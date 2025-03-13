import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {
private String[][] otter;
  private int[][] info;
  
  public MyStory(String[][] otter, int[][] info) {
    this.otter = otter;
    this.info = info;
  }

  public void drawScene(){
    drawFirstScene();
  }
  
  public void drawFirstScene() {
  clear("pink");
    
  setTextHeight(30);
  setTextColor("white");
  setTextStyle(Font.SANS , FontStyle.NORMAL);

drawText("Traits & Behaviors", 80, 30);


    /*
     * puts a red filter onto the images
     * sets the text color, size, and placement
     */
ImageFilter seaOtter = new ImageFilter("seaOtter.jpg");
    drawImage(seaOtter, 20, 60, 170);
    seaOtter.keepColor("red"); 
    pause(0.5);
    drawImage(seaOtter, 20, 60, 170);

    ImageFilter naRiverOtter = new ImageFilter("naRiverOtter.jpg");
    drawImage(naRiverOtter, 210, 245, 170);
    naRiverOtter.keepColor("red"); 
    pause(0.5);
    drawImage(naRiverOtter, 210, 245, 170);

    setTextHeight(15);
    setTextColor("white");
    setTextStyle(Font.SANS , FontStyle.NORMAL);
    drawText("Sea Otter", 255, 121);
    drawText("North American River Otter", 15, 322);


  }
  



}
