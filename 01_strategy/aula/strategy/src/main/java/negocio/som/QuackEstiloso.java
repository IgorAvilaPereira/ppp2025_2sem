package negocio.som;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class QuackEstiloso implements ComportamentoSom {

    private void playSound(String filePath){
        try {
            File audioFile = new File(filePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.println("Playing audio...");            
            // Keep the program running until the audio finishes
            Thread.sleep(clip.getMicrosecondLength() / 1000);
            clip.close();
            audioStream.close();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException e) {
            e.printStackTrace();
        }    
    }

    @Override
    public void emitirSom() {
        System.out.println("som estiloso!");
        playSound("./src/main/resources/quack.wav");
    }
}
