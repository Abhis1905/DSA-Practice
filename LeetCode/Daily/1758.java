1758. Minimum Changes To Make Alternating Binary String
Problem

Given a binary string s consisting only of '0' and '1', we can change any character in one operation.

A string is alternating if no two adjacent characters are equal.

Return the minimum number of operations required to make the string alternating.

Example
Input:  s = "0100"
Output: 1

Explanation:
Change last character to '1' → "0101"
Approach

An alternating binary string can only have two possible patterns:

"010101..."

"101010..."

We compare the given string with pattern "010101..." and count mismatches.

If cnt is the number of mismatches with "010101...", then:

operations for pattern1 = cnt
operations for pattern2 = n - cnt

Because the characters matching the first pattern will mismatch the second pattern.

Finally return the minimum of both.

Algorithm

Iterate through the string.

Generate expected character using "01".charAt(i % 2).

Count mismatches.

Return min(cnt, n - cnt).

Complexity
Time Complexity:  O(n)
Space Complexity: O(1)

  
Java Implementation
class Solution {
    public int minOperations(String s) {
        int cnt = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) != "01".charAt(i % 2)) {
                cnt++;
            }
        }

        return Math.min(cnt, n - cnt);
    }
}
