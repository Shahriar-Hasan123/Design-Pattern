public class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType)
    {
        if(audioType.equalsIgnoreCase("vlc"))
            advancedMediaPlayer = new VlcPlayer();
        else
            advancedMediaPlayer = new Mp4Player();
    }
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc"))
            advancedMediaPlayer.playVlc(fileName);
        else
            advancedMediaPlayer.playMp4(fileName);
    }
}
