class Path4{
    // Returns count of possible paths to reach from the topmost and the leftmost cell (cell at 1, 1) 
	// to rightmost and bottommost cell.
    // Row number m and column number n.

    static int numberOfPaths(int m, int n)
    {
        // Create a 1D array to store results of subproblems
        int[] dp = new int[n];  //after initialization, the default value will be 0 for each elements.
        dp[0] = 1;
		
		for (int k = 0; k < n; k++) {
			System.out.println("dp["+k+"]="+dp[k]);
		}
 System.out.println("********************************************");
        for (int i = 0; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j - 1];
				
				
				System.out.println("dp[j] += dp[j - 1]       " +"dp["+j+"] += dp[("+j+"+ - 1)]="+dp[j]);
				
            }
        }
			System.out.println("Prepare to return!");
        return dp[n - 1];
    }
 
    // Driver program to test above function
    public static void main(String args[])
    {
        System.out.println(numberOfPaths(3, 5));
    }
}