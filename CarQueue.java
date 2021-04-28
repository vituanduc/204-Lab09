
import java.util.PriorityQueue;
import java.util.Random;


public class CarQueue {

  
   Random ran = new Random();
   PriorityQueue<Integer> Q = new PriorityQueue<Integer>();
   private int out;
  
   public CarQueue(){
  
       Q.add(ran.nextInt(4));
       Q.add(ran.nextInt(4));
       Q.add(ran.nextInt(4));
       Q.add(ran.nextInt(4));
       Q.add(ran.nextInt(4));
       Q.add(ran.nextInt(4));
       Q.add(ran.nextInt(4));
       Q.add(ran.nextInt(4));
       Q.add(ran.nextInt(4));
       Q.add(ran.nextInt(4));
       Q.add(ran.nextInt(4));
       Q.add(ran.nextInt(4));
       Q.add(ran.nextInt(4));
      
      
  
   }
  
   public void addToQueue() {
  
       class ARunnable implements Runnable
          {
          
             public void run()
             {
              
                try
                {
                   Q.add(ran.nextInt(4));
                   Q.add(ran.nextInt(4));
                   Q.add(ran.nextInt(4));
                   Q.add(ran.nextInt(4));
                   Q.add(ran.nextInt(4));
                   Q.add(ran.nextInt(4));
                   Q.add(ran.nextInt(4));
                  
                  
                }
                finally
                {
                  
                }
             }
          }
       Runnable r = new ARunnable();
       Thread t = new Thread(r);
       
          t.start();  
   }

   public int deleteQueue() {
      
       class ARunnable implements Runnable
          {
          
          
             public void run()
             {

               try {
                       Thread.sleep(2000);
                   } catch (InterruptedException e) {
                      
                   }
                  
              
                try
                {
                   if(Q.size() < 20){
                       Q.add(ran.nextInt(4));
                       Q.add(ran.nextInt(4));
                       Q.add(ran.nextInt(4));
                       Q.add(ran.nextInt(4));
                       Q.add(ran.nextInt(4));
                       Q.add(ran.nextInt(4));
                       Q.add(ran.nextInt(4));
                       Q.add(ran.nextInt(4));
                       Q.add(ran.nextInt(4));
                       Q.add(ran.nextInt(4));
                       Q.add(ran.nextInt(4));
                       Q.add(ran.nextInt(4));
                       Q.add(ran.nextInt(4));
                       Q.add(ran.nextInt(4));
                  
                   }
                  
                   else if (!Q.isEmpty()){
                   out = Q.remove();
                   }
                  
                  
                }
                finally
                {
                  
                }
             }
           
          }
       Runnable r = new ARunnable();
       Thread t = new Thread(r);
       
          t.start();
        
  
          return out;
      
   }

}

