import java.util.Timer;
import java.util.TimerTask;


public class myTimer {
    
    Timer timer;
    int car_battery = 100;

    public myTimer(int sec) {
        timer = new Timer();
        timer.schedule(new RemindTask(), 0, sec*1000);     
	}

    class RemindTask extends TimerTask {
        public void run() {
            System.out.println("End time");
            timer.cancel(); //Terminate the timer thread
        }
    }

    public static void main(String args[]) {
        new myTimer(sec*1000);
        while(timer = 1000){
            car_battery = car_battery - 0.1;
            }
            if (car_battery < 20){
                System.out.println("Your battery is below 20%");
                System.out.println("You will need to charge this car or you won't get any wE-points");
    
            }
        System.out.println("Battery reduced.");
    }
}
