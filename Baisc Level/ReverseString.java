class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String st2 = "";
        for (int i=str.length()-1; i>=0; i--) {
            st2+= str.charAt(i);
        }
        return st2;
    }
}
