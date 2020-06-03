package com.personel.second.action;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.personel.second.dto.Person;

public class Test {

	public static void main(String[] args) {

		Read r=new Read();
		List<Person>comm=new ArrayList<>();
		List<Person>base=new ArrayList<>();
		List<Person>dept=new ArrayList<>();
		List<Person>list=new ArrayList<>();

		try {
			comm=r.getComm("C:\\Users\\FS015\\Desktop\\comm.txt");
			base=r.getBase("C:\\Users\\FS015\\Desktop\\base.txt");
			dept=r.getdept("C:\\Users\\FS015\\Desktop\\dept.txt");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
		for(Person p:comm) {
			p.toString();
		}
		Read.listIn(list, comm);
		Read.listIn(list, base);
		Read.listIn(list, dept);



	}

}
