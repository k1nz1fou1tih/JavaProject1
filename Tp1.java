/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author ha
 */
public class Tp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       
        
        String str ;
        String   st,str1=null;
        String str2=null;
        
        int s=0;
       
       
        
          
        System.out.println("entrer ton code:");
        Scanner sc =new Scanner (System.in);
        str = sc.nextLine();
         
        while (sc.hasNext()){
            s++ ;
            str1=sc.nextLine();
             //System.out.println("coco");
              
        str =str+str1;
        if (s>=5)break ;
        
   
        }     
        
        
         
      
        int d=inter (str);
        int dec=Decalage(d) ;
        System.out.println("la clé est :"+dec);
        String lm=convert(str,dec);
        System.out.println("le txte dechiffrer est :\n"+lm);
        
    }
    
    public static int inter( String ss){
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        int c=0;
        int d=0;
        char e=0 ;
        for (int j=0;j<25;j++){ 
            
           int b ;
            b = compteOccurences(ss,alphabet.charAt(j));
          if (b>=c){
          c=b;
          e=alphabet.charAt(j);
          d=j;
          }
          
        
        
    }
        return d;
    }
    public static int Decalage(int m){
          if (m>=4)return m-4 ; 
              return(26-4+m);
        
          
         
    }
    public static String convert(String s,int decl){
        String alphabet1="abcdefghijklmnopqrstuvwxyz";
        s=s.toLowerCase();
        char []alph=alphabet1.toCharArray();
        char []s1 =s.toCharArray();
        for (int i=0;i<s.length();i++){
        for (int j=0;j<25;j++){
       while ( s.charAt(i)==alphabet1.charAt(j)){
          /*System.out.println(s.charAt(i));
          System.out.println(alphabet1.charAt(j));
          System.out.println(j);*/
          if(j>=decl) 
          s1[i]=alph[j-decl];else s1[i]=alph[26-(decl-j)];
          break;
       }
                }
        
        }
        s=String.valueOf(s1);
        return s;
    }
    public static int compteOccurences(String maChaine,char recherche) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    maChaine=maChaine.toLowerCase();
    int nb=0;
    for (int i=0;i<maChaine.length();i++){
        if (maChaine.charAt(i)==recherche )
            nb++;
    
    }
    return nb;
    }
    
}
