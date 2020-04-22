package fifth_chapter.defaultvalue;

public class DefaultValue {
    int d_int;
    float d_float;

    char d_char;
    String d_string;

    boolean d_boolean;

    public void doSomething(){
        System.out.println("Default value for instance variable");

        System.out.println("int\t\t: " + d_int);        // 0
        System.out.println("float\t: " + d_float);      // 0.0
        System.out.println("char\t: " + d_char);        //
        System.out.println("String\t: " + d_string);    // null
        System.out.println("boolean\t: " + d_boolean);  // false
    }
}
