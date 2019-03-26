package practice10;

public class Klass {
    private int number;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Klass klass = (Klass) o;

        return number == klass.number;
    }
	
    public String getDisplayName() {
        return "Class " + number;
    }

    public void assignLeader(Student student) {
        if (!student.getKlass().equals(this)) {
            System.out.print("It is not one of us.\n");
        } else {
            this.leader = student;
        }
    }

    public Student getLeader() {
        return leader;
    }

    public void appendMember(Student student) {
        student.setKlass(this);
    }
}