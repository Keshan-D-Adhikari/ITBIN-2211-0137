/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.db.DatabaseFunctions;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nimesh.Hathurusinghe
 */
public class UserController {

    DatabaseFunctions databaseFunctions;

    public UserController() {

        databaseFunctions = new DatabaseFunctions();
    }

    public boolean userLogin(String userName, String password) throws SQLException {
        String sql = "SELECT * FROM user where username='" + userName + "' AND password='" + password + "'";

        System.out.println(sql);
        ResultSet resultSet = databaseFunctions.getData(sql);
        
        

        if (resultSet.next()) {
            return true;
        } else {
            return false;

        }
    }
}
