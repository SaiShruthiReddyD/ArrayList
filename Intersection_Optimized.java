import java.util.*;
public class Intersection_Optimized{
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
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(a[i]);
        }
        int count=0;
        for(int i=0;i<m;i++){
            if(set.contains(b[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}