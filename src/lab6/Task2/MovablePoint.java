package lab6.Task2;

class MovablePoint implements Movable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {this.y-=ySpeed;}

    public void moveDown() {this.y+=ySpeed;}

    public void moveLeft() {this.x-=xSpeed;}

    public void moveRight() {this.x+=xSpeed;}
}
