package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class StackTest 
{
   private MyStack stack;
   
   @Before
   public void setUp() throws Exception {
       stack = new MyStack();
   }

   @Test
   public void checkStackConstructor(){
    assertNotNull(stack.top);
   }

   @Test
   public void checkIfStackEmpty(){
    assertTrue("Stack is empty", stack.empty());
   }

   @Test
   public void checkIfStackNotEmpty(){
    stack.push(2);
    assertFalse("Stack is not empty",stack.empty());
   }

  @Test
   public void pushElementToStack(){
    stack.push(1);
   assertEquals("Element pushed to stack",stack.peek(), 1);
   }

     @Test
   public void peekStackTopObject(){
    stack.push(12);
    assertEquals("Element peeked from stack", stack.peek(),12);
   }

  @Test
   public void popStackTopObject(){
    stack.push(5);
    assertEquals("Element popped from stack", stack.pop(),5);
   }

    @Test
   public void printStackElements(){
    stack.push(4);
    stack.push(5);
    stack.push(6);
    assertNotNull("Stack elements are printed", stack.print());
   }
}
