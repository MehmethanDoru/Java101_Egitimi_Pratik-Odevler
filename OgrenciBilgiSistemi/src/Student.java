public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
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
            c1.note = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            c2.note = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            c3.note = note3;
        }
    }

    void addBulkPerformanceNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            c1.performanceNote = note1;
        }

        if (note2 >= 0 && note2 <= 100) {
            c2.performanceNote = note2;
        }

        if (note3 >= 0 && note3 <= 100) {
            c3.performanceNote = note3;
        }
    }

    void calcAvarage() {
        this.avarage = ((this.c1.note * 0.8) + (this.c1.performanceNote * 0.2) + (this.c2.note * 0.8) + (this.c2.performanceNote * 0.2) + (this.c3.note * 0.8) + (this.c3.performanceNote * 0.2)) / 3;
    }

    void printNote() {
        System.out.println();
        System.out.println(this.c1.name + " => Sinav: " + this.c1.note + " Sozlu: " + this.c1.performanceNote);
        System.out.println(this.c2.name + " => Sinav: " + this.c2.note + " Sozlu: " + this.c2.performanceNote);
        System.out.println(this.c3.name + " => Sinav: " + this.c3.note + " Sozlu: " + this.c3.performanceNote);
    }

    void isPass() {
        calcAvarage();
        printNote();

        if (this.avarage > 55) {
            isPass = true;
            System.out.println("\nSinifi Basari Ile Gectiniz :)");
        } else {
            System.out.println("\nSinifi Gecemediniz :(");
        }
    }
}
