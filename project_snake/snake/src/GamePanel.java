import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        //g可理解为画笔工具
        super.paintComponent(g);//清屏
        this.setBackground(Color.BLACK);
        //在GamePanel上显示header
        Data.header.paintIcon(this, g, 15, 11);
        //填充矩形空间
        g.fillRect(15, 75, 850, 600);
    }
    
}