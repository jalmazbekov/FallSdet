package _21_OOP._3_Encapsulation;

public class VideoPlayer {

    private int duration;
    private int currentPosition;
    private boolean isPlay;
    private int volume;

    public VideoPlayer(int duration, int volume) {
        if(duration > 0 && duration <= duration){
            this.duration = duration;
        } else {
            System.out.println("Ошибка! Длительность должна быть от 1- 180 секунд!");
            this.duration = 180;
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

    public void seek(int seconds) {
        if (!isPlay) { // перематывать можно только на паузе
            if (seconds > 0 && currentPosition + seconds <= duration) {
                currentPosition += seconds;
                System.out.println("Перемотано на " + seconds + " секунд. Новая позиция: " + currentPosition);
            } else {
                System.out.println("Перемотка недоступна! Максимум можно перемотать до " + duration);
            }
        } else {
            System.out.println("Нельзя перематывать во время воспроизведения! Сначала поставьте на паузу.");
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
