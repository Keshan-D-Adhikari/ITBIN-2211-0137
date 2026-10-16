/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.db.DatabaseFunctions;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.MemberModel;

/**
 *
 * @author keshan
 */
public class MemeberController {

    DatabaseFunctions databaseFunctions;

    public MemeberController() {

        databaseFunctions = new DatabaseFunctions();
    }

    public int saveMember(MemberModel member) throws SQLException {
        String sql = "INSERT INTO `member` "
                + "(`name`, `member_id`, `birthday`, `gender`, `mobile_number`, `email`)"
                + " VALUES ('" + member.getName() + "', '" + member.getMemberId() + "', '" + member.getBirthday() + "', "
                + "'" + member.getGender() + "', '" + member.getMobileNumber() + "', '" + member.getEmail() + "')";

        return databaseFunctions.saveOrUpdate(sql);
    }
    
    public int updateMember(MemberModel member) throws SQLException {

        String sql = "UPDATE member SET"
                + " name='" + member.getName()+ "',birthday='" + member.getBirthday()+ "',gender='" + member.getGender()+ "',mobile_number='" + member.getMobileNumber()+ "',email='" + member.getEmail()+ "' "
                + " WHERE member_id='" + member.getMemberId()+ "'";

        return databaseFunctions.saveOrUpdate(sql);

    }

    public String getNewMemberId() throws SQLException {
        String sql = "SELECT COUNT(member_id)+1 as newMember_id FROM member";

        ResultSet resultSet = databaseFunctions.getData(sql);

        if (resultSet.next()) {
            String string = resultSet.getString(1);
            return string;
        }
        return null;
    }

    public ResultSet getAllMembers() throws SQLException {
        String sql = "SELECT `name`, `member_id`, `birthday`, `gender`, `mobile_number`, `email` FROM member  WHERE active=1 ORDER BY member_id ASC";
        ResultSet data = databaseFunctions.getData(sql);
        return data;
    }

    public String getMemberName(String id) throws SQLException {
        String sql = "SELECT `name` FROM member WHERE `member_id`='" + id + "'";
        ResultSet data = databaseFunctions.getData(sql);
        if (data.next()) {
            return data.getString(1);
        } else {
            return "";
        }
    }
    
     public int deleteMember(String ID) throws SQLException {
        String sql = "UPDATE member SET active=0 WHERE member_id=" + ID + "";
        return databaseFunctions.saveOrUpdate(sql);
    }

    public ResultSet getMemberByID(String id) throws SQLException {
        String sql = "SELECT `name`, `member_id`, `birthday`, `gender`, `mobile_number`, `email` FROM member WHERE `member_id`='" + id + "'";
        ResultSet data = databaseFunctions.getData(sql);
        return data;
    }

}
