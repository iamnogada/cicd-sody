package io.kubepia.application;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Controller
 */
@RestController
@RequestMapping("/api")
public class Controller {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @RequestMapping()
    public String index() {

        return "This is api index page (" + formatter.format(new Date()) + ")";
    }

}