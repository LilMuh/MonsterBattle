package MonsterBattle;

public class BattleArena {
    public static void main(String[] args) {
        // Default: Health: 50, power: 50
        Role Brute = new Role("Brute", 100, 80, 15);
        Role Soldier = new Role("Soldier", 50, 50, 50);

        // Show role info
        Brute.showRoleInfo();
        Soldier.showRoleInfo();

        // Two roles battle
        fight(Brute,Soldier); // Remaining health: Brute -> 0; Soldier -> 2
        fight(Soldier,Brute); // Remaining health: Brute -> 0; Soldier -> 14

    }

    public static boolean die(Role role){
        if(role.getHealth()==0){
            return true;
        }
        return false;
    }

    public static void fight(Role attacker, Role defender){
        // two role fight each other
        while(!(die(defender)||die(attacker))){
            attacker.attack(defender);
            // If defender is still alive, attack back
            if(!die(defender)){defender.attack(attacker);}
            else{break;}
        }
        if(die(defender)){
            System.out.println();
            System.out.println(defender.getName()+" has been killed by "+attacker.getName());
        }
        else if (die(attacker)) {
            System.out.println();
            System.out.println(attacker.getName()+" has been killed by "+defender.getName());
        }
        else{
            System.out.println("Something went wrong, no one died");
        }
    }

}
