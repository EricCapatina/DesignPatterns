public class Administrator
{
    private int level;
    private String name;

    public Administrator(int level, String name)
    {
        this.level = level;
        this.name = name;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
