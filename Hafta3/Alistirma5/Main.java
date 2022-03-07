import java.util.ArrayList;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {
        List<Integer> list1 = List.of(3,6,9,15,8,4);
        System.out.println("İlk dizideki elemanlar: ");
        for (Integer integer : list1) {
            System.out.print(integer + " ");
        }
        System.out.println();
        List<Integer> list2 = List.of(2,4,7,0,36,34,8);
        System.out.println("İkinci dizideki elemanlar: ");
        for (Integer integer : list2) {
            System.out.print(integer + " ");
        }
        System.out.println();
        List<Integer> commonElements = findCommonElements(list1, list2);
        System.out.print("2 dizideki ortak elemanlar: ");
        for (Integer integer : commonElements) {
            System.out.print(integer + " ");
        }
    }
    
    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> returnList = new ArrayList<>();
        for(Integer num : list1) {
            if(list2.contains(num)) {
                returnList.add(num);
            }
        }

        return returnList;
    }
}