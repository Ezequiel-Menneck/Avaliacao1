package com.example.avaliacaosdm.Controller;

import com.example.avaliacaosdm.Service.imcCalculatorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class imcController {

    @GetMapping("/imc")
    public ResponseEntity<?> getImcCalculator(@RequestParam Double peso, @RequestParam Double altura) {
        return ResponseEntity.ok(imcCalculatorService.getImcCalculator(peso, altura));
    }

}
