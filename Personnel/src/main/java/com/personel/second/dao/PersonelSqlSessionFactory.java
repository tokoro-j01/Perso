package com.personel.second.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import com.personel.second.dto.Person;


public class PersonelSqlSessionFactory {
	private static Logger log = Logger.getLogger(Person.class);
	public static SqlSessionFactory getSqSessionFactory() {
		DOMConfigurator.configure("log4j.xml");
		SqlSessionFactory mSessionFactory = null;
		Reader reader;
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            mSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            log.info("SqlSessionFactoryオブジェクトが作成された。");
        } catch (IOException e) {
        	e.printStackTrace();
        }
        return mSessionFactory;
    }
}

