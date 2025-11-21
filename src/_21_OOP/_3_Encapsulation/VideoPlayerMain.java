package _21_OOP._3_Encapsulation;

public class VideoPlayerMain {
    static void main() {

        VideoPlayer videoPlayer = new VideoPlayer(180, 10);
        System.out.println(videoPlayer);
        System.out.println(videoPlayer.Play());
        System.out.println(videoPlayer.pause(10));
        videoPlayer.stop();
        videoPlayer.seek(200);
        System.out.println(videoPlayer);


    }
}
