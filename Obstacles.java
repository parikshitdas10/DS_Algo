import java.util.*;

public class Obstacles {
    static Set<Item> set = new HashSet<>();
    static int[] dir = new int[] { 0, 1, 2, 3 }; // right, down, left, up

    public static void main(String[] args) {
        /*
         * char[][] board = new char[][]{
         * {'.','.','.','.','X','.','.'},
         * {'X','.','.','.','.','.','.'},
         * {'.','.','.','.','.','X','.'},
         * {'.','.','.','.','.','.','.'},
         * };
         */

        char[][] board1 = new char[][] {
                { '.', '.', 'X', '.', '.' },
                { 'X', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.' },
                { '.', '.', '.', '.', '.' },
        };

        System.out.println(solve(board1));
    }

    public static int solve(char[][] board) {
        Map<String, Boolean> visited = new HashMap<>();
        dfs(board, 0, 0, 0, visited);
        return set.size();
    }

    static void dfs(char[][] board, int x, int y, int direction, Map<String, Boolean> visited) {

        String key = x + ":" + y + ":" + direction;
        if (visited.containsKey(key)) {
            return;
        }

        if (x == board.length || x == -1 || y == -1 || y == board[0].length) {
            // edge case : simple go back to prev x,y and change direction
            if (x == board.length) {
                // current direction is down
                dfs(board, x - 1, y, 2, visited);
            } else if (x == -1) {
                // current direction is up
                dfs(board, x + 1, y, 0, visited);
            } else if (y == board[0].length) {
                // current direction is right
                dfs(board, x, y - 1, 1, visited);
            } else if (y == -1) {
                // current direction is left
                dfs(board, x, y + 1, 3, visited);
            }
            return;
        }

        visited.put(key, true);
        if (board[x][y] != 'X') {
            // keep moving in the same direction
            Item item = new Item(x, y);
            set.add(item);
            if (direction == 0) {
                dfs(board, x, y + 1, 0, visited);
            } else if (direction == 1) {
                dfs(board, x + 1, y, 1, visited);
            } else if (direction == 2) {
                dfs(board, x, y - 1, 2, visited);
            } else {
                dfs(board, x - 1, y, 3, visited);
            }
        } else {
            // Same as edge case : go to prev x,y and change direction
            if (direction == 0) {
                dfs(board, x, y - 1, 1, visited);
            } else if (direction == 1) {
                dfs(board, x - 1, y, 2, visited);
            } else if (direction == 2) {
                dfs(board, x, y + 1, 3, visited);
            } else {
                dfs(board, x + 1, y, 0, visited);
            }
        }

    }

    static class Item {
        int x;
        int y;

        Item(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int hashCode() {
            return Objects.hashCode(this.x) * Objects.hashCode(this.y);
        }

        public boolean equals(Object o) {
            Item other = (Item) o;
            return other.x == this.x && other.y == this.y;
        }
    }
}