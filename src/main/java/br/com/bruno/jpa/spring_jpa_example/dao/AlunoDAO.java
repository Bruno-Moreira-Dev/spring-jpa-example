package br.com.bruno.jpa.spring_jpa_example.dao;

import br.com.bruno.jpa.spring_jpa_example.entity.Aluno;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    private final Connection connection;

    public AlunoDAO(Connection connection) {
        this.connection = connection;
    }

    public List<Aluno> buscarTodosOsAlunos() throws SQLException {
        String SQL = "SELECT * FROM aluno";
        PreparedStatement preparedStatement = connection.prepareStatement(SQL);
        ResultSet resultSet = preparedStatement.executeQuery();
        List<Aluno> alunos = new ArrayList<>();
        while (resultSet.next()) {
            Aluno aluno = new Aluno();
            aluno.setId(resultSet.getLong("id"));
            aluno.setNome(resultSet.getString("nome"));
            aluno.setIdade(resultSet.getInt("idade"));
            alunos.add(aluno);
        }
        return alunos;
    }

    public void inserirNovoAluno(String nome, int idade) throws SQLException {
        String SQL = "INSERT INTO aluno(nome, idade) VALUES (?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(SQL);
        preparedStatement.setString(1, nome);
        preparedStatement.setInt(2, idade);
        preparedStatement.executeUpdate();
    }
}
