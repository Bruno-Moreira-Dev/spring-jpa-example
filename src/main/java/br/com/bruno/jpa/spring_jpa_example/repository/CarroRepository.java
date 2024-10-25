package br.com.bruno.jpa.spring_jpa_example.repository;

import br.com.bruno.jpa.spring_jpa_example.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
}
