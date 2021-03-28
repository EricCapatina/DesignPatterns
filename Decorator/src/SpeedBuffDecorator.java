public class SpeedBuffDecorator extends BuffDecorator {

    public SpeedBuffDecorator(IBuff buff) {
        super(buff);
    }

    @Override
    public String getBuff() {

        return _buff.getBuff() + "\nAdditional buff: Speed: +33";
    }
}
