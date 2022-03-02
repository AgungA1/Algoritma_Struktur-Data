package JS2;

public class PacMan {
    int x, y, width, height;

    void moveLeft(int b) {
        x -=1;
    }
    void moveRight(int b){
        x +=1;
    }
    void moveUp(int b){
        y +=1;
    }
    void moveDown(int b){
        y -=1;
    }
    void printPosition(int x, int y){
        System.out.println("Pacman berada diposisi (x,y) = "+ x + "," + y);
    }
}
