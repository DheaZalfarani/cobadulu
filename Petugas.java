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
public class Petugas {
    private int nip;
    private String nama, password;
    private static int autoIncrement = 1;
    
    
    public int getNip() {
        return nip;
    }
    public Petugas(String nama, String password) {
        this.nip = autoIncrement++;
        this.nama = nama;
        this.password = password;
    }
    
    public String getNama() {
        return nama;
    }
    public String getPassword() {
        return password;
    }
    @Override
    public String toString() {
        return String.format("|%10s|%20s|%10s|", nip, nama,password);
    }   
}
