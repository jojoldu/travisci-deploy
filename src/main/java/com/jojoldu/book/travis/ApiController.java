package com.jojoldu.book.travis;

import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jojoldu@gmail.com on 01/09/2018
 * Blog : http://jojoldu.tistory.com
 * Github : https://github.com/jojoldu
 */

@RequiredArgsConstructor
@RestController
public class ApiController {
    private final Environment env;

    @GetMapping("/profile")
    public String profile() {
        List<String> profiles = Arrays.asList(env.getActiveProfiles());

        if(profiles.contains("set1")){
            return "set1";
        }

        if(profiles.contains("set2")){
            return "set2";
        }

        return profiles.get(0);
    }
}
