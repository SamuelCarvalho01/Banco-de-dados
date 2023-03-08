package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entidades.Categoria;
import com.example.demo.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repos;
	
	public Categoria buscar(Integer id) {
		Optional <Categoria> obj = repos.findById(id);
		return obj.orElse (null);
	}
}
