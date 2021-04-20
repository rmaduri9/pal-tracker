package io.pivotal.pal.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class PalTrackerApplication {

    public static void main(String[] args) {

        SpringApplication.run(PalTrackerApplication.class, args);
        // new SpringApplicationBuilder(PalTrackerApplication.class)
        //   .web(WebApplicationType.NONE)
        //    .run(args);
    }
}
