/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.librobibl.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.librobibl.Entity.Libro;
/**
 *
 * @author salguero
 */


public interface LibroRepository extends JpaRepository<Libro, Integer>{

}
