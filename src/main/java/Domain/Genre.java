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
import java.util.Set;
import javax.persistence.Id;	
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
  
    private Set<Catalogrecord> Catalogrecords;
   
    public Genre( String name) {	
        this.name=name;	


    }	

    @Id
    @Column(name = "id")
    @GeneratedValue
    public long getId() {
        return id;
    }

    
    @OneToMany(mappedBy = "genre", cascade = CascadeType.ALL)
    public Set<Catalogrecord> getCatalogrecords() {
        return Catalogrecords;
    }
    
    
    
    public Genre(){	
    }	
    
 //public int getId() {
   //     return id;
  //  }
    
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