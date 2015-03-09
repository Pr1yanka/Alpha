
package fungrid;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class FunGrid {
    Timer time=new Timer();
     int score;
    public FunGrid(){
        //new ButtonGrid(10,10);
        user u=new user(10,10);
        JOptionPane.showMessageDialog(null,"red");
        Thread t=new Thread(u);
        t.start();
        time.schedule(new TimerTask() {
        @Override
        public void run() {
            u.kill();
            gameOver g=new gameOver(u.getScore());
        }
        }, 10*1000);
          
    }

    public static void main(String[] args) {
        FunGrid f=new FunGrid();
    }
    
}
