package br.com.bruno.jpa.spring_jpa_example;

import br.com.bruno.jpa.spring_jpa_example.config.DB;
import br.com.bruno.jpa.spring_jpa_example.dao.AlunoDAO;
import br.com.bruno.jpa.spring_jpa_example.entity.Aluno;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class BuscarTodosClientesExecute {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DB.getConnection()) {
            AlunoDAO alunoDAO = new AlunoDAO(connection);
            List<Aluno> alunos = alunoDAO.buscarTodosOsAlunos();
            System.out.println(alunos);
        }
    }
}
