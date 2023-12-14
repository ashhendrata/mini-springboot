package spring.project.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class TimeAPI {

    private String utc_datetime;

    public TimeAPI(String utc_datetime) {
        this.utc_datetime = utc_datetime;
    }

    public String getUtc_datetime() {
        return utc_datetime;
    }

    public void setUtc_datetime(String utc_datetime) {
        this.utc_datetime = utc_datetime;
    }
}
