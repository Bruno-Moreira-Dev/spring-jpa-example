package br.com.bruno.jpa.spring_jpa_example.repository;

import br.com.bruno.jpa.spring_jpa_example.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
