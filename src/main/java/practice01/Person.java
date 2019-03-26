package practice01;

public class Person {
	private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce() {
        return "My name is " + this.name + ". I am " + this.age + " years old.";
    }
}
/*
写一个Person类，要有name，age属性，要有一个introduce方法，
introduce方法返回一个字符串形如：

>My name is Tom. I am 21 years old.

*/