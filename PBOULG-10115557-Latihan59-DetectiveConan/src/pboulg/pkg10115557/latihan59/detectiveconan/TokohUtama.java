/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan59.detectiveconan;

/**
 *
 * @author RyanJuan
 */
public class TokohUtama extends Film{
        public TokohUtama(String nama,String tokoh) {
        super(nama,tokoh);
    }
    
    public void tampilTokohUtama(){
        
        TokohUtama obj = new TokohUtama("Shinichi Kudo","Utama");
        System.out.println("======Film Detective Conan======");
        System.out.println("Tokoh : "+obj.tokoh);
        System.out.println("1. "+obj.nama);
        System.out.println("2. Ran Mouri");
        System.out.println("3. Kogoro Mouri");
    }
}
