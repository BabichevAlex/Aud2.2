/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aud2.pkg2;

/**
 *
 * @author 1710502
 */
public class Aud22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 5, y = 7;

        x = x ^ y; // стало 2
        System.out.println(x);
        y = x ^ y; // стало 5
        System.out.println(y);
        x = x ^ y; //стало 7
        System.out.println(x);
        // TODO code application logic here
    }

}
