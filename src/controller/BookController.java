/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.db.DatabaseFunctions;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.BookModel;

/**
 *
 * @author keshan
 */
public class BookController {

    DatabaseFunctions databaseFunctions;

    public BookController() {
        databaseFunctions = new DatabaseFunctions();
    }

    public int saveBook(BookModel book) throws SQLException {
        String sql = "Insert into book"
                + "(book_id,name,price,language,category,author,active)values"
                + "('" + book.getbookId() + "','" + book.getname() + "','" + book.getprice() + "','" + book.getlanguage() + "','" + book.getcategory() + "','" + book.getauthor() + "',1)";

        return databaseFunctions.saveOrUpdate(sql);
    }

    public int updateBook(BookModel book) throws SQLException {

        String sql = "UPDATE book SET"
                + " name='" + book.getname() + "',price='" + book.getprice() + "',language='" + book.getlanguage() + "',category='" + book.getcategory() + "',author='" + book.getauthor() + "' "
                + " WHERE book_id='" + book.getbookId() + "' AND active=1";

        return databaseFunctions.saveOrUpdate(sql);

    }
    
      public String getNewBookId() throws SQLException {
        String sql = "SELECT COUNT(book_id)+1 as new_id FROM book";

        ResultSet resultSet = databaseFunctions.getData(sql);

        if (resultSet.next()) {
            String string = resultSet.getString(1);
            return string;
        }
        return null;
    }

    public ResultSet getAllBooks() throws SQLException {
        String sql = "SELECT `book_id`, `name`, `price`, `language`, `category`, `author` FROM book WHERE active=1 ORDER BY book_id ASC";
        ResultSet data = databaseFunctions.getData(sql);
        return data;
    }

    public String getBookName(String id) throws SQLException {
        String sql = "SELECT `name` FROM book WHERE `book_id`='" + id + "'";
        ResultSet data = databaseFunctions.getData(sql);
        if (data.next()) {
            return data.getString(1);
        } else {
            return "";
        }
    }

    public int deleteBook(String bookID) throws SQLException {
        String sql = "UPDATE book SET active=0 WHERE book_id=" + bookID + "";
        return databaseFunctions.saveOrUpdate(sql);
    }

    public ResultSet getBookByID(String id) throws SQLException {
        String sql = "SELECT `book_id`, `name`, `price`, `language`, `category`, `author` FROM book WHERE `book_id`='" + id + "'";
        ResultSet data = databaseFunctions.getData(sql);
        return data;
    }

}
