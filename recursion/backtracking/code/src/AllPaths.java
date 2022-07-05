import java.util.Arrays;

public class AllPaths {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

//        allPaths("", 0, 0, maze);
        int[][] path = new int[maze.length][maze[0].length];
        allPathsPrint("", 0, 0, maze, path, 1);
    }

    static void allPaths(String p, int r, int c, boolean[][] maze){
        if(r == maze.length-1 && c == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;

        if(r < maze.length-1){
            allPaths(p + "D", r+1, c, maze);
        }
        if(c < maze[0].length-1){
            allPaths(p + "R", r, c+1, maze);
        }
        if(r > 0){
            allPaths(p+ "U", r-1, c, maze);
        }
        if(c > 0){
            allPaths(p + "L", r, c-1, maze);
        }

        maze[r][c] = true;
    }

    static void allPathsPrint(String p, int r, int c, boolean[][] maze, int[][] path, int step){
        if(r == maze.length-1 && c == maze[0].length-1){
            path[r][c] = step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        path[r][c] = step;

        if(r < maze.length-1){
            allPathsPrint(p + "D", r+1, c, maze, path, step +1);
        }
        if(c < maze[0].length-1){
            allPathsPrint(p + "R", r, c+1, maze, path, step +1);
        }
        if(r > 0){
            allPathsPrint(p+ "U", r-1, c, maze, path, step +1);
        }
        if(c > 0){
            allPathsPrint(p + "L", r, c-1, maze, path, step +1);
        }

        maze[r][c] = true;
        path[r][c] = 0;
    }
}
