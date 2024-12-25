/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...
*/
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        
        while (columnNumber > 0) {
            // Compute the character to add to the result
            int index = (columnNumber - 1) % 26;
            char currentChar = (char) ('A' + index);
            
            // Append the character to the result
            result.append(currentChar);
            
            // Update the column number
            columnNumber = (columnNumber - 1) / 26;
        }
        
        // Reverse the string to get the correct order
        return result.reverse().toString();
    }
}
