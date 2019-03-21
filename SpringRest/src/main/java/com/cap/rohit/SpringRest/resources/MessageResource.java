package com.cap.rohit.SpringRest.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cap.rohit.SpringRest.model.Message;
import com.cap.rohit.SpringRest.service.MessageService;

@Path("/messages")
public class MessageResource {
	MessageService messageService=new MessageService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages()
	{
		
		return messageService.getAllMessages();
		
	}
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Message getMessage(@PathParam("messageId") long messageId)
	{
		return messageService.getMessage(messageId);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)
	public Message addMessage(Message message)
	{
	return messageService.addMessage(message);
	}
	
	
	@PUT
	@Path("/{messageId}")
	@Consumes(MediaType.APPLICATION_JSON)	
	@Produces(MediaType.APPLICATION_JSON)
	public Message updateMessage(@PathParam("messageId") long messageId,Message message)
	{
		message.setId(messageId);
	return messageService.updateMessage(message);
	}
	
	
		
		
		
}
