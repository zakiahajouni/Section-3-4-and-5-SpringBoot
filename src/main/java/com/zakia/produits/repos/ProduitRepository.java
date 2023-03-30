package com.zakia.produits.repos;

import com.zakia.produits.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository  extends JpaRepository<Produit, Long> {

}
