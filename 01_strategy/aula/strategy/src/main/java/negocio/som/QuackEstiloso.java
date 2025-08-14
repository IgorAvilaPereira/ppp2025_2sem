package negocio.som;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

public class QuackEstiloso implements ComportamentoSom {

    @Override
    public void emitirSom() {
        System.out.println("som estiloso!");
        // // Play Audio File
        // try {
        // String audioFileDirectory =
        // "/home/iapereira/git/ppp2025_2sem/01_strategy/aula/strategy/src/main/resources/quack.mp3";
        // InputStream is = getClass().getResourceAsStream(audioFileDirectory);
        // BufferedInputStream bis = new BufferedInputStream(is);
        // AudioInputStream ais = AudioSystem.getAudioInputStream(bis);
        // Clip audio = AudioSystem.getClip();
        // audio.open(ais);
        // FloatControl volume =
        // (FloatControl)audio.getControl(FloatControl.Type.MASTER_GAIN);
        // volume.setValue(1.0f); // Reduce volume by 10 decibels.

        // audio.loop(Clip.LOOP_CONTINUOUSLY);
        // audio.start();
        // // Thread.sleep(audio.getMicrosecondLength() / 10000);
        // audio.close();
        // } catch (IOException | UnsupportedAudioFileException |
        // LineUnavailableException e) {
        // System.out.println(e.getMessage());

        // }
    }
    // // Play Audio File
    // try {
    // String audioFileDirectory =
    // "/home/iapereira/git/ppp2025_2sem/01_strategy/aula/strategy/src/main/resources/quack.mp3";
    // InputStream is = getClass().getResourceAsStream(audioFileDirectory);
    // BufferedInputStream bis = new BufferedInputStream(is);
    // AudioInputStream ais = AudioSystem.getAudioInputStream(bis);
    // Clip audio = AudioSystem.getClip();
    // audio.open(ais);
    // FloatControl volume =
    // (FloatControl)audio.getControl(FloatControl.Type.MASTER_GAIN);
    // volume.setValue(1.0f); // Reduce volume by 10 decibels.

    // audio.loop(Clip.LOOP_CONTINUOUSLY);
    // audio.start();
    // // Thread.sleep(audio.getMicrosecondLength() / 10000);
    // audio.close();
    // } catch (IOException | UnsupportedAudioFileException |
    // LineUnavailableException e) {
    // System.out.println(e.getMessage());

    // }
}
