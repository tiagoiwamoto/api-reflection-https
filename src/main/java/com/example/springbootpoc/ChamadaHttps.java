package com.example.springbootpoc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@FeignClient(name = "chamadahttps", url = "https://kamehouse.com.br:8081/api/v1")
public interface ChamadaHttps {

    @GetMapping(path = "/open/profile")
    ResponseEntity<Map<String, Object>> profile();
}
