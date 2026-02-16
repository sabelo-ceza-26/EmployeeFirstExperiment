package za.ac.cput.domain;

public class Address {
    private String streetNum;
    private String streetName;
    private String city;
    private String zipCode;

    private Address() {
    }

    private Address(String streetNum, String streetName, String city, String zipCode) {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.city = city;
        this.zipCode = zipCode;
    }
    public Address(Builder builder){
        this.streetNum = builder.streetNum;
        this.streetName = builder.streetName;
        this.city = builder.city;
        this.zipCode = builder.zipCode;

        }

    public String getStreetNum() {
        return streetNum;
    }
    public String getStreetName() {
        return streetName;
    }

    public String getCity() {
        return city;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Override
    public String toString() {
        return
                "\nStreet Number: " + streetNum +
                        "\nStreet Name: " + streetName +
                        "\nCity: " + city +
                        "\nZip Code: " + zipCode;
    }
    public static class Builder{
        private String streetNum;
        private String streetName;
        private String city;
        private String zipCode;

        public Builder setStreetNum(String streetNum) {
            this.streetNum = streetNum;
            return this;
        }

        public Builder setStreetName(String streetName) {
            this.streetName = streetName;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }
        public Address.Builder copy(Address address) {
            this.streetNum = address.streetNum;
            this.streetName = address.streetName;
            this.city = address.city;
            this.zipCode = address.zipCode;
            return this;

        }
        public Address build(){
            return new Address(this);
        }

    }

}

