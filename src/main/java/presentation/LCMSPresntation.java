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
            
            System.out.println("Enter first name: ");
            anAuthor.setFname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anAuthor.setLname(aScanner.nextLine());
            
            System.out.println("Enter Author code: ");
            anAuthor.setAuthorCode(aScanner.nextLine());
            
            authJDBC.addAuthorJDBC(anAuthor);
            System.out.println("Author Added Using JDBC");
            
        }
        
        else if(jdbcChoice==2)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();
            
             Scanner aScanner = new Scanner(System. in);
   
            System.out.println("Enter first name: ");
            anAuthor.setFname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anAuthor.setLname(aScanner.nextLine());
            
            System.out.println("Enter school: ");
          anAuthor.setAuthorCode(aScanner.nextLine());
         //   
            authJDBC.updateAuthorJDBC(anAuthor);
            System.out.println("Author updated Using JDBC");
        }
        else if(jdbcChoice==3)
        {
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            
        //    authJDBC.deleteAuthor(aScanner.nextInt());
            System.out.println("Author deleted using JDBC");
        }
        else if(jdbcChoice==4)
        {
            Author anAuthor=new Author();
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter ID: ");
            int id = aScanner.nextInt();
         //   anAuthor = authJDBC.getAuthor(id);
            
            //Runtime.getRuntime().exec("cls");
            
            System.out.println("Author return using JDBC\n");
            System.out.println("ID: " + anAuthor.getId()+"\n");
         //   System.out.println("Title: " + anAuthor.getAuthorTitle()+"\n");
        //    System.out.println("First Name: " + anAuthor.getFname()+"\n");
            System.out.println("Last Name: " + anAuthor.getLname()+"\n");
        //    System.out.println("School: " + anAuthor.getAuthorSchool()+"\n");
        }
        else if(jdbcChoice==5)
        {
            ResultSet rs=null;
            AuthorJDBCManager authJDBC = new AuthorJDBCManager();            
            Scanner aScanner = new Scanner(System.in);
            
            
        //    rs = authJDBC.getAllAuthors();
            
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
    
    
    
    
    
    
    
    public static void ORMMenu() throws IOException
    {
        Scanner scanORM = new Scanner(System.in);
        
       // Runtime.getRuntime().exec("cls");
       //System.out.flush();
        
       System.out.println("ORM\n");
        System.out.println("1: Add Author");
        System.out.println("2: Update Author");
        System.out.println("3: Delete Author");
        System.out.println("4: Select an Author");
        System.out.println("5: Select all Authors");
        System.out.println("6: Exit\n"); 
        
        int ormChoice=scanORM.nextInt();
        if(ormChoice==1)
        {
            Author anAuthor=new Author();
            AuthorManager authORM = new AuthorManager();
            
             Scanner aScanner = new Scanner(System.in);
            
            System.out.println("Enter first name: ");
            anAuthor.setFname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anAuthor.setLname(aScanner.nextLine());
            
            System.out.println("Enter Author Code: ");
           anAuthor.setAuthorCode(aScanner.nextLine());
            
            authORM.addAuthor(anAuthor);
            System.out.println(" Author Added Using ORM");
        }
        else if(ormChoice==2)
        {
            Author anAuthor=new Author();
            AuthorManager authORM = new AuthorManager();
            
             Scanner aScanner = new Scanner(System. in);

            System.out.println("Enter first name: ");
            anAuthor.setFname(aScanner.nextLine());
            
            System.out.println("Enter last name: ");
            anAuthor.setLname(aScanner.nextLine());
            
            System.out.println("Enter Author Code: ");
             anAuthor.setAuthorCode(aScanner.nextLine());
            
            authORM.updateAuthor(anAuthor);
            System.out.println("Author Updated Using ORM");
        }
        else if(ormChoice==3)
        {
            AuthorManager authORM = new AuthorManager();            
            Scanner aScanner = new Scanner(System. in);
            System.out.println("Enter ID: ");
            
            authORM.deleteAuthor(Author.class, aScanner.nextInt());
            System.out.println("Author deleted using ORM");
        }
        else if(ormChoice==4)
        {
            Author anAuthor=new Author();
            AuthorManager authORM = new AuthorManager();            
            Scanner aScanner = new Scanner(System. in);
            
            System.out.println("Enter ID: ");
            anAuthor = authORM.getAuthor(aScanner.nextInt());
            
            //Runtime.getRuntime().exec("cls");
            //System.out.flush();
            
            System.out.println("Author return using ORM\n");
            System.out.println("ID: " + anAuthor.getId()+"\n");
         //   System.out.println("Title: " + anAuthor.getAuthorTitle()+"\n");
            System.out.println("First Name: " + anAuthor.getFname()+"\n");
            System.out.println("Last Name: " + anAuthor.getLname()+"\n");
        //    System.out.println("School: " + anAuthor.getAuthorSchool()+"\n");
        }
        else if(ormChoice==5)
        {
            List<Author> authors =new ArrayList();
            AuthorManager authORM = new AuthorManager();            
            Scanner aScanner = new Scanner(System. in);
            
            
            authors = authORM.getAllAuthors();
            
            //Runtime.getRuntime().exec("cls");
            //System.out.flush();
            
            System.out.println("List of authora return using ORM\n");
            
            for(int i=0; i<authors.size(); i++){
            System.out.println("ID: " + authors.get(i).getId()+"\n");
        //    System.out.println("Title: " + authors.get(i).getAuthorTitle()+"\n");
            System.out.println("First Name: " + authors.get(i).getFname()+"\n");
            System.out.println("Last Name: " + authors.get(i).getLname()+"\n");
         //   System.out.println("School: " + authors.get(i).getAuthorSchool()+"\n");
            }
        }
        else if(ormChoice==6)
        {
            return;
        }
        
        
        
    }
    
    
    
    
}
