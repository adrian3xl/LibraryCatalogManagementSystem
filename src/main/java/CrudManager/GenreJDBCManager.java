/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CrudManager;
import Domain.Genre;
import java.util.ArrayList;
import java.util.List;
import Service.Factory;
import Service.IGenreService;
import Service.Exceptions.ServiceLoadException;
import Service.IGenreServiceJDBC;
import java.sql.ResultSet;
/**
 *
 * @author Adrian
 */
public class GenreJDBCManager {
    
public void addGenreJDBC(Genre anGenre)
    {
        try {
            System.out.println("In Business Layer addGenre(Genre genre) method");
            Factory factory = new Factory();            
            IGenreServiceJDBC iGenreMgrJDBC = (IGenreServiceJDBC) factory.getTheService(IGenreServiceJDBC.NAME);
            iGenreMgrJDBC.addGenreJDBC(anGenre);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    public Genre getGenreJDBC(int genreId)
    {
        Genre anGenre=new Genre();
        try {
            System.out.println("In Business Layer getGenreJDBC(int genreId) method");
            Factory factory = new Factory();           
            IGenreServiceJDBC iGenreMgrJDBC = (IGenreServiceJDBC) factory.getTheService(IGenreServiceJDBC.NAME);
            anGenre=iGenreMgrJDBC.getGenreJDBC(genreId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            
        }
        return anGenre;
    }
    
    public void updateGenreJDBC(Genre anGenre)
    {
        try {
            System.out.println("In Business Layer  updateGenreJDBC(Genre anGenre) method");
            Factory factory = new Factory();            
            IGenreServiceJDBC iGenreMgrJDBC = (IGenreServiceJDBC) factory.getTheService(IGenreServiceJDBC.NAME);
            iGenreMgrJDBC.updateGenreJDBC(anGenre);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
        }
    }
    
    public ResultSet getAllGenreJDBC()
    {
        ResultSet rs=null;
        List<Genre> genreList = new ArrayList<>();
        try {
            System.out.println("In Business Layer getAllAthors JDBC method");
            Factory factory = new Factory();
            IGenreServiceJDBC iGenreMgrJDBC = (IGenreServiceJDBC) factory.getTheService(IGenreServiceJDBC.NAME);
            rs=iGenreMgrJDBC.getAllGenreJDBC();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());            
        }
        return rs;
    }
    
    
    public void deleteGenreJDBC(int genreId)
    {
        try {
            System.out.println("In Business Layer deleteAuhor JDBC method");
            Factory factory = new Factory();
            IGenreServiceJDBC iGenreMgrJDBC = (IGenreServiceJDBC) factory.getTheService(IGenreServiceJDBC.NAME);
            iGenreMgrJDBC.deleteGenreJDBC(genreId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
        }
    }

    public GenreJDBCManager() {
    }
    
    
    
}
