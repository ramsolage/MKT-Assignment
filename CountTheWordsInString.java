package ESGProject;

import java.util.Scanner;

public class CountTheWordsInString {

	public static void main(String[] args) {
		int count=1;
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
       System.out.println(s.length());
       for(int i=0;i<s.length();i++)
       {
           if((s.charAt(i)==' '))
           {
               count++;
           }
       }
       System.out.println("Number of words in string = "+count);
      
       
       
    
}
}
