package com.modip.senforagespring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.modip.senforagespring.dao.IClient;
import com.modip.senforagespring.entities.Client;

@Controller
public class ClientController {
	@Autowired
	private IClient clientdao;
	@RequestMapping(value="client/liste")
	public ModelAndView list () {
		List<Client> clients = clientdao.findAll ();
		return new ModelAndView ("client/liste","liste_clients", clients);
	}

}
