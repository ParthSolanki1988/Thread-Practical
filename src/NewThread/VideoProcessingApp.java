package NewThread;

public class VideoProcessingApp {

  public static void main(String[] args) {
    // Assume we have a list of video frames
    String[] frames = {"frame1.jpg", "frame2.jpg", "frame3.jpg", "frame4.jpg", "frame5.jpg"};

    // Create an array to hold the threads
    Thread[] threads = new Thread[frames.length];

    // Start a thread for each frame
    for (int i = 0; i < frames.length; i++) {
      threads[i] = new Thread(new FrameProcessingTask(frames[i]));
      threads[i].start();
    }

  }
}
