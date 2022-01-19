package com.LamiaOmar.PointDeVente.webservices;

import com.LamiaOmar.PointDeVente.beans.Commande;
import com.LamiaOmar.PointDeVente.beans.CommandeLogs;
import com.LamiaOmar.PointDeVente.services.CommandeLogsService;
import com.LamiaOmar.PointDeVente.services.CommandeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/logs")

public class CommandeLogsWS {


    @Autowired
    private CommandeLogsService logsService;
    @GetMapping("")
    public List<CommandeLogs> findAll(){ return logsService.findAll(); }

    @GetMapping("{id}")
    public CommandeLogs findById(@PathVariable long id){ return logsService.findById(id);}

    @PostMapping("")
    public CommandeLogs save(@RequestBody CommandeLogs cl){ return logsService.save(cl); }

    @DeleteMapping("delete/{id}")
    public  void deleteById(@PathVariable long id){ logsService.DeleteById(id); }

    @PutMapping("{id}")
    public CommandeLogs update(@PathVariable long id, @RequestBody CommandeLogs cl){

        return logsService.update(id, cl);
    }
}
