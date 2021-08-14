package com.xyz.t1_deomRest_jersey;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("aliens")
public class Alien_Controller_or_resource {
	
	AlienDao ad=new AlienDao();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAliens() {
		
		System.out.println("getting called");
		
		return ad.getAliens();
	}
	
	@GET
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alien getAlien(@PathParam("id") int id) {
		
	return ad.getAlien(id);
	}

	@POST
	@Path("alien")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Alien createAlien(Alien a) {
		
		System.out.println(a);
		ad.create(a);
		return a;
	}
	@PUT
	@Path("alien")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Alien updateAlien(Alien a) {
		
		System.out.println(a);
		if(ad.getAlien(a.getId()).getId()==0) {
			ad.create(a);
		}
		else
		{
		ad.update(a);
		}
		return a;
	}
	@DELETE
	@Path("alien/{id}")
	@Consumes({MediaType.APPLICATION_XML,MediaType.APPLICATION_JSON})
	public Alien deleteAlien(@PathParam("id") int id) {
		
		Alien a=ad.getAlien(id);
		
		if(a.getId()!=0) {
			ad.delete(id);
		}
		
		return a;
	}
}