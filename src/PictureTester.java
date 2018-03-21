/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test keepOnlyblue */
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  
  /** Method to test negate */
  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  
  /** Method to test grayscale */
  public static void testGrayscale()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  
  /** Method to test grayscale */
  public static void testFixUnderwater()
  {
    Picture water = new Picture("water.jpg");
    water.explore();
    water.fixUnderwater();
    water.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorVerticalrightToLeft */
  public static void testMirrorVerticalRightToLeft()
  {
    Picture butterfly = new Picture("butterfly1.jpg");
    butterfly.explore();
    butterfly.mirrorVerticalRightToLeft();
    butterfly.explore();
  }
  
  /** Method to test mirrorHorizontal*/
  public static void testMirrorHorizontal()
  {
    Picture butterfly = new Picture("butterfly1.jpg");
    butterfly.explore();
    butterfly.mirrorHorizontal();
    butterfly.explore();
  }
  
  /** Method to test mirrorHorizontalBotToTop*/
  public static void testMirrorHorizontalBotToTop()
  {
    Picture butterfly = new Picture("butterfly1.jpg");
    butterfly.explore();
    butterfly.mirrorHorizontalBotToTop();
    butterfly.explore();
  }
  
  /** Method to test mirrorDiagonal*/
  public static void testMirrorDiagonal()
  {
    Picture butterfly = new Picture("beach.jpg");
    butterfly.explore();
    butterfly.mirrorDiagonal();
    butterfly.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test mirrorArms */
  public static void testMirrorArms()
  {
    Picture temple = new Picture("snowman.jpg");
    int[] tl1 = {154, 104}, br1 = {192, 168}, tl2 = {166, 238}, br2 = {198, 292};
    temple.explore();
    temple.mirrorPartial(tl1, br1, 200);
    temple.mirrorPartial(tl2, br2, 200);
    temple.explore();
  }
  
  /** Method to test mirrorGull*/
  public static void testMirrorGull()
  {
    Picture temple = new Picture("seagull.jpg");
    int[] tl1 = {234, 232}, br1 = {329, 351};
    temple.explore();
    temple.mirrorPartial(tl1, br1, -200); // Literally just added 3 lines of code to mirrorArms. I'm just going to reuse the same code as before.
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	  //testZeroBlue();
	  //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
	  //testNegate();
	  //testGrayscale();
	  //testFixUnderwater();
	  //testMirrorVertical();
	  //testMirrorVerticalRightToLeft();
	  //testMirrorHorizontal();
	  //testMirrorHorizontalBotToTop();
	  //testMirrorDiagonal();
	testMirrorTemple();
	testMirrorArms();
    testMirrorGull();
	  //testCollage();
    //testCopy();
	  //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}