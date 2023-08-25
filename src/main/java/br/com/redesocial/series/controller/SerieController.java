package br.com.redesocial.series.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/series")
public class SerieController {

    @GetMapping
    public ResponseEntity listar(){
        System.out.println("Listando todas as série");
        return new ResponseEntity("Listou todas as séries com sucesso", HttpStatus.ACCEPTED);
    }
}
