package br.com.bruno.jpa.spring_jpa_example.controller;

import br.com.bruno.jpa.spring_jpa_example.model.Cliente;
import br.com.bruno.jpa.spring_jpa_example.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping("/all")
    public ResponseEntity<List<Cliente>> getAllClients()  {
        return ResponseEntity.ok(clienteRepository.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<Cliente> saveClient(@RequestBody Cliente cliente) {
        cliente = clienteRepository.save(cliente);
        return ResponseEntity.ok().body(cliente);
    }
}
