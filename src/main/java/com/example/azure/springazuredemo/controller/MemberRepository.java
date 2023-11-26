package com.example.azure.springazuredemo.controller;


import com.example.azure.springazuredemo.controller.dto.BaseRes;

import java.util.Optional;


public interface MemberRepository {
    public boolean saveMember(Member member);
}
