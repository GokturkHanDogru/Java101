package Entry;

public class Student {
    String name;
    String stuNo;
    String classes;
    Course c1;
    Course c2;
    Course c3;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, String classes, Course c1, Course c2, Course c3) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.avarage = 0.0;
        this.isPass = false;

    }

    void addBulkExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            this.c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            this.c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            this.c3.note = note3;
        }
    }

    void oralExamNote(int note4, int note5, int note6){
        if (note4 >= 0 && note4 <= 100) {
            this.c1.oralnote = note4;
        }
        if (note5>= 0 && note5 <= 100) {
            this.c2.oralnote = note5;
        }
        if (note6 >= 0 && note6 <= 100) {
            this.c3.oralnote = note6;
        }
    }
    void isPass(){
        this.avarage=((this.c1.note*0.8)+(this.c1.oralnote*0.2)+(this.c2.note*0.8)+(this.c2.oralnote*0.2)+(this.c3.note*0.8)+(this.c3.oralnote*0.2))/3.0;
        if (this.avarage>=55){
            System.out.println("You Passed the Term");
            this.isPass=true;
        }else {
            System.out.println("You didn´t Passed the Term");
            this.isPass=false;
        }
        printNote();
        System.out.println("===============");
    }
    void printNote() {
        System.out.println(this.c1.name + ":\t" + this.c1.note);
        System.out.println(this.c2.name + ":\t" + this.c2.note);
        System.out.println(this.c3.name + ":\t" + this.c3.note);
        System.out.println("Your Avarage : "+ this.avarage);
    }
}
