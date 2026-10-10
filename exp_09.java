class ReservationThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ticket Reservation Status: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Reservation Thread Interrupted");
            }
        }
    }
}

class StatusThread implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Ticket Confirmation Status: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Status Thread Interrupted");
            }
        }
    }
}

public class exp_9 {
    public static void main(String[] args) {
        ReservationThread reservation = new ReservationThread();
        StatusThread status = new StatusThread();
        Thread statusThread = new Thread(status);

        reservation.start();
        statusThread.start();
    }
}




