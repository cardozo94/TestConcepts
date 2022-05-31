package com.camacar.demorest;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("aliens")
public class AliensResource {
	
	private static AlienRepository repo = new AlienRepository();
	private AlienDataBase dbAlien = new AlienDataBase();
	
	/*@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getAlienName() {
		Alien a1 = new Alien();
		a1.setName("Camilo");
		a1.setPoints(100);
		return a1.toString();
	}*/
	
	/* resource class
	 * @GET
	@Produces(MediaType.APPLICATION_XML)
	public Alien getAlien() {
		System.out.println("get alien");
		Alien a1 = new Alien();
		a1.setName("Camilo");
		a1.setPoints(100);
		return a1;
	}*/
	
	/* list as result
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Alien> getAlien() {
		System.out.println("get alien list");
		Alien a1 = new Alien();
		a1.setName("Camilo");
		a1.setPoints(100);
		
		Alien a2 = new Alien();
		a2.setName("Briyith");
		a2.setPoints(1000);
		
		List<Alien> aliens = Arrays.asList(a1, a2);
		return aliens;
	}*/

	@GET
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public synchronized List<Alien> getAliens() {
		System.out.println("get alien list from DDBB. ");
		
//		return repo.getAliens();
		return dbAlien.getAliens();
	}
	
	/*@GET
	@Path("alien/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public synchronized Alien getAlien(@PathParam("id") int id) {
		return repo.getAlien(id);
	}*/
	
	@GET
	@Path("alien/{id}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public synchronized Alien getAlien(@PathParam("id") int id) {
//		return repo.getAlien(id);
		return dbAlien.getAlien(id);
	}
	
	@POST
	@Path("alien")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public synchronized Alien createAlien(Alien alien) {
		System.out.println("create alien "+alien);
//		repo.creteAlien(alien);
		dbAlien.createAlien(alien);
		return alien;
	}
	
	@PUT
	@Path("alien")
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public Alien updateAlien(Alien alien) {
		System.out.println("update alien "+alien);
//		repo.creteAlien(alien);
		dbAlien.updateAlien(alien);
		return alien;
	}
	
	@DELETE
	@Path("alien/{id}")
	public Alien killAlien(@PathParam("id") int id) {
		Alien alien = dbAlien.getAlien(id);
		if(alien.getId()!=0)
			dbAlien.deleteAlien(id);
		return alien;
	}
}
