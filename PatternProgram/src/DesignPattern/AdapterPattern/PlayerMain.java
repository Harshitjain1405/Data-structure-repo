package DesignPattern.AdapterPattern;

public class PlayerMain {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("vlc", "abc.vlc");
        audioPlayer.play("mp4", "def.mp4");
        audioPlayer.play("mp3", "xyz.mp3");
        audioPlayer.play("avi", "mno.avi");
    }
}
