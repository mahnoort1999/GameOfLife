public class world extends Patterns{

//Members

private char[][] gameBoard = new char[10][20];
private int numofRows;
private int numofCols;


	public world (){

  

   this.numofRows = 0;

  	this.numofCols = 0;  

	}

	public world(int r, int c)

 { 

  this.numofRows = r;

    	this.numofCols = c;  

 }

 

 

// 

 public int getRows() {

  return numofRows;

 }

 //using getters here for the retrieval of variables

 public int getColumns() {

  return numofCols;

 }

//setting the primary gameboard 

public void setGameBoard()

{

  	for ( int i = 0; i < gameBoard.length; i++)

   {

    for(int j = 0; j < gameBoard[i].length; j++)

  {

   gameBoard[i][j] = ' ';

  

 	}

  

   }

}

//primary glider pattern

public void putGlider(int r,int c)

 {

   //char[][] glider = new char [10][10];

  char pattern[][] = getGlider();

 	for ( int i = 0; i <pattern.length ; i++)

  {

  for(int j = 0; j < pattern[i].length; j++)

  {

   gameBoard[i+r][j+c] = pattern[i][j];

  }

  

  }

  

 }

 //primary exploder pattern

public void putExploder(int r,int c)

 {

   //char[][] glider = new char [10][10];

  char pattern[][] = getExploder();

  for ( int i = 0; i <pattern.length ; i++)

  {

  for(int j = 0; j < pattern[i].length; j++)

  {

   gameBoard[i+r][j+c] = pattern[i][j];

  }

  

  }

  //primary oscillator pattern (blinker)

 }

 public void putBlinker(int r,int c)

 {

   //char[][] blinker = new char [10][10];

  char pattern[][] = getBlinker();

  for ( int i = 0; i <pattern.length ; i++)

  {

  for(int j = 0; j < pattern[i].length; j++)

  {

   gameBoard[i+r][j+c] = pattern[i][j];

  }

  

  }

  

 }

//retreiving the gameboard

	public char[][] getGameBoard(){

  

  

  for(int i = 0; i < gameBoard.length;i++) {

   for(int j = 0; j < gameBoard[0].length;j++) {

   	gameBoard[2][3] = '*';

   	gameBoard[3][4] = '*';

   	gameBoard[4][2] = '*';

   	gameBoard[4][3] = '*';

   	gameBoard[4][4] = '*';

    	

   }

  }

    	return gameBoard;

 

	}

 

 //printing the gameboard

public void printGameBoard(){

 

  System.out.println("                     	");

 

   	for (int i = 0; i < gameBoard.length;i++){

   	for(int j = 0; j < gameBoard[i].length;j++){

   

   

   System.out.print(gameBoard[i][j]);

  	}

  System.out.println("");

 	}

  

}



//this is to count the number of neighbors

 

  private int countNeighbors(int r, int c) {

  int count = 0;

  

 	  if(inBound(gameBoard, r-1,c-1) && (gameBoard[r-1][c-1] == '*'))

    count++;

   

        	if(inBound(gameBoard,r-1,c) && (gameBoard[r-1][c] == '*'))

    count++;

        	if(inBound(gameBoard,r-1,c+1) && (gameBoard[r-1][c+1] == '*'))

    count++;

 

        	if(inBound(gameBoard,r,c-1) && (gameBoard[r][c-1] == '*'))

             	count++;    

        	if(inBound(gameBoard,r,c+1) && (gameBoard[r][c+1] == '*'))

    count++;

        	if(inBound(gameBoard,r+1,c-1) && (gameBoard[r+1][c-1] == '*'))

    count++;

        	if(inBound(gameBoard,r+1,c) && (gameBoard[r+1][c] == '*'))

    count++;

        	if(inBound(gameBoard,r+1,c+1) && (gameBoard[r+1][c+1] == '*'))

               	count++;    

  	

  return count;

  }

   public boolean inBound(char[][] w, int r, int c){

 if((r >= 0) && (r < w.length) && (c >= 0) && (c < w.length))

   return true;

	else

   return false;

  }

 

 

 

 

  //update newer generations of the board

 

 public void nextGen(){

 

   char[][] nextGen = new char[20][20]; 

  

     	

   	for(int r = 0; r < gameBoard.length; r++){

 	for(int c = 0; c < gameBoard[r].length; c++){

	

  if(countNeighbors(r,c) == 3){

  	nextGen [r][c] = '*';   

  

  }

  else if ((gameBoard[r][c] == ' ') && (countNeighbors(r,c) == 3)){

   //cell is brought into existence

   nextGen [r][c] = '*'; 

  }

  else if ((gameBoard[r][c] == '*') && ((countNeighbors(r,c) == 2 || countNeighbors(r,c) == 3 ))){

   //cell is constant at this stage

   nextGen [r][c] = '*'; 

  }

  

  else if ((gameBoard[r][c] == '*') && (countNeighbors(r,c) < 2)){

   //lonely... I'm Mr. lonely I have nobody to call my owwwwwn

   nextGen [r][c] = ' '; 
  }

  

  else if ((gameBoard[r][c] == '*') && (countNeighbors(r,c) > 3)){

   // Cause I've been scared of crowded places, Come with me, I'll take you home

   nextGen [r][c] = ' '; 
  }

  

  else if ((gameBoard[r][c] == ' ' && (countNeighbors(r,c) > 3))){

   

   nextGen [r][c] = ' ';  

  }

	

 } 

 }

   gameBoard = nextGen;

 }

 

}





