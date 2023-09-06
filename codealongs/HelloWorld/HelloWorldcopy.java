import javax.swing.*;

public class HelloWorldcopy {
    public static void main(String[] args) {
        String message = "hejhej hallå!";

        JFrame frame = new JFrame("buuu");
        frame.setSize(350, 250);

        JLabel label = new JLabel(message, JLabel.CENTER);
        frame.add(label);

        frame.setVisible(true);
    }
}