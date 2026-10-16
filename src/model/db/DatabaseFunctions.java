/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.db;

import model.db.DBconnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author keshan
 */
public class DatabaseFunctions {

    public int saveOrUpdate(String sql) throws SQLException {
        PreparedStatement pst = DBconnect.connect().prepareStatement(sql);
        return pst.executeUpdate();
    }

    public ResultSet getData(String sql) throws SQLException {
        PreparedStatement pst = DBconnect.connect().prepareStatement(sql);
        return pst.executeQuery(sql);
    }

}
