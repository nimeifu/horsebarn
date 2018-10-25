public class Unicorn implement Horse
{
    private int weight;
    private String name;


    public void Unicorn(String name, int weight)
    {
        this.weight=weight;
        this.name=name;
    }
    public int getweight()
    {
        return(this.weight);
    }
    public String getname()
    {
        return(this.name);
    }
}
