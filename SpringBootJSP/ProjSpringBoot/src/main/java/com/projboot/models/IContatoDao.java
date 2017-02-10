package com.projboot.models;

import java.util.List;

public interface IContatoDao {
	
	public void adiciona(Contato contato);
	public List<Contato> getLista();
	public Contato getContato(long id);
	public void altera(Contato contato);
	public void remove(Contato contato);
}
