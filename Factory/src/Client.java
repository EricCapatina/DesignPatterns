public class Client {
    public static void main(String[] args) {
        // Problema:
//        Monster monster = new MonsterA();
//        Monster monster1 = new MonsterA();
//
//        monster.attack();
//        monster1.attack();
        // 1 ex:
//        MonsterFactory monsterFactory = new MonsterAFactory();
//
//        Monster monster = monsterFactory.createMonster();
//        monster.attack();
        // 2 ex:
        MonsterFactory monsterFactory = createMonsterUser("A");
        Monster monster = monsterFactory.createMonster();
        monster.attack();
    }
        static MonsterFactory createMonsterUser(String type)
        {
            if(type.equalsIgnoreCase("R"))
            {
                return new MonsterRFactory();
            }
            else if(type.equalsIgnoreCase("A"))
            {
                return new MonsterAFactory();
            }
            else
            {
                throw new RuntimeException(type + " is Unknown type to spawn");
            }
        }


}
