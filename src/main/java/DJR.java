import lombok.Getter;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
@Getter
public class DJR {

    private Integer number;
    private LinkedHashMap<BigDecimal,Boolean> map;
    protected static String str;

    public DJR(Integer number){
        setNumber(number);
    }

    public void setNumber(Integer number) {
        if (number <-18){
            throw new RuntimeException();
        }
        this.number = number;
    }

    public void method(int num){
        System.out.println(num);
    }
    public void method(double num){
        System.out.println(num);
    }

}
