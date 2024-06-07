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
public class KantorCabang {
    private String namaKota;
    private double budget;

    public KantorCabang(String namaKota, double budget) {
        this.namaKota = namaKota;
        this.budget = budget;
    }

    public String getKota() {
        return namaKota;
    }

    public double getDanaPerDivisi(int nDivisi) {
        return budget/nDivisi;
    }
    
}
