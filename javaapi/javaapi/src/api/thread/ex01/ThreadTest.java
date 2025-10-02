package api.thread.ex01;

public class ThreadTest implements Runnable /* extends Thread */ {

    private int num = 0;

    // 스레드가 run메서드를 동작 시킴
    @Override
    public synchronized void run() {
        // 스레드 관련 기능을 사용할 때는 Thread.static 메서드를 사용
        for (int i = 1; i <= 10; i++) {
            if(Thread.currentThread().getName().equals("A")) { // 현재 동작하는 스레드 이름이 A일때
                num++;
            }
            System.out.println(Thread.currentThread().getName() + ":" + num);

            try {
                Thread.sleep(1000); // 1초간 정지
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
