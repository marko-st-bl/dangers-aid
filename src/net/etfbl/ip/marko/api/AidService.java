package net.etfbl.ip.marko.api;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import net.etfbl.ip.marko.dao.AidDAO;
import net.etfbl.ip.marko.dto.Aid;

@Path("/aidservice")
public class AidService {
	
	@GET
	@Path("/aids")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Aid> getAids(){
		List<Aid> retVal = new ArrayList<>();
		retVal = new AidDAO().getAids();
		
		
		return retVal;
	}

}
