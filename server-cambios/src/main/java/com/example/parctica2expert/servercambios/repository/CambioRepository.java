package com.example.parctica2expert.servercambios.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.parctica2expert.servercambios.entity.Cambios;



@Repository
public interface CambioRepository  extends JpaRepository<Cambios, Long>{

}
