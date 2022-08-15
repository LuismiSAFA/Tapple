package com.tapple.JuegoTapple.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tapple.JuegoTapple.entity.Plato;

@Repository
public class PlatoDAOImpl implements PlatoDAO{
	
	 @Autowired
	    private EntityManager entityManager;

	@Override
	public List<Plato> findAll() {
		Session currentSession = entityManager.unwrap(Session.class);

        Query<Plato> theQuery = currentSession.createQuery("from platos", Plato.class);

        List<Plato> platos = theQuery.getResultList();
        
		return platos;
	}

	@Override
	public Plato findById(int id) {
		
		Session currentSession = entityManager.unwrap(Session.class);

		Plato plato = currentSession.get(Plato.class, id);

        return plato;
	}

	@Override
	public void save(Plato plato) {
		
		Session currentSession = entityManager.unwrap(Session.class);

        currentSession.saveOrUpdate(plato); 
		
	}

	@Override
	public void deleteById(int id) {
		
		Session currentSession = entityManager.unwrap(Session.class);

        Query<Plato> theQuery = currentSession.createQuery("delete from platos where id=:idPlato");

        theQuery.setParameter("idPlato", id);
        theQuery.executeUpdate();
		
	}
	 
	

}
