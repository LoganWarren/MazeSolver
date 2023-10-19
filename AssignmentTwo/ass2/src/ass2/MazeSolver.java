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
    private void buildPath(Square sq) {
        this.path = new LinkedList<Square>();
        
        // Start with the finish square and traverse back to the start square
        while (sq != null) {
            this.path.add(0, sq);  // Add to the front to maintain the order
            sq.setOnPath(); // Mark the square as being on the solution path
            sq = sq.getPrevious();
        }
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
        
        // Check if the nextSquare is the exit
        if (nextSquare.getType() == Square.EXIT) {
            this.pathFound = true;
            this.finished = true;
            buildPath(nextSquare);
            return;
        }
        
        // Get neighbors of the current square
        ArrayList<Square> neighbors = maze.getNeighbors(nextSquare);
        
        // Add unmarked neighbors to the worklist and mark them
        for (Square neighbor : neighbors) {
            if (!neighbor.isMarked() && neighbor.getType() != Square.WALL) {
                neighbor.setPrevious(nextSquare);
                neighbor.mark();
                this.add(neighbor);
            }
        }
    }
    
}
