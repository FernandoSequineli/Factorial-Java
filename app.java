/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Factorial.pkg2;

/**
 *
 * @author fernando
 */
public class app {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("3! fact(3) " +fact(3));
        System.out.println("5! fact(5) " +fact(5));
        System.out.println("9! fact(9) " +fact(9));
    }
    
    
    public static int fact(int n){
         if(n == 0){
             return  1;
         }else {
             return  n * fact(n-1);
         }   
        
        
    }
    
    
}
