package java_summary;

public class Exercise7 {
    public static void main(String[] args) {
        int i = 1, j = 1, a = 10;
        System.out.println("a = i++ + j++: " + (i++ + j++));
        i = 1;
        j = 1;
        System.out.println("a = i++ + ++j: " + (i++ + ++j));
        i = 1;
        j = 1;
        System.out.println("a = ++i + j++: " + (++i + j++));
        i = 1;
        j = 1;
        System.out.println("a = ++i + ++j: " + (++i + ++j));
        i = 1;
        j = 1;
        System.out.println("a = i++ + j++ + i++ + j++: " + (i++ + j++ + i++ + j++));
        i = 1;
        j = 1;
        System.out.println("a = ++i + ++j + i++ + j++: " + (++i + ++j + i++ + j++));
        i = 1;
        j = 1;
        System.out.println("a = i++ + ++i - i-- - --i: " + (i++ + ++i - i-- - --i));
        System.out.println("a += a++ + ++a: " + (a += a++ + ++a));
    }
}

