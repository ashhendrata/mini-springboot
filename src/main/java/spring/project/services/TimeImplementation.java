package spring.project.services;
import org.springframework.stereotype.Service;
import kong.unirest.Unirest;
import spring.project.model.TimeAPI;

import java.net.http.HttpResponse;

@Service
public class TimeImplementation implements Time{

    @Override
    public String getCurrentTime(String timeZone){
        HttpResponse<TimeAPI> response = Unirest.get("http://worldtimeapi.org/api/timezone/Europe/" + timeZone).asObject(TimeAPI.class);
        return response.getBody().getUtc_datetime();
    }
}
