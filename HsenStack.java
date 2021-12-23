/*
* This program is a stack class.
*
* @author  Hsen Mansour
* @version 1.0
* @since   2021-12-07
*/

import java.util.ArrayList;

/**
* This is the stack class program.
*/
public class HsenStack {
    /**
    * Stack vareable.
    */
    private ArrayList<Integer> stack = new ArrayList<Integer>();

    /**
    * Function adds value to stack.
    *
    * @param pushValue push value.
    */
    public void push(final int pushValue) {
        stack.add(pushValue);
    }

    /**
    * Function.
    *
    * @param popStack stack.
    */
    public int pop() {
        final int returnpop = stack.get(0);
        stack.remove(0);
        return returnpop;
    }

    /**
    * Prints stack.
    */
    public void showStack() {
        System.out.println(stack);
    }
}
