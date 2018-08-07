package com.hand.infra.util;

import com.hand.Film;
import com.hand.infra.config.FilmDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main(String[] args) {
        System.out.println("Context Start");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Film film = (Film) context.getBean("film");

        FilmDao filmDao = new FilmDao();
        filmDao.insertOne();

        System.out.println("Context Stop");

    }
}
