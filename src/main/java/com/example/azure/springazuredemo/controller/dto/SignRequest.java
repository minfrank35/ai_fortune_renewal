package com.example.azure.springazuredemo.controller.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignRequest {

    private Long id;

    private String email;

    private String pwd;

    private String name;

    private String gender;

    private String birthday;

    private String phone;

}