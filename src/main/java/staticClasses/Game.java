package staticClasses;

import FileManager.FileManager;

public class Game {



    enum GameType{
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static void writeNumOfPlayersPerTeam(GameType game) {
         FileManager fileManager = new FileManager();
         switch (game){
             case SOCCER:
                 fileManager.writeToFile("soccer.txt", "11");
                 break;
             case HOCKEY:
                 fileManager.writeToFile("hockey.txt", "6");
             case RUGBY:
                 fileManager.writeToFile("rugby.txt", "15");
                 break;
         }
    }




}
