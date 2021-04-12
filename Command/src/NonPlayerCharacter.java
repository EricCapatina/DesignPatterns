public class NonPlayerCharacter
{
    private String _name;
    private int _level;
    private int _id;
    public NonPlayerCharacter(String name, int level, int id)
    {
        _name = name;
        _level = level;
        _id = id;
    }

    public void spawn()
    {
        System.out.println("You have spawned " + _name + " Level: " + _level + "\t ID: " + _id);
    }

    public void delete()
    {
        System.out.println("You have deleted monster: " + _name + " Level: " + _level + " level\t ID: " + _id);
    }
}
