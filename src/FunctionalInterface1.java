 import java.util.function.Function;
public class FunctionalInterface1 {
    protected static class MyMath{
        public static Integer triple(Integer x){
            return x*3;
        }
    }

    public static void main(String[] args) {
        Function<Integer,Integer> myTriple = MyMath::triple;
        Integer result = myTriple.apply(3);
        System.out.println(result);
    }
}