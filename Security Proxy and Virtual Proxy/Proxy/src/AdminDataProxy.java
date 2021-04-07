public class AdminDataProxy implements ICheckData
{
    private Administrator _administrator;
    private ICheckData _iCheckData;

    public AdminDataProxy(Administrator _administrator)
    {
        this._administrator = _administrator;
        this._iCheckData = new AdminData();
    }

    @Override
    public void Check()
    {
        if(_administrator.getLevel() > 3)
        {
            _iCheckData.Check();
        }
        else
        {
            System.out.println("Sorry, u dont have the rights to check this user data!\n");
        }
    }
}
