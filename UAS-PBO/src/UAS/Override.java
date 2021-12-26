/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS;

import java.util.ArrayList;

/**
 *
 * @author Hanifan
 */
public class Override implements Interface {

    ArrayList<Data> datalist = new ArrayList<>();
    
      

    @java.lang.Override
    public void add(Data data){
        datalist.add(data);
    }
    
    boolean terhapus = false;

    @java.lang.Override
    public void delete(String id){
        for(int i = 0; i < datalist.size(); i++){
            if(datalist.get(i).idK.equals(id)){
                datalist.remove(i);
                terhapus = true;
                System.out.println("Karyawan berhasil dihapus dari data!!");
            }else{
                System.out.println("Kode karyawan tidak ada dalam data!!");
            }
        }
    }
    
    boolean ditemukan = false;
    int index = 0;

    
    
    @java.lang.Override
    public void search(String kode){
        for(int i = 0; i < datalist.size(); i++){            
            if(datalist.get(i).idK.equals(kode)){
                
                // mengambil index untuk menampilkan data
                index = i;
                ditemukan = true;
                
            }
        }
        
        if(ditemukan){
            datalist.get(index).print();
        }
        
    }
    
    
    
    
    @java.lang.Override
    public void print(){
        System.out.println("=============================================================================");
        System.out.println("                                DATA KARYAWAN                                ");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("KODE" + "\t" + "NAMA" + "\t"+ "GOL"+ "\t"+  "USIA"+ "\t" + "STATUS NIKAH" + "\t" + "JUMLAH ANAK");
        System.out.println("-----------------------------------------------------------------------------");
        
        
        for(int i=0; i <datalist.size(); i++){
            String kode = datalist.get(i).idK;
            String nama = datalist.get(i).namaK;
            String golong = datalist.get(i).golongan;
            int usia = datalist.get(i).usia;
            String status = "Belum Menikah";
            int jumlahAnak = 0;
            if( datalist.get(i).statsKar == 1){
                status = "Sudah Menikah";
                jumlahAnak = datalist.get(i).jmlhAnak;
            }else if( datalist.get(i).statsKar == 0){
                status = "Belum Menikah";
                jumlahAnak = 0;
            }
          
            System.out.println(kode + "\t" + nama + "\t"+ golong+ "\t"+ usia+"\t"+ status +"\t"+ jumlahAnak );
        }
        
        System.out.println("-----------------------------------------------------------------------------");
        
        System.out.println("Jumlah Data : " + datalist.size());
    }
    
}