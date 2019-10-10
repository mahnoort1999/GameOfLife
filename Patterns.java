    public class Patterns 
    {



    public char[][] gliderArray = {{' ','*',' '},
                                   {' ',' ','*'},
                                   {'*','*','*'}};
                                 


    public char[][] getGlider()
    {
        return gliderArray;
    }

    public char[][] blinkerArray = {{' ',' ',' '},
                                    {'*','*','*'},
                                    {' ',' ',' '}};

    public char[][] getBlinker()
    {
        return blinkerArray;
    }

    public char[][] exploderArray = {{' ','*',' '},
                                     {'*','*','*'},
                                     {'*',' ','*'},
                                     {' ','*',' '}};

    public char[][] getExploder()
    {
        return exploderArray;
    }

    }