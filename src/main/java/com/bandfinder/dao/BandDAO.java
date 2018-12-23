package com.bandfinder.dao;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.bandfinder.models.Band;
import com.mysql.cj.xdevapi.JsonParser;

public class BandDAO {
			
		public void addBand(String bandInfo)
		{
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("bandfinderPU");
			EntityManager entityManager = factory.createEntityManager();
			entityManager.getTransaction().begin();
			
			Band newBand = new Band();
			
			JSONObject params = new JSONObject(bandInfo);
			
			newBand.setName(params.getString("name"));
			newBand.setGenre(params.getString("genre"));
			
			entityManager.persist(newBand);
			
			entityManager.getTransaction().commit();
			entityManager.close();
			factory.close();
		}
}
