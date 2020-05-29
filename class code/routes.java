public class routes
{
    private int type;
    private int route_time;
    private int route_cost;
    public routes(int t)
    {
        // initialise instance variables
        this.type = t;
        this.route_time = -1;
        this.route_cost = 0;
    }
    
    public void save_route_time(int time)
    {
        this.route_time = time;
    }
    public void save_route_cost(int cost){
        this.route_cost = cost;
    }
}
