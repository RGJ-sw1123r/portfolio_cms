package com.portfolio.cms.api.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {

	@GetMapping("/developer")
    public Map<String, Object> getDeveloperInfo() {
        Map<String, Object> dev = new HashMap<>();
        dev.put("name", "홍길동");
        dev.put("role", "백엔드 개발자");
        dev.put("skills", List.of("Java", "Spring Boot", "JPA", "MySQL"));
        return dev;
    }

    @GetMapping("/designer")
    public Map<String, Object> getDesignerInfo() {
        Map<String, Object> designer = new HashMap<>();
        designer.put("name", "김디자이너");
        designer.put("role", "UI/UX 디자이너");
        designer.put("tools", List.of("Figma", "Photoshop", "Illustrator"));
        return designer;
    }
    
}
