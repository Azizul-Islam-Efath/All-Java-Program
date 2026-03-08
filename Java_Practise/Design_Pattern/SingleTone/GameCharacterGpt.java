package Prototype;

public interface GameCharacterGpt {
    GameCharacterGpt clone();
    void display();
}

class Warrior implements GameCharacterGpt {

    private int health;
    private int attackPower;
    private int defense;
    private String weapon;
    private String skillLevel;

    public Warrior(int health, int attackPower, int defense, String weapon, String skillLevel) {
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
        this.weapon = weapon;
        this.skillLevel = skillLevel;
    }

    public GameCharacterGpt clone() {
        return new Warrior(health, attackPower, defense, weapon, skillLevel);
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    public void display() {
        System.out.println("Warrior -> Health: " + health +
                ", Attack: " + attackPower +
                ", Defense: " + defense +
                ", Weapon: " + weapon +
                ", Skill: " + skillLevel);
    }
}

class Archer implements GameCharacterGpt {

    private int health;
    private int attackPower;
    private int defense;
    private String weapon;
    private String skillLevel;

    public Archer(int health, int attackPower, int defense,
                  String weapon, String skillLevel) {
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
        this.weapon = weapon;
        this.skillLevel = skillLevel;
    }

    @Override
    public GameCharacterGpt clone() {
        return new Archer(health, attackPower, defense, weapon, skillLevel);
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    @Override
    public void display() {
        System.out.println("---- Archer ----");
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("Defense: " + defense);
        System.out.println("Weapon: " + weapon);
        System.out.println("Skill Level: " + skillLevel);
    }
}

class Mage implements GameCharacterGpt {

    private int health;
    private int attackPower;
    private int defense;
    private String specialAbility;
    private String skillLevel;

    public Mage(int health, int attackPower, int defense,
        String specialAbility, String skillLevel) {
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
        this.specialAbility = specialAbility;
        this.skillLevel = skillLevel;
    }

    @Override
    public GameCharacterGpt clone() {
        return new Mage(health, attackPower, defense, specialAbility, skillLevel);
    }

    public void setSpecialAbility(String ability) {
        this.specialAbility = ability;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    @Override
    public void display() {
        System.out.println("---- Mage ----");
        System.out.println("Health: " + health);
        System.out.println("Attack Power: " + attackPower);
        System.out.println("Defense: " + defense);
        System.out.println("Special Ability: " + specialAbility);
        System.out.println("Skill Level: " + skillLevel);
    }
}

class GameClient1 {

    public static void main(String[] args) {

        // Original Warrior
        Warrior originalWarrior = new Warrior(120, 80, 70, "Sword", "Medium");

        // Clone Warrior
        Warrior clonedWarrior = (Warrior) originalWarrior.clone();
        clonedWarrior.setWeapon("Axe");
        clonedWarrior.setSkillLevel("High");

        System.out.println("Original Warrior:");
        originalWarrior.display();

        System.out.println("\nCloned Warrior:");
        clonedWarrior.display();


        // Original Archer
        Archer originalArcher = new Archer(90, 95, 50, "Bow", "Medium");

        Archer clonedArcher = (Archer) originalArcher.clone();
        clonedArcher.setWeapon("Crossbow");
        clonedArcher.setSkillLevel("Expert");

        System.out.println("\nOriginal Archer:");
        originalArcher.display();

        System.out.println("\nCloned Archer:");
        clonedArcher.display();


        // Original Mage
        Mage originalMage = new Mage(80, 110, 40, "Fireball", "Advanced");

        Mage clonedMage = (Mage) originalMage.clone();
        clonedMage.setSpecialAbility("Lightning Strike");
        clonedMage.setSkillLevel("Master");

        System.out.println("\nOriginal Mage:");
        originalMage.display();

        System.out.println("\nCloned Mage:");
        clonedMage.display();
    }
}