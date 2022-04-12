/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perpustakaan;

/**
 *
 * @author Tri Afirianto
 */
public class Buku {
    private int id;
    private String judul;
    private JenisKategoriBuku kategori;
    private static int autoIncrement = 1;

public int getId() {
        return id;
    }
    public Buku(String judul, JenisKategoriBuku kategori) {
        this.id = autoIncrement++;
        this.judul = judul;
        this.kategori = kategori;
    }

    @Override
    public String toString() {
        return String.format("|%10s|%35s|%20s|", id, judul,kategori);
    }   
}
