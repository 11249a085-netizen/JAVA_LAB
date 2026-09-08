class SingleThread {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread is running: " + i);
            }
        });
        t.start();
    }
}