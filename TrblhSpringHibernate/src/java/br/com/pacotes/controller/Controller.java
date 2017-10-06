/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.pacotes.controller;

import br.com.pacotes.dao.TrabalhoDao;
import br.com.pacotes.entidade.Trabalho;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

/**
 *
 * @author thiag
 */
@Controller
public class ControllerView {

    @RequestMapping("/index")
    public String index(Model model) {

        return "index";
    }

    @RequestMapping("/salva")
    public String salvaBanco(Model model, Trabalho trabalho) {
        TrabalhoDao dao = new TrabalhoDao();
        if (trabalho != null) {
            dao.cadastrarUsuario(trabalho);
        }
        return "salvo";
    }
}
