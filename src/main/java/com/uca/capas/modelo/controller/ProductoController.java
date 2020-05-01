package com.uca.capas.modelo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.modelo.domain.Producto;

@Controller
public class ProductoController {
	
	@RequestMapping("/producto")
	public ModelAndView index11() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", new Producto());
		mav.setViewName("clases/claseProducto/index");
		return mav;
	}
	

	
	@RequestMapping("/procesarProd")
	public ModelAndView procesar2(@Valid @ModelAttribute Producto product, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		
		if(result.hasErrors()) {
			mav.setViewName("clases/claseProducto/index");
		}
		else { //Si no hay, flujo normal
			String mensaje = "Producto " + product.getNombre() +" guardado con éxito";
			mav.addObject("mensaje", mensaje);
			mav.setViewName("clases/claseProducto/resultado");
		}
		return mav;
	}

}
