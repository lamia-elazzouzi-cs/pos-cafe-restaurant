package com.LamiaOmar.PointDeVente.webservices;

import com.LamiaOmar.PointDeVente.beans.Commande;
import com.LamiaOmar.PointDeVente.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/commandes")

public class CommandeWS {
    @Autowired
    private CommandeService commandeService;
    @GetMapping("")
    public List<Commande> findAll(){ return commandeService.findAll(); }

    @GetMapping("{id}")
    public Commande findById(@PathVariable long id){ return commandeService.findById(id);}

    @PostMapping("")
    public Commande save(@RequestBody Commande c){ return commandeService.save(c); }

    @DeleteMapping("delete/{id}")
    public  void deleteById(@PathVariable long id){ commandeService.DeleteById(id); }

    @PutMapping("{id}")
    public Commande update(@PathVariable long id, @RequestBody Commande c){
        return commandeService.update(id, c);
    }
}

