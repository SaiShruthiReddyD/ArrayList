/*
given two arrays a[] and b[], your task is to determine whether b[] is 
a subset of a[].
ip: a[]=[11,7,1,13,21,3,7,3],b[]=[11,3,7,1,7]
op: true
*/
import java.util.*;
public class Subset{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int[] b=new int[m];
        for(int i=0;i<m;i++){
            b[i]=sc.nextInt();
        }
        boolean f=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(a[i]==b[j]){
                    f=true;
                }
            }
        }System.out.println(f);
    }
}