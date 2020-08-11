package com.satya.jaxrs.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
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
    @Produces(MediaType.APPLICATION_XML)
	public List<Messenger> getAllMessages() {
    	
    	
		return messengerService.getAllMessages();
	}
   /* @GET
    @Path("/{messageId}")
    @Produces(MediaType.TEXT_PLAIN)
	public String test(@PathParam("messageId") String messageId) {
    	
    	
		return "got the param value"+messageId;
	}*/
    @GET
    @Path("/{messageId}")
    @Produces(MediaType.APPLICATION_XML)
	public Messenger messenger(@PathParam("messageId") long id) {
    	
    	
		return messengerService.getMessages(id);
	}
}
