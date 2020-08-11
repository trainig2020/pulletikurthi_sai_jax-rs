package com.satya.jaxrs.messenger.resources;

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

import com.satya.jaxrs.messenger.model.Messenger;
import com.satya.jaxrs.messenger.service.MessengerService;

@Path("/message")
public class Message {
	MessengerService messengerService=new MessengerService();
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Messenger> getAllMessages() {
    	
    	
		return messengerService.getAllMessages();
	}
    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_JSON)
	public Messenger messenger(@PathParam("messageId") long id) {
    	
    	
		return messengerService.getMessages(id);
	}
    @POST
   @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
	public Messenger addMessenger(Messenger messenger) {
    	
    	
		return messengerService.addMessages(messenger);
	}
    
    @PUT
    @Path("/{messageId}")
    @Consumes(MediaType.APPLICATION_JSON)
     @Produces(MediaType.APPLICATION_JSON)
 	public Messenger updateMessenger(@PathParam("messageId") long id,Messenger messenger) {
     	
     	messenger.setId(id);
 		return messengerService.updateMessages(messenger);
 	}
    @DELETE
    @Path("/{messageId}")
     @Produces(MediaType.APPLICATION_JSON)
 	public Messenger removeMessenger(@PathParam("messageId") long id) {
     	
 		return messengerService.removeMessages(id);
 	}
}
