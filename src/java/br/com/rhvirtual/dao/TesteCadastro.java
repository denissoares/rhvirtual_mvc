package br.com.rhvirtual.dao;

import br.com.rhvirtual.dominio.Cadastro;
import java.sql.SQLException;

public class TesteCadastro {
    
    public static void main(String[] args) {
        
        Cadastro cadastro = new Cadastro();
        CadastroDAO dao = new CadastroDAO();
        
        
        cadastro.setNome("Denis");
        cadastro.setEndereco("Rua Três");
        cadastro.setTelefone(981562488);
        cadastro.setEmail("denis.assis@fatec.sp.gov.br");
        cadastro.setSenha("TI");
        
        try {
            dao.adiciona(cadastro);
        } catch (SQLException e) {
            System.out.println(e);
        }   
    }
}
