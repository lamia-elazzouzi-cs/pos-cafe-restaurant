package com.LamiaOmar.PointDeVente.webservices;

import com.LamiaOmar.PointDeVente.beans.Categorie;
import com.LamiaOmar.PointDeVente.beans.Produit;
import com.LamiaOmar.PointDeVente.services.ProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/produits")

public class ProduitWS {
    @Autowired
    private ProduitService produitService;
    @GetMapping("")
    public List<Produit> findAll(){ return produitService.findAll(); }

    @GetMapping("admin/{adminID}")
    public List<Produit> findByAdminID(@PathVariable Long adminID){ return produitService.findByAdminID(adminID); }


    @GetMapping("{id}")
    public Produit findById(@PathVariable long id){ return produitService.findById(id);}

    @PostMapping("")
    public Produit save(@RequestBody Produit p){ return produitService.save(p); }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable long id){ produitService.DeleteById(id); }

    @PutMapping("{id}")
    public Produit update(@PathVariable long id, @RequestBody Produit p){
        return produitService.update(id, p);
    }
}
