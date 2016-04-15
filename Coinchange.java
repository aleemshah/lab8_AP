/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coinchange;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author saleem.bscs13seecs
 */
public class Coinchange {

    public static int dynamic(int money,int[] coin) {
    int[] a = new int[money + 1];
		Arrays.fill(a, Integer.MAX_VALUE-1000);
		a[0]=0;
		for (int i = 0; i <= money; i++) { 
                    for (int j = coin.length - 1; j >= 0; j--) {
				if (coin[j] <= i) {
					a[i] = Math.min(1 + a[i - coin[j]], a[i]);
				}
			}
		}
            return a[money];
     
     }
     public static void greedy(int money) {
         int c=0;
         while(money>0){
     if(money>=25){
     money=money-25;     
     c++;
     }
     else 
         if(money>=10){
            money=money-10;    
            c++;
            }
     else 
              if(money>=5){
            money=money-5;   
            c++;
            }
     else 
                   if(money>=1){
            money=money-1;  
            c++;
            }
   
     
     }
         System.out.println(c);
    }
    public static void main(String[] args) {
     int  money;
     System.out.println("Enter the amount of money ");
     Scanner input = new Scanner(System.in);
     money = input.nextInt();
     int[] coins= new int[4];
     coins[0]=25;
     coins[1]=10;
     coins[2]=5;
     coins[3]=1;
     int money2=money;
      
    greedy(money);
    int result=dynamic(money2,coins);
    System.out.println(result);
    }
    
}
   