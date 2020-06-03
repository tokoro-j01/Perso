package com.personel.second.action;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import com.personel.second.dto.Person;

public class Read  {
		//ファイルをlistに格納する
		public List<Person> get(String filename) throws IOException, ParseException {

			ArrayList <Person>List=new ArrayList<Person>();
			File file=new File(filename);
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			String line;
	        //BufferReaderのメソッドで一行ずつ読み込む
			while (( line = br.readLine()) != null) {
				String[] info=line.split(",");
				Person stuff=new Person();
				stuff.setId(info[0]);
				stuff.setDepartID(info[1]);
				stuff.setName(info[2]);
				stuff.setFurigana(info[3]);
				stuff.setSex(info[3]);
				stuff.setBirthday(info[4]);
				stuff.setHomePhone(info[5]);
				stuff.setSumahoPhone(info[6]);
				stuff.setEmail(info[7]);
				stuff.setPositionID(info[8]);
				stuff.setJoinDate(info[9]);


				//Listに格納
				List.add(stuff);
			}
			br.close();
	        return List;
		}
		public List<Person> getComm(String filename) throws IOException, ParseException{

			ArrayList <Person>List=new ArrayList<Person>();
			File file=new File(filename);
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			String line;
	        //BufferReaderのメソッドで一行ずつ読み込む
			while (( line = br.readLine()) != null) {
				String[] info=line.split(",");
				Person stuff=new Person();
				stuff.setName(info[0]);
				stuff.setAdress(info[1],info[2]);
				stuff.setHomePhone(info[3]);
				stuff.setSumahoPhone(info[4]);
				stuff.setEmail(info[5]);
			}
			br.close();
			return List;
			}
		public List<Person> getdept(String filename) throws IOException, ParseException{

			ArrayList <Person>List=new ArrayList<Person>();
			File file=new File(filename);
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			String line;
	        //BufferReaderのメソッドで一行ずつ読み込む
			while (( line = br.readLine()) != null) {
				String[] info=line.split(",");
				Person stuff=new Person();
				stuff.setName(info[0]);
				stuff.setDepartID(info[1]);
				stuff.setPositionID(info[2]);
				stuff.setBirthday(info[3]);
			}
			br.close();
			return List;
			}
		public List<Person> getBase(String filename) throws IOException, ParseException{

			ArrayList <Person>List=new ArrayList<Person>();
			File file=new File(filename);
			FileReader fileReader = new FileReader(file);
			BufferedReader br = new BufferedReader(fileReader);
			String line;
	        //BufferReaderのメソッドで一行ずつ読み込む
			while (( line = br.readLine()) != null) {
				String[] info=line.split(",");
				Person stuff=new Person();
				stuff.setName(info[0]);
				stuff.setFurigana(info[1]);
				stuff.setSex(info[2]);
				stuff.setBirthday(info[3]);
			}
			br.close();
			return List;
			}
		//Listを他のListに入れる
		public static void listIn(List<Person> list1,List<Person> list2) {
			for(int i=0,num=list2.size();i<num;i++) {
				Person s=list2.get(i);
				list1.add(s);
			}
		}
}
