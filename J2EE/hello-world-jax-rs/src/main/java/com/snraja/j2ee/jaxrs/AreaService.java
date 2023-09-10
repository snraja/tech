package com.snraja.j2ee.jaxrs;

import java.util.*;
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
	@Path("/cities-text")
	@Produces(MediaType.TEXT_PLAIN)
	public String getAreaInText() {
		return "Delhi, Bengaluru, Visakhapatnam, Hyderabad, Lucknow, Indore, Ahmedabad, Pune, Bhopal, Surat";
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