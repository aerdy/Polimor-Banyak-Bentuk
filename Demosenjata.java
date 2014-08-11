/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance2;

/**
 *
 * @author aerdy
 */
public class Demosenjata {
    public static void main(String[] args) {
        Senjata s= new Senjata();
        Prajutit p=new Prajutit();
        Bazooka b=new Bazooka();
       p.setSenjata(s);
       p.tembak();
       s=new M16();
       p.setBazooka(b);
       p.bazooka();
            
    }
    
}
