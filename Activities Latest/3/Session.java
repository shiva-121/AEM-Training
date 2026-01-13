package com.adobe.ase.aem.training.core.models;

import java.util.Date;

public interface Session {
	public String getTitle();
	public String getSpeaker();
	public Date getStartTime();
	public Date getEndTime();
}
