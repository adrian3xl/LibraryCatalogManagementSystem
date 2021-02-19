/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Service.Exceptions.ServiceLoadException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import Service.IService;

import java.io.FileInputStream;

import java.io.FileInputStream;

import java.util.Properties;

/**
 *
 * @author IT Technician
 */
public class Factory {

    public Factory() {}
    
    public IService getTheService(String serviceName) throws ServiceLoadException{
        try{
            Class <?> theClass=Class.forName(getImplementName(serviceName));
             return (IService)theClass.newInstance();
        }
        catch(Exception ex)
        {
            throw new ServiceLoadException(serviceName + " not loaded: "+ex.getMessage());
        }
        }
    
    public String getImplementName(String serviceName) throws Exception
    {
        FileInputStream fis = null;
       
            Properties props = new Properties();
            fis = new FileInputStream("C:\\Users\\cghfcjg\\Documents\\NetBeansProjects\\BooksJDBCORM\\src\\main\\java\\MyFactory.properties");
            props.load(fis);
            fis.close();
            return props.getProperty(serviceName);   
    
        }
}
    

    
    
    

