public class Teacher {
    String name;
    String mpno;
    String branch;

    Teacher(String name, String mpno, String branch){
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print() {
        System.out.println("================");
        System.out.println("ADI : " + this.name);
        System.out.println("NUMARA : " + this.mpno);
        System.out.println("DERS : " + this.branch);
    }
}
