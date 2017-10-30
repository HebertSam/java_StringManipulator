public class StringManipulatorTest{
    public static void main(String [] args){
        StringManipulator manipulator = new StringManipulator();
        System.out.println(manipulator.trimAndConcat("  Hello  ", "  World  "));
        char letter = 'o';
        System.out.println(manipulator.getIndexOrNull("Coding", letter));
        System.out.println(manipulator.getIndexOrNull("Hello World", letter));
        System.out.println(manipulator.getIndexOrNull("Hi", letter));
        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        System.out.println(manipulator.getIndexOrNull(word, subString));
        System.out.println(manipulator.getIndexOrNull(word, notSubString));
        System.out.println(manipulator.concatSubstring(word, 1, 2, notSubString));
    }
}