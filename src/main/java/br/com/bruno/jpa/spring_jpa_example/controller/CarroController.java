package br.com.bruno.jpa.spring_jpa_example.controller;

import br.com.bruno.jpa.spring_jpa_example.model.Carro;
import br.com.bruno.jpa.spring_jpa_example.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carro")
public class CarroController {

    @Autowired
    private CarroRepository carroRepository;

    @PostMapping("/save")
    public ResponseEntity<Carro> saveCarro(@RequestBody Carro carro) {
        carro = carroRepository.save(carro);
        return ResponseEntity.ok().body(carro);
    }
}
