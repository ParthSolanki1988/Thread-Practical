package NewThread;

public class FrameProcessingTask extends Thread {
  private String frame;

  public FrameProcessingTask(String frame) {
    this.frame = frame;
  }

  @Override
  public void run() {
    processFrame();
  }

  private void processFrame() {
    System.out.println("Processing frame: " + frame);
    // Perform frame processing tasks (e.g., applying filters, resizing, etc.)
    try {
      Thread.sleep(2000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Frame processed: " + frame);
  }
}
