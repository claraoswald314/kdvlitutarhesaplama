package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double tutar, kdvlifiyat, kdvoranı, kdvtutarı;
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen tutarı giriniz : ");
        tutar = scanner.nextDouble();
        if(tutar>=1000){
            kdvoranı=0.08;
            kdvtutarı=tutar*kdvoranı;
            kdvlifiyat=tutar+kdvtutarı;
            System.out.println("kdv li tutar : " + kdvlifiyat);
        }else{
            kdvoranı=0.18;
            kdvtutarı=tutar*kdvoranı;
            kdvlifiyat=tutar+kdvtutarı;
            System.out.println("kdv li tutar : " + kdvlifiyat);
        }
    }
}
