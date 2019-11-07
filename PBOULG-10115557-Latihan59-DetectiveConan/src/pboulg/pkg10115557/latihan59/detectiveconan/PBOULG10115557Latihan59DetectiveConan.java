/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulg.pkg10115557.latihan59.detectiveconan;

/**
 *
 * @author RyanJuan
 * NAMA                 : Rayan
 * KELAS                : PBOULG
 * NIM                  : 10115557
 * Deskripsi Program    : Program menampilkan untuk menampilkan biodata
 * karakter dari detektif conan
 */
public class PBOULG10115557Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     TokohUtama obj = new TokohUtama("","");
        obj.tampilTokohUtama();
        System.out.println("");
        TokohPendukung obj1 = new TokohPendukung("","");
        obj1.tampilTokohPendukung();
        System.out.println("");
        Detektif obj2 = new Detektif("","");
        obj2.tampilDeetective();
    }
    
}
