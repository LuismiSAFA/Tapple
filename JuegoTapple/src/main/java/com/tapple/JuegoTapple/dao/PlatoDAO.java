package com.tapple.JuegoTapple.dao;

import java.util.List;
import com.tapple.JuegoTapple.entity.Plato;

public interface PlatoDAO {

	public List<Plato> findAll();

    public Plato findById(int id);

    public void save(Plato plato);

    public void deleteById(int id);
	
}
