package com.LamiaOmar.PointDeVente.webservices;

import com.LamiaOmar.PointDeVente.beans.Admin;
import com.LamiaOmar.PointDeVente.services.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/admins")

public class AdminWS {
    @Autowired
    private AdminService adminService;
    @GetMapping("")
    public List<Admin> findAll(){ return adminService.findAll(); }

    @GetMapping("{id}")
    public Admin findById(@PathVariable long id){ return adminService.findById(id);}

    @PostMapping("")
    public Admin save(@RequestBody Admin a){ return adminService.save(a); }

    @DeleteMapping("delete/{id}")
    public  void deleteById(@PathVariable long id){ adminService.DeleteById(id); }

    @PutMapping("{id}")
    public Admin update(@PathVariable long id, @RequestBody Admin a){
        return adminService.update(id, a);
    }
}
