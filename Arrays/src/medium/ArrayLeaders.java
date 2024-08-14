package medium;

import java.util.ArrayList;
import java.util.List;

public class ArrayLeaders {
    public static void main(String[] args){
        int arr[] = new int[]{30,10,10,5};
        int n = arr.length;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i< n;i++){
            boolean leaderElem = true;
            for(int j=i+1; j<n;j++){
                if(arr[i] <arr[j]){
                   leaderElem = false;
                   break;
                }
            }
            if(leaderElem == true){
                list.add(arr[i]);
            }
        }
        list.forEach(System.out::println);
    }
}
