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
import CrudManager.CatalogloanrecordJDBCManager;
import CrudManager.CatalogrecordJDBCManager;
import CrudManager.CustomerJDBCManager;
import CrudManager.DocumenttypeJDBCManager;
import CrudManager.EmployeeJDBCManager;
import CrudManager.GenreJDBCManager;
import CrudManager.PublisherJDBCManager;
import Domain.Catalogloanrecord;
import Domain.Catalogrecord;
import Domain.Customer;
import Domain.Documenttype;
import Domain.Employee;
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
            System.out.println("ID: " + anGenre.getId()+"\n");
            System.out.println("Genre Name: " + anGenre.getName()+"\n");
        
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
            GenreJDBCManager GenreJDBC = new GenreJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            
            rs = GenreJDBC.getAllGenreJDBC();
            
           // Runtime.getRuntime().exec("cls");
            
            System.out.println("ResultSet of authors return using JDBC\n");
            
            while(rs.next()){
            System.out.println("ID: " + rs.getInt("ID")+"\n");
  
            System.out.println("Genre Name: " + rs.getString("name")+"\n");
 
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
        System.out.println("1: Add Document type");
        System.out.println("2: Update Document type");
        System.out.println("3: Delete Document type");
        System.out.println("4: Select an Document type");
        System.out.println("5: Select all Document type");
        System.out.println("6: Exit\n");
        
        
        int jdbcChoice=scanJDBC.nextInt();
        if(jdbcChoice==1)
        {
            Documenttype anDocumenttype=new Documenttype();
            DocumenttypeJDBCManager DocumenttypeJDBC = new DocumenttypeJDBCManager();
            
             Scanner aScanner = new Scanner(System.in);
 
            System.out.println("Enter Documenttype name: ");
            anDocumenttype.setName(aScanner.nextLine());
 
            DocumenttypeJDBC.addDocumenttypeJDBC(anDocumenttype);
            System.out.println("Documenttype Added Using JDBC");
            
        }
        else if(jdbcChoice==2)
        {
            Documenttype anDocumenttype=new Documenttype();
            DocumenttypeJDBCManager DocumenttypeJDBC = new DocumenttypeJDBCManager();
            
             Scanner aScanner = new Scanner(System. in);
           
            System.out.println("Enter Documenttype name: ");
            anDocumenttype.setName(aScanner.nextLine());
            
            DocumenttypeJDBC.updateDocumenttypeJDBC(anDocumenttype);
            System.out.println("Document type updated Using JDBC");
        }
        else if(jdbcChoice==3)
        {
            DocumenttypeJDBCManager DocumenttypeJDBC = new DocumenttypeJDBCManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            
            DocumenttypeJDBC.deleteDocumenttypeJDBC(aScanner.nextInt());
            System.out.println("Documenttype deleted using JDBC");
        }
        else if(jdbcChoice==4)
        {
             Documenttype anDocumenttype=new Documenttype();
            DocumenttypeJDBCManager DocumenttypeJDBC = new DocumenttypeJDBCManager();
                     
            Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter ID: ");
            int id = aScanner.nextInt();
            anDocumenttype =  DocumenttypeJDBC.getDocumenttypeJDBC(id);
            
            //Runtime.getRuntime().exec("cls");
            
            System.out.println("Author return using JDBC\n");
            System.out.println("ID: " + anDocumenttype.getId()+"\n");
 
            System.out.println("Documenttype Name: " + anDocumenttype.getName()+"\n");
 
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
        DocumenttypeJDBCManager DocumenttypeJDBC = new DocumenttypeJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            
            rs =  DocumenttypeJDBC.getAllDocumenttypeJDBC();
            
           // Runtime.getRuntime().exec("cls");
            
            System.out.println("ResultSet of Document type return using JDBC\n");
            
            while(rs.next()){
            System.out.println("ID: " + rs.getInt("ID")+"\n");
 
            System.out.println(" Document type Name: " + rs.getString("name")+"\n");
 
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
        System.out.println("1: Add Catalogrecord");
        System.out.println("2: Update Catalogrecord");
        System.out.println("3: Delete Catalogrecord");
        System.out.println("4: Select an Catalogrecord");
        System.out.println("5: Select all Catalogrecords");
        System.out.println("6: Exit\n");
        
        
        int jdbcChoice=scanJDBC.nextInt();
        if(jdbcChoice==1)
        {
           Catalogrecord anCatalogrecord=new Catalogrecord();
            CatalogrecordJDBCManager CatalogrecordJDBC = new CatalogrecordJDBCManager();
            
             Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter Catalogrecord title: ");
            anCatalogrecord.setTitle(aScanner.nextLine());
            
            System.out.println("Select Catalogrecord genre: ");
            //anCatalogrecord.setGenre(aScanner.nextLine());
            
              System.out.println("Select Catalogrecord documenttype: ");
           // anCatalogrecord.setDocumenttype(aScanner.nextLine());
            
              System.out.println("Select Catalogrecord author:  ");
           // anCatalogrecord.setAuthor(aScanner.nextLine());
            
            
            System.out.println("Select Catalogrecord publisher: ");
           // anCatalogrecord.setPublisher(aScanner.nextLine());
            
            System.out.println("Enter release date: ");
          //  anCatalogrecord.setDatereleased(aScanner.nextLine());
          
             System.out.println("Enter Catalogrecord code: ");
           anCatalogrecord.setCatalogcode(aScanner.nextLine());
           
              System.out.println("Enter Catalogrecord Condition: ");
           anCatalogrecord.setConditionstatement(aScanner.nextLine());
            
            CatalogrecordJDBC.addCatalogrecordJDBC(anCatalogrecord);
            System.out.println("Catalogrecord Added Using JDBC");
            
        }
        else if(jdbcChoice==2)
        {
          Catalogrecord anCatalogrecord=new Catalogrecord();
            CatalogrecordJDBCManager CatalogrecordJDBC = new CatalogrecordJDBCManager();
            
             Scanner aScanner = new Scanner(System. in);
            
            System.out.println("Enter Catalogrecord title: ");
            anCatalogrecord.setTitle(aScanner.nextLine());
            
            System.out.println("Select Catalogrecord genre: ");
            //anCatalogrecord.setGenre(aScanner.nextLine());
            
              System.out.println("Select Catalogrecord documenttype: ");
           // anCatalogrecord.setDocumenttype(aScanner.nextLine());
            
              System.out.println("Select Catalogrecord author:  ");
           // anCatalogrecord.setAuthor(aScanner.nextLine());
            
            
            System.out.println("Select Catalogrecord publisher: ");
           // anCatalogrecord.setPublisher(aScanner.nextLine());
            
            System.out.println("Enter release date: ");
          //  anCatalogrecord.setDatereleased(aScanner.nextLine());
          
             System.out.println("Enter Catalogrecord code: ");
           anCatalogrecord.setCatalogcode(aScanner.nextLine());
           
              System.out.println("Enter Catalogrecord Condition: ");
           anCatalogrecord.setConditionstatement(aScanner.nextLine());
            
            
            CatalogrecordJDBC.updateCatalogrecordJDBC(anCatalogrecord);
            System.out.println("Author updated Using JDBC");
        }
        else if(jdbcChoice==3)
        {
            CatalogrecordJDBCManager CatalogrecordJDBC = new CatalogrecordJDBCManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            
            CatalogrecordJDBC.deleteCatalogrecordJDBC(aScanner.nextInt());
            System.out.println("Catalogrecord deleted using JDBC");
        }
        else if(jdbcChoice==4)
        {
           Catalogrecord anCatalogrecord=new Catalogrecord();
            CatalogrecordJDBCManager CatalogrecordJDBC = new CatalogrecordJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter ID: ");
            int id = aScanner.nextInt();
            anCatalogrecord = CatalogrecordJDBC.getCatalogrecordJDBC(id);
            
            //Runtime.getRuntime().exec("cls");
            
            System.out.println("Author return using JDBC\n");
            System.out.println("ID: " + anCatalogrecord.getId()+"\n");
            System.out.println("Title: " + anCatalogrecord.getTitle()+"\n");
            System.out.println("Genre: " + anCatalogrecord.getGenre()+"\n");
            System.out.println("Document Type: " + anCatalogrecord.getDocumenttype()+"\n");
            System.out.println("released date: " + anCatalogrecord.getDatereleased()+"\n");
             System.out.println("Author: " + anCatalogrecord.getAuthor()+"\n");
              System.out.println("Publisher: " + anCatalogrecord.getPublisher()+"\n");
                 System.out.println("Catalog Code: " + anCatalogrecord.getCatalogcode()+"\n");
                    System.out.println("Condition Statement : " + anCatalogrecord.getConditionstatement()+"\n");
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
            CatalogrecordJDBCManager CatalogrecordJDBC = new CatalogrecordJDBCManager();          
            Scanner aScanner = new Scanner(System.in);
            
            
            rs = CatalogrecordJDBC.getAllCatalogrecordJDBC();
            
           // Runtime.getRuntime().exec("cls");
            
            System.out.println("ResultSet of Catalogrecords return using JDBC\n");
            
            while(rs.next()){
            System.out.println("ID: " + rs.getInt("ID")+"\n");
            System.out.println("Title: " + rs.getString("title")+"\n");
            System.out.println("Genre: " + rs.getString("Genre")+"\n");
            System.out.println("Document Type:" + rs.getString("documenttype")+"\n");
            System.out.println("released date: " + rs.getString("releaseddate") +"\n");
            System.out.println("Author: " + rs.getString("author") +"\n");
            System.out.println("Publisher: " + rs.getString("publisher") +"\n");
            System.out.println("Catalog Code: " + rs.getString("catalogcode") +"\n");
            System.out.println("Condition Statement : " + rs.getString("conditionstatement") +"\n");
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
        System.out.println("1: Add Catalog loan");
        System.out.println("2: Update Catalog loan");
        System.out.println("3: Delete Catalog loan");
        System.out.println("4: Select an Catalog loan");
        System.out.println("5: Select all Catalog loans");
        System.out.println("6: Exit\n");
        
        
        int jdbcChoice=scanJDBC.nextInt();
        if(jdbcChoice==1)
        {
            Catalogloanrecord anCatalogloanrecord=new Catalogloanrecord();
            CatalogloanrecordJDBCManager CatalogloanrecordJDBC = new CatalogloanrecordJDBCManager();
            
             Scanner aScanner = new Scanner(System.in);
      
            System.out.println("Enter title: ");
            //anCatalogloanrecord.setCatalogrecord(aScanner.nextLine());
            
            System.out.println("Customer: ");
           // anCatalogloanrecord.getCustomer(aScanner.nextLine());
            
            System.out.println("Employee:");
           // anCatalogloanrecord.getEmployee(aScanner.nextLine());
            
            System.out.println("Loancode: ");
             anCatalogloanrecord.setLoancode(aScanner.nextLine());
             
             System.out.println("Recieved date: ");
            // anCatalogloanrecord.setRecieveddate(aScanner.nextLine());
            
            CatalogloanrecordJDBC.addCatalogloanrecordJDBC(anCatalogloanrecord);
            System.out.println("Catalog loan record Added Using JDBC");
            
        }
        else if(jdbcChoice==2)
        {
            Catalogloanrecord anCatalogloanrecord=new Catalogloanrecord();
            CatalogloanrecordJDBCManager CatalogloanrecordJDBC = new CatalogloanrecordJDBCManager();
            
             Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            anCatalogloanrecord.setId(System.in.read());
            
            System.out.println("Enter title: ");
           // anCatalogloanrecord.setCatalogrecord(aScanner.nextLine());
            
            System.out.println("Enter Customer: ");
          //  anCatalogloanrecord.setCustomer(aScanner.nextLine());
            
            System.out.println("Enter Employee: ");
            //anCatalogloanrecord.setEmployee(aScanner.nextLine());
            
            System.out.println("Loan Date: ");
            anCatalogloanrecord.setLoancode(aScanner.nextLine());
            
            System.out.println("Loan code: ");
            anCatalogloanrecord.setLoancode(aScanner.nextLine());
            
            System.out.println("Recieved date: ");
          //  anCatalogloanrecord.setRecieveddate(aScanner.nextLine());
  
            CatalogloanrecordJDBC.updateCatalogloanrecordJDBC(anCatalogloanrecord);
            System.out.println("Catalog loan record updated Using JDBC");
        }
        else if(jdbcChoice==3)
        {
            CatalogloanrecordJDBCManager CatalogloanrecordJDBC = new CatalogloanrecordJDBCManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            
            CatalogloanrecordJDBC.deleteCatalogloanrecordJDBC(aScanner.nextInt());
            System.out.println("Catalog loan record deleted using JDBC");
        }
        else if(jdbcChoice==4)
        {
            Catalogloanrecord anCatalogloanrecord=new Catalogloanrecord();
            CatalogloanrecordJDBCManager CatalogloanrecordJDBC = new CatalogloanrecordJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter ID: ");
            int id = aScanner.nextInt();
            anCatalogloanrecord = CatalogloanrecordJDBC.getCatalogloanrecordJDBC(id);
            
            //Runtime.getRuntime().exec("cls");
            
            System.out.println("Author return using JDBC\n");
            System.out.println("ID: " + anCatalogloanrecord.getId()+"\n");
            System.out.println("Title: " + anCatalogloanrecord.getCatalogrecord()+"\n");
            System.out.println("Customer: " + anCatalogloanrecord.getCustomer()+"\n");
            System.out.println("Employee: " + anCatalogloanrecord.getEmployee()+"\n");
            System.out.println("Loandate: " + anCatalogloanrecord.getLoandate()+"\n");
             System.out.println("Recieved date: " + anCatalogloanrecord.getRecieveddate()+"\n");
          
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
            CatalogloanrecordJDBCManager CatalogloanrecordJDBC = new CatalogloanrecordJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            
            rs = CatalogloanrecordJDBC.getAllCatalogloanrecordJDBC();
            
           // Runtime.getRuntime().exec("cls");
            
            System.out.println("ResultSet of authors return using JDBC\n");
            
            while(rs.next()){
            System.out.println("ID: " + rs.getInt("ID")+"\n");
            System.out.println("Title: " + rs.getString("Title")+"\n");
           System.out.println("Customer: " + rs.getString("customer_id")+"\n");
            System.out.println("Employee: " + rs.getString("employee_id")+"\n");
            System.out.println("Loandate: " + rs.getString("loandate") +"\n");
             System.out.println("Recieved date: " + rs.getString("recieveddate") +"\n");
            
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
            Employee anEmployee=new Employee();
            EmployeeJDBCManager EmployeeJDBC = new EmployeeJDBCManager();
            
             Scanner aScanner = new Scanner(System.in);

            System.out.println("Enter first name: ");
            anEmployee.setFname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anEmployee.setLname(aScanner.nextLine());
            
            System.out.println("Employee ID: ");
            anEmployee.setEmployeecode(aScanner.nextLine());
            
            System.out.println("Enter Job title: ");
            anEmployee.setJobtitle(aScanner.nextLine());
            
            System.out.println("Enter password: ");
            anEmployee.setPassword(aScanner.nextLine());
           
            EmployeeJDBC.addEmployeeJDBC(anEmployee);
            System.out.println("Author Added Using JDBC");
            
        }
        else if(jdbcChoice==2)
        {
            Employee anEmployee=new Employee();
            EmployeeJDBCManager EmployeeJDBC = new EmployeeJDBCManager();
            
             Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            anEmployee.setId(System.in.read());
            
           System.out.println("Enter first name: ");
            anEmployee.setFname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anEmployee.setLname(aScanner.nextLine());
            
            System.out.println("Employee ID: ");
            anEmployee.setEmployeecode(aScanner.nextLine());
            
            System.out.println("Enter Job title: ");
            anEmployee.setJobtitle(aScanner.nextLine());
            
            System.out.println("Enter password: ");
            anEmployee.setPassword(aScanner.nextLine());
            
             EmployeeJDBC.updateEmployeeJDBC(anEmployee);
            System.out.println(" Employee updated Using JDBC");
        }
        else if(jdbcChoice==3)
        {
             EmployeeJDBCManager  EmployeeJDBC = new  EmployeeJDBCManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            
             EmployeeJDBC.deleteEmployeeJDBC(aScanner.nextInt());
            System.out.println("Author deleted using JDBC");
        }
        else if(jdbcChoice==4)
        {
             Employee anEmployee=new Employee();
            EmployeeJDBCManager EmployeeJDBC = new EmployeeJDBCManager();
            
            Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter ID: ");
            int id = aScanner.nextInt();
            anEmployee = EmployeeJDBC.getEmployeeJDBC(id);
            
            //Runtime.getRuntime().exec("cls");
            
            System.out.println("Author return using JDBC\n");
            System.out.println("ID: " + anEmployee.getId()+"\n");
            System.out.println("First Name: " + anEmployee.getFname()+"\n");
            System.out.println("Last Name: " + anEmployee.getLname()+"\n");
            System.out.println("School: " + anEmployee.getJobtitle()+"\n");
             // System.out.println("School: " + anEmployee.getPassword()+"\n");
             System.out.println("School: " + anEmployee.getEmployeecode()+"\n");
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
            EmployeeJDBCManager EmployeeJDBC = new EmployeeJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            
            rs = EmployeeJDBC.getAllEmployeeJDBC();
            
           // Runtime.getRuntime().exec("cls");
            
            System.out.println("ResultSet of authors return using JDBC\n");
            
            while(rs.next()){
            System.out.println("ID: " + rs.getInt("ID")+"\n");
            System.out.println("Job Title: " + rs.getString("jobetitle")+"\n");
            System.out.println("First Name: " + rs.getString("firstname")+"\n");
            System.out.println("Last Name: " + rs.getString("lastname")+"\n");
            
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
        System.out.println("1: Add Customer");
        System.out.println("2: Update Customer");
        System.out.println("3: Delete Customer");
        System.out.println("4: Select an Customer");
        System.out.println("5: Select all Customer");
        System.out.println("6: Exit\n");
        
        
        int jdbcChoice=scanJDBC.nextInt();
        if(jdbcChoice==1)
        {
            Customer anCustomer=new Customer();
            CustomerJDBCManager CustomerJDBC = new CustomerJDBCManager();
            
             Scanner aScanner = new Scanner(System.in);
 
            System.out.println("Enter first name: ");
            anCustomer.setFname(aScanner.nextLine());
                      
            System.out.println("Enter last name: ");
            anCustomer.setLname(aScanner.nextLine());
             
           System.out.println("Enter customer ID: ");
           anCustomer.setCustomercode(aScanner.nextLine());
           
             System.out.println("Enter customer address: ");
           anCustomer.setAddressbook(aScanner.nextLine());
           
            
            System.out.println("Enter phone number : ");
            anCustomer.setPhonenumber(aScanner.nextLine());
            
            CustomerJDBC.addCustomerJDBC(anCustomer);
            System.out.println("Customer Added Using JDBC");
            
        }
        else if(jdbcChoice==2)
        {
           Customer anCustomer=new Customer();
            CustomerJDBCManager CustomerJDBC = new CustomerJDBCManager();
            
             Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            anCustomer.setId(System.in.read());
            
            System.out.println("Enter first name: ");
            anCustomer.setFname(aScanner.nextLine());
                      
            System.out.println("Enter last name: ");
            anCustomer.setLname(aScanner.nextLine());
             
           System.out.println("Enter customer ID: ");
           anCustomer.setCustomercode(aScanner.nextLine());
           
             System.out.println("Enter customer address: ");
           anCustomer.setAddressbook(aScanner.nextLine());
           
            
            System.out.println("Enter phone number : ");
            anCustomer.setPhonenumber(aScanner.nextLine());
            
            
            CustomerJDBC.updateCustomerJDBC(anCustomer);
            System.out.println("Customer updated Using JDBC");
        }
        else if(jdbcChoice==3)
        {
            CustomerJDBCManager CustomerJDBC = new CustomerJDBCManager();        
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            
             CustomerJDBC.deleteCustomerJDBC(aScanner.nextInt());
            System.out.println(" Customer deleted using JDBC");
        }
        else if(jdbcChoice==4)
        {
             Customer anCustomer=new  Customer();
           CustomerJDBCManager CustomerJDBC = new CustomerJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter ID: ");
            int id = aScanner.nextInt();
            anCustomer = CustomerJDBC.getCustomerJDBC(id);
            
            //Runtime.getRuntime().exec("cls");
            
            System.out.println("Customer return using JDBC\n");
            System.out.println("ID: " + anCustomer.getId()+"\n");
            System.out.println("First Name: " + anCustomer.getFname()+"\n");
            System.out.println("Last Name: " + anCustomer.getLname()+"\n");
              System.out.println("customer ID: " + anCustomer.getCustomercode()+"\n");
                System.out.println("Phone number: " + anCustomer.getPhonenumber()+"\n");
            System.out.println("Address: " + anCustomer.getAddressbook()+"\n");
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
            CustomerJDBCManager CustomerJDBC = new CustomerJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            
            rs = CustomerJDBC.getAllCustomerJDBC();
            
           // Runtime.getRuntime().exec("cls");
            
            System.out.println("ResultSet of authors return using JDBC\n");
            
            while(rs.next()){
            System.out.println("ID: " + rs.getInt("ID")+"\n");
            System.out.println("First Name: " + rs.getString("firstname")+"\n");
            System.out.println("Last Name: " + rs.getString("lastname")+"\n");
            System.out.println("Customer ID: " + rs.getString("customercode") +"\n");
            System.out.println("Phonenumber: " + rs.getString("phonenumber")+"\n");
            System.out.println("Address: " + rs.getString("address")+"\n");
        }
        }
        else if(jdbcChoice==6)
        {
            return;
        }
        
        
    }
}
