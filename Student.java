class EncapsulationTask {
    public static void main(String[] args) {
        Student student  = new Student();
        student .setName("shruti");
        student .setAge(23);
        student .setGrade("A");
        System.out.println("\n__________________________");
        System.out.println("\nStudent Name:"+ student.getName());
        System.out.println("\nStudent Age:"+ student.getAge());
        System.out.println("\nStudent grade:"+ student.getGrade());
        System.out.println("\n__________________________");
   
    }
    
}

class Student{
    private String name , grade;
    private int age;

    public int getAge() {
        return age;
    }

    public String getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }


}
