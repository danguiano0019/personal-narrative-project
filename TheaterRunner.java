import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

/*
 * list of the otter species
 *
 * list of the populations, heights, and life expectancy
 * of certain species 
 */
String[][] otter = {
{"Sea Otter", "North American River Otter"},
{"Asian Small-Clawed Otter", "Eurasian Otter"},
{"Spotted Neck Otter", "Neotropical Otter"}
};

int [][] info = {
  // populations
    {126000, 100000},
  // heights
    {20, 47},
  // years
    {8, 16}
};

  MyStory scene = new MyStory(otter, info);
    
    // Call drawScene
    scene.drawScene();
    
    // Play scene in Theater
    Theater.playScenes(scene);

    
    
  }
}