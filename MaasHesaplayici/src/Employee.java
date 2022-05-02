public class Employee {
    Employee emp1;
    String name;
    double salary;
    int workHours;
    int hireYears;

    Employee(String name, double salary, int workHours, int hireYears) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYears = hireYears;
    }

    int tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return (int) (salary * 0.03);
        }
    }

    int bonus() {
        if (workHours > 40) {
            return (workHours-40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        int year = 2021 - this.hireYears;
        if (year < 10) {
            return this.salary * 0.05;
        } else if (year < 20) {
            return this.salary * 0.1;
        } else {
            return this.salary * 0.15;
        }
    }

    void EmployeeInfo() {
        System.out.println("================");
        System.out.println("Isim : " + this.name);
        System.out.println("Maasi : " + this.salary);
        System.out.println("Calisma Saati : " + this.workHours);
        System.out.println("Baslangic Yili : " + this.hireYears);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maas Artisi : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maas : " + ((this.salary + bonus()) - tax()) );
        System.out.println("Toplam Maas : " + (this.salary + bonus() + raiseSalary() - tax()) );
    }
}
