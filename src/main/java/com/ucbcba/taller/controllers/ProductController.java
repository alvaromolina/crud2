package com.ucbcba.taller.controllers;


import com.ucbcba.taller.entities.Product;
import com.ucbcba.taller.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * Product controller.
 */
@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }


    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/product/new", method = RequestMethod.GET)
    public String newProduct(Model model) {
        return "newProduct";
    }



    /* List all products.
     *
     * @param model
     * @return
     */

    @RequestMapping(value = "/product/{id}", method = RequestMethod.GET)
    public String showProduct(@PathVariable Integer id, Model model) {
        model.addAttribute("otracosa", productService.getProductById(id));
        return "product";
    }


    @RequestMapping(value = "/product/eliminar/{id}", method = RequestMethod.GET)
    public String deleteProduct(@PathVariable Integer id, Model model) {
        //Falta borrar
        return "product";
    }


    /**
     * List all products.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("products", productService.listAllProducts());
        return "products";
    }



}