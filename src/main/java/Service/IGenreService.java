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
public interface IGenreService extends IService {
    
public final String NAME="IGenreService";
    
    public void addGenre (Genre genre) throws Exception ; //method for adding genre
    
    public void updateGenre (Genre genre) throws Exception ; //method for updating a genre
    
    public Genre getGenre (int id) throws Exception ; //method to select genre
    
    public ResultSet getAllGenre () throws Exception;
    
    public void deleteGenre (int id) throws Exception; 
    
}
