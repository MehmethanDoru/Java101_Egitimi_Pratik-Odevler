public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mete", "3434", "MZK");
        Teacher t2 = new Teacher("Taha", "3437", "ING");
        Teacher t3 = new Teacher("Yunus", "5252", "GEMI");

        Course c1 = new Course("MUZIK", "101", "MZK");
        c1.addTeacher(t1);
        Course c2 = new Course("INGILIZCE", "201", "ING");
        c2.addTeacher(t2);
        Course c3 = new Course("GEMI","301", "GEMI");
        c3.addTeacher(t3);
        Student s1 = new Student("Mehmethan", "504", "7", c1, c2, c3);

        s1.addBulkExamNote(90,45,75);
        s1.addBulkPerformanceNote(100,60,80);
        s1.isPass();

        System.out.println("\nDerslerden Sorumlu Hocalar");
        t1.print();
        t2.print();
        t3.print();
    }
}
