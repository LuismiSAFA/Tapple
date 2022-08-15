package com.tapple.JuegoTapple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tapple.JuegoTapple.dao.PlatoDAO;
import com.tapple.JuegoTapple.entity.Plato;


@Service
public class PlatoServiceImpl implements PlatoService{
	
	@Autowired
    private PlatoDAO platoDAO;
	
	public List<Plato> findAll() {
        List<Plato> listPlatos= platoDAO.findAll();
        return listPlatos;
    }
	
	public Plato findById(int id) {
		Plato plato = platoDAO.findById(id);
        return plato;
    }

    public void save(Plato plato) {
    	platoDAO.save(plato);

    }

    public void deleteById(int id) {
    	platoDAO.deleteById(id);
    }

}
