package za.ac.cput.factory;

import za.ac.cput.domain.Address;
public class AddressFactory {
    public static Address createAddress(String streetNumber,String streetName, String city, String postalCode) {
    return new Address.Builder()
            .setStreetNum(streetNumber)
            .setStreetName(streetName)
            .setCity(city)
            .setZipCode(postalCode)
            .build();
    }

}
