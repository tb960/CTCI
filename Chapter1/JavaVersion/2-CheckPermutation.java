public class CheckPermutation {
    //Given two strings, write a method to decide if one is a permutation of the other.

    //1st approach, O(n^2) time complexity and O(1) space complexity,
    //O(n^2) because we will go through two string of length n at worst case
    //O(1) time complexity because we always only have 128 ASCII character
    //we can also convert the string to all lowercase character
    public static boolean isPermutation(String strA, String strB){
        int len1 = strA.length();
        int len2 = strB.length();
        if(len1 != len2){
            return false;
        }
        int charArray[] = new int[128];
        for (int i=0; i<len1; i++){
            int val = strA.charAt(i);
            charArray[val]++;
        }

        //this for loop and the following for loop can be merge so that we save time for another for loop
        for (int i=0; i<len2; i++){
            int val = strB.charAt(i);
            charArray[val]--;
        }

        for(int i=0; i<charArray.length; i++){
            if(charArray[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args){
        String a = "Hello";
        String b = "asdfghjkl";

        String a1String = "Hello";
        String a2String = "Hello";

        System.out.println(isPermutation(a, b));
        System.out.println(isPermutation(a1String, a2String));

    }


}
