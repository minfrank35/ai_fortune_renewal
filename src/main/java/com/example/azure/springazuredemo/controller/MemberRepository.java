package com.example.azure.springazuredemo.controller;


import java.util.Optional;


public interface MemberRepository {
    public boolean saveMember(Member member);
}
