package MonsterBattle;

public class BattleArena {
    public static void main(String[] args) {
        // Default: Health: 50, power: 50
        Role Brute = new Role("Brute", 100, 75);
        Role Soldier = new Role("Soldier", 50, 50);

        Brute.showRoleInfo();
        Soldier.showRoleInfo();

        while(!(die(Soldier)||die(Brute))){
            Brute.attack(Soldier);
            Soldier.attack(Brute);
        }
    }

    public static boolean die(Role role){
        if(role.getHealth()==0){
            System.out.println();
            System.out.printf("%s has been killed", role.getName());
            return true;
        }
        return false;
    }

}
