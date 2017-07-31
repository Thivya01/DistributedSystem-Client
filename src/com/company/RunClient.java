package com.company;

import java.util.Scanner;

class RunClient{

    public static void main(String args[]){
        System.out.println("Please enter the number of clients?");
        Scanner scanner=new Scanner(System.in);
        int j=scanner.nextInt();
        for (int i=1 ;i<=j ;i++){

            SampleClient s=new SampleClient();
            s.run();

        }


    }

}
