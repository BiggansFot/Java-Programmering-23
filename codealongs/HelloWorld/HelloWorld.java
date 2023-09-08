import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorld {
    public static void main(String[] args) {
        String message = "hejhej hallå!";

        JFrame frame = new JFrame(title:"buuu");
        frame.setSize(350, height:250);

        JLabel label = new JLabel(message, JLabel.CENTER);
        frame.add(label);

        frame.setVisible(true);
    }
}