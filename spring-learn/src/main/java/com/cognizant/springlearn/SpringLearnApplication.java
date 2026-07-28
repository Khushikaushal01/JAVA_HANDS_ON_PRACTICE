package com.cognizant.springlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import com.cognizant.springlearn.model.Country;
import java.util.ArrayList;

@SpringBootApplication
@ImportResource({"classpath:country.xml", "classpath:employee.xml"})
public class SpringLearnApplication {

    private static final Logger logger = LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {
        logger.info("Start of main()");
        ApplicationContext context = SpringApplication.run(SpringLearnApplication.class, args);
        displayCountries(context);
        logger.info("End of main()");
    }

    public static void displayCountries(ApplicationContext context) {
        logger.info("Start of displayCountries()");
        @SuppressWarnings("unchecked")
        ArrayList<Country> countries = (ArrayList<Country>) context.getBean("countryList");
        logger.debug("Countries list: {}", countries);
        logger.info("End of displayCountries()");
    }
}
