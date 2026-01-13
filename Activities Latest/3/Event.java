package com.adobe.ase.aem.training.core.models;

import java.util.Date;
import java.util.List;

public interface Event {
	public String getName();
	public Date getDate();
	public String getVenue();
	public List<Session> getSession();
}
