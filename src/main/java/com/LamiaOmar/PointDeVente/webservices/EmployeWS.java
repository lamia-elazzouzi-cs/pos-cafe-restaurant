package com.LamiaOmar.PointDeVente.webservices;

import com.LamiaOmar.PointDeVente.beans.Employe;
import com.LamiaOmar.PointDeVente.services.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/employes")

public class EmployeWS {
    @Autowired
    private EmployeService employeService;
    @GetMapping("")
    public List<Employe> findAll(){ return employeService.findAll(); }

    @GetMapping("{id}")
    public Employe findById(@PathVariable long id){ return employeService.findById(id);}

    @PostMapping("")
    public Employe save(@RequestBody Employe e){ return employeService.save(e); }

    @DeleteMapping("delete/{id}")
    public  void deleteById(@PathVariable long id){ employeService.DeleteById(id); }

    @PutMapping("{id}")
    public Employe update(@PathVariable long id, @RequestBody Employe e){
        return employeService.update(id, e);
    }
}
