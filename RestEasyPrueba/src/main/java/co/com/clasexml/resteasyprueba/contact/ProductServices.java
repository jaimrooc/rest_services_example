/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.clasexml.resteasyprueba.contact;

import co.com.clasexml.resteasyprueba.entities.Product;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author jaro
 */
@Path("/product")
public interface ProductServices {
    
    @Path("/getAllproducts")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    List<Product> getProducts();
    
    @Path("/getProduct")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    Product getProducts(@QueryParam("code") String code);
    
    @Path("/updateProduc")
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    void updateProduct(Product product);
    
    @Path("/createProduc")
    @PUT
    void create(@FormParam("code") String code, 
            @FormParam("name") String name, @FormParam("cost") double cost);
}
