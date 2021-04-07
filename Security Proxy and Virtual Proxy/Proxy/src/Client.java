public class Client
{
    public static void main(String[] args)
    {
        ICheckData admin1 = new AdminDataProxy(new Administrator(2, "Victor"));
        admin1.Check();
        ICheckData admin2 = new AdminDataProxy(new Administrator(5, "Eric"));
        admin2.Check();
    }
}
