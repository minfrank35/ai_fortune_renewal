package com.example.azure.springazuredemo.controller;


import com.example.azure.springazuredemo.controller.dto.SignRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class SignService {

    private final MemberRepository memberRepository = new MemberRepositoryImpl();
//    private final JwtProvider jwtProvider;

//    public SignResponse login(SignRequest request) throws Exception {
//        Member member = memberRepository.findByEmail(request.getEmail()).orElseThrow(() ->
//                new BadCredentialsException("잘못된 계정정보입니다."));
//
//        if (!passwordEncoder.matches(request.getPwd(), member.getPwd())) {
//            throw new BadCredentialsException("잘못된 계정정보입니다.");
//        }
//
//        return SignResponse.builder()
//                .token(jwtProvider.createToken(member.getEmail(), member.getRoles()))
//                .build();
//
//    }
    public boolean register(SignRequest request) throws Exception {
        boolean success = false;
        try {
            Member member = new Member();
            member.setId(request.getId());
            member.setEmail(request.getEmail());
            member.setName(request.getName());
            member.setGender(request.getGender());
            member.setPhone(request.getPhone());
            member.setPwd(request.getPwd());


            success = memberRepository.saveMember(member);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new Exception("잘못된 요청입니다.");
        }
        return success;
    }

//    public SignResponse getMember(String email) throws Exception {
//        Member member = memberRepository.findByEmail(email)
//                .orElseThrow(() -> new Exception("계정을 찾을 수 없습니다."));
//        return new SignResponse(member);
//    }
//
//
//    public boolean updateMember(SignRequest request) throws Exception {
//        try {
//            // 기존 회원 정보 조회
//            Member member = memberRepository.findByEmail(request.getEmail())
//                    .orElseThrow(() -> new Exception("계정을 찾을 수 없습니다."));
//
//            // 업데이트할 정보 설정
//            member.setPwd(passwordEncoder.encode(request.getPwd()));
//            member.setName(request.getName());
//            member.setGender(request.getGender());
//            member.setBirthday(request.getBirthday());
//            member.setPhone(request.getPhone());
//
//            // 회원 정보 업데이트
//            memberRepository.save(member);
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            throw new Exception("회원 정보 업데이트에 실패했습니다.");
//        }
//        return true;
//    }

}
