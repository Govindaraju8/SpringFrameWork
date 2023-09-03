package com.doctorapp.spring.jdbc.dals;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

public class CredentialsDAL {
	private String username;
    private String passwordd;
    private HashMap<String, String> h1 = new HashMap<>();

    public CredentialsDAL(String n, String p) {
        this.username = n;
        this.passwordd = p;
    }

    public boolean verification() {
        boolean check = false;
        getdatafromDB();
        if (h1.containsKey(username)) {
            if (h1.get(username).equals(passwordd)) {
                check = true;
            }
        }
        return check;
    }

    public void getdatafromDB() {
        try {
            String url = "jdbc:postgresql://localhost:5432/postgres";
            String dbUsername = "postgres";
            String dbPassword = "Postgres";
            Class.forName("org.postgresql.Driver");

            Connection c = DriverManager.getConnection(url, dbUsername, dbPassword);
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("SELECT username, passwordd FROM Credentialss");

            while (rs.next()) {
                h1.put(rs.getString(1), rs.getString(2));
            }

            // Close resources (should be done in a finally block or try-with-resources)
            rs.close();
            st.close();
            c.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
