public class countVovelsConst {
    public static void main(String[] args) {
        int vovelCount=0,constCount=0;
        String str="abcdefghidfgdjfk";
        for(char c:str.toCharArray()){
            if("aeiouAEIOU".indexOf(c)!=-1){
                vovelCount++;
            }
            else if(Character.isLetter(c)){
                constCount++;
            }
        }
        System.out.println("vovels count: "+vovelCount);
        System.out.println("consonants  count: "+constCount);

    }
}
