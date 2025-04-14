package com.example.spring_boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-engineers")

public class SoftwareEngineerController {

    @GetMapping
    public List<SoftwareEngineer> getEngineers() {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Arsema",
                        "js, node, tailwindcss, react"

                ),
                new SoftwareEngineer(
                        2,
                        "Betty",
                        "java, spring, Spring-boot"

        )
        );
    }
}
