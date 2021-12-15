package com.company;

public class Roomba implements iRobot{
    final int[][] room;
    Direction dir;
    int row;
    int column;

    //constructor
    public Roomba(int[][] room) {
        this.room = room;
        this.dir = Direction.DOWN;
    }

    @Override
    public boolean move() {
        if(dir == Direction.DOWN){
            if(room[row][column + 1] > room.length  || room[row][column + 1]  == -1 ){
                return false;
            }
            column++;
        } else if(dir == Direction.LEFT){
            if(room[row-1][column] < 0 || room[row - 1][column] == -1){
                return false;
            }
            row--;
        } else if(dir == Direction.RIGHT){
            if(room[row + 1][column] > room.length || room[row + 1][column] == -1){
                return false;
            }
            row++;
        } else if(dir == Direction.UP){
            if(room[row][column - 1] < 0 || room[row][column - 1] == -1){
                return false;
            }
            column--;
        }
        return  true;
    }

    @Override
    public void turnLeft() {
        this.dir = Direction.LEFT;
    }

    @Override
    public void turnRight() {
        this.dir = Direction.RIGHT;
    }

    @Override
    public void clean() {
        room [row][column] = 1;
    }
}
