package practice02;

public class Student extends Person{
	private final int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public String introduce() {
        return "I am a Student. I am at Class " + this.klass + ".";
    }
}
/*
再写一个Student类继承Person类，除了name，age属性，还有要有klass属性。也有一个introduce方法，
introduce方法返回一个字符串形如：

>I am a Student. I am at Class 2.
*/