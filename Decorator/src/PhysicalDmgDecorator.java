public class PhysicalDmgDecorator extends BuffDecorator{
    public PhysicalDmgDecorator(IBuff buff) {
        super(buff);
    }

    @Override
    public String getBuff() {
        return _buff.getBuff() + "\nAdditional buff: Physical Damage: +330";
    }
}
