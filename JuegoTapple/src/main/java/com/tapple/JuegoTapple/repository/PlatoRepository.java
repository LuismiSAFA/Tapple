package com.tapple.JuegoTapple.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tapple.JuegoTapple.entity.Plato;
 
@Repository
public interface PlatoRepository extends JpaRepository<Plato, Long>{

}
