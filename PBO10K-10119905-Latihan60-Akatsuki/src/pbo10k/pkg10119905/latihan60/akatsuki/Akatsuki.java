/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k.pkg10119905.latihan60.akatsuki;

/**
 *
 * @author aruma
 */
public class Akatsuki {
    protected String nama;
    protected String cincin;

    public Akatsuki(String nama, String umur) {
        this.nama = nama;
        this.cincin = umur;
    }
    
    public void Display(){
        System.out.println();
        System.out.println("Nama : "+ nama);
        System.out.println("Cincin : "+ cincin);
        
                
    }
    
    
}
