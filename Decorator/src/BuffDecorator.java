public abstract class BuffDecorator implements IBuff {
    protected IBuff _buff;

    public BuffDecorator(IBuff buff) {
        this._buff = buff;
    }

    @Override
    public abstract String getBuff();
}
