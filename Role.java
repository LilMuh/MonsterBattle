package MonsterBattle;

public class Role {

// Properties
    private String name; // Role name
    private int health; // Role health, 0 to death
    private int power; // Role's power to attack
    private int armor; // Role's armor to physical damage


// Actions

    public Role() {
    }

    public Role(String name, int health, int power, int armor) {
        this.name = name;
        this.health = health;
        this.power = power;
        this.armor = armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        if(armor>=-100&&armor<=100){
            this.armor = armor;
        }
        else {
            System.out.println(".....................");
            System.out.println("The armor is invalid.");
            System.out.println(".....................");
        }
    }

    // Design a method to role1.attack(role2)
    public void attack(Role role){

        int damage = (int)(this.power*(this.armor/100.0));
        int remainHealth = role.getHealth() - damage;
        remainHealth = remainHealth < 0 ? 0 : remainHealth;
        role.setHealth(remainHealth);
        System.out.println("---------------------------------------------------");
        System.out.printf("%s hits %s by super power, and it deals %s damage.", this.getName(), role.getName(), damage);
        System.out.println();
        System.out.printf("%s's remaining health is %s", role.getName(), role.getHealth());
        System.out.println();
        System.out.println("---------------------------------------------------");

    }



    public void showRoleInfo(){
        System.out.println("========================");
        System.out.println("Role info");
        System.out.println("    Name: "+this.getName());
        System.out.println("    Power: "+this.getPower());
        System.out.println("    Health: "+this.getHealth());
        System.out.println("    Armor: "+this.getArmor());
        System.out.println("========================");
    }
}
