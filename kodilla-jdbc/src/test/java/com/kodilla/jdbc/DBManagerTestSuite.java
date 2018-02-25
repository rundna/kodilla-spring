package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DBManager dbManager = DBManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }
    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DBManager dbManager = DBManager.getInstance();

        //When
        String sqlQuery = "SELECT * FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(7, counter);
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException{
        //Given
        DBManager dbManager = DBManager.getInstance();

        //When
        String sqlQuery="SELECT U.FIRSTNAME, U.LASTNAME, COUNT(*)  AS POST_NUMBER " +
                "FROM USERS U, POSTS P " +
                "WHERE U.ID = P.USER_ID " +
                "GROUP BY P.USER_ID " +
                "HAVING COUNT(*)>=2";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while(rs.next()) {
            System.out.println(rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME")+"," +
                    rs.getInt("POST_NUMBER"));
            counter++;
        }
        rs.close();
        statement.close();
        Assert.assertEquals(2, counter);
    }
}