package general;

class SampleThreadProgram implements Runnable{

    private Thread t;
    private String threadName;

    SampleThreadProgram (String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        while (true)
            System.out.print(threadName);
    }

    public void start() {
        if( t== null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class ThreadProgram {
    public static void main(String[] args) {
        SampleThreadProgram A = new SampleThreadProgram("A");
        SampleThreadProgram B = new SampleThreadProgram("B");
        B.start();
        A.start();
    }
}
