class Solution {
    public boolean rotateString(String s, String goal) {
    //     String temp = goal+goal;
    //     int hashCode = s.hashCode();
    //     int length = s.length();
    //     for(int i=0;i<temp.length();i++){
    //         int goalHashcode = temp.substring(i,i+length).hashCode();
    //         if(goalHashcode == hashCode) return true;
    //     }
    //   return false;  
    // }
    if (s.length() != goal.length()) {
        return false; // If lengths are different, s cannot be rotated to form goal
    }
        String temp = goal + goal;
    int hashCode = s.hashCode();
    int length = s.length(); // Use length() method to get the length of a string
    int finalLength = temp.length()-length;
    for (int i = 0; i < finalLength; i++) { // Use temp.length() to iterate through temp
        int goalHashcode = temp.substring(i, i + length).hashCode(); // Use i + length to get the substring
        if (goalHashcode == hashCode) {
            return true;
        }
    }
    
    return false;
}
}