package io.kubepia.application;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 */
@RestController
@RequestMapping("/api")
public class Controller {

    @RequestMapping()
    public String get() {
        return "this is api home at " + getLocalDateTime();
    }

    @RequestMapping("/v1")
    public String index() {
        return "this is api v1 at " + getLocalDateTime();
    }

    String getLocalDateTime() {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        formatter.setTimeZone(TimeZone.getTimeZone("KST"));
        Date now = new Date();
        Date local = new Date(now.getTime() + Calendar.getInstance().getTimeZone().getOffset(now.getTime()));
        // LocalDate today = LocalDate.now();
        // System.out.println("Current Date=" + today);
        // LocalTime time = LocalTime.now();
        // System.out.println("Current Time=" + time);
        // Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("KST"));
        // Date currentDate = calendar.getTime();

        return formatter.format(local);
    }

}