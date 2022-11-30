public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Nurdan Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Gülay Hoca", "90550000001", "FZK");
        Teacher t3 = new Teacher("Dağıstan Hoca", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("Ebrar Betül", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(100,100,100);
        s1.addBulkVerbalNote(100, 100, 100);
        s1.isPass();

        Student s2 = new Student("Hayriye Utku", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.addBulkVerbalNote(90, 60, 80);
        s2.isPass();

        Student s3 = new Student("Havva Nur", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,80,30);
        s3.addBulkVerbalNote(60, 100, 50);
        s3.isPass();
    }
}
