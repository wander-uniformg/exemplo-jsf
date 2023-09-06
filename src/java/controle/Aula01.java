/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controle;

import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.RequestScoped;
import jakarta.faces.bean.SessionScoped;

/**
 *
 * @author wander
 */
//@ManagedBean
@ManagedBean
@SessionScoped
public class Aula01 {
    
    private String message;
    private static int value = 0;
    
    public Aula01() {
        message = "Hello Aula01";
        value++;
    }
    
    
    public String getMessage() {
        return message + " - " + String.valueOf(value);
    }
    
    public void setMessage(String message) {
        this.message = message ;
    }
    
    public String home() {
        return "home.xhtml";
    }
    
}
