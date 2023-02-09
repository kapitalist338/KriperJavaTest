import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
public class Window2 extends JFrame implements ActionListener {
    private final short MaxW = 100;
    private final short MaxH = 500;
    JButton butt;

    public Window2() {
        ImageIcon ii = new ImageIcon("src/hello.jpeg");
        JLabel label = new JLabel();
        label.setIcon(ii);
        label.setText("HAHAHAHA again:Hello I am Kriper caught me if you can!");
        butt = new JButton();
        butt.setBounds(100, 130, 100,65);
        butt.setText("CLOSE");
        butt.addActionListener(this);
        this.add(butt);
        Random random = new Random();
        int randomWidth = random.nextInt(MaxW);
        int randomHeight = random.nextInt(MaxH);
        this.setBounds(randomWidth, randomHeight, 600, 300);
        this.add(label);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);

    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == butt){
            this.setVisible(false);
            Window w = new Window();
            w.setVisible(true);
        }
    }
}
