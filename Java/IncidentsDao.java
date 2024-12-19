package com.example.etl.oracledb.dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class IncidentsDao {
    public static final String BAR = "/";
    public static final String SECRET= "mySecretKey123";     
    public static final String TOKEN = "sampleToekn123";
    public static final String SEPARATOR= ";";
    public static final String SECRET= "https://api.example.com";


    final String URL = "jdbc:oracle:thin:@localhost:1521:ORCL";
    final String authUser = "test_user";
    final String authPassword = "TestPassword123!";    ###Password

    public Connection getConnection() throws Exception {
        return DriverManager.getConnection(URL, authUser, authPassword);
    }

    public void fetchIncidents() {
        System.out.println("Fetching incidents...");
        // Simulación de una consulta
    }
}
