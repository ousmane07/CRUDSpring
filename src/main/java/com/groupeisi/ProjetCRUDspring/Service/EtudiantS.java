package com.groupeisi.ProjetCRUDspring.Service;

import com.groupeisi.ProjetCRUDspring.Entity.EtudiantM;
import com.groupeisi.ProjetCRUDspring.Repository.EtudiantR;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  EtudiantS {
  @Autowired
    private EtudiantR etudiantRepository;

    public List<EtudiantM> getAllUsers() {
        return etudiantRepository.findAll();
    }

    public EtudiantM createEtudiantM (EtudiantM etudiantM) {
        return etudiantRepository.save(etudiantM);
    }
    public EtudiantM updateEtudiant(Long id, EtudiantM updatedEtudiant) {
        EtudiantM existingEtudiant = etudiantRepository.findById(id).orElse(null);
        if (existingEtudiant != null) {
            existingEtudiant.setNom(updatedEtudiant.getNom());
            existingEtudiant.setPrenom(updatedEtudiant.getPrenom());
            // Ajoutez d'autres propriétés à mettre à jour selon votre modèle EtudiantM
            return etudiantRepository.save(existingEtudiant);
        }
        return null;
    }


    public void deleteUser(Long id) {
        etudiantRepository .deleteById(id);
    }
}
