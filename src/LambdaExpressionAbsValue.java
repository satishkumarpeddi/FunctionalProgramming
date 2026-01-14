import java.util.function.Function;
public class LambdaExpressionAbsValue {
    public static void main(String[] args){
        Function<Integer,Integer> absoluteValue = (Integer x) -> x < 0 ? -x:x;
        System.out.println(absoluteValue.apply(-100));
    }

}
