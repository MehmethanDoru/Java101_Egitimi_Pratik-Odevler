public class Fighter {
    String name;
    int weight;
    int health;
    int damage;
    int dodge;

    Fighter(String name, int weight, int health, int damage, int dodge){
        this.name = name;
        this.weight = weight;
        this.health = health;
        this.damage= damage;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        }
    }

    boolean isDodge() {
        int random = (int) (Math.random() * 100);
        return (random < this.dodge);
    }

    int hit(Fighter foe) {
        System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");

        if (foe.isDodge()) {
            System.out.println(foe.name + " gelen darbeyi blokladi.\n");
            return foe.health;
        }

        if ( (foe.health - this.damage) < 0 ) {
            return 0;
        }

        return (foe.health - this.damage);
    }

}
