73. Set Matrix Zeroes

🔗 Problem Link
https://leetcode.com/problems/set-matrix-zeroes/

🧩 Problem Statement

Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0.

The transformation should modify the matrix accordingly.

💡 Approach

To solve this problem:

Create two auxiliary arrays:

row[] to mark rows containing 0

col[] to mark columns containing 0

Traverse the matrix:

If matrix[i][j] == 0, mark
row[i] = 1 and col[j] = 1.

Traverse the matrix again:

If row[i] == 1 or col[j] == 1, set
matrix[i][j] = 0.

This approach ensures all rows and columns containing a 0 are correctly updated.

Java Implementation
class Solution {
    public void setZeroes(int[][] matrix)
    { 
        int m = matrix.length;
        int n = matrix[0].length;

        int[] row = new int[m];
        int[] col = new int[n];

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(matrix[i][j] == 0)
                {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(row[i] == 1 || col[j] == 1)
                {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
⏱ Complexity Analysis

Time Complexity:
O(m × n)

Space Complexity:
O(m + n) (extra arrays used for rows and columns)

🧠 Concepts Used

Matrix Traversal

Array Marking Technique

Simulation
