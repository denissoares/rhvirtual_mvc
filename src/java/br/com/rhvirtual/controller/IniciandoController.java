/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.rhvirtual.controller;

import br.com.rhvirtual.dao.CadastroDAO;
import br.com.rhvirtual.dominio.Cadastro;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class IniciandoController {
    
    @RequestMapping("/index")
    public String iniciando(Model model, Cadastro cadastro){
        
        CadastroDAO dao =  new CadastroDAO();
        
        try {
            dao.adiciona(cadastro);
            
            model.addAttribute("nome", cadastro.getNome());
            
        } catch (SQLException e) {
            System.out.println(e);
        }
        
        return "index";
    }
    
    @RequestMapping("/cadastro")
    public String cadastro(){
        
        return "cadastro";
    }
    
    @RequestMapping("/exibir")
    public String ixibir(Model model){
        
        CadastroDAO dao = new CadastroDAO();
        
        try {
            model.addAttribute("lista", dao.busca());
        } catch (Exception e) {
        }
    
        return "listar";
}
    
}
