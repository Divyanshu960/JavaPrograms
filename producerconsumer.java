class Producer implements Runnable
{
ArrayList a1;
producer(ArrayList a)
{
a1 = a;
}
public void run()
  {
  
  }  
}

class Consumer implements Runnable
{  
ArrayList a1;
consumer(ArrayList a)
{
a1 = a;
}
  
public void run()
  {
    
  }
}


public class thr1{
 public static void main(String a[])
 {
  ArrayList a1 = new ArrayList();
  
  producer p1 = new producer(a1);
  consumer c1 = new consumer(a1);
  
  Thread t1 = new Thread(p1);
  Thread t2 = new Thread(p1);
  
 }
} 
