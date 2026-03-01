import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;

public class Compute {
    
    public ArrayList Compute(String u, BigDecimal i) throws IOException {
        ArrayList<BigDecimal> numbers = new ArrayList<>();
        numbers.clear();
        String[] values = u.split(" ");
        for (String value : values) {
            if (!value.trim().isEmpty()) {
                numbers.add(new BigDecimal(value.trim()));
            }
        }
         return numbers;
    }
    
    public BigDecimal Add(String u, BigDecimal i) throws IOException {
        ArrayList<BigDecimal> numbers = new ArrayList<>();
        Compute(u, i);
        BigDecimal result = BigDecimal.ZERO;
        for (BigDecimal number : numbers) {
            result = result.add(number);
        }
        result = result.add(i);
        return result;
    }
    public BigDecimal Subtraction(String u, BigDecimal i) throws IOException {
        ArrayList<BigDecimal> numbers = new ArrayList<>();
        Compute(u, i);
        BigDecimal result = BigDecimal.ZERO;
        result = result.add(i);
        for (BigDecimal number : numbers) {
          result = result.add(number.negate());
        }
        return result;
    }
    public BigDecimal division (String u, BigDecimal i) throws IOException {
        ArrayList<BigDecimal> numbers = new ArrayList<>();
        Compute(u, i);
        BigDecimal result = BigDecimal.ZERO;
        result = result.add(i);
        for (BigDecimal number : numbers) {
         result = result.divide(number, 1000, RoundingMode.HALF_UP);
        }
        return result;
    }
    public BigDecimal Multiplication (String u, BigDecimal i) throws IOException {
        ArrayList<BigDecimal> numbers = new ArrayList<>();
        Compute(u, i);
        BigDecimal result = BigDecimal.ZERO;
        result = result.add(i);
        for (BigDecimal number : numbers) {
            result = result.multiply(number);
        }
        return result;
    }
    public BigDecimal squared (int u, BigDecimal i) throws IOException {
        ArrayList<BigDecimal> numbers = new ArrayList<>();
       int f = 0;
       BigDecimal result = BigDecimal.ZERO;
       result = result.add(i);
        while ( u > f ) {
          result = result.multiply(i);
          f++;
        }
        return result;
    }
}
