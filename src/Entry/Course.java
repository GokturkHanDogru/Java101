package Entry;

public class Course {
    String name;
    String code;
    String prefix;
    int note ;
    int oralnote;
    Teacher teacher;

    Course(String name, String code, String prefix,Teacher teacher){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.teacher=teacher;
        int note =0;
    }

    void addTeacher(Teacher teacher) {
        if (teacher.branch.equals(this.prefix)) {
            this.teacher = teacher;
            // printTeacherInfo();
        } else {
            System.out.println("Teacher and Branch are Wrong!");
        }
    }
    void printTeacherInfo(){
        this.teacher.print();
    }

}
