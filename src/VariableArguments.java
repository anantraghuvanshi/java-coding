import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        fun(2, 3 , 4, 5, 5,6,7,4,2,5,7);
    }
    static void fun(int ...a){ /////basically passes arrays of number. Used when the number of arguments are variable/unknown.
        System.out.println(Arrays.toString(a));
    }
}
