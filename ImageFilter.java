import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {

  public ImageFilter(String fileName) {
    super(fileName);
  }

  // Add filter methods here
  public void keepColor(String color){
  // 0. Get the 2D array of pixels
Pixel[][] pixels = getImagePixels();
  // 1. Traverse the 2D array of pixels
  for(int row = 0; row < pixels.length; row++){
      for(int col = 0; col < pixels[0].length; col++){
         // 2. Select the current pixel
        Pixel currentPixel = pixels[row][col];
          // 3. Change the red value to 0
        if(color.equals("red")){
          // remove blue and green
          currentPixel.setBlue(0);
          currentPixel.setGreen(0);
        }
        else if (color.equals("blue")){
          currentPixel.setRed(0);
          currentPixel.setGreen(0);
        }
        else if (color.equals("green")){
          currentPixel.setBlue(0);
          currentPixel.setRed(0);
        }
    }
  }
  
}
}