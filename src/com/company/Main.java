package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;

        for (int i=0;i<n;i++){
            sum += i+1;
        }
        System.out.println(sum);

        //faster solution
        sum = (n+1)*n/2;
        System.out.println(sum);

        //jeśli wynik mnożenia może wyjść poza zakres możemy srobić najpierw dzielenie
        if(n%2==0)
            sum = (n/2)*(n+1);
        else
            sum = (n+1)/2*n;
        System.out.println(sum);



    }
}
