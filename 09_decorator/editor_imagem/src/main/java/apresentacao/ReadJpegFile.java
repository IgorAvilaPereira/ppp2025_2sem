package apresentacao;

import java.awt.Color;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorConvertOp;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class ReadJpegFile {

    public static BufferedImage convertToGrayscale(BufferedImage originalImage) {
        BufferedImage grayImage = new BufferedImage(originalImage.getWidth(), originalImage.getHeight(),
                BufferedImage.TYPE_INT_ARGB);

        for (int y = 0; y < originalImage.getHeight(); y++) {
            for (int x = 0; x < originalImage.getWidth(); x++) {
                int rgb = originalImage.getRGB(x, y);
                Color color = new Color(rgb);

                int red = color.getRed();
                int green = color.getGreen();
                int blue = color.getBlue();

                int average = (red + green + blue) / 3;

                // Create a new color with the same alpha but grayscale RGB values
                Color grayColor = new Color(average, average, average, color.getAlpha());
                grayImage.setRGB(x, y, grayColor.getRGB());
            }
        }
        return grayImage;
    }

    public static void main(String[] args) {
        // Specify the path to your JPEG file
        // String filePath = "/home/iapereira/git/ppp2025_2sem/09_decorator/editor_imagem/src/main/resources/igor.jpg"; // Replace
                                                                                            // with
                                                    // the
                                                                                                                     // actual
                                                                                                                     // path
        String filePath = JOptionPane.showInputDialog("Path");
        try {
            // Create a File object representing the image file
            File file = new File(filePath);

            // Read the image using ImageIO.read()
            BufferedImage image = ImageIO.read(file);

            // Check if the image was successfully loaded
            if (image != null) {

                System.out.println(
                        "Image loaded successfully. Dimensions: " + image.getWidth() + "x" + image.getHeight());

                ColorConvertOp op = new ColorConvertOp(ColorSpace.getInstance(ColorSpace.CS_GRAY), null);
                BufferedImage dest = op.filter(image, null);

                ImageIO.write(dest, "PNG", new File("/home/iapereira/git/ppp2025_2sem/09_decorator/editor_imagem/src/main/resources/teste.png"));
                JOptionPane.showMessageDialog(null, "Image converted to grayscale successfully!");
                Runtime.getRuntime().exec("google-chrome /home/iapereira/git/ppp2025_2sem/09_decorator/editor_imagem/src/main/resources/teste.png");
                // You can now work with the 'image' object (e.g., display it, process it)
            } else {
                System.out.println("Could not load the image. Ensure the file exists and is a valid JPEG.");
            }

        } catch (IOException e) {
            System.err.println("Error reading the image file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}