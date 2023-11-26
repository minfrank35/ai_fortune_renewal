package com.example.azure.springazuredemo.controller;

import java.sql.*;

public class MemberRepositoryImpl implements MemberRepository {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "sys as sysdba";
    private static final String PASSWORD = "1234";


    @Override
    public boolean saveMember(Member member) {
        try {
            // 오라클 데이터베이스 연결
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);

            // 쿼리 수행
            String query = "INSERT INFO member(id, email, pwd, name, gender, birthday,phone) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement insertStatement = connection.prepareStatement(query)) {

                insertStatement.setLong(1,member.getId());
                insertStatement.setString(2, member.getEmail());
                insertStatement.setString(3,member.getPwd());
                insertStatement.setString(4, member.getName());
                insertStatement.setString(5, member.getGender());
                insertStatement.setString(6, member.getBirthday());
                insertStatement.setString(7, member.getPhone());
            }

            // 연결 종료
            connection.close();
        } catch (
                SQLException e) {
            e.printStackTrace();
            return false;
        }
       return true;
    }
}
