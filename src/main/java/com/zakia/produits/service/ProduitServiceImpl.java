package com.zakia.produits.service;

import com.zakia.produits.entities.Produit;
import com.zakia.produits.repos.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceImpl implements ProduitService {
    @Autowired
    ProduitRepository produitRepository;


    @Override
    public Produit saveProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public Produit updateProduit(Produit p) {
        return produitRepository.save(p);
    }

    @Override
    public void deleteProduit(Produit p) {
        produitRepository.delete(p);
    }

    @Override
    public void deleteProduitById(Long id) {
        produitRepository.deleteById(id);

    }

    @Override
    public Produit getProduit(Long id) {
        return produitRepository.findById(id).get();

    }

    @Override
    public List<Produit> getAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Page<Produit> getAllProduitsParPage(int page, int size) {
        return produitRepository.findAll(PageRequest.of(page, size));
    }
}
