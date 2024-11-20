package lab13.Task3;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;

    public Address(String address, String delimiter) {
        StringTokenizer st = new StringTokenizer(address, delimiter);
        this.country = st.nextToken().trim();
        this.region = st.nextToken().trim();
        this.city = st.nextToken().trim();
        this.street = st.nextToken().trim();
        this.house = st.nextToken().trim();
        this.building = st.nextToken().trim();
        this.apartment = st.nextToken().trim();
    }

    public String toString() {
        return country + "," + region + "," + city + "," + street + "," + house + "," + building + "," + apartment + "\n";
    }
}
