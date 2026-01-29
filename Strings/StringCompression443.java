class StringCompression443 {
    public static int compress(char[] chars) {
       int n = chars.length;

       
       int i=0;
       int index=0;
       int count;

       while(i<n){
        char currChar=chars[i];
        count=0;

        while(i<n && chars[i]==currChar){
            count++;
            i++;
        }

        chars[index]=currChar;
        index++;
        if(count > 1){
            String countstr = Integer.toString(count);
            for(char ch : countstr.toCharArray()){
               
                chars[index]=ch;
                index++;
            }
        }

       }
       System.out.println(chars);
       return index;
    }

    public static void main(String[] args) {
      char[] chars={'a','a','a','a','a','a','a','a','a','a','b','b'};
      System.out.println(StringCompression443.compress(chars));
    }
}