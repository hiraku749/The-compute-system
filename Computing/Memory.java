import java.math.BigDecimal;

public class Memory {
    BigDecimal result = BigDecimal.ZERO;
    int amount;
    
    public void setResult(BigDecimal result) {
        this.result = result;
        amount++;
    }
    public BigDecimal getResult() {
       return this.result;
    }
    public int getmemory() {
        return this.amount;
    }
}