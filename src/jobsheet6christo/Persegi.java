/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet6christo;
import java.io.*;

/**
 *
 * @author GL553VD
 */
public class Persegi {
    public static void main(String[] args){
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        String x=" ";
        int hitungLuas=0;
        System.out.println("-Luas Persegi-");
        System.out.println("Maukkan nilai sisi:");
        
        try {
            x=data.readLine();
            int angka=Integer.parseInt(x);
            hitungLuas=angka*angka;
        } catch (Exception e){
            System.out.println("Eror");
        }
        System.out.println("Luas persegi dengan sisi"+x+"adalah"+hitungLuas);
    }
}
