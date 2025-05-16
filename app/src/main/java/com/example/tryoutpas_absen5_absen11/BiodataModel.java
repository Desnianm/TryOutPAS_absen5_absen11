package com.example.tryoutpas_absen5_absen11;

public class BiodataModel {
    private String namaLengkap;
    private String namaPanggilan;
    private String absen;
    private String peran; // ✅ Tambahan

    public BiodataModel(String namaLengkap, String namaPanggilan, String absen, String peran) {
        this.namaLengkap = namaLengkap;
        this.namaPanggilan = namaPanggilan;
        this.absen = absen;
        this.peran = peran;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getNamaPanggilan() {
        return namaPanggilan;
    }

    public String getAbsen() {
        return absen;
    }

    public String getPeran() {
        return peran;
    }
}


