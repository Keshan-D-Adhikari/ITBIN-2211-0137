/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.db.DatabaseFunctions;
import controller.util.CommonUtils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

/**
 *
 * @author Nimesh.Hathurusinghe
 */
public class BookRetunController {

    DatabaseFunctions databaseFunctions;

    public BookRetunController() {
        databaseFunctions = new DatabaseFunctions();
    }
    
     public int updateBookReturn(String  barrowId,String indexNo,String panalty) throws SQLException {

        String sql = "UPDATE borrow SET"
                + " status='1' "
                + " WHERE index_no='" + indexNo+ "'";
        
         String sql2 = "INSERT INTO panelty_payment (member_id,panelty,date) VALUES"
                + " ('"+barrowId+"','"+panalty+"','"+CommonUtils.getStringDate(new Date())+"') ";
         
         System.out.println(sql2);
         
         databaseFunctions.saveOrUpdate(sql2);

        return databaseFunctions.saveOrUpdate(sql);

    }

    public ResultSet getReturnBooks(String memberID) throws SQLException {
        String sql = "SELECT b.book_id,b.`name`,bw.index_no from borrow as bw \n"
                + "INNER JOIN borrow_book bk ON bw.index_no=bk.borrow_id \n"
                + "INNER JOIN book b ON b.book_id=bk.book_id "
                + "WHERE bw.member_id='" + memberID + "' AND bw.status=0 ";

        System.out.println(sql);

        return databaseFunctions.getData(sql);
    }
    
        public int getDueDates(String memberID) throws SQLException {
            
            String today= CommonUtils.getStringDate(new Date());
            
        String sql = "SELECT  DATEDIFF('"+today+"' , return_date ) as dayCount FROM borrow "
                + "WHERE member_id='" + memberID + "' and status=0";
        
            System.out.println(sql);

        ResultSet resultSet = databaseFunctions.getData(sql);
        if(resultSet.next()){
            int parseInt = Integer.parseInt(resultSet.getString(1));
            
            if(parseInt>0){
            return parseInt;
            }
        }
        return 0;
    }

}
