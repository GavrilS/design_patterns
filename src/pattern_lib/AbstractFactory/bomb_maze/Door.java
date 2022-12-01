package pattern_lib.AbstractFactory.bomb_maze;

public class Door implements BombMaze {
    public String create(){
        return "Created a door inside a room with a BOMB!!!";
    }

    public String returnSelf() {
        return "This is a door in a BOMB room!!!";
    }

    public String explode(){
        return "The bomb exploded and the door is gone!";
    }
}
