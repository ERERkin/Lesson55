package kg.wallet.model;

import javax.xml.bind.annotation.XmlRootElement;
import java.sql.Timestamp;

import static java.time.LocalTime.now;

@XmlRootElement(name = "timeReturn")
public class TimeReturn {
    private String time;

    public TimeReturn() {
        time = String.valueOf(now());
        System.out.println(time);
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
