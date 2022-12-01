package pattern_lib.AbstractFactory.bomb_maze;

public class BombRoom implements BombMaze {
    public String create(){
        return "Created a room with a BOMB!!!";
    }

    public String returnSelf() {
        return "This is a room with a BOMB!";
    }

    public String explode(){
        return "The bomb exploded and the room is destroyed!";
    }
}
