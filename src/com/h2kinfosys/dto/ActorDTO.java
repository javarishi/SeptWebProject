package com.h2kinfosys.dto;

import java.io.Serializable;
import java.util.Date;

import com.thoughtworks.xstream.annotations.XStreamAlias;


@XStreamAlias("actor")
public class ActorDTO implements Serializable{
	
	public ActorDTO() {
		// TODO Auto-generated constructor stub
	}
	
	private String firstName;
	private String lastName;
	private int actorId;
	private Date lastUpdate;
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the actorId
	 */
	public int getActorId() {
		return actorId;
	}
	/**
	 * @param actorId the actorId to set
	 */
	public void setActorId(int actorId) {
		this.actorId = actorId;
	}
	/**
	 * @return the lastUpdate
	 */
	public Date getLastUpdate() {
		return lastUpdate;
	}
	/**
	 * @param lastUpdate the lastUpdate to set
	 */
	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

}
