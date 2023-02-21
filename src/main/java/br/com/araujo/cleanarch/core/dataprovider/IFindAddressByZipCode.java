package br.com.araujo.cleanarch.core.dataprovider;

import br.com.araujo.cleanarch.core.domain.Address;

public interface IFindAddressByZipCode {
    Address find(final String zipcode);
}
