/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.JDBCImplement;

import Service.HibernateImplement.*;
import Domain.Author;
import java.util.ArrayList;
import java.util.List;
import Service.IAuthorService;
import Service.IAuthorService;
import Service.IAuthorServiceJDBC;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author KRichards
 */
public class AuthorImplementJDBC extends JDBCMainConfiguration implements IAuthorServiceJDBC {
    
 Statement statement;
 
 @Override 
    public void addAuthorJDBC(Author author) throws Exception {
        
        String insertAuthor = "INSERT INTO author(id, authorcode, firstname, lastname) "
                + "values('" + author.getId() + 
                "', '" + author.getAuthorCode()+
                "', '" + author.getFname() + 
                "', '" + author.getLname() + "')";    
        
        statement=this.getConnection().createStatement();        
        statement.execute(insertAuthor);      
        
        this.getConnection().close();       
    }

    @Override
    public void updateAuthorJDBC(Author author) throws Exception {
           
        String updateAuthor = "UPDATE author SET authorcode = '" + author.getAuthorCode()+ 
                "', firstname = '" + author.getFname() + 
                "', lastname = '" + author.getFname() + 
                
                "' WHERE ID = '"+ author.getId() +"'";        
        
        statement = this.getConnection().createStatement();
        
        int rowsUpdated = statement.executeUpdate(updateAuthor);
        if (rowsUpdated > 0) {
            System.out.println("Update Successful");
        }
        
        this.getConnection().close();  
    }

    @Override
    public Author getAuthorJDBC(int authorID) throws Exception {
        String selectAuthor = "Select * From author Where id = " + authorID;
        statement=this.getConnection().createStatement();
        
        ResultSet rs=statement.executeQuery(selectAuthor);
        
        Author author=new Author();
        author.setId(authorID);
        author.setAuthorCode(rs.getString("authorcode"));
        author.setFname(rs.getString("firstname"));
        author.setLname(rs.getString("lastname"));
             
        
        return author;
        
    }

    @Override
    public ResultSet getAllAuthorsJDBC() throws Exception {
        ResultSet rs=null;
        
        String SelectAll="Select * From author";
        statement=this.getConnection().createStatement();
        rs=statement.executeQuery(SelectAll);
        
        return rs;
    }

    @Override
    public void deleteAuthorJDBC(int authorId) throws Exception {
        statement=this.getConnection().createStatement();
        statement.execute("Delete From author Where id = " + authorId);
    }

   
}
