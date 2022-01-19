package com.LamiaOmar.PointDeVente.services;

import com.LamiaOmar.PointDeVente.beans.Admin;
import com.LamiaOmar.PointDeVente.dao.AdminDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class AdminService {

    @Autowired
    private AdminDAO admin_dao;

    public Admin save(Admin a){
        return admin_dao.save(a);
    }

    public Admin findById(long along){
            return admin_dao.findById(along).get();
    }

    public void DeleteById(Long along){
        admin_dao.deleteById(along);
    }

    public List<Admin> findAll(){
        return admin_dao.findAll();

    }

    public Admin update(long id, Admin a){
        Admin a1 = new Admin();
        a1 = this.findById(id);
        a1.setNom(a.getNom());
        a1.setEmail(a.getEmail());
        a1.setMdp(a.getMdp());

        this.save(a1);
        return a1;
    }



}
