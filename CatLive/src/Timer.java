public class Timer {
    private static long thistime = newtime();
    public static long time() {
        long timer = 0;
        boolean realtime = true;
        timer = newtime() - thistime;
        return timer;
    }

    private static long newtime() {
        long a;
        long nstime1 = System.nanoTime();
        a = nstime1 / 1000000000;
        return a;
    }
}
