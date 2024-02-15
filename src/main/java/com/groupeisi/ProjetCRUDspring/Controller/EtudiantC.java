package com.groupeisi.ProjetCRUDspring.Controller;

import com.groupeisi.ProjetCRUDspring.Entity.EtudiantM;
import com.groupeisi.ProjetCRUDspring.Service.EtudiantS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/etudiants")
public class  EtudiantC{
  @Autowired
    private EtudiantS etudiantS;
    @GetMapping
    public List<EtudiantM> getAllUsers() {
        return etudiantS.getAllUsers();
    }
    @PostMapping
    public EtudiantM createEtudiantM (@RequestBody EtudiantM etudiantM) {
        return etudiantS.createEtudiantM(etudiantM);
    }
    @PutMapping("/{id}")
    public EtudiantM updateEtudiant(@PathVariable Long id, @RequestBody EtudiantM updatedEtudiant) {
        return etudiantS.updateEtudiant(id, updatedEtudiant);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        etudiantS.deleteUser(id);
    }
}


