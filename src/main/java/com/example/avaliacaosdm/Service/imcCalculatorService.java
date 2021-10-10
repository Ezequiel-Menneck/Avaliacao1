package com.example.avaliacaosdm.Service;

import org.springframework.stereotype.Service;

import java.text.DecimalFormat;

@Service
public class imcCalculatorService {

    public static String getImcCalculator(Double peso, Double altura) {
        DecimalFormat df = new DecimalFormat("###,##0.00");
        Double imc = peso / Math.pow(altura, 2);
        String imcConvert = df.format(imc);


        if(imc <= 18.4) {
            return "Baixo peso, seu IMC é: " + imcConvert;
        } else if(imc >= 18.5 && imc <= 24.9) {
            return "Intervalo normal, seu IMC é: " + imcConvert;
        } else if(imc >= 25 && imc <= 29.9) {
            return "Sobrepeso, seu IMC é: " + imcConvert;
        } else if(imc >= 30 && imc <= 34.9) {
            return "Obesidade classe 1, seu IMC é: " + imcConvert;
        } else if(imc >= 35 && imc <= 39.9) {
            return "Obesidade classe 2, seu IMC é: " + imcConvert;
        } else  {
            return "Obesidade classe 3, seu IMC é: " + imcConvert;
        }

    }

}
