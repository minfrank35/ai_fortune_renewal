package com.example.azure.springazuredemo.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
public class SignResponse {
    private Long id;
    private String email;
    private String name;
    private String gender;
    private String birthday;
    private String phone;

    public SignResponse(Long id, String email, String name, String gender, String birthday, String phone) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.phone = phone;
    }
}
