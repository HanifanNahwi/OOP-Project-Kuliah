/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Hanifan
 */
public class Data {

    private int D,M,Y;
 
    public int statsKar,jmlhAnak,usia,tunjanganSI,tunjanganP,tunjanganA,gajiKotor,potongan,
            gajiAkhir ,gajiPokok;
 
    public String idK,namaK,alamatK,tglahirK,golongan;
 
    boolean StatusTunjanganA = false,StatusTunjanganSI = false,StatusTunjanganP = false;
    
  
    public Data(String id, String nama, String alamat, String tgl, String golong, int status, int anak){
        this.idK = id;
        this.namaK = nama;
        this.alamatK = alamat;
        this.tglahirK = tgl;
        this.golongan = golong;
        this.statsKar = status;
        this.jmlhAnak = anak;
        
        
        String tgllahir =  this.tglahirK;
        String[] lahir = tgllahir.split("-");
        Y = Integer.parseInt(lahir[0] );
        M = Integer.parseInt(lahir[1] );
        D = Integer.parseInt(lahir[2] );
        
        LocalDate from = LocalDate.of(Y, M, D);
        
        LocalDate today = LocalDate.now();
        
        int umur = Period.between(from, today).getYears();
        this.usia = umur;
        
        
        switch (golongan) {
            case "a":
            case "A":
                gajiPokok = 5000000;
                break;
            case "b":
            case "B":
                gajiPokok = 6000000;
                break;
            case "c":
            case "C":
                gajiPokok = 7000000;
                break;
        }
        
        
        switch(statsKar ){
            case 1 : 
                this.tunjanganSI = gajiPokok*10/100;
                this.StatusTunjanganSI = true;
                break;
        }
        
        switch(statsKar){
            case 1 :
                if(jmlhAnak>0){
                    tunjanganA = jmlhAnak*gajiPokok*5/100;
                    StatusTunjanganA = true;
                }
                break;
        }
        
        
        
        if(usia>30){
            tunjanganP = gajiPokok*15/100;
            StatusTunjanganP = true;
            
        }

        
        
        gajiKotor = gajiPokok + tunjanganSI + tunjanganP + tunjanganA;
        
        potongan = gajiKotor*25/1000;
  
        gajiAkhir = gajiKotor - potongan;
        
    }

    
    
    public void print(){
        System.out.println("=========================================================");
        System.out.println("                  DATA PROFIL KARYAWAN                   ");
        System.out.println("---------------------------------------------------------");

        System.out.println("Kode Karyawan           : " + idK);
        System.out.println("Nama Karyawan           : " + namaK);
        System.out.println("Golongan                : " + golongan);
        System.out.println("Usia                    : " + usia);

        // status menikah dan jumlah anak 
        switch( statsKar ){
            case 0 :
                System.out.println("Status Menikah          : Belum Menikah");
                System.out.println("---------------------------------------------------------");
                break;
            
            case 1 :
                System.out.println("Status Menikah          : Sudah Menikah");
                System.out.println("Jumlah Anak             : " + jmlhAnak);
                System.out.println("---------------------------------------------------------");
        }
        System.out.println("Gaji Pokok              : Rp" + gajiPokok);
        
        //pengecekan tunjangan
        if(StatusTunjanganSI){
            System.out.println("Tunjangan Suami/Istri   : Rp" + tunjanganSI );
        }if(StatusTunjanganP){
            System.out.println("Tunjangan Pegawai       : Rp" + tunjanganP);
        }if(StatusTunjanganA){
            System.out.println("Tunjangan Anak          : Rp" + tunjanganA); 
        }
        System.out.println("--------------------------------------------------------- +");
        System.out.println("Gaji Kotor              : Rp" + gajiKotor);
        System.out.println("Potongan                : Rp" + potongan);
        System.out.println("--------------------------------------------------------- -");
        System.out.println("Gaji Bersih             : Rp" + gajiAkhir);
    }
}

