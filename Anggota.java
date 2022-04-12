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
public class Anggota {
    private int id;
    private String nama;
    /** 
     * Untuk mendapatkan id anggota secara auto increment 
     * sebagai pengganti belum adanya basis data.
     */
    private static int autoIncrement = 1;

    /**
     * Membuat anggota baru dengan nilai id otomatis
     * berdasarkan atribut {@link #autoIncrement}.
     * 
     * @param nama 
     *        nama anggota baru
     */
    public Anggota(String nama) {
        this.id = autoIncrement++;
        this.nama = nama;
    }

    /**
     * Mengambil id anggota.
     * 
     * @return id anggota dari object ini
     */
    public int getId() {
        return id;
    }

    /**
     * Mengambil nama anggota.
     * 
     * @return nama anggota dari object ini
     */
    public String getNama() {
        return nama;
    }

    /**
     * Menampilkan info yang berisi id dan nama anggota
     * 
     * @return info dari object ini
     */
    @Override
    public String toString() {
        return String.format("|%10s|%20s|", id, nama);      
    }    
}
