package negocio;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class QuackEstiloso implements ComportamentoSom {

    @Override
    public void emitirSom() {
        // Carrega o arquivo de áudio (não funciona com .mp3, só .wav)
        URL oUrl;
        try {
            oUrl = new URL("https://www.youtube.com/watch?v=Fw3RB7xnb80");
            Clip oClip = AudioSystem.getClip();
            AudioInputStream oStream = AudioSystem.getAudioInputStream(oUrl);
            oClip.open(oStream);

            oClip.loop(0); // Toca uma vez
            // clip.loop(Clip.LOOP_CONTINUOUSLY); // Toca continuamente (para o caso de
            // músicas)

            // Para a execução (senão o programa termina antes de você ouvir o som)
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    JOptionPane.showMessageDialog(null, "Clique pra fechar!");
                }
            });
        } catch (IOException | LineUnavailableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (UnsupportedAudioFileException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
