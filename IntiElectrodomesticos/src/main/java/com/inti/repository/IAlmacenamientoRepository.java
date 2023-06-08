package com.inti.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.inti.model.Almacenamiento;

@Repository
public interface IAlmacenamientoRepository extends JpaRepository<Almacenamiento, Integer>{

}
