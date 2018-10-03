package com.sample;

import java.util.ArrayList;
import java.util.List;

public class BracketCombinations {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        getlist(4,4,"", list);
        System.out.print(list);
    }

    private static void getlist(int left, int right, String temp, List<String> list){
        if(left==0 && right==0){
            list.add(temp);
        }else{
            if(left>0){
                getlist(left-1,right,temp+"(",list);
            }
            if(right>left){
                getlist(left,right-1,temp+")",list);
            }
        }

        return;
    }
}
