/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.librobibl.Repository;

import com.example.librobibl.Entity.Biblioteca;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 *
 * @author salguero
 */
public interface BibliotecaRepository extends JpaRepository<Biblioteca, Integer>{

}
