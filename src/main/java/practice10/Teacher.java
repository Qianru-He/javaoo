package practice10;

import java.util.Collection;
import java.util.LinkedList;

import static java.util.stream.Collectors.joining;

public class Teacher extends Person {
    private LinkedList<Klass> classes = new LinkedList<Klass>();

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, LinkedList<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
    }

    public String introduce() {
        if (this.classes.isEmpty()) {
            return teach("No Class");
        }

        String classIds = this.classes.stream().map(k -> String.valueOf(k.getNumber())).collect(joining(", "));
        return teach("Class " + classIds);
    }

    private String teach(String name) {
        return basicIntroduce() + " I teach " + name + ".";
    }

    private String doNotTeach(String name) {
        return basicIntroduce() + " I don't teach " + name + ".";
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return teach(student.getName());
        }
        return doNotTeach(student.getName());
    }

    private String basicIntroduce() {
        return super.introduce() + " I am a Teacher.";
    }

    public Collection<Klass> getClasses() {
        return classes;
    }

    public boolean isTeaching(Student student) {
		Klass k = student.getKlass();
		for(Klass elem:this.classes)
		{
			if(k.equals(elem))
				return true;
		}
        return false;
    }
}