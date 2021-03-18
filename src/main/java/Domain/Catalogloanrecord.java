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
import java.util.Date;		
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**	
 *	
 * @author Adrian	
 */	


@Entity	
@Table(name="catalogloanrecord")
public class Catalogloanrecord implements Serializable{	

     @Id	
    @Column(name="loancode")
     private String loancode;
     
     private int id;
     
      @Column(name="loandate") 
     private Date loandate;
    
       @Column(name="recieveddate") 
    private Date recieveddate;
    
    private Catalogrecord catalogrecord;	
    
    private Customer customer;	
   	
    private Employee employee;	

    
    public Catalogloanrecord(){	
    }
    
    
    public Catalogloanrecord( Employee employee, Customer customer,Catalogrecord catalogrecord,Date recieveddate,Date loandate, String loancode      ){	
  
        this.catalogrecord=catalogrecord;
        this.customer=customer;
        this.loandate= loandate;
        this.recieveddate=recieveddate;
        this.loancode=loancode;
    
    }	
    @Id
    @Column(name = "id")
    @GeneratedValue
    public long getId() {
        return id;
    }
@ManyToOne
    @JoinColumn(name = "customer_id")
    public Customer getCustomer() {
        return customer;
    }
 
    @ManyToOne
    @JoinColumn(name = "employee_id")
    public Employee getEmployee() {
        return employee;
    }

    @ManyToOne
    @JoinColumn(name = "catalogrecord_id")
    public Catalogrecord getCatalogrecord() {
        return catalogrecord;
    }

    public String getLoancode() {
        return loancode;
    }

    public Date getLoandate() {
        return loandate;
    }

    public Date getRecieveddate() {
        return recieveddate;
    }

    public void setLoancode(String loancode) {
        this.loancode = loancode;
    }

    public void setLoandate(Date loandate) {
        this.loandate = loandate;
    }

    public void setRecieveddate(Date recieveddate) {
        this.recieveddate = recieveddate;
    }
  
     public void setId(int id) {
        this.id = id;
    }

    public void setCatalogrecord(Catalogrecord catalogrecord) {
        this.catalogrecord = catalogrecord;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
     
    
}