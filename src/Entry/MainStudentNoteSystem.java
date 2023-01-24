package Entry;

import javax.sql.rowset.spi.TransactionalWriter;

public class MainStudentNoteSystem {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Chris Brown", "HIS",  "3459");
        Teacher t2 = new Teacher ("Graham Bell", "PSY","1234");
        Teacher t3 = new Teacher("Alex Smith","MAT", "0567");


        Course his = new Course("History","101","HIS",t1);
        his.addTeacher(t1);

        Course psy = new Course("Phsyics","201","PSY",t2);
        psy.addTeacher(t2);

        Course mat = new Course("Mathematics","202","MAT", t3);
        mat.addTeacher(t3);



        Student s1 = new Student("Alex", "989","4",his,psy,mat);
        s1.addBulkExamNote(100,79,50);
        s1.oralExamNote(70,70,70);
        s1.isPass();

        Student s2 = new Student("Karen","1080","4",his,psy,mat);
        s2.addBulkExamNote(99,78,35);
        s2.oralExamNote(70,70,70);
        s2.isPass();

        Student s3 = new Student("Rachel","719","5",his,psy,mat);
        s3.addBulkExamNote(39,48,35);
        s2.oralExamNote(70,70,70);
        s3.isPass();
    }

}
