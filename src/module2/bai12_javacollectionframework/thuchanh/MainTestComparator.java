package module2.bai12_javacollectionframework.thuchanh;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MainTestComparator {
    public static void main(String[] args) {
        Student student = new Student("Kien", 30, "DN");
        Student student1 = new Student("Nam", 26, "DN");
        Student student2 = new Student("Quang", 38, "DN");
        Student student3 = new Student("Hung", 38, "DN");

        List<Student> lists = new ArrayList<Student>();
        lists.add(student);
        lists.add(student1);
        lists.add(student2);
        lists.add(student3);
        Collections.sort(lists);
        for (Student st : lists) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("So sanh theo tuoi:");
        for (Student st : lists) {
            System.out.println(st.toString());
        }
    }
}
