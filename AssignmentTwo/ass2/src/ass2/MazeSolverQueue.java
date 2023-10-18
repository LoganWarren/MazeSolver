package ass2;

public class MazeSolverQueue extends MazeSolver {
    private MyQueue<Square> queue;

    public MazeSolverQueue(Maze maze) {
        super(maze);
        this.makeEmpty();
        Square start = maze.getStart();
        start.mark();
        this.add(start);
    }

    @Override
    void makeEmpty() {
        queue = new MyQueue<Square>();
    }

    @Override
    boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    void add(Square sq) {
        queue.enqueue(sq);
    }

    @Override
    Square next() {
        return queue.dequeue();
    }
}
