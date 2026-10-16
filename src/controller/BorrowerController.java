/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.db.DatabaseFunctions;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.BarrowerModel;
import model.BorrowBooksModel;

/**
 *
 * @author keshan
 */
public class BorrowerController {

    DatabaseFunctions databaseFunctions;

    public BorrowerController() {

        databaseFunctions = new DatabaseFunctions();
    }

    public int getLastBorrowerId() throws SQLException {
        String sql = "SELECT max(index_no) as borrow_id FROM borrow";

        ResultSet resultSet = databaseFunctions.getData(sql);

        if (resultSet.next()) {
            int string = resultSet.getInt(1);
            return string;
        }
        return 0;
    }

    public int saveBarrowData(BarrowerModel barrower, BorrowBooksModel[] borrowBooks) throws SQLException {

        String sqlBarrower = "INSERT INTO borrow (member_id, due_date, return_date, status) VALUES "
                + "('" + barrower.getMemberId() + "' ,'" + barrower.getDueDate() + "','" + barrower.getReturnDate() + "','" + barrower.getStatus() + "')";

        int isBarrowerSaved = databaseFunctions.saveOrUpdate(sqlBarrower);
        if (isBarrowerSaved == 1) {

            for (BorrowBooksModel books : borrowBooks) {

                String sqlBarrowerBooks = "INSERT INTO borrow_book (borrow_id, book_id) VALUES "
                        + "('" + getLastBorrowerId() + "','" + books.getBookId() + "')";

                databaseFunctions.saveOrUpdate(sqlBarrowerBooks);
            }
        }

        return isBarrowerSaved;
    }

    public ResultSet getAllBorrower() throws SQLException {
        String sql = "SELECT `name`, `member_id`, `birthday`, `gender`, `mobile_number`, `email` FROM member";
        ResultSet data = databaseFunctions.getData(sql);
        return data;
    }

    // borrow== member_id, due_date, return_date, status
    // borrow_books == index_no, borrow_id, book_id
}
