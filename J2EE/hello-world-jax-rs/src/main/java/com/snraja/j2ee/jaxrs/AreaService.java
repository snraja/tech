package com.snraja.j2ee.jaxrs;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/area")
public class AreaService {

	@GET
	@Path("/cities-json")
	@Produces(MediaType.APPLICATION_JSON)
	public List<AreaModel> getArea() {
		
		return this.getCityAreasModel();
	}
	
	@GET
	@Path("/cities-jsondb")
	@Produces(MediaType.APPLICATION_JSON)
	public List<AreaModel> getAreaDB() {
		DataStore ds = new DataStore();
		return ds.getAreaData();
	}
	
	@GET
	@Path("/cities-jsondb-html")
	@Produces(MediaType.TEXT_HTML)
	public String getAreaDBHtml() {
		StringBuilder sb = new StringBuilder(500);
		sb.append("<html>");
		sb.append("<head><title>Cities - Area </title></head>");
		sb.append("<body>");
		sb.append("<table><tr><th>City</th><th>Area</th></tr>");
		DataStore ds = new DataStore();
		for (AreaModel am : ds.getAreaData()) {
			String trData = String.format("<tr><td>%s</td><td>%s</td></tr>", am.name, am.area);
			sb.append(trData);
		}
		sb.append("</table>");
		return sb.toString();
	}
	
	@GET
	@Path("/cities-text")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAreaInText() {
		return "Delhi, Bengaluru, Visakhapatnam, Hyderabad, Lucknow, Indore, Ahmedabad, Pune, Bhopal, Surat";
	}
	
	@GET
	@Path("/cities-persist")
	@Produces(MediaType.TEXT_PLAIN)
	public String saveEntity() {
		EntityManagerFactory emf = null;
		EntityManager entityManager = null;
		EntityTransaction transaction = null;

		try{
			emf = Persistence.createEntityManagerFactory("mysql_persistence_unit");
			entityManager = emf.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();

			Areadata ad = new Areadata();
			ad.id = 11;
			ad.name = "Araku";
			ad.area = "100";
					
			entityManager.persist(ad);

			transaction.commit();
			System.out.println("TRansaction commit complete");
		}catch(Exception e){
			transaction.rollback();
			System.out.println("transaction exception thrown " + e);
		}finally{
			entityManager.close();
			emf.close();
			System.out.println("transaction finally");
		}
		return "Persist Complete";
	}

	private List<AreaModel> getCityAreasModel() {
		List<AreaModel> list = new ArrayList<AreaModel>();
		list.add(new AreaModel("Delhi", "1398 km^2"));
		list.add(new AreaModel("Bengaluru", "741 km^2"));
		list.add(new AreaModel("Visakhapatnam", "681 km^2"));
		list.add(new AreaModel("Hyderabad", "650 km^2"));
		list.add(new AreaModel("Lucknow", "631 km^2"));
		list.add(new AreaModel("Indore", "564 km^2"));
		list.add(new AreaModel("Ahmedabad", "505 km^2"));
		list.add(new AreaModel("Pune", "485 km^2"));
		list.add(new AreaModel("Bhopal", "463 km^2"));
		list.add(new AreaModel("Surat", "461 km^2"));
		return list;
	}
}