public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;
    int start;
    int i;

    Match(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = 65;
        this.maxWeight = 90;
        this.start = 50;
        this.i = 0;
    }

    void run() {
        if (checkWeight()) {
            System.out.println("\nKIRMIZI KOSEDE: " + this.f1.name + "\nMAVI KOSEDE: " + this.f2.name);
            System.out.println("\nMAC BASLIYOOOR !");
            while (f1.health > 0 && f2.health > 0) {
                i++;
                System.out.println("\n====== " + i + ". ROUND" + " ======");
                if (isStart() /* f1 is start. */) {
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                } else {
                    f1.health = f2.hit(f1);
                    if (isWin()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    if (isWin()) {
                        break;
                    }
                }
                printHealth();
            }
        } else {
            System.out.println("Boksorlerin Sikleleri Uyumsuz !");
        }
    }

    boolean checkWeight() {
        return (f1.weight <= maxWeight && f1.weight >= minWeight) && (f2.weight <= maxWeight && f2.weight >= minWeight);
    }

    boolean isStart() {
        int randomValue = (int) (Math.random() * 100);
        return (randomValue < this.start);
    }

    boolean isWin() {
        if (this.f1.health == 0) {
            System.out.println("\nMaci Kazanan => " + this.f2.name);
            return true;
        }

        if (this.f2.health == 0) {
            System.out.println("\nMaci Kazanan => " + this.f1.name);
            return true;
        }

        return false;
    }

    void printHealth() {
        System.out.println();
        System.out.println(this.f1.name + " icin kalan saglik = " + this.f1.health);
        System.out.println(this.f2.name + " icin kalan saglik = " + this.f2.health);
    }


}
