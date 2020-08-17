package com.wusasa.utils;

public class CommenUtils {
    public static String getRandomId(Integer amount){
        String result = "";
        int max = 9,min = 0;
        while(amount-- > 0){
            int temp = (int) (Math.random()*(max-min)+min);
            result += temp;
        }
        return result;
    }
}
