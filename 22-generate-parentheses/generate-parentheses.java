class Solution {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<>();
        String temp="";
        int opencount = 0;
        int closedcount = 0;
        backtrack(n, result, temp, opencount, closedcount);
        return result;
    }

    static void backtrack(int n, ArrayList<String> result, String temp, int open, int closed) {
        if (open == n && closed == n) {
            result.add(temp);
            return;
        }
        if (open < n) {
            backtrack(n, result, temp + "(", open + 1, closed);
        }
        if (closed < open) {
            backtrack(n, result, temp + ")", open, closed + 1);
        }
    }
}