package dev.ruan.social.login.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

        @GetMapping("/")
        public String home() {
                return "Hello, Home!";
        }

        @GetMapping("/secured")
        public String secured() {
                return "Hello, Secured";
        }
}
