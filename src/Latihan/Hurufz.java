/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author WINDOWS 10
 */
public class Hurufz {
    public static void main(String[] args){
        int z=4;
        for(int a=1; a<=5; a++){
            if(a==1 || a==5){
                System.out.print("@");
            }
        }
                for(int b=1;b<=5; b++){
                if(b==z){
                System.out.print("@");
                }
                else{System.out.print(" ");
                }
         }
                z--;
                System.out.print(" ");
                }
}

