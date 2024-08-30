package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Main.class);

        System.out.println("Hello world!");
        logger.info("Hello world !");
    }
}