public class Main {

    public static void main(String[] args) {
    KronometreThread thread1=new KronometreThread("thread1");
    KronometreThread thread2=new KronometreThread("thread2");
    thread1.start();
    thread2.start();
    }
}
