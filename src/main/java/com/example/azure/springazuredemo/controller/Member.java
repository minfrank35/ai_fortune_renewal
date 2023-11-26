package com.example.azure.springazuredemo.controller;


import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Builder @AllArgsConstructor @NoArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tmp_seq")
    @SequenceGenerator(name = "tmp_seq", sequenceName = "tmp_seq", allocationSize = 1)
    private Long id;

    @Column(unique = true)
    private String email;

    private String pwd;

    private String name;

    private String gender;

    private String birthday;

    private String phone;

}
