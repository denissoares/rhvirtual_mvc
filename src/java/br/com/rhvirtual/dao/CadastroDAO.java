package br.com.rhvirtual.dao;

import br.com.rhvirtual.dominio.Cadastro;
import conexao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CadastroDAO {
    
    public void adiciona(Cadastro cadastro) throws SQLException{
        
        Conexao conn = new Conexao();
        
        String sql = "insert into cadastro(nome, endereco, telefone, email, senha) values(?,?,?,?,?)";
        
        PreparedStatement ps = conn.getConecao().prepareStatement(sql);
        
        ps.setString(1, cadastro.getNome());
        ps.setString(2, cadastro.getEndereco());
        ps.setInt(3, cadastro.getTelefone());
        ps.setString(4, cadastro.getEmail());
        ps.setString(5, cadastro.getSenha());
        
        ps.execute();
        
    }
    
    public List<Cadastro> busca() throws SQLException{
        
        List<Cadastro> lista =  new ArrayList<>();
        
        Conexao conn = new Conexao();
         
        String sql = "select * from cadastro";
        
        PreparedStatement ps = conn.getConecao().prepareStatement(sql);
        
        ResultSet rs = ps.executeQuery();

        while(rs.next()){

            Cadastro cadastro = new Cadastro();
            
            cadastro.setNome(rs.getString("nome"));
            cadastro.setEndereco(rs.getString("endereco"));
            cadastro.setTelefone(rs.getInt("telefone"));
            cadastro.setEmail(rs.getString("email"));
            cadastro.setSenha(rs.getString("senha"));
            
            lista.add(cadastro);
                
            }
        
        return lista;
        
    }
}
