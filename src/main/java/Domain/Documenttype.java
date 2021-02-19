/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Adrian
 */

@Entity	
@Table(name="documenttype")
public class Documenttype {
  
      @Id	
    @Column(name="name")	
    private String name;	

    public Documenttype( String name) {	
        this.name=name;
  
    }	


    public Documenttype(){	
    }	

    public void setName(String name) {	
        this.name = name;	
    }	

    public String getName() {	
        return name;	
    }	

   @Override	
    public String toString() {	
        return "Documenttype{" + "name=" + name + '}';	
    }	
}