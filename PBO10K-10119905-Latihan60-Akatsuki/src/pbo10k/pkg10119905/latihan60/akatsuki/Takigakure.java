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
public class Takigakure extends Akatsuki{
    private final String asal;
    
    public Takigakure(String nama, String umur) {
        super(nama, umur);
        this.asal = "Takigakure";
    }

    @Override 
    public void Display() {
        super.Display(); 
        System.out.println("Asal : "+asal );
    }

    
}

