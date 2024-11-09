import com.fasterxml.jackson.annotation.JsonProperty;

public class Places {

    public Places(String placename, String longitude, String state, String stateabbreviation, String latitude) {
        this.placename = placename;
        this.longitude = longitude;
        this.state = state;
        this.stateabbreviation = stateabbreviation;
        this.latitude = latitude;
    }

    private String placename;

    private String longitude;

    private String state;

    private String stateabbreviation;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("state abbreviation")
    public String getStateabbreviation() {
        return stateabbreviation;
    }

    @JsonProperty("state abbreviation")
    public void setStateabbreviation(String stateabbreviation) {
        this.stateabbreviation = stateabbreviation;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("place name")
    public String getPlacename() {
        return placename;
    }

    @JsonProperty("place name")
    public void setPlacename(String placename) {
        this.placename = placename;
    }

    private String latitude;




}
