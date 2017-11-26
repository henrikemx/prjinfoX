package br.com.infox.dal;

import java.sql.*;

/**
 * Aula 07 - Conectando o banco de dados
 * @author henrique
 * Aula revista em 13/07/2017
 * 
 */
public class ModuloConexao {

    // o método abaixo será responsavel por estabelecer conexão com o banco de dados
    
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // a linha abaixo "chama" o driver
        String driver = "com.mysql.jdbc.Driver";
        // armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        // estabelecendo a conexao com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            // System.out.println(conexao);
            return conexao;
        } catch (Exception e) {
            // a linha abaixo serve de apoio para identificar o erro
            // System.out.println(e);
            return null;
        }
    }

}
