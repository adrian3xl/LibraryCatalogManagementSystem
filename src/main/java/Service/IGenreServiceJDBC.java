/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Domain.Genre;
import java.sql.ResultSet;

/**
 *
 * @author Adrian
 */
public interface IGenreServiceJDBC extends IService {
    
   public final String NAME="IGenreServiceJDBC";
    
    public void addGenreJDBC(Genre genre) throws Exception ; //method for adding genre
    
    public void updateGenreJDBC(Genre genre) throws Exception ; //method for updating a genre
    
    public Genre getGenreJDBC(int id) throws Exception ; //method to select genre
    
    public ResultSet getAllGenreJDBC() throws Exception;
    
    public void deleteGenreJDBC(int id) throws Exception; 
    
}
