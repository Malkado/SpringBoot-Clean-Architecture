package br.com.araujo.cleanarch.dataprovider.client.mapper;

import br.com.araujo.cleanarch.core.domain.Address;
import br.com.araujo.cleanarch.dataprovider.client.response.AddressResponse;
import org.mapstruct.Mapper;

@Mapper( componentModel = "spring")
public interface IAddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
