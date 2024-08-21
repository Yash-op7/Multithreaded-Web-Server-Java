public class Client {
    public Runnable getRunnable() {
        // Runnable is a functional interface
        return new Runnable() {
            @Override
            public void run() {
                int port = 8010;
            }
        }
    }

    // unlike the SingleThreaded Server this will spawn 100 clients for now few milliseconds apart
    public static void main(String[] args) {
        Client client = new Client();
        for(int i=0;i<100;i++) {
            try{
                Thread thread = new Thread(client.getRunnable());
                thread.start();
            } catch(Exception e) {
                return;
            }
        }
    }
}