package control;

import java.util.ArrayList;

public class Bar {
    public static void main(String[] args) {


    }

    public static <T extends Comparable<T>> void mergeSort(ArrayList<T> list){
        if(list.size()<=1){
            return;
        }
        int mid = list.size()/2;
        ArrayList<T> left = new ArrayList<>(list.subList(0,mid));
        ArrayList<T> right = new ArrayList<>(list.subList(mid, list.size()));

        mergeSort(left);
        mergeSort(right);

        merge(left, right, list);
    }

    private static <T extends Comparable<T>> void merge(ArrayList<T> left,
                                                       ArrayList<T> right,
                                                       ArrayList<T> result){
        result.clear();
        int leftIndex=0, rightIndex=0;

        while (leftIndex<left.size() && rightIndex<right.size()){
            if(left.get(leftIndex).compareTo(right.get(rightIndex))<0){
                result.add(left.get(leftIndex++));
            }else {
                result.add(right.get(rightIndex++));
            }
        }

        while(leftIndex < left.size()){
            result.add(left.get(leftIndex++));
        }

        while(rightIndex < right.size()){
            result.add(right.get(rightIndex++));
        }
    }

}