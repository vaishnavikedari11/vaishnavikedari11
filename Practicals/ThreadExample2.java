//creating thread by implmenting runnable interface
public class ThreadExample2 implements Runnable {                 //runnable  is interface
                                                            //when we are using interface we can also use class or extend it.
                                                            
    public static void main(String[] args) {
        ThreadExample2 t=new ThreadExample2();       //object/instance creating of ThreadExample2 class
        Thread thread=new Thread(t);                // creating instance of Thread class-in built class
        thread.start();                             //instance of thread class is used to call start()method
        System.out.println("this code is running outside the thread");
    }
    public void run(){
        System.out.println("This code is running inside thread");
    }
}
