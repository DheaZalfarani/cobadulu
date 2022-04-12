/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tri Afirianto
 */
public class LisPetugas {
    private static List<Petugas> lisPetugas;
    
    public LisPetugas() {
        lisPetugas = new ArrayList<>();
        lisPetugas.add(new Petugas("Chimon", "1234"));
        lisPetugas.add(new Petugas("Tay Tawan", "2345"));
        lisPetugas.add(new Petugas("Choi Woo Shik", "3456"));
        lisPetugas.add(new Petugas("Dylan Wang", "4567"));
    }
    
    private static void cekNull() {
        if (lisPetugas == null)
            new LisPetugas();
    }
    
    public static void tampilLis() {
        cekNull();
        for (Petugas petugas : lisPetugas)
            System.out.println(petugas);
    }

    public static List<Petugas> getLisPetugas() {
        cekNull();
        return lisPetugas;
    }

    public static void tambahPetugas(String nama, String password) {        
        cekNull();        
        tambahPetugas(new Petugas(nama, password));
    }
    
    public static void tambahPetugas(Petugas petugas) {
        cekNull();
        lisPetugas.add(petugas);
        PesanPopUp.tampil(petugas.toString() + " berhasil ditambahkan", JenisPesanPopUp.SUKSES);
    }
}
