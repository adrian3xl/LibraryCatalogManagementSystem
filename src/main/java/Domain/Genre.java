/*	
 * To change this license header, choose License Headers in Project Properties.	
 * To change this template file, choose Tools | Templates	
 * and open the template in the editor.	
 */	
package Domain;	
import java.io.Serializable;	
import javax.persistence.Column;	
import javax.persistence.Entity;	
import javax.persistence.Table;	
import com.mycompany.librarycatalogmanagementsystem.*;	
import javax.persistence.Id;	

/**	
 *	
 * @author Adrian	
 */	

@Entity	
@Table(name="genre")	

public class Genre {	

     @Id	
    @Column(name="name")	
    private String name;	
    private int id;

    public Genre( String name) {	
        this.name=name;	


    }	


    public Genre(){	
    }	
 public int getId() {
        return id;
    }
    public void setName(String name) {	
        this.name = name;	
    }	

    public String getName() {	
        return name;	
    }	

    public void setId(int id) {
        this.id = id;
    }
    
   @Override	
    public String toString() {	
        return "Genre{" + "name=" + name + '}';	
    }	



}