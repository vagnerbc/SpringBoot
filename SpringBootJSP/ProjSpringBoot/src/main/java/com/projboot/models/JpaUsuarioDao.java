package com.projboot.models;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

@Repository
public class JpaUsuarioDao {

	@PersistenceContext
	private EntityManager manager;
	
	@SuppressWarnings("unchecked")
	public boolean existeUsuario(Usuario usuario){
		Query query =  manager.createQuery("select u from Usuario u where u.usuario = :USUARIO and u.senha = :SENHA");
		query.setParameter("USUARIO", usuario.getUsuario());
		query.setParameter("SENHA", usuario.getSenha());
		
		List<Usuario> usuarios = query.getResultList();
		
		return (usuarios.size() != 0);
		
		
	}
}
