/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author usraux
 */
public class J {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> anteriores;
        String[] sucesores;
        String dummy;
        int n;
        
        dummy = in.readLine();
        while(!dummy.equals("0")){
        
        anteriores = new ArrayList(Arrays.asList(in.readLine().split(" ")));
        dummy = in.readLine();
        sucesores = in.readLine().split(" ");
        
        
        for(String sucesor : sucesores){
            n = 0;
            for(String anterior : anteriores){
                
                if(sucesor.equals(anterior)){
                    
                    n++;
                }
            }
            anteriores.add(sucesor);
            System.out.println(n+1);
        }
        dummy = in.readLine();
        }
    }
}

