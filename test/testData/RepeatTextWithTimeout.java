package testData;

public class RepeatTextWithTimeout {
  public static void main(String[] args) throws InterruptedException {
    if (args.length != 3) {
      System.err.println("Usage: COUNT TIMEOUT_MILLIS TEXT");
      System.exit(1);
    }
    int count = Integer.parseInt(args[0]);
    int timeoutMillis = Integer.parseInt(args[1]);
    String text = args[2];
    for (int i = 1; i <= count; i++) {
      System.out.println("#" + i + ": " + text);
      Thread.sleep(timeoutMillis);
    }
  }
}
