/*
* This program test the stack class
*
* @author  Hussein Mansour
* @version 1.0
* @since   2021-12-07
*/

/**
* This is the stack class program.
*/
final class Main {
    /**
    * Constant.
    */
    public static final int TEN = 10;
    /**
    * Constant.
    */
    public static final int ELEVEN = 11;
    /**
    * String.
    */
    public static final int STR = "The stack list";
    /**
    * String.
    */
    public static final int STRONE = "Adding 10: ";
    /**
    * String.
    */
    public static final int STRTWO = "End of stack list ";
    /**
    * Space.
    */
    public static final String SPACE = "\n";

    /**
    * Prevent instantiation
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Main() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * Starting... the main method
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        final HsenStack stack = new HsenStack();

        // The stack no adds
        System.out.println(STR + SPACE);
        stack.showStack();
        System.out.print(SPACE + STRTWO + SPACE);

        // Adding 10
        System.out.print(SPACE + STR);
        System.out.println(SPACE + STRONE + SPACE);
        stack.push(TEN);

        stack.showStack();
        System.out.print(SPACE + STRTWO + SPACE);

        // Adding 11.
        System.out.print(SPACE + STR);
        System.out.println(SPACE + "Adding 11: " + SPACE);
        stack.push(ELEVEN);

        stack.showStack();
        System.out.print(SPACE + STRTWO + SPACE);

        // Adding 12.
        System.out.print(SPACE + STR);
        System.out.println(SPACE + STRONE + SPACE);
        stack.push(TEN);

        stack.showStack();
        System.out.print(SPACE + STRTWO + SPACE);

        // Pop top element
        System.out.print(SPACE + STR);
        System.out.println(SPACE + "Pop top element: " + SPACE);
        stack.pop(0);

        stack.showStack();
        System.out.println(SPACE + STRTWO + SPACE);

        // Done.
        System.out.println("\nDone.");
    }
}
