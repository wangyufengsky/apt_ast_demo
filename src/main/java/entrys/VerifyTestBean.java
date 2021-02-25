package entrys;


import annotation.NewSetter;
import lombok.Data;
import lombok.NonNull;

@Data
public class VerifyTestBean {


    @NonNull
    private String name;

    @NonNull
    private Integer age;



}
