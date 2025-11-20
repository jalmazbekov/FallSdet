package _21_OOP._4_OOp;

public class VideoPlayerMain {
    public static void main(String[] args) {
        VideoPlayer videoPlayer = new VideoPlayer(180, 10);
        System.out.println(videoPlayer);
        System.out.println(videoPlayer.Play());
        System.out.println(videoPlayer.pause(10));
        videoPlayer.stop();
        videoPlayer.seek(170);
        videoPlayer.seek(20);
        System.out.println(videoPlayer);
    }
}