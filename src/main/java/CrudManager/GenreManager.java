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
public class GenreManager {
      final static Logger logger = Logger.getLogger(GenreManager.class);
public void addGenre(Genre anGenre)
    {
        try {
            logger.info("In Business Layer addGenre(Genre genre) method");
            System.out.println("In Business Layer addGenre(Genre genre) method");
            Factory factory = new Factory();            
            IGenreService iGenreMgr = (IGenreService) factory.getTheService(IGenreService.NAME);
            iGenreMgr.addGenre(anGenre);
            
        } catch (ServiceLoadException ex) {
         System.out.println(ex.getMessage());
           
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
           logger.error(ex.getMessage()); 
        }
    }
    public Genre getGenre (int genreId)
    {
        Genre anGenre=new Genre();
        try {
            logger.info("In Business Layer getGenre (int genreId) method");
            System.out.println("In Business Layer getGenre (int genreId) method");
            Factory factory = new Factory();           
            IGenreService  iGenreMgr  = (IGenreService ) factory.getTheService(IGenreService .NAME);
            anGenre=iGenreMgr .getGenre(genreId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage()); 
            
        }
        return anGenre;
    }
    
    public void updateGenre (Genre anGenre)
    {
        try {
            logger.info("In Business Layer  updateGenre (Genre anGenre) method");
            System.out.println("In Business Layer  updateGenre (Genre anGenre) method");
            Factory factory = new Factory();            
            IGenreService  iGenreMgr  = (IGenreService) factory.getTheService(IGenreService .NAME);
            iGenreMgr .updateGenre (anGenre);
            
        } catch (ServiceLoadException ex) {
          
           System.out.println(ex.getMessage()); 
        } catch (Exception ex) {
            
           System.out.println(ex.getMessage()); 
            logger.error(ex.getMessage()); 
        }
    }
    
    public ResultSet getAllGenre ()
    {
        ResultSet rs=null;
        List<Genre> genreList = new ArrayList<>();
        try {
            logger.info("In Business Layer getAllAthors  method");
            System.out.println("In Business Layer getAllAthors  method");
            Factory factory = new Factory();
            IGenreService  iGenreMgr  = (IGenreService ) factory.getTheService(IGenreService .NAME);
            rs=iGenreMgr .getAllGenre ();
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());  
             logger.error(ex.getMessage()); 
        }
        return rs;
    }
    
    
    public void deleteGenre (Class <?> Genre,int genreId)
    {
        try {
            logger.info("In Business Layer deleteGenre method");
            System.out.println("In Business Layer deleteGenre method");
            Factory factory = new Factory();
            IGenreService  iGenreMgr  = (IGenreService ) factory.getTheService(IGenreService .NAME);
            iGenreMgr .deleteGenre (Genre, genreId);
            
        } catch (ServiceLoadException ex) {
          System.out.println(ex.getMessage());
            
        } catch (Exception ex) {
            
            System.out.println(ex.getMessage());
             logger.error(ex.getMessage()); 
        }
    }

    public GenreManager() {
    }
    
    
    
}
