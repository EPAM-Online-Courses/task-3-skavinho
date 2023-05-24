package efs.task.oop;

public class Main {
    public static void main(String[] args) {
        Villager kashya = new Villager("Kashya", 30);
        ExtraordinaryVillager akara = new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER);
        Villager gheed = new Villager("Gheed", 50);
        ExtraordinaryVillager deckardCain = new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY);
        Villager warriv = new Villager("Warriv", 35);
        Villager flawia = new Villager("Flawia", 25);

        Object objectDeckardCain = deckardCain;
        Object objectAkara = akara;

        Villager[] villagers = {kashya, akara, gheed, deckardCain, warriv, flawia};

        for (Villager villager : villagers) {
            villager.sayHello();
        }

        while (Monsters.monstersHealth > 0) {
            for (Villager villager : villagers) {
                if (villager.getHealth() > 0) {
                    System.out.println("Aktualnie walczacy osadnik to " + villager.getName());
                    villager.attack(Monsters.andariel);
                    villager.attack(Monsters.blacksmith);
                }
            }

            if (Monsters.andariel.getHealth() > 0) {
                Monsters.andariel.attack(kashya);
                Monsters.andariel.attack(akara);
                Monsters.andariel.attack(gheed);
                Monsters.andariel.attack(deckardCain);
                Monsters.andariel.attack(warriv);
                Monsters.andariel.attack(flawia);
            }

            if (Monsters.blacksmith.getHealth() > 0) {
                Monsters.blacksmith.attack(kashya);
                Monsters.blacksmith.attack(akara);
                Monsters.blacksmith.attack(gheed);
                Monsters.blacksmith.attack(deckardCain);
                Monsters.blacksmith.attack(warriv);
                Monsters.blacksmith.attack(flawia);
            }

            System.out.println("Potwory posiadaja jeszcze " + Monsters.monstersHealth + " punkty(-ów) życia.");
        }

        System.out.println("Obozowisko ocalone!");

        deckardCain = (ExtraordinaryVillager) deckardCain;
        akara = (ExtraordinaryVillager) akara;

        // Wywołanie metody klasy ExtraordinaryVillager
        deckardCain.sayHello();
        akara.sayHello();
    }
}