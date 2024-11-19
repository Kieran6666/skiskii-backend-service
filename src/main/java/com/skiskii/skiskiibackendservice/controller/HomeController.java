package com.skiskii.skiskiibackendservice.controller;

import com.skiskii.skiskiibackendservice.domain.vo.response.ApiResult;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Home Controller
 */
@RestController
@RequestMapping("/home")
public class HomeController {
    /**
     * greeting
     *
     * @return hello
     */
    @GetMapping("/greeting")
    public ResponseEntity<ApiResult<?>> greeting() {
        return new ResponseEntity<>(ApiResult.success(), HttpStatus.OK);
    }
}
