import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class PostCodeDetails {

    public PostCodeDetails(String postcode, String country, String countryabbreviation, List<Places> places) {
        this.postcode = postcode;
        this.country = country;
        this.countryabbreviation = countryabbreviation;
        this.places = places;
    }

    private  String postcode;

    private  String country;

    public List<Places> getPlaces() {
        return places;
    }

    public void setPlaces(List<Places> places) {
        this.places = places;
    }

    @JsonProperty("country abbreviation")
    public String getCountryabbreviation() {
        return countryabbreviation;
    }

    @JsonProperty("country abbreviation")
    public void setCountryabbreviation(String countryabbreviation) {
        this.countryabbreviation = countryabbreviation;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("post code")
    public String getPostcode() {
        return postcode;
    }


    @JsonProperty("post code")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    private  String countryabbreviation;

    private List<Places> places;


}
