import java.util.Random;
import java.util.Scanner;

public class driver extends world{

 

public static void main(String [] args) {

 int sleep = 0;
 int patt = 0;
 int rows = 0;
 int cols = 0;
 int genMax = 0;

    Scanner in = new Scanner(System.in);

    int userChoice;

 world world = new world(rows, cols); 

 world.setGameBoard();

    Scanner input = new Scanner(System.in);
    walkThrough printText = new walkThrough();

printText.spaceR();

    printText.howRows();
    rows = input.nextInt();

      printText.howCols();
      cols = input.nextInt();

        printText.numofGens();
        genMax = input.nextInt();

    printText.selectPattern();
    patt = input.nextInt();

printText.sleepMsg();
sleep = input.nextInt();



if (patt != 7)
{
  if (patt == 1) {
   world.putGlider(2,2);
 
  }
 else if (patt == 2)
 {
  world.putExploder(3,2);
  }
  else if (patt == 3)
  {
  world.putBlinker(3,3);
  }
  else if (patt == 6)
  {
    System.exit(0);
   printText.gameOver(); 
   return;
  }
}

  world.printGameBoard();

 

  for(int i = 0; i <= genMax;i++){

 


	System.out.println( "Generation "+ i);

//printing the primary gameboard

    world.printGameBoard(); 

//printing the future generations

    world.nextGen(); 

//sleep/refresh rule
    //Question: what if we used Timer class for this? It'd be easier... -C

  try

   {

     Thread.sleep(sleep);

   }

       catch(Exception ex)

   {

      System.out.println("Exception:"+ex.getStackTrace());

  }



 

  }

      printText.gameOver();

  }
}
