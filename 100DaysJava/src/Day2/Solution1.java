package Day2;

/**
 * Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!
 * Given an array, s,n of  real number strings, sort them in descending order — but wait, there's more! Each number must be printed in the exact same format as it was read from stdin,
 * meaning that .1 is printed as .1, and 0.1 is printed as 0.1 If two numbers represent numerically equivalent values,
 * then they must be listed in the same order as they were received as input).
 */

import java.math.BigDecimal;
import java.util.*;
class Solution1{
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        Arrays.sort(s,0,n, (a,b)->{

            BigDecimal s1= new BigDecimal(a);
            BigDecimal s2= new BigDecimal(b);
            return s2.compareTo(s1);
        });
        //Write your code here

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }
}