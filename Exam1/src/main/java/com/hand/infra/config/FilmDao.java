package com.hand.infra.config;

import com.hand.Film;
import com.hand.infra.mapper.FilmMapper;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class FilmDao {
    public void insertOne() {
        DBAccess dbAccess = new DBAccess();
        SqlSession sqlSession = null;
        String filmTitle = "ALICE";
        String description = "aaaaaaaaaaaaaaa";
        int languageId = 1;
        try {
            sqlSession = dbAccess.getSqlSession();
            Film film = new Film();
            film.setDescription(description);
            film.setLanguageId(languageId);
            film.setOriginalLanguageId(1);
            film.setReleaseYear("2018");
            film.setTitle(filmTitle);
            film.setRentalDuration(8);
            System.out.println("Film Title: "+filmTitle);
            System.out.println("Film Description: "+description);
            System.out.println("Film LanguageId: "+languageId);
            // 通过sqlSession执行SQL
            FilmMapper messageMapper = sqlSession.getMapper(FilmMapper.class);
            messageMapper.insertOne(film);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

}
