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
import org.apache.log4j.Logger;
/**
 *
 * @author Adrian
 */
public class GenreJDBCManager {
    final static Logger logger = Logger.getLogger(GenreJDBCManager.class); 
public void addGenreJDBC(Genre anGenre)
    {
        try {
            logger.info("In Business Layer addGenre(Genre genre) method");
            System.out.println("In Business Layer addGenre(Genre genre) method");
            Factory factory = new Factory();            
            IGenreServiceJDBC iGenreMgrJDBC = (IGenreServiceJDBC) factory.getTheService(IGenreServiceJDBC.NAME);
            iGenreMgrJDBC.addGenreJDBC(anGenre);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
           logger.error(ex.getMessage()); 
        }
    }
    public Genre getGenreJDBC(int genreId)
    {
        Genre anGenre=new Genre();
        try {
            logger.info("In Business Layer getGenreJDBC(int genreId) method");
            System.out.println("In Business Layer getGenreJDBC(int genreId) method");
            Factory factory = new Factory();           
            IGenreServiceJDBC iGenreMgrJDBC = (IGenreServiceJDBC) factory.getTheService(IGenreServiceJDBC.NAME);
            anGenre=iGenreMgrJDBC.getGenreJDBC(genreId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage()); 
        }
        return anGenre;
    }
    
    public void updateGenreJDBC(Genre anGenre)
    {
        try {
            logger.info("In Business Layer  updateGenreJDBC(Genre anGenre) method");
            System.out.println("In Business Layer  updateGenreJDBC(Genre anGenre) method");
            Factory factory = new Factory();            
            IGenreServiceJDBC iGenreMgrJDBC = (IGenreServiceJDBC) factory.getTheService(IGenreServiceJDBC.NAME);
            iGenreMgrJDBC.updateGenreJDBC(anGenre);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
            logger.error(ex.getMessage()); 
        }
    }
    
    public ResultSet getAllGenreJDBC()
    {
        ResultSet rs=null;
        List<Genre> genreList = new ArrayList<>();
        try {
            logger.info("In Business Layer getAllAthors JDBC method");
            System.out.println("In Business Layer getAllAthors JDBC method");
            Factory factory = new Factory();
            IGenreServiceJDBC iGenreMgrJDBC = (IGenreServiceJDBC) factory.getTheService(IGenreServiceJDBC.NAME);
            rs=iGenreMgrJDBC.getAllGenreJDBC();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());   
             logger.error(ex.getMessage()); 
        }
        return rs;
    }
    
    
    public void deleteGenreJDBC(int genreId)
    {
        try {
            logger.info("In Business Layer deleteAuhor JDBC method");
            System.out.println("In Business Layer deleteAuhor JDBC method");
            Factory factory = new Factory();
            IGenreServiceJDBC iGenreMgrJDBC = (IGenreServiceJDBC) factory.getTheService(IGenreServiceJDBC.NAME);
            iGenreMgrJDBC.deleteGenreJDBC(genreId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage()); 
        }
    }

    public GenreJDBCManager() {
    }
    
    
    
}
