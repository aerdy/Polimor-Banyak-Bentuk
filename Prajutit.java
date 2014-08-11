/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance2;

/**
 *
 * @author aerdy
 */
public class Prajutit {
    Senjata senjata;
    void setSenjata(Senjata var){
        senjata=var;
    }
    Bazooka bazooka;
    void setBazooka(Bazooka var){
        bazooka=var;
    }
    void tembak(){
        senjata.tembak();
    }void bazooka(){
        bazooka.cetak();
    }
    
    
}
