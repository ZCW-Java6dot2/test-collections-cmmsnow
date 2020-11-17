package gettestie.src.main.java.rocks.zipcode;

import java.util.Comparator;

public class Address{
    private String street;
    private String town;
    private String postCode;
    private String country;

    /**
     * Construct an Address without country
     */
    public Address(String street, String town, String postCode) {
        this(street, town, postCode, "");
    }

    /**
     * Construct an Address with full details
     */
    public Address(String street, String town, String postCode, String country) {
        this.street = street;
        this.town = town;
        this.postCode = postCode;
        this.country = country;
    }

    /**
     * Return a string representation of this object.
     */
    public String toString() {
        return street + "\n" + town + " " + postCode + "\n" + country + "\n";
    }

//    @Override
//    public int compareTo(String otherPostCode) {
//        return Integer.compare(this.postCode.length(), otherPostCode.length());
//    }

//    public Comparator<String> PostCodeComparison = new Comparator<String>() {
//        @Override
//        public int compare(String , String o2) {
//            return 0;
//        }
    }
}
