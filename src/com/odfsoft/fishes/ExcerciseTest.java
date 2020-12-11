package com.odfsoft.fishes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExcerciseTest {

    @Test
    public void test() {
        Excercise test = new Excercise();

        int sol = test.solution("ABAD");

        assertEquals(3, sol);
    }

    @Test
    public void test2() {
        Excercise test = new Excercise();

        int sol = test.solution("ACCD");

        assertEquals(1, sol);
    }

    @Test
    public void test3() {
        Excercise test = new Excercise();

        int sol = test.solution("ACCCCD");

        assertEquals(1, sol);
    }

    @Test
    public void test4() {
        Excercise test = new Excercise();

        int sol = test.solution("CAAADACD");

        assertEquals(5, sol);
    }

    @Test
    public void test5() {
        Excercise test = new Excercise();

        int sol = test.solution("DDDDDACD");

        assertEquals(1, sol);
    }

    @Test
    public void test6() {
        Excercise test = new Excercise();

        int sol = test.solution("CAAADACD");

        assertEquals(5, sol);
    }

    @Test
    public void longString() {

        Excercise test = new Excercise();

        int sol = test.solution("CAAADACD");

        assertEquals(5, sol);
    }


}