package controllers;

import java.util.List;

import models.Postagem;
import play.mvc.Controller;

public class Postagens extends Controller {
	
	public static void form() {
		 render();
	}
	
	public static void salvar(Postagem p) {
		p.save();
		form();
		listar();
		 
	}
	
	public static void listar() {
		List<Postagem> listar = Postagem.findAll();
		render(listar);
	}
	
	public static void remover(long id) {
		Postagem p = Postagem.findById(id);
		p.delete();
		flash.success("Postagem removida");
		listar();
	}
	
	
	
}
