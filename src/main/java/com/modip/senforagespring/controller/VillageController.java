package com.modip.senforagespring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.modip.senforagespring.dao.IVillage;
import com.modip.senforagespring.entities.Village;

@Controller
public class VillageController {
	@Autowired
	private IVillage villagedao;
	
	@RequestMapping(value="client/ajout")
	public ModelAndView list() {
		List<Village> villages = villagedao.findAll();
		return new ModelAndView ("client/ajout","liste_villages", villages);
		 
	}

}
