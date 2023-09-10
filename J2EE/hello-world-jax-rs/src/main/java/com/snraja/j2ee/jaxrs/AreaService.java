package com.snraja.j2ee.jaxrs;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/area")
public class AreaService {

	@GET
	@Path("/cities")
	@Produces(MediaType.APPLICATION_JSON)
	public String getArea() {
		return "{ Mumbai : 603.4 km^2 \n Bangalore : 741 km^2 \n Chennai : 426 km^2 } ";
	}
}
