package com.inti.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.inti.model.Producto;
import com.inti.repository.IAlmacenamientoRepository;
import com.inti.repository.IMarcaRepository;
import com.inti.repository.IProductoRepository;

@Controller
public class ProductoController {
	
	@Autowired
	private IProductoRepository repoProd;
	
	@Autowired
	private IMarcaRepository repoMarc;
	
	@Autowired
	private IAlmacenamientoRepository repoAlm;
	
	// Cargar el mantener producto
	@GetMapping("/mantenimientoProducto")
	public String pagProducto(@ModelAttribute Producto producto,Model model) {
		model.addAttribute("listMarca", repoMarc.findAll());
		model.addAttribute("listAlmacenamiento", repoAlm.findAll());
		model.addAttribute("listProducto", repoProd.findAll());
		model.addAttribute("producto", new Producto());
		
		return "mantenimientoProducto";
	}

	@GetMapping("/inicio")
	public String pagInicio(Model model) {
		model.addAttribute("producto", new Producto());
		return "index";
	}

	// Método para guardar el producto
	@PostMapping("/producto/grabar")
	public String grabarProducto(@ModelAttribute Producto producto, Model model) {
	    model.addAttribute("listMarca", repoMarc.findAll());
	    model.addAttribute("listAlmacenamiento", repoAlm.findAll());
	    
	    try {
			repoProd.save(producto);
			model.addAttribute("mensaje", "Registro correcto");
			model.addAttribute("clase", "alert alert-success");
			
		} catch (Exception e) {
			model.addAttribute("mensaje", "Registro incorrecto");
			model.addAttribute("clase", "alert alert-danger");	
		}
	    
	    return "redirect:/mantenimientoProducto";
	}
	
	//Controlador para eliminar 
	@GetMapping("/eliminar/{id}")
	public String eliminarElemento(@PathVariable("id") Integer id, Model model) {
		repoProd.deleteById(id);	
		return "redirect:/mantenimientoProducto";
	}
	
}



