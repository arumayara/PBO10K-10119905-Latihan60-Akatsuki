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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("=== Data Member Akatsuki ===");
        Orochimaru objOrochimaru = new Orochimaru("Orochimaru ","Langit");
        Itachi objItachi = new Itachi("Itachi Uciha ","Merah Darah");
        Tobi objTobi = new Tobi("Tobi/ Madara Uciha","Berlian");
        Pain objPain = new Pain ("Pain","Nol");
        Konan objKonan = new Konan ("Konan", "Putih");
        Deidara objDeidara = new Deidara ("Deidara", "Biru/ Hijau");
        Hidan objHidan = new Hidan ("Hidan", "Tiga");
        Kakuzu objKakuzu = new Kakuzu ("Kakuzu","Utara");
        Kisame objKisame = new Kisame ("Kisame","Selatan");
        Sasori objSasori = new Sasori ("Sasori","Virgo");
        Zetsu objZetsu = new Zetsu ("Zetsu","Banteng");
        
        
        objOrochimaru.Display();objOrochimaru.Sanin();
        objItachi.Display();objItachi.memilikiDojutsuMata();
        objTobi.Display();objTobi.memilikiDojutsuMata();
        objPain.Display();objPain.mengeluarkanJutsuGravitasi();
        objKonan.Display();objKonan.mengeluarkanJutsuKertas();
        objDeidara.Display();objDeidara.mengeluarkanJutsuTanahLiat();
        objHidan.Display();objHidan.memilikiJutsuAliranJashin();
        objKakuzu.Display();objKakuzu.memilikiJutsuMenyimpanNyawa();
        objKisame.Display();objKisame.menggunakanPedangLegendaris();
        objSasori.Display();objSasori.menggunakanJutsuBoneka();
        objZetsu.Display();objZetsu.mempunyaiDuaKepribadian();
        
        
        

        
    }
    
}
