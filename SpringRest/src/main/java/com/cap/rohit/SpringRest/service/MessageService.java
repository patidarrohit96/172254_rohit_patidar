package com.cap.rohit.SpringRest.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.cap.rohit.SpringRest.database.DatabaseClass;
import com.cap.rohit.SpringRest.model.Message;

public class MessageService {
	
  private Map<Long, Message> messages=DatabaseClass.getMessages();
	
	
//public List<Message> getAllMessages(){
//	Message m1=new Message(1l, "hello", "Rohit");
//	Message m2=new Message(2l, "hey", "rohit");
//	List<Message> list=new ArrayList<Message>();
//	list.add(m1);
//	list.add(m2);
//	return list;
	
  public MessageService()
  {
	  messages.put(1L, new Message(1,"hello world","rohit"));
	  messages.put(2L, new Message(2,"hello baby","rohit"));
  }
	
	public List<Message> getAllMessages()
	{
	messages.values();
	return new ArrayList<Message>(messages.values());
    }
	
	public Message getMessage(Long id)
	{
	messages.values();
	return messages.get(id);
    }
	
	public Message addMessage(Message message)
	{
	message.setId(messages.size()+1);
	messages.put(message.getId(), message);
	
	return message;
	
    }
	
	public Message updateMessage(Message message)
	{
	if(message.getId()<=0)
	{
		return null;
    }
	messages.put(message.getId(),message);
	return message;
	}
	public Message removeMessage(Long id) {
	return messages.remove(id);
	
	
	}
	
}

