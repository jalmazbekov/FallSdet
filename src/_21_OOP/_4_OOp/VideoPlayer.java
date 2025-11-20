package _21_OOP._4_OOp;

public class VideoPlayer {

    private int duration;
    private int currentPosition;
    private boolean isPlay;
    private int volume;

    public VideoPlayer(int duration, int volume) {
        if(duration > 0 && duration <= 3){
            this.duration = duration;
        } else {
            System.out.println("Ошибка!");
        }
        this.volume = volume;
    }

    public boolean Play(){
        isPlay = true;
        return isPlay;
    }

    public String pause(int seconds) {
        if (isPlay && seconds > 0 && seconds < 180) {
            System.out.println("Pause on seconds " + seconds);
            isPlay = false;
            this.currentPosition = seconds;
            return "Вы остановились на тeкущей позиции: " + currentPosition;
        } else {
            return "Допустимо ставить на паузу с 1 - 180!";
        }

    }

    public void stop(){
        if(isPlay){
            System.out.println("Stop");
            isPlay = false;
        }
    }

    public void seek(int seconds){
        if (seconds < (180 - currentPosition)){
            currentPosition +=  seconds;
            System.out.println("Перемотано на " + seconds);
        } else {
            System.out.println("Перемотка недоступна!");
        }
    }

    public int getDuration() {
        return duration;
    }

    public int getCurrentPosition() {
        return currentPosition;
    }

    public boolean isPlay() {
        return isPlay;
    }

    public int getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "VideoPlayer{" +
                "duration=" + duration +
                ", currentPosition=" + currentPosition +
                ", isPlay=" + isPlay +
                ", volume=" + volume +
                '}';
    }
}