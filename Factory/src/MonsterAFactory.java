public class MonsterAFactory implements MonsterFactory {
    @Override
    public Monster createMonster() {
        return new MonsterA();
    }
}
