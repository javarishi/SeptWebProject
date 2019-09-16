package com.h2kinfosys.util;

import java.util.ArrayList;
import java.util.Date;

import com.h2kinfosys.dto.ActorDTO;
import com.h2kinfosys.dto.Blog;
import com.h2kinfosys.dto.Entry;
import com.thoughtworks.xstream.XStream;

public class XMLConvertor {
	
	XStream xstream = null;
	
	public XMLConvertor() {
		 xstream = new XStream();
		 xstream.processAnnotations(ActorDTO.class);
		 xstream.processAnnotations(Blog.class);
		 xstream.processAnnotations(Entry.class);
	}
	
	
	public String convertToXML(Object obj) {
		String xmlResult = null;
		xmlResult = xstream.toXML(obj);
		return xmlResult;
	}
	
	
	public Object convertFromXML(String xml) {
		Object obj = null;
		obj = xstream.fromXML(xml);
		return obj;
	}
	

	public static void main(String[] args) {
		
		ActorDTO actor = new ActorDTO();
		actor.setActorId(100);
		actor.setFirstName("Ryan");
		actor.setLastName("Covix");
		actor.setLastUpdate(new Date());
		
		XMLConvertor convertor = new XMLConvertor();
		String xmlString = convertor.convertToXML(actor);
		
	//	System.out.println(xmlString);
		
		// Reverse this operation
		ActorDTO convertedActor = (ActorDTO) convertor.convertFromXML(xmlString);
	
	//	System.out.println(convertedActor.getActorId());
		
		
		Blog blog = new Blog();
		blog.setAuthor("Guilherme Silveira");
		
		ArrayList<Entry> entries = new ArrayList<Entry>();
		entries.add(new Entry("first", "My first blog entry."));
		entries.add(new Entry("tutorial", "Today we have developed a nice alias tutorial. Tell your friends! NOW!"));
		
		blog.setEntries(entries);
		
		String blogXML = convertor.convertToXML(blog);
		System.out.println(blogXML);
		
	}
	
}
