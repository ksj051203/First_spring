package spring.spring.controller;

import org.springframework.web.bind.annotation.PostMapping;
import spring.spring.domain.Member;

public class MemberForm {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
