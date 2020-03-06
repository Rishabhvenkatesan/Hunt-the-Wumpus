/* Daniel Lelivelt
   11-4-19
   AP CSA Period 7
   Mr. Thompson
   This program will use the DrawingPanel to draw a picture of Steve from the game Minecraft.
   It uses methods for the setting, head, and body, as well as custom RGB colors. 47 lines of code. */
import java.awt.*;
public class Doodle {
   public static DrawingPanel panel = new DrawingPanel(200, 350);
   public static Graphics g = panel.getGraphics();
   public static final Color SKIN_COLOR = new Color(255, 175, 125);
   public static final Color INDIGO = new Color(75, 0, 255);
   public static void main(String[] args) {
      drawSetting();
      drawBody();
      drawHead();
   }
   //draws the sky and ground
   public static void drawSetting() {
      panel.setBackground(new Color(100, 255, 255)); //sky blue background
      g.setColor(Color.GREEN);
      g.fillRect(0, 300, 200, 50); //ground
   }
   //draws Steve's head
   public static void drawHead() {
      g.setColor(SKIN_COLOR);
      g.fillRect(60, 20, 80, 80); //head
      g.fillRect(90, 100, 20, 10); //neck
      g.setColor(INDIGO);
      g.fillRect(80, 60, 10, 10); //eyes
      g.fillRect(110, 60, 10, 10); //eyes
      g.setColor(Color.WHITE);
      g.fillRect(70, 60, 10, 10); //eyes
      g.fillRect(120, 60, 10, 10); //eyes
      g.setColor(new Color(200, 100, 50)); //mouth color
      g.fillRect(90, 70, 20, 10); //mouth
      g.fillRect(80, 80, 40, 10); //mouth
      g.setColor(new Color(40, 20, 0)); //brown
      g.fillRect(60, 20, 80, 20); //hair
      g.fillRect(60, 40, 10, 10); //hair
      g.fillRect(130, 40, 10, 10); //hair
   }
   //draws Steve's body
   public static void drawBody() {
      g.setColor(new Color(0, 150, 150)); //teal
      g.fillRect(20, 100, 160, 40); //shirt
      g.fillRect(60, 100, 80, 100); //shirt
      g.setColor(SKIN_COLOR);
      g.fillRect(20, 140, 40, 80); //arms
      g.fillRect(140, 140, 40, 80); //arms
      g.setColor(INDIGO);
      g.fillRect(60, 200, 80, 120); //pants
      g.setColor(Color.GRAY);
      g.fillRect(60, 320, 80, 20); //feet
   }
}