import java.applet.*;
import java.awt.*;
public class GeomFig extends Applet {
public void paint(Graphics g) {
g.setColor(Color.GREEN);
g.drawLine(20, 20, 100, 20);
g.drawRect(20, 50, 120, 90);
g.setColor(Color.BLUE);
g.fillRoundRect(130, 50, 120, 70, 15, 15);
g.setColor(Color.RED);
g.drawOval(20, 160, 160, 100);
g.fillOval(180, 160, 160,100); } }
