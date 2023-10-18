package ass2;

import java.util.*;

abstract class MazeSolver {
    public static final int STACK = 1, QUEUE = 2;
    protected Maze maze;
    protected boolean finished = false;
    protected boolean pathFound = false;
    private  List<Square> path;

    MazeSolver(Maze maze) {
        this.maze = maze;          
    }

    abstract void makeEmpty();

    abstract boolean isEmpty();

    abstract void add(Square sq);

    abstract Square next();

    public boolean isFinished() {
        return finished;
    }

    public boolean pathFound() {
        return pathFound;
    }    

    /*
     * Once the finish square is reached,
     * this method makes a list of the squares on a path 
     * from the start square to the exit square
     */
    private void buildPath (Square sq) {
        this.path= new LinkedList<Square>();        
        //TODO: your code here
        
        // you can start with the finish square and use getPrevious() 
        // to recover the path from start to finish.
        // Recall that you can add in front of the list 
        // to get the correct order of elements in the path
    }
    
    public List<Square> getPath() {        
        return this.path; 
    }
    
    /* performs one step of the maze solver algorithm */
    public void step() {
        if (this.isEmpty()) {
            this.finished = true;
            return;
        }
        
        Square nextSquare = this.next();
        // TODO: one step of the maze exploration algorithm
    }
}
