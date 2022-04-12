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
public class LisBuku {
    private static List<Buku> lisBuku;

    public LisBuku() {
        lisBuku = new ArrayList<>();
        lisBuku.add(new Buku("UUD 1945", JenisKategoriBuku.UMUM));
        lisBuku.add(new Buku("Tips Lancar Bahasa Inggris 3 Bulan", JenisKategoriBuku.BAHASA));
        lisBuku.add(new Buku("BUPENA", JenisKategoriBuku.SAINS_DAN_MATEMATIKA));
        lisBuku.add(new Buku("Bumi", JenisKategoriBuku.FIKSI));
    }
    
    private static void cekNull() {        
        if (lisBuku == null)
            new LisBuku();
    }
    
    public static void tampilLis() {
        cekNull();
        for (Buku buku : lisBuku)
            System.out.println(buku);
    }

    public static List<Buku> getLisBuku() {
        cekNull();
        return lisBuku;
    }

    public static void tambahBuku(String judul, JenisKategoriBuku kategori) {        
        cekNull();        
        tambahBuku(new Buku(judul, kategori));
    }
    
    public static void tambahBuku(Buku buku) {
        cekNull();
        lisBuku.add(buku);
        PesanPopUp.tampil(buku.toString() + " berhasil ditambahkan", JenisPesanPopUp.SUKSES);
    }
}
