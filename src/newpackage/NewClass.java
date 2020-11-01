/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.Scanner;


/*
F(1, 1)＝45 
F(1, 0)＝55, F(2, 0)＝3025, F(2, 1)＝4500, F(2, 2)＝2475, F(3, 1)＝358875 

test 
3 2 338625 正解
4 3 1秒をオーバー・・・
5 0
7 6
8 4
8 8

*/

/**
 *
 * @author you-s
 */
public class NewClass {

    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                String[] inputs = s.split(" ", 0);

                if (s.length() == 0 || inputs.length != 2) {
                    System.out.println("end");
                    break;
                } else {
                    Integer n = Integer.parseInt(inputs[0]);
                    Integer c = Integer.parseInt(inputs[1]);
                    
                   System.out.println("[条件]桁数:"+ n + " 繰り上がり数:" + c);

                    double loopCount = Math.pow(10, n);

                   int cnt = 0;
                    for (int i = 0; i < loopCount ; i++) {
                        String tmpI = ("00000000" + String.valueOf(i));
                        String strI = tmpI.substring(tmpI.length() - n, tmpI.length());
                        for (int j = i; j < loopCount; j++) {
                            String tmpJ = ("00000000" + String.valueOf(j));
                            String strJ = tmpJ.substring(tmpJ.length() - n, tmpJ.length());
                            
                            String tmpA = ("00000000" + String.valueOf(i + j));
                            String strA = tmpA.substring(tmpA.length() - n , tmpA.length());                            
                            
                           
                            System.out.print(strI + "+" + strJ );
                            if(i!=j){System.out.print(" & " + strJ + "+" + strI );}
                            System.out.print( "  =" + (i + j));
                            int up = 0;
                            for (int k = 0; k < n; k++){
                                char x = strI.charAt(k);
                                char y = strJ.charAt(k);
                                char z = strA.charAt(k);
                                
                                int xi = Character.getNumericValue(x);
                                int yi = Character.getNumericValue(y);
                                int zi = Character.getNumericValue(z);
                                
                                //System.out.println("#" + xi +  ":" + yi +  ":" + zi); 
                                
                                if(xi+yi > 9){//System.out.print("☆"); 
                                up++;}
                                if(xi+yi==9 && zi==0){//System.out.print("★");
                                up++;}
                               
                            }
                            
                            System.out.print("[" + up + "]");

                            if(up==c){
                            cnt++;
                            if(i!=j){
                                System.out.print("★")
                                        ;cnt++;}
                            System.out.println("★");
                            }else{
                                System.out.println("");
                            }
                        }
                    }
                    System.out.println(cnt);

                }
            }
        }
    }
}
