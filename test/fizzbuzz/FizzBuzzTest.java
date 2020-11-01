/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

import org.junit.Test;
import static org.junit.Assert.*;

public class FizzBuzzTest {
    @Test
    public void testAnswer() {
        //1.正しい答え 2.実装の戻り値 
        assertEquals("1",FizzBuzz.answer(1));
        assertEquals("2",FizzBuzz.answer(2));
        assertEquals("Fizz",FizzBuzz.answer(3));
        assertEquals("4",FizzBuzz.answer(4));
        assertEquals("Buzz",FizzBuzz.answer(5));
        assertEquals("Fizz",FizzBuzz.answer(6));
        assertEquals("7",FizzBuzz.answer(7));
        assertEquals("8",FizzBuzz.answer(8));
        assertEquals("Fizz",FizzBuzz.answer(9));
        assertEquals("Buzz",FizzBuzz.answer(10));
        assertEquals("11",FizzBuzz.answer(11));
        assertEquals("Fizz",FizzBuzz.answer(12));
        assertEquals("13",FizzBuzz.answer(13));
        assertEquals("14",FizzBuzz.answer(14));
        assertEquals("FizzBuzz",FizzBuzz.answer(15));
        assertEquals("16",FizzBuzz.answer(16));
        assertEquals("17",FizzBuzz.answer(17));
        assertEquals("Fizz",FizzBuzz.answer(18));
        assertEquals("19",FizzBuzz.answer(19));
        assertEquals("Buzz",FizzBuzz.answer(20));        
    }    
}
