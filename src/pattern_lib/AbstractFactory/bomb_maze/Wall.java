package pattern_lib.AbstractFactory.bomb_maze;

public class Wall implements BombMaze {
    public String create(){
        return "Created a wall in a room with a BOMB!!!";
    }

    public String returnSelf() {
        return "This is wall in a room with a BOMB!";
    }

    public String explode(){
        return "The bomb exploded and the wall collapsed!";
    }
}
