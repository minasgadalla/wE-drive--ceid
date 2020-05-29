public class timer{
    // instance variables - replace the example below with your own
    private boolean active;
    private int active_time;
    private int time;
    public timer()
    {
        // initialise instance variables
        System.out.println("Timer created");
        this.active =false;
        this.active_time  = 0;
        this.time = 0;
    }
    
    public void stop_timer(boolean time_passed){
        if(this.active && time_passed == true){
            this.active = false;
        }else{
        System.out.println("You cannot stop the timer because the timer has not been started yet");
        }
    
    }
    
    public void updateTimer(int time){
        this.active_time += time;
    }
    
    public void increaseTime(){
        this.time++;
    }
    
    public void start_timer(){
        this.active = true;
        this.increaseTime();
    }
    
    public void start_pause_timer(){
    
    }
