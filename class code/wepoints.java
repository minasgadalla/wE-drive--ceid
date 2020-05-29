
public class wepoints
{
    private int wepoints;
    
    public wepoints()
    {
        this.wepoints = 0;
    }
    
    public int get_wepoints(int y)
    {
        // put your code here
        return this.wepoints;
    }
    
    public void sub_wepoints(int sub){
        this.wepoints = this.wepoints - sub;    
    }
    
    public void zero_wepoints(){
        this.wepoints = 0;
    
    }
    
    
}
