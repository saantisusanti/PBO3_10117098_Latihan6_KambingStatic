/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117098_latihan6_kambingstatic;

/**
 *
 * @author 
 * NAMA  : Santi Susanti
 * KELAS : PBO3
 * NIM   : 10117098
 */
public class PBO3_10117098_Latihan6_KambingStatic {

    //NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " + 
                Mamalia.jumlahKambing);
    }
    
}
