/*
package com.ttn.springboot.controller;

import com.ttn.springboot.entity.Database;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class DatabaseController {
    @Autowired
    Database database;
    Logger logger=(Logger) LoggerFactory.getLogger(DatabaseController.class);
    @GetMapping("/database")
    public String getDatabase() {
        logger.info("ENTER THE DATABASES");
        return database.toString();
    }
}
*/
