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
public class CabangDuplikatException extends Exception{
    private String namaCabang;

    public CabangDuplikatException(String namaCabang, String message) {
        super(message);
        this.namaCabang = namaCabang;
    }

    public String getNamaCabang() {
        return namaCabang;
    }
    
}
