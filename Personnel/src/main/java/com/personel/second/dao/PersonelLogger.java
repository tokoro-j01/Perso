package com.personel.second.dao;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.personel.second.dto.Person;

public class PersonelLogger {
	public static Logger log = Logger.getLogger(Person.class);
	static {
	    DOMConfigurator.configure("log4j.xml");
	}
	public static Logger getLogger() {
		return log;
	}
}
