import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("12");
        list.add("Hi");
        list.add("Hello");
        list.add("Hey");
        System.out.println(list);

        int s=list.size();//returns size of list
        System.out.println(s);

        list.add(2,"45");//adding the element at specific location int list 
        System.out.println(list);
        ArrayList<String> list1=new ArrayList<>();
        list1.add("13");

        list1.addAll(list);//adding list to list1
        System.out.println(list1);

        list.set(3,"Ho");//Update the existing value
        System.out.println(list);

        list.remove("Ho");//To remove that particular element
        System.out.println(list);

        System.out.println(list.get(2));//To get the element at that index

        //Iteration-1
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        //Iteration-2
        for(String item:list){
            System.out.println(item);
        }

        //Sorting (ascending order)
        Collections.sort(list);//strings are sorted in the order of the ascii values
        System.out.println(list);

        //sorting (descending order)
        Collections.reverse(list);
        System.out.println(list);

        //contains method
        boolean found=list.contains("45");
        System.out.println(found);
    }
}
