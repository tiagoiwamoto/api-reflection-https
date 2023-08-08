package com.example.springbootpoc;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MeuController {

    private final ChamadaHttps chamada;

    @GetMapping(path = "/teste")
    public String index(){
        System.out.println("Olá GraalVM");
        log.info("teste de log");
        MeuReflection reflection = new MeuReflection();
        MeuPojo pojo = new MeuPojo();
        pojo.setId(Long.valueOf(new Random().nextInt(9999999)));
        pojo.setName(UUID.randomUUID().toString());
        pojo.setBirthdate(LocalDate.now());
        reflection.execute(pojo);
        Map<String, Object> response = this.chamada.profile().getBody();
        return response.toString();
    }
}
