package com.example.demoSecurity.controller;


import com.example.demoSecurity.model.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    /*@GetMapping("/admin")
    @ResponseBody
    public ResponseEntity<Bulk> addItem(@RequestBody Bulk bulk){
        return new ResponseEntity<Bulk>(HttpStatus.CREATED);
    }*/

    @GetMapping("/admin")
    @ResponseBody
    public Message addItem(){
        return new Message(1, "Message");
    }
}
