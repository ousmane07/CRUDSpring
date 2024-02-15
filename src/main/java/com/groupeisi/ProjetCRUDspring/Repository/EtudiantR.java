package com.groupeisi.ProjetCRUDspring.Repository;

import com.groupeisi.ProjetCRUDspring.Entity.EtudiantM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantR extends JpaRepository<EtudiantM, Long> {
}

