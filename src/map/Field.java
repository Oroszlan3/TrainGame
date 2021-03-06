package map;

public abstract class Field {
    private String type;
    private Field left;
    private Field right;
    private Field up;
    private Field down;

    public Field() {
        type = "Field";
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Field getLeft() {
        return left;
    }

    public Field getRight() {
        return right;
    }

    public Field getUp() {
        return up;
    }

    public Field getDown() {
        return down;
    }
}
