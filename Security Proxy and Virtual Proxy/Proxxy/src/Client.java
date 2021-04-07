public class Client
{
    public static void main(String[] args)
    {
        IDataReturn dataReturn = new DataReturnProxy("krab");
        dataReturn.displayData();
        System.out.println("");
        dataReturn.displayData();
        System.out.println("");
        dataReturn.displayData();
    }
}
