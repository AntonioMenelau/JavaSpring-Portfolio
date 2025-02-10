package com.toni.portifolio.controler;

import com.toni.portifolio.model.Item;
import com.toni.portifolio.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/itens")
public class ItemController {

    @Autowired
    private ItemService service;

    @GetMapping
    public String listarItens(Model model) {
        List<Item> itens = service.listarTodos();
        model.addAttribute("itens", itens);
        return "index";
    }

    @PostMapping("/salvar")
    public String salvarItem(@ModelAttribute Item item) {
        service.salvar(item);
        return "redirect:/itens";
    }

    @GetMapping("/deletar/{id}")
    public String deletarItem(@PathVariable Long id) {
        service.excluir(id);
        return "redirect:/itens";
    }
}
