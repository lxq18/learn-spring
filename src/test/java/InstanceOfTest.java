public class InstanceOfTest {
    public static void main(String[] args) {
        Person person = new Person();
        XiaoMing xiaoMing = new XiaoMing();
        Xiaohong xiaohong = new Xiaohong();

        System.out.println(person instanceof Person);

        System.out.println(xiaoMing instanceof Person);
        System.out.println(xiaoMing instanceof XiaoMing);

        System.out.println(xiaohong instanceof Student);
    }
}

class Person {
    private String name;
}
class XiaoMing extends Person {

}

interface Student {
    void study();
}

class Xiaohong implements Student {

    @Override
    public void study() {

    }
}