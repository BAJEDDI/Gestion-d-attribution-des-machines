/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class Lang {
    private String selectedLocale = "en";
 
    public String getSelectedLocale() {
        return selectedLocale;
    }

 
public void setSelectedLocale(String selectedLocale) {
    System.out.println("Selected Locale: " + selectedLocale);
    this.selectedLocale = selectedLocale;
}

   
    

    public void changeLanguage() {
        System.out.println("Selected Locale: " + selectedLocale);
    }
}
