package com.toni.portifolio.service;

import com.toni.portifolio.model.Item;
import com.toni.portifolio.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository repository;

    public List<Item> listarTodos() {
        return repository.findAll();
    }

    public Optional<Item> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Item salvar(Item item) {
        return repository.save(item);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
