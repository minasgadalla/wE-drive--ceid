public class Volunteer extends User
{
    public int user_id;
    public int location;  
    
    public void load_screen()
    {
        System.out.println("Loading GPS route");
        System.out.println("Please confirm route:");
        // We will think anout adding it instead of two System.outs
       /*
       @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        }
        */
   
    }
    
    
    public void loc_con(int user_id,int location)
    {
        user_id = this.user_id;
        location = this.location;
    }
    
    public int update_loc(location)
    {
        public int new_location = location;
        return new_location;
    }
}

//Dont delete anything!
