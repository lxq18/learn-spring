import com.alibaba.fastjson.JSON;
import lombok.Data;
import lombok.experimental.Accessors;
import org.junit.Test;

public class SerilaTest {

    public static void main(String[] args) {
        B b = new B();
        b.setAddress("a").setAge(10).setName("b");
        String json = JSON.toJSONString(b);
        System.out.println(json);
        A a = JSON.parseObject(json, A.class);
        System.out.println(JSON.toJSONString(a));
    }

    @Test
    public void test2() {
        A a = new A();
        a.setAge(10).setName("b");
        String json = JSON.toJSONString(a);

        B b = JSON.parseObject(json, B.class);
        System.out.println(JSON.toJSONString(b));
    }
}

@Data
@Accessors(chain = true)
class A {
    private String name;
    private Integer age;
}

@Data
@Accessors(chain = true)
class B {
    private String name;
    private Integer age;
    private String address;
}
