import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Random;
public class Window extends JFrame implements ActionListener {
    private final short MaxW = 1000;
    private final short MaxH = 500;
    JButton buttt;

    public Window() {
        ImageIcon ii = new ImageIcon("src/hello.jpeg");
        JLabel label = new JLabel();
        label.setIcon(ii);
        label.setText("Hello I am Kriper caught me if you can!");
        buttt = new JButton();
        buttt.setBounds(100, 130, 100, 65);
        buttt.setText("CLOSE");
        buttt.addActionListener(this);
        this.add(buttt);
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
  public void actionPerformed(ActionEvent ee){
     if(ee.getSource() == buttt){
         this.setVisible(false);
         Window2 w2 = new Window2();
         w2.setVisible(true);
     }
  }
}



