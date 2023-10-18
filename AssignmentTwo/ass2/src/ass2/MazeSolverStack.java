package ass2;

public class MazeSolverStack extends MazeSolver {
    private MyStack<Square> stack;

    public MazeSolverStack(Maze maze) {
        super(maze);
        this.makeEmpty();
        Square start = maze.getStart();
        start.mark();
        this.add(start);
    }

    @Override
    void makeEmpty() {
        stack = new MyStack<Square>();
    }

    @Override
    boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    void add(Square sq) {
        stack.push(sq);
    }

    @Override
    Square next() {
        return stack.pop();
    }
}
