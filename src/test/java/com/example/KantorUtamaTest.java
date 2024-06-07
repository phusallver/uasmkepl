package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KantorUtamaTest {
    @Test
    public void testTambahCabangBerhasilTambah() {
        KantorUtama ku = new KantorUtama();
        String actual = ku.tambahCabang("Purworejo", 10000000);
        String expected = "Cabang Purworejo berhasil ditambahkan.";
        assertEquals(expected, actual);
    }
    
    @Test
    public void testTambahCabangGagalTambah() {
        KantorUtama ku = new KantorUtama();
        String actual = ku.tambahCabang("Purworejo", 10000000);
        actual = ku.tambahCabang("Purworejo", 10000000);
        String expected = "Cabang Purworejo gagal dimasukkan.";
        assertEquals(expected, actual);
    }
        
    @Test
    public void testTambahCabangSuksesTambahJogja() {
        KantorUtama ku = new KantorUtama();
        String actual = ku.tambahCabang("Jogja", 10000000);
        String expected = "Cabang Jogja gagal dimasukkan.";
        assertEquals(expected, actual);
    }
}
