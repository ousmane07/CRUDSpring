package com.groupeisi.ProjetCRUDspring.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
public class  EtudiantM{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private String Nom;
    @Getter
    private String Prenom;

    public void setNom(String Nom) {
        this.Nom =  Nom;
    }

    public void setPrenom(String  Prenom) {
        this. Prenom =  Prenom;
    }

    // Getters and Setters
}

