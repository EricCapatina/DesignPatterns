public class MonsterRFactory implements MonsterFactory{
    @Override
    public Monster createMonster() {
        return new MonsterR();
    }
}
