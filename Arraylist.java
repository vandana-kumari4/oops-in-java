import java.util.ArrayList;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        
    
    ArrayList <Integer> List=new ArrayList <>();
List.add(4);
List.add(8);
List.add(9);
List.add(5);
int max;
max=Integer.MIN_VALUE;
//List.add(1,9);
//System.out.println(List);
//System.out.println(List);
System.out.println(List.size());
//get element-O(1)
//int element =List.get(2);
//System.out.println(element);
//delete
//List.remove(2);
//System.out.println(List);

//set
//List.set(3,10);
//System.out.println(List);
//contains
/////System.out.println(List.contains(1));
//System.out.println(List.contains(11));

//printArraylist
for(int i=0;i<List.size();i++){
    System.out.print(List.get(i)+" ");
}
System.out.println();

for(int i=List.size()-1;i>=0;i--){
    System.out.print(List.get(i)+" ");
}
System.out.println();

for(int i=0;i<List.size();i++){
    if(max<List.get(i)){
        max=List.get(i);

    }
}
System.out.println("max elemnt ="+max);
}
}
