/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.JDBCImplement;

import Domain.Genre;
import Service.IGenreServiceJDBC;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Adrian
 */
public class GenreImplementJDBC extends JDBCMainConfiguration implements IGenreServiceJDBC {

     Statement statement;
     
    @Override
    public void addGenreJDBC(Genre genre) throws Exception {
        String insertGenre = "INSERT INTO genre(name) "
                + "values('" + genre.getName()+ "')";    
        
        statement=this.getConnection().createStatement();        
        statement.execute(insertGenre);      
        
        this.getConnection().close();       
    }

    @Override
    public void updateGenreJDBC(Genre genre) throws Exception {
        String updateGenre = "UPDATE author SET  name = '" + genre.getName()+ 
                
                "' WHERE ID = '"+ genre.getId() +"'";        
        
        statement = this.getConnection().createStatement();
        
        int rowsUpdated = statement.executeUpdate(updateGenre);
        if (rowsUpdated > 0) {
            System.out.println("Update Successful");
        }
        
        this.getConnection().close();  
    }

    @Override
    public Genre getGenreJDBC(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ResultSet getAllGenreJDBC() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteGenreJDBC(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
