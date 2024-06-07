/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
/**
 *
 * @author USER
 */
import java.util.ArrayList;
import java.util.Scanner;

public class KantorUtama {
    private ArrayList<KantorCabang> cabang;
    private int divisiPerCabang;

    public KantorUtama() {
        this.cabang = new ArrayList<>();
    }
    
    public void inputCabang(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama kantor cabang: ");
        String namaKantorCabang = scanner.next();
        System.out.print("Masukkan budget kantor cabang: ");
        int budgetKantorCabang = scanner.nextInt();
        System.out.println(tambahCabang(namaKantorCabang, budgetKantorCabang));
    }

    public String tambahCabang(String namaKantorCabang, double budgetKantorCabang) {
        try {
            KantorCabang kcBaru = new KantorCabang(namaKantorCabang, budgetKantorCabang);
            if(cabang.isEmpty()){
                cabang.add(kcBaru);
            }else {
                for(KantorCabang kc : cabang){
                    if(kc.getKota().equals(kcBaru.getKota())){
                        throw new CabangDuplikatException(
                                namaKantorCabang, 
                                "Kantor cabang tidak berhasil ditambahkan " 
                                        + namaKantorCabang + " sudah ada di daftar cabang");
                    }
                }
                cabang.add(kcBaru);
            }
            System.out.println("");
            return "Cabang "+namaKantorCabang+" berhasil ditambahkan.";
        } catch (CabangDuplikatException e) {
            return  "Cabang "+e.getNamaCabang()+" gagal dimasukkan.";
        }
    }
    
    public void setDivisiPerCabang(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah divisi per cabang: ");
        divisiPerCabang = scanner.nextInt();
    }
    
    public void printData(){
        for(KantorCabang kc : cabang){
            System.out.println("Kantor cabang " 
                    + kc.getKota() + " dengan budget " 
                    + kc.getDanaPerDivisi(this.divisiPerCabang) + " per divisi");
        }
    }
    
}
