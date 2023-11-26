package com.example.azure.springazuredemo.controller;



import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Builder @AllArgsConstructor @NoArgsConstructor
public class Member {

    private Long id;

    private String email;

    private String pwd;

    private String name;

    private String gender;

    private String birthday;

    private String phone;

}
