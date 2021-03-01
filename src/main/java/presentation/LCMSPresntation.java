/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentation;

import Domain.Author;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import CrudManager.AuthorJDBCManager;
import CrudManager.AuthorManager;
import CrudManager.GenreJDBCManager;
import CrudManager.PublisherJDBCManager;
import Domain.Genre;
import Domain.Publisher;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author KRichards
 */
public class LCMSPresntation {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        int selectMethod=0;        
        while(selectMethod!=-1){
           System.out.println("What method, \n 1: JDBC \n 2: ORM \n 3: Exit");
           int choice = scan.nextInt();
           
           if(choice==1){
               try {
                   //call JDBC Menu
                   JDBCMenu();
               } catch (IOException ex) {
                   System.out.println(ex.getMessage());
               } catch (SQLException ex) {
                   Logger.getLogger(LCMSPresntation.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           else if(choice==2)
           {
               try {
                   //call ORM Menu
                   ORMMenu();
               } catch (IOException ex) {
                  System.out.println(ex.getMessage());
               }
           }
           else if(choice==3)
           {
               //program Exit
               System.exit(0);
           }
        }
        
        
    }
    
    public static void JDBCMenu() throws IOException, SQLException
    {
        Scanner scan = new Scanner(System.in);
        
        int selectMethod=0;        
        while(selectMethod!=-1){
           System.out.println("Select Function, \n 1: Author \n 2: Publisher \n 3: Genre \n 4: DocType \n 5: Catalog record \n 6: Catalog loan \n 7: Employee \n 8: Customer \n 9: Exit");
           int choice = scan.nextInt();
           
           if(choice==1){
               try {
                   //call JDBC Menu
                   AuthorJDBCMenu();
               } catch (IOException ex) {
                   System.out.println(ex.getMessage());
               } catch (SQLException ex) {
                   Logger.getLogger(LCMSPresntation.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
           else if(choice==2)
           {
               try {
                   //call ORM Menu
                   PublisherJDBCMenu();
               } catch (IOException ex) {
                  System.out.println(ex.getMessage());
               }
           }
            else if(choice==3)
           {
               try {
                   //call ORM Menu
                   GenreJDBCMenu();
               } catch (IOException ex) {
                  System.out.println(ex.getMessage());
               }
           }
               else if(choice==4)
           {
               try {
                   //call ORM Menu
                   DoctypeJDBCMenu();
               } catch (IOException ex) {
                  System.out.println(ex.getMessage());
               }
           }
                  else if(choice==5)
           {
               try {
                   //call ORM Menu
                  CatalogrecordJDBCMenu();
               } catch (IOException ex) {
                  System.out.println(ex.getMessage());
               }
           }
                     else if(choice==6)
           {
               try {
                   //call ORM Menu
                 CatalogloanJDBCMenu();
               } catch (IOException ex) {
                  System.out.println(ex.getMessage());
               }
           }
                        else if(choice==7)
           {
               try {
                   //call ORM Menu
                   EmployeeJDBCMenu();
               } catch (IOException ex) {
                  System.out.println(ex.getMessage());
               }
           }
                           else if(choice==8)
           {
               try {
                   //call ORM Menu
                   CustomerJDBCMenu();
               } catch (IOException ex) {
                  System.out.println(ex.getMessage());
               }
           }
                           
           else if(choice==9)
           {
               //program Exit
               System.exit(0);
           }
        }
        
        

    }
    
    
     public static void AuthorJDBCMenu() throws IOException, SQLException
    {
         Scanner scanJDBC = new Scanner(System.in);
        
      //  Runtime.getRuntime().exec("cls");
        
        System.out.println("JDBC\n");
        System.out.println("1: Add Author");
        System.out.println("2: Update Author");
        System.out.println("3: Delete Author");
        System.out.println("4: Select an Author");
        System.out.println("5: Select all Authors");
        System.out.println("6: Exit\n");
        
        
        int jdbcChoice=scanJDBC.nextInt();
        if(jdbcChoice==1)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();
            
             Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter author first name: ");
            anAuthor.setFname(aScanner.nextLine());
            
            System.out.println("Enter author last name: ");
            anAuthor.setLname(aScanner.nextLine());
            
            System.out.println("Enter author code : ");
            anAuthor.setAuthorCode(aScanner.nextLine());
            
            authJDBC.addAuthorJDBC(anAuthor);
            System.out.println("Author Added Using JDBC");
            
        }
        else if(jdbcChoice==2)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();
            
             Scanner aScanner = new Scanner(System. in);
            
            System.out.println("Enter ID: ");
            anAuthor.setId(System.in.read()); 
             
            System.out.println("Enter author first name: ");
            anAuthor.setFname(aScanner.nextLine());
            
            System.out.println("Enter author last name: ");
            anAuthor.setLname(aScanner.nextLine());
            
            System.out.println("Enter author code: ");
            anAuthor.setAuthorCode(aScanner.nextLine());
            
            authJDBC.updateAuthorJDBC(anAuthor);
            System.out.println("Author updated Using JDBC");
        }
        else if(jdbcChoice==3)
        {
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            
            authJDBC.deleteAuthorJDBC(aScanner.nextInt());
            System.out.println("Author deleted using JDBC");
        }
        else if(jdbcChoice==4)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter ID: ");
            int id = aScanner.nextInt();
            anAuthor = authJDBC.getAuthorJDBC(id);
            
            //Runtime.getRuntime().exec("cls");
            
            System.out.println("Author return using JDBC\n");
            System.out.println("ID: " + anAuthor.getId()+"\n");
            System.out.println("First Name: " + anAuthor.getFname()+"\n");
            System.out.println("Last Name: " + anAuthor.getLname()+"\n");
            System.out.println("Author code: " + anAuthor.getAuthorCode()+"\n");
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            
            rs = authJDBC.getAllAuthorsJDBC();
            
           // Runtime.getRuntime().exec("cls");
            
            System.out.println("ResultSet of authors return using JDBC\n");
            
            while(rs.next()){
            System.out.println("ID: " + rs.getInt("ID")+"\n");
            System.out.println("First Name: " + rs.getString("firstname")+"\n");
            System.out.println("Last Name: " + rs.getString("lastname")+"\n");
            System.out.println("School: " + rs.getString("authorcode") +"\n");
        }
        }
        else if(jdbcChoice==6)
        {
            return;
        }
        
        
    }
    ///////////////////////////////////////////////////////////////////////////////////
      public static void PublisherJDBCMenu() throws IOException, SQLException
    {
         Scanner scanJDBC = new Scanner(System.in);
        
      //  Runtime.getRuntime().exec("cls");
        
        System.out.println("JDBC\n");
        System.out.println("1: Add Publisher");
        System.out.println("2: Update Publisher");
        System.out.println("3: Delete Publisher");
        System.out.println("4: Select an Publisher");
        System.out.println("5: Select all Publisher");
        System.out.println("6: Exit\n");
        
        
        int jdbcChoice=scanJDBC.nextInt();
        if(jdbcChoice==1)
        {
           Publisher anPublisher=new Publisher();
            PublisherJDBCManager PublisherJDBC = new PublisherJDBCManager();
            
             Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter Publisher first name: ");
            anPublisher.setFname(aScanner.nextLine());
            
            System.out.println("Enter Publisher last name: ");
            anPublisher.setLname(aScanner.nextLine());
            
            System.out.println("Enter Publisher Code: ");
            anPublisher.setPublisherCode(aScanner.nextLine());
            
           PublisherJDBC.addPublisherJBDC(anPublisher);
            System.out.println("Publisher Added Using JDBC");
            
        }
        else if(jdbcChoice==2)
        {
           Publisher anPublisher=new Publisher();
            PublisherJDBCManager PublisherJDBC = new PublisherJDBCManager();
            
             Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            anPublisher.setId(System.in.read());
            
                System.out.println("Enter Publisher first name: ");
            anPublisher.setFname(aScanner.nextLine());
            
            System.out.println("Enter Publisher last name: ");
            anPublisher.setLname(aScanner.nextLine());
            
            System.out.println("Enter Publisher Code: ");
            anPublisher.setPublisherCode(aScanner.nextLine());
            
            PublisherJDBC.updatePublisherJDBC(anPublisher);
            System.out.println("Publisher updated Using JDBC");
        }
        else if(jdbcChoice==3)
        {
            PublisherJDBCManager PublisherJDBC = new PublisherJDBCManager();           
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            
             PublisherJDBC.deletePublisherJDBC(aScanner.nextInt());
            System.out.println(" Publisher deleted using JDBC");
        }
        else if(jdbcChoice==4)
        {
            Publisher anPublisher=new Publisher();
            PublisherJDBCManager PublisherJDBC = new PublisherJDBCManager();           
            Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter ID: ");
            int id = aScanner.nextInt();
            anPublisher = PublisherJDBC.getPublisherJDBC(id);
            
            //Runtime.getRuntime().exec("cls");
            
            System.out.println("Author return using JDBC\n");
            System.out.println("ID: " + anPublisher.getId()+"\n");
            System.out.println("Publisher First Name: " + anPublisher.getFname()+"\n");
            System.out.println("Publisher Last Name: " + anPublisher.getLname()+"\n");
            System.out.println("Publisher Code: " + anPublisher.getPublisherCode()+"\n");
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
             PublisherJDBCManager PublisherJDBC = new PublisherJDBCManager();          
            Scanner aScanner = new Scanner(System.in);
            
            
            rs = PublisherJDBC.getAllPublishersJDBC();
            
           // Runtime.getRuntime().exec("cls");
            
            System.out.println("ResultSet of authors return using JDBC\n");
            
            while(rs.next()){
            System.out.println("ID: " + rs.getInt("ID")+"\n");
            System.out.println("First Name: " + rs.getString("firstname")+"\n");
            System.out.println("Last Name: " + rs.getString("lastname")+"\n");
            System.out.println("Publisher Code: " + rs.getString("publishercode") +"\n");
        }
        }
        else if(jdbcChoice==6)
        {
            return;
        }
        
        
    }
    
 ////   ////////////////////////////////////////////////////////////////////////////////
       public static void GenreJDBCMenu() throws IOException, SQLException
    {
         Scanner scanJDBC = new Scanner(System.in);
        
      //  Runtime.getRuntime().exec("cls");
        
        System.out.println("JDBC\n");
        System.out.println("1: Add Genre");
        System.out.println("2: Update Genre");
        System.out.println("3: Delete Genre");
        System.out.println("4: Select an Genre");
        System.out.println("5: Select all Genre");
        System.out.println("6: Exit\n");
        
        
        int jdbcChoice=scanJDBC.nextInt();
        if(jdbcChoice==1)
        {
            Genre anGenre=new Genre();
            GenreJDBCManager GenreJDBC = new GenreJDBCManager();
            
             Scanner aScanner = new Scanner(System.in);
             
            System.out.println("Genre name: ");
            anGenre.setName(aScanner.nextLine());
            
            GenreJDBC.addGenreJDBC(anGenre);
            System.out.println("Author Added Using JDBC");
            
        }
        else if(jdbcChoice==2)
        {
            Genre anGenre=new Genre();
            GenreJDBCManager GenreJDBC = new GenreJDBCManager();
            
             Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            anGenre.setId(System.in.read());
            
       System.out.println("Genre name: ");
            anGenre.setName(aScanner.nextLine());
            
            GenreJDBC.updateGenreJDBC(anGenre);
            System.out.println("Genre updated Using JDBC");
        }
        else if(jdbcChoice==3)
        {
             GenreJDBCManager GenreJDBC = new GenreJDBCManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            
            GenreJDBC.deleteGenreJDBC(aScanner.nextInt());
            System.out.println("Genre deleted using JDBC");
        }
        else if(jdbcChoice==4)
        {
            Genre anGenre=new Genre();
            GenreJDBCManager GenreJDBC = new GenreJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter ID: ");
            int id = aScanner.nextInt();
            anGenre = GenreJDBC.getGenreJDBC(id);
            
            //Runtime.getRuntime().exec("cls");
            
            System.out.println("Author return using JDBC\n");
            System.out.println("ID: " + anAuthor.getId()+"\n");
            System.out.println("Title: " + anAuthor.getAuthorTitle()+"\n");
            System.out.println("First Name: " + anAuthor.getFname()+"\n");
            System.out.println("Last Name: " + anAuthor.getLname()+"\n");
            System.out.println("School: " + anAuthor.getAuthorSchool()+"\n");
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            
            rs = authJDBC.getAllAuthors();
            
           // Runtime.getRuntime().exec("cls");
            
            System.out.println("ResultSet of authors return using JDBC\n");
            
            while(rs.next()){
            System.out.println("ID: " + rs.getInt("ID")+"\n");
            System.out.println("Title: " + rs.getString("Title")+"\n");
            System.out.println("First Name: " + rs.getString("FirstName")+"\n");
            System.out.println("Last Name: " + rs.getString("LastName")+"\n");
            System.out.println("School: " + rs.getString("School") +"\n");
        }
        }
        else if(jdbcChoice==6)
        {
            return;
        }
        
        
    }
    
   ////////////////////////////////////////////////////////////////////////////
       
        public static void DoctypeJDBCMenu() throws IOException, SQLException
    {
         Scanner scanJDBC = new Scanner(System.in);
        
      //  Runtime.getRuntime().exec("cls");
        
        System.out.println("JDBC\n");
        System.out.println("1: Add Author");
        System.out.println("2: Update Author");
        System.out.println("3: Delete Author");
        System.out.println("4: Select an Author");
        System.out.println("5: Select all Authors");
        System.out.println("6: Exit\n");
        
        
        int jdbcChoice=scanJDBC.nextInt();
        if(jdbcChoice==1)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();
            
             Scanner aScanner = new Scanner(System.in);
            System.out.println("Enter ID: ");
            anAuthor.setId(System.in.read());
            
            System.out.println("Enter title: ");
            anAuthor.setAuthorTitle(aScanner.nextLine());
            
            System.out.println("Enter first name: ");
            anAuthor.setFname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anAuthor.setLname(aScanner.nextLine());
            
            System.out.println("Enter school: ");
            anAuthor.setAuthorSchool(aScanner.nextLine());
            
            authJDBC.addAuthor(anAuthor);
            System.out.println("Author Added Using JDBC");
            
        }
        else if(jdbcChoice==2)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();
            
             Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            anAuthor.setId(System.in.read());
            
            System.out.println("Enter title: ");
            anAuthor.setAuthorTitle(aScanner.nextLine());
            
            System.out.println("Enter first name: ");
            anAuthor.setFname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anAuthor.setLname(aScanner.nextLine());
            
            System.out.println("Enter school: ");
            anAuthor.setAuthorSchool(aScanner.nextLine());
            
            authJDBC.updateAuthor(anAuthor);
            System.out.println("Author updated Using JDBC");
        }
        else if(jdbcChoice==3)
        {
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            
            authJDBC.deleteAuthor(aScanner.nextInt());
            System.out.println("Author deleted using JDBC");
        }
        else if(jdbcChoice==4)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter ID: ");
            int id = aScanner.nextInt();
            anAuthor = authJDBC.getAuthor(id);
            
            //Runtime.getRuntime().exec("cls");
            
            System.out.println("Author return using JDBC\n");
            System.out.println("ID: " + anAuthor.getId()+"\n");
            System.out.println("Title: " + anAuthor.getAuthorTitle()+"\n");
            System.out.println("First Name: " + anAuthor.getFname()+"\n");
            System.out.println("Last Name: " + anAuthor.getLname()+"\n");
            System.out.println("School: " + anAuthor.getAuthorSchool()+"\n");
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            
            rs = authJDBC.getAllAuthors();
            
           // Runtime.getRuntime().exec("cls");
            
            System.out.println("ResultSet of authors return using JDBC\n");
            
            while(rs.next()){
            System.out.println("ID: " + rs.getInt("ID")+"\n");
            System.out.println("Title: " + rs.getString("Title")+"\n");
            System.out.println("First Name: " + rs.getString("FirstName")+"\n");
            System.out.println("Last Name: " + rs.getString("LastName")+"\n");
            System.out.println("School: " + rs.getString("School") +"\n");
        }
        }
        else if(jdbcChoice==6)
        {
            return;
        }
        
        
    }
     
         public static void CatalogrecordJDBCMenu() throws IOException, SQLException
    {
         Scanner scanJDBC = new Scanner(System.in);
        
      //  Runtime.getRuntime().exec("cls");
        
        System.out.println("JDBC\n");
        System.out.println("1: Add Author");
        System.out.println("2: Update Author");
        System.out.println("3: Delete Author");
        System.out.println("4: Select an Author");
        System.out.println("5: Select all Authors");
        System.out.println("6: Exit\n");
        
        
        int jdbcChoice=scanJDBC.nextInt();
        if(jdbcChoice==1)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();
            
             Scanner aScanner = new Scanner(System.in);
            System.out.println("Enter ID: ");
            anAuthor.setId(System.in.read());
            
            System.out.println("Enter title: ");
            anAuthor.setAuthorTitle(aScanner.nextLine());
            
            System.out.println("Enter first name: ");
            anAuthor.setFname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anAuthor.setLname(aScanner.nextLine());
            
            System.out.println("Enter school: ");
            anAuthor.setAuthorSchool(aScanner.nextLine());
            
            authJDBC.addAuthor(anAuthor);
            System.out.println("Author Added Using JDBC");
            
        }
        else if(jdbcChoice==2)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();
            
             Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            anAuthor.setId(System.in.read());
            
            System.out.println("Enter title: ");
            anAuthor.setAuthorTitle(aScanner.nextLine());
            
            System.out.println("Enter first name: ");
            anAuthor.setFname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anAuthor.setLname(aScanner.nextLine());
            
            System.out.println("Enter school: ");
            anAuthor.setAuthorSchool(aScanner.nextLine());
            
            authJDBC.updateAuthor(anAuthor);
            System.out.println("Author updated Using JDBC");
        }
        else if(jdbcChoice==3)
        {
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            
            authJDBC.deleteAuthor(aScanner.nextInt());
            System.out.println("Author deleted using JDBC");
        }
        else if(jdbcChoice==4)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter ID: ");
            int id = aScanner.nextInt();
            anAuthor = authJDBC.getAuthor(id);
            
            //Runtime.getRuntime().exec("cls");
            
            System.out.println("Author return using JDBC\n");
            System.out.println("ID: " + anAuthor.getId()+"\n");
            System.out.println("Title: " + anAuthor.getAuthorTitle()+"\n");
            System.out.println("First Name: " + anAuthor.getFname()+"\n");
            System.out.println("Last Name: " + anAuthor.getLname()+"\n");
            System.out.println("School: " + anAuthor.getAuthorSchool()+"\n");
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            
            rs = authJDBC.getAllAuthors();
            
           // Runtime.getRuntime().exec("cls");
            
            System.out.println("ResultSet of authors return using JDBC\n");
            
            while(rs.next()){
            System.out.println("ID: " + rs.getInt("ID")+"\n");
            System.out.println("Title: " + rs.getString("Title")+"\n");
            System.out.println("First Name: " + rs.getString("FirstName")+"\n");
            System.out.println("Last Name: " + rs.getString("LastName")+"\n");
            System.out.println("School: " + rs.getString("School") +"\n");
        }
        }
        else if(jdbcChoice==6)
        {
            return;
        }
        
        
    }
         
          public static void CatalogloanJDBCMenu() throws IOException, SQLException
    {
         Scanner scanJDBC = new Scanner(System.in);
        
      //  Runtime.getRuntime().exec("cls");
        
        System.out.println("JDBC\n");
        System.out.println("1: Add Author");
        System.out.println("2: Update Author");
        System.out.println("3: Delete Author");
        System.out.println("4: Select an Author");
        System.out.println("5: Select all Authors");
        System.out.println("6: Exit\n");
        
        
        int jdbcChoice=scanJDBC.nextInt();
        if(jdbcChoice==1)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();
            
             Scanner aScanner = new Scanner(System.in);
            System.out.println("Enter ID: ");
            anAuthor.setId(System.in.read());
            
            System.out.println("Enter title: ");
            anAuthor.setAuthorTitle(aScanner.nextLine());
            
            System.out.println("Enter first name: ");
            anAuthor.setFname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anAuthor.setLname(aScanner.nextLine());
            
            System.out.println("Enter school: ");
            anAuthor.setAuthorSchool(aScanner.nextLine());
            
            authJDBC.addAuthor(anAuthor);
            System.out.println("Author Added Using JDBC");
            
        }
        else if(jdbcChoice==2)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();
            
             Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            anAuthor.setId(System.in.read());
            
            System.out.println("Enter title: ");
            anAuthor.setAuthorTitle(aScanner.nextLine());
            
            System.out.println("Enter first name: ");
            anAuthor.setFname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anAuthor.setLname(aScanner.nextLine());
            
            System.out.println("Enter school: ");
            anAuthor.setAuthorSchool(aScanner.nextLine());
            
            authJDBC.updateAuthor(anAuthor);
            System.out.println("Author updated Using JDBC");
        }
        else if(jdbcChoice==3)
        {
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            
            authJDBC.deleteAuthor(aScanner.nextInt());
            System.out.println("Author deleted using JDBC");
        }
        else if(jdbcChoice==4)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter ID: ");
            int id = aScanner.nextInt();
            anAuthor = authJDBC.getAuthor(id);
            
            //Runtime.getRuntime().exec("cls");
            
            System.out.println("Author return using JDBC\n");
            System.out.println("ID: " + anAuthor.getId()+"\n");
            System.out.println("Title: " + anAuthor.getAuthorTitle()+"\n");
            System.out.println("First Name: " + anAuthor.getFname()+"\n");
            System.out.println("Last Name: " + anAuthor.getLname()+"\n");
            System.out.println("School: " + anAuthor.getAuthorSchool()+"\n");
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            
            rs = authJDBC.getAllAuthors();
            
           // Runtime.getRuntime().exec("cls");
            
            System.out.println("ResultSet of authors return using JDBC\n");
            
            while(rs.next()){
            System.out.println("ID: " + rs.getInt("ID")+"\n");
            System.out.println("Title: " + rs.getString("Title")+"\n");
            System.out.println("First Name: " + rs.getString("FirstName")+"\n");
            System.out.println("Last Name: " + rs.getString("LastName")+"\n");
            System.out.println("School: " + rs.getString("School") +"\n");
        }
        }
        else if(jdbcChoice==6)
        {
            return;
        }
        
        
    }
          
           public static void EmployeeJDBCMenu() throws IOException, SQLException
    {
         Scanner scanJDBC = new Scanner(System.in);
        
      //  Runtime.getRuntime().exec("cls");
        
        System.out.println("JDBC\n");
        System.out.println("1: Add Author");
        System.out.println("2: Update Author");
        System.out.println("3: Delete Author");
        System.out.println("4: Select an Author");
        System.out.println("5: Select all Authors");
        System.out.println("6: Exit\n");
        
        
        int jdbcChoice=scanJDBC.nextInt();
        if(jdbcChoice==1)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();
            
             Scanner aScanner = new Scanner(System.in);
            System.out.println("Enter ID: ");
            anAuthor.setId(System.in.read());
            
            System.out.println("Enter title: ");
            anAuthor.setAuthorTitle(aScanner.nextLine());
            
            System.out.println("Enter first name: ");
            anAuthor.setFname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anAuthor.setLname(aScanner.nextLine());
            
            System.out.println("Enter school: ");
            anAuthor.setAuthorSchool(aScanner.nextLine());
            
            authJDBC.addAuthor(anAuthor);
            System.out.println("Author Added Using JDBC");
            
        }
        else if(jdbcChoice==2)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();
            
             Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            anAuthor.setId(System.in.read());
            
            System.out.println("Enter title: ");
            anAuthor.setAuthorTitle(aScanner.nextLine());
            
            System.out.println("Enter first name: ");
            anAuthor.setFname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anAuthor.setLname(aScanner.nextLine());
            
            System.out.println("Enter school: ");
            anAuthor.setAuthorSchool(aScanner.nextLine());
            
            authJDBC.updateAuthor(anAuthor);
            System.out.println("Author updated Using JDBC");
        }
        else if(jdbcChoice==3)
        {
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            
            authJDBC.deleteAuthor(aScanner.nextInt());
            System.out.println("Author deleted using JDBC");
        }
        else if(jdbcChoice==4)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter ID: ");
            int id = aScanner.nextInt();
            anAuthor = authJDBC.getAuthor(id);
            
            //Runtime.getRuntime().exec("cls");
            
            System.out.println("Author return using JDBC\n");
            System.out.println("ID: " + anAuthor.getId()+"\n");
            System.out.println("Title: " + anAuthor.getAuthorTitle()+"\n");
            System.out.println("First Name: " + anAuthor.getFname()+"\n");
            System.out.println("Last Name: " + anAuthor.getLname()+"\n");
            System.out.println("School: " + anAuthor.getAuthorSchool()+"\n");
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            
            rs = authJDBC.getAllAuthors();
            
           // Runtime.getRuntime().exec("cls");
            
            System.out.println("ResultSet of authors return using JDBC\n");
            
            while(rs.next()){
            System.out.println("ID: " + rs.getInt("ID")+"\n");
            System.out.println("Title: " + rs.getString("Title")+"\n");
            System.out.println("First Name: " + rs.getString("FirstName")+"\n");
            System.out.println("Last Name: " + rs.getString("LastName")+"\n");
            System.out.println("School: " + rs.getString("School") +"\n");
        }
        }
        else if(jdbcChoice==6)
        {
            return;
        }
        
        
    }
           
            public static void CustomerJDBCMenu() throws IOException, SQLException
    {
         Scanner scanJDBC = new Scanner(System.in);
        
      //  Runtime.getRuntime().exec("cls");
        
        System.out.println("JDBC\n");
        System.out.println("1: Add Author");
        System.out.println("2: Update Author");
        System.out.println("3: Delete Author");
        System.out.println("4: Select an Author");
        System.out.println("5: Select all Authors");
        System.out.println("6: Exit\n");
        
        
        int jdbcChoice=scanJDBC.nextInt();
        if(jdbcChoice==1)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();
            
             Scanner aScanner = new Scanner(System.in);
            System.out.println("Enter ID: ");
            anAuthor.setId(System.in.read());
            
            System.out.println("Enter title: ");
            anAuthor.setAuthorTitle(aScanner.nextLine());
            
            System.out.println("Enter first name: ");
            anAuthor.setFname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anAuthor.setLname(aScanner.nextLine());
            
            System.out.println("Enter school: ");
            anAuthor.setAuthorSchool(aScanner.nextLine());
            
            authJDBC.addAuthor(anAuthor);
            System.out.println("Author Added Using JDBC");
            
        }
        else if(jdbcChoice==2)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();
            
             Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            anAuthor.setId(System.in.read());
            
            System.out.println("Enter title: ");
            anAuthor.setAuthorTitle(aScanner.nextLine());
            
            System.out.println("Enter first name: ");
            anAuthor.setFname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anAuthor.setLname(aScanner.nextLine());
            
            System.out.println("Enter school: ");
            anAuthor.setAuthorSchool(aScanner.nextLine());
            
            authJDBC.updateAuthor(anAuthor);
            System.out.println("Author updated Using JDBC");
        }
        else if(jdbcChoice==3)
        {
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            
            authJDBC.deleteAuthor(aScanner.nextInt());
            System.out.println("Author deleted using JDBC");
        }
        else if(jdbcChoice==4)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter ID: ");
            int id = aScanner.nextInt();
            anAuthor = authJDBC.getAuthor(id);
            
            //Runtime.getRuntime().exec("cls");
            
            System.out.println("Author return using JDBC\n");
            System.out.println("ID: " + anAuthor.getId()+"\n");
            System.out.println("Title: " + anAuthor.getAuthorTitle()+"\n");
            System.out.println("First Name: " + anAuthor.getFname()+"\n");
            System.out.println("Last Name: " + anAuthor.getLname()+"\n");
            System.out.println("School: " + anAuthor.getAuthorSchool()+"\n");
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            
            rs = authJDBC.getAllAuthors();
            
           // Runtime.getRuntime().exec("cls");
            
            System.out.println("ResultSet of authors return using JDBC\n");
            
            while(rs.next()){
            System.out.println("ID: " + rs.getInt("ID")+"\n");
            System.out.println("Title: " + rs.getString("Title")+"\n");
            System.out.println("First Name: " + rs.getString("FirstName")+"\n");
            System.out.println("Last Name: " + rs.getString("LastName")+"\n");
            System.out.println("School: " + rs.getString("School") +"\n");
        }
        }
        else if(jdbcChoice==6)
        {
            return;
        }
        
        
    }
}
