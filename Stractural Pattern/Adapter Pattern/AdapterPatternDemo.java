public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Loving you is a loosing game");
        audioPlayer.play("mp4", "Amar shonar Bangla");
        audioPlayer.play("vlc", "Ki name deke bolbo tomake");
        audioPlayer.play("avc", "Hello world");
    }
}
