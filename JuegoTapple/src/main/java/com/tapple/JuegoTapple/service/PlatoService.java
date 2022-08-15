package com.tapple.JuegoTapple.service;

import java.util.List;
import com.tapple.JuegoTapple.entity.Plato;


public interface PlatoService {
	
	public List<Plato> findAll();

    public Plato findById(int id);

    public void save(Plato plato);

    public void deleteById(int id);
    
}
