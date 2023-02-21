package br.com.araujo.cleanarch.dataprovider;

import br.com.araujo.cleanarch.core.dataprovider.IFindAddressByZipCode;
import br.com.araujo.cleanarch.core.domain.Address;
import br.com.araujo.cleanarch.dataprovider.client.IFindAddressByZipCodeClient;
import br.com.araujo.cleanarch.dataprovider.client.mapper.IAddressResponseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeImpl implements IFindAddressByZipCode {
    @Autowired
    private IFindAddressByZipCodeClient findAddressByZipCodeClient;

    @Autowired
    private IAddressResponseMapper addressResponseMapper;
    @Override
    public Address find(String zipcode) {
        var addressResponse = findAddressByZipCodeClient.find(zipcode);
        return addressResponseMapper.toAddress(addressResponse);
    }
}
