package com.example.pinshot.controller;

import com.example.pinshot.entity.MemberEntity;
import com.example.pinshot.repository.MemberEntityRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/members")
@Log4j2
public class MemberController {

    private final MemberEntityRepository memberEntityRepository;
    @Autowired
    public MemberController(MemberEntityRepository memberEntityRepository) {
        this.memberEntityRepository = memberEntityRepository;
    }
    @PostMapping("/register")
    public String registerMember(
            @RequestParam("name") String name,
            @RequestParam("rank") String rank,
            @RequestParam("number") String number,
            @RequestParam("email") String email
    ) {
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setName(name);
        memberEntity.setRank(rank);
        memberEntity.setNumber(number);
        memberEntity.setEmail(email);

        memberEntityRepository.save(memberEntity);

        return "redirect:/index.html"; // 등록 성공
    }

}
