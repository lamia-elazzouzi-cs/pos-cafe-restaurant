package com.LamiaOmar.PointDeVente.webservices;

import com.LamiaOmar.PointDeVente.beans.Categorie;
import com.LamiaOmar.PointDeVente.services.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/categories")

public class CategorieWS {
    @Autowired
    private CategorieService categorieService;
    @GetMapping("")
    public List<Categorie> findAll(){ return categorieService.findAll(); }

    @GetMapping("{id}")
    public Categorie findById(@PathVariable long id){ return categorieService.findById(id);}

    @PostMapping("")
    public Categorie save(@RequestBody Categorie c){ return categorieService.save(c); }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable long id){ categorieService.DeleteById(id); }

    @PutMapping("{id}")
    public Categorie update(@PathVariable long id, @RequestBody Categorie c){
        return categorieService.update(id, c);
    }
}
