package com.odfsoft.companies.x.longest_consecutive;

public class Excercise {

    public int solution(int[] A) {
        int order = 0;
        int longest = 1;
        int currentLongest = 1;
        for (int i = 1; i < A.length; i++) {
            int difference = A[i] - A[i - 1];
            if(Math.abs(difference) == 1 && (order == difference || order == 0) ) {
                order = A[i] - A[i -1];
                currentLongest++;
            } else {
                order = 0;
                currentLongest = 1;
            }

            if(currentLongest > longest) {
                longest = currentLongest;
            }
        }
        return longest;
    }

}
