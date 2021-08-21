package com.example.flippingRowers.controller;
 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RowerController {
    
    @GetMapping("/getDeck")
    public X getDeck() {
        return createDeck();
    }

    @PostMapping("/shuffle")
    public X shuffle() {
        return shuffleDeck();
    }

}
