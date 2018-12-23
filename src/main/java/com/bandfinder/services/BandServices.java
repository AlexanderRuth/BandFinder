package com.bandfinder.services;  

import java.io.IOException; 
import java.util.List;  
import javax.servlet.http.HttpServletResponse; 
import javax.ws.rs.Consumes; 
import javax.ws.rs.DELETE; 
import javax.ws.rs.PathParam; 
import javax.ws.rs.GET; 
import javax.ws.rs.OPTIONS; 
import javax.ws.rs.POST; 
import javax.ws.rs.PUT; 
import javax.ws.rs.Path; 
import javax.ws.rs.PathParam; 
import javax.ws.rs.Produces; 
import javax.ws.rs.core.Context; 
import javax.ws.rs.core.MediaType;  
import com.bandfinder.dao.BandDAO;  

@Path("/BandServices") 

public class BandServices {  
	
   @POST
   @Path("/Band/{payload}") 
   @Consumes(MediaType.APPLICATION_JSON)
   public void addBand(@PathParam("payload") String data)
   {
	   
	   BandDAO bdao = new BandDAO();
	   bdao.addBand(data);
   }
   
   @GET
   @Path("/Band") 
   @Produces(MediaType.APPLICATION_JSON)
   public String getBand()
   {
	   return "Poo";
   }
}