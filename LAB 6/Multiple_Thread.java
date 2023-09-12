package ThreadDemo;
/*Write a Java program to create multiple thread in Java.
 * Apply thread properties too.(priority,name)
 */

class Minimum extends Thread {
    public Minimum(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println("Thread " + getName() + " is running.");
    }
}

class Normal extends Thread {
    public Normal(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println("Thread " + getName() + " is running.");
    }
}

class Maximum extends Thread {
    public Maximum(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    @Override
    public void run() {
        System.out.println("Thread " + getName() + " is running.");
    }
}
public class Multiple_Thread {

	public static void main(String[] args) {
	
		Minimum thread1 = new Minimum("This is a Minimum", Thread.MIN_PRIORITY);
		Normal thread2 = new Normal("This is a Normal", Thread.NORM_PRIORITY);
        Maximum thread3 = new Maximum("This is a Maximum", Thread.MAX_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
	}

}
