/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Domain;
import Domain.Person;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
//import com.mycompany.librarycatalogmanagementsystem.*;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

/**
 *
 * @author Adrian
 */
@Entity
@Table(name="employee")
public class Employee extends Person {

   @Column(name="jobtitle")
    private String jobtitle;
     @Column(name="employeecode")
    private String employeecode;
     @Column(name="password")
    private String password;

     
      private Set<Catalogloanrecord> Catalogloanrecords;
      
         @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    public Set<Catalogloanrecord> getCatalogloanrecords() {
        return Catalogloanrecords;
    }
     
       public Employee(int id, String fname, String lname,String jobtitle,String password, String employeecode) {
        this.employeecode = employeecode;
        this.setFname(fname);
        this.setLname(lname);
        this.jobtitle=jobtitle;
        this.password=password;
        this.setId(id);

    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public void setEmployeecode(String employeecode) {
        this.employeecode = employeecode;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public String getEmployeecode() {
        return employeecode;
    }

    public String getPassword() {
        return password;
    }

    public Employee(){
}


    @Override
    public String toString() {
        return "{" + super.toString() + "Employee{password=" + password + ", jobtitle=" + jobtitle + ", employeecode=" + employeecode + '}';
    }

}