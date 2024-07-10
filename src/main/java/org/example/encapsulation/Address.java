package org.example.encapsulation;

public class Address {

    private String country;
    private String city;
    private String district;
    private StreetAddress streetAddress;

    public static class StreetAddress {
        private String streetNumber;
        private String streetName;
        private String postalCode;
    }

    public String getCountry() {
        class CountyCode {
            private String code;
            private String name;
        }
        CountyCode countyCode = new CountyCode();
        return "";
    }

}

