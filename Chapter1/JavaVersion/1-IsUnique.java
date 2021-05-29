public class IsUnique{
    //Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

    //1st, use a linear scan, 
    //2nd, use a set
    //3rd, use an extra array, constant size array to keep count of the number of character in the string, this will 
    //required O(n) time complexity and o(1) space
    public static boolean isUniqueChar(String str){
        boolean charArray[] = new boolean[128]; //assume ASCII charcters is used
        for(int i=0; i<str.length(); i++){
            //what does str.chatAt() return?
            int val = str.charAt(i);

            //we cannot use oneliner here because in both case of the if else we have diff output
            if(charArray[val]){
                return false;
            }
            else{
                charArray[val] = true;
            }

        }
        return true;
    }

    public static void main (String[] args){
        String a = "Hello";
        String b = "asdfghjkl";

        System.out.println(isUniqueChar(a));
        System.out.println(isUniqueChar(b));

    }
    
}
