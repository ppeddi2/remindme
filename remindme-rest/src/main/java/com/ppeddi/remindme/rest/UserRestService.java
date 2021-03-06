/**
 * 
 */
package com.ppeddi.remindme.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.ppeddi.remindme.domain.User;

/**
 * @author ppeddi
 * 
 */
@Path("/v1/user")
@Consumes("application/json")
@Produces("application/json")
public interface UserRestService {

	@POST
	@Path("/")
	String createUser(User user);

	@PUT
	@Path("/")
	void updateUser(User user);

	@GET
	@Path("/{userId}")
	User retrieveUser(@PathParam("userId") String userId);
	
	@GET
	@Path("/userName/{userName}")
	User retrieveUserByUserName(@PathParam("userName") String userName);
}
