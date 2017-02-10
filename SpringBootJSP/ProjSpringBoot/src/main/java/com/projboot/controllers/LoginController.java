package com.projboot.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.projboot.models.JpaUsuarioDao;
import com.projboot.models.Usuario;

@Controller
public class LoginController {

private JpaUsuarioDao dao;
	
	@Autowired
	public LoginController(JpaUsuarioDao dao){
		this.dao = dao;
	}
	
	@RequestMapping("/loginForm")
	public String loginForm() {
		return "formularioLogin";
	}
	
	@RequestMapping("efetuaLogin")
	public String efetuaLogin(Usuario usuario, HttpSession session) {
		if(dao.existeUsuario(usuario)) {
			session.setAttribute("usuarioLogado", usuario);
			return "forward:listaContatos";
		}
		return "redirect:loginForm";
	}
	
	@RequestMapping("logout")
	public String Logout(HttpSession session) {
		session.invalidate();
		return "redirect:loginForm";
	}
}
