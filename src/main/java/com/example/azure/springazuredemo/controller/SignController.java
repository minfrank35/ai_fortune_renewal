package com.example.azure.springazuredemo.controller;

import com.example.azure.springazuredemo.controller.dto.BaseRes;
import com.example.azure.springazuredemo.controller.dto.SignRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignController {
    private final SignService memberService = new SignService();

    @GetMapping(value = "/welcome")
    public String wish() {
        return "welcome";
    }
    @PostMapping(value = "/register")
    public ResponseEntity<BaseRes> signup(@RequestBody SignRequest request) throws Exception {
        return new ResponseEntity<BaseRes>(memberService.register(request), HttpStatus.OK);
    }
}
