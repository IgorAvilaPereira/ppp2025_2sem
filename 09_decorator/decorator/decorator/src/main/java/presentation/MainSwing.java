package presentation;

import javax.swing.*;

import model.Espresso;
import model.Order;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainSwing {
  public static Order order = new Order();
  
  public static void main(String[] args) {
    JFrame frame = new JFrame("Starbucks");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(654, 352);
    JPanel panel = new JPanel();
    panel.setLayout(null);
    panel.setBackground(Color.decode("#eeeeee"));
    JButton btn_espresso = new JButton("Espresso");
    btn_espresso.setBounds(19, 30, 106, 29);
    btn_espresso.setBackground(Color.decode("#ffffff"));
    btn_espresso.setForeground(Color.decode("#1b1b1b"));
    btn_espresso.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
    btn_espresso.setBorder(new RoundedBorder(4, Color.decode("#626262"), 1));
    btn_espresso.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_espresso, Color.decode("#c2c2c2"), Color.decode("#ffffff"));
    btn_espresso.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame, "Espresso!!");
        MainSwing.order.setBeverage(new Espresso());
      }
    });
    panel.add(btn_espresso);

    JButton btn_order = new JButton("Close Order");
    btn_order.setBounds(23, 83, 106, 29);
    btn_order.setBackground(Color.decode("#ffffff"));
    btn_order.setForeground(Color.decode("#1b1b1b"));
    btn_order.setFont(CustomFontLoader.loadFont("./resources/fonts/Lexend.ttf", 14));
    btn_order.setBorder(new RoundedBorder(4, Color.decode("#626262"), 1));
    btn_order.setFocusPainted(false);
    OnClickEventHelper.setOnClickColor(btn_order, Color.decode("#c2c2c2"), Color.decode("#ffffff"));
    panel.add(btn_order);
    btn_order.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(frame, "close order!!" + MainSwing.order.getCost());
      }
    });
    frame.add(panel);
    frame.setVisible(true);
  }

  @Override
  public String toString() {
    return "WindowBuilder []";
  }
}