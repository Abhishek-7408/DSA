class reverseStr{
    public static void main(String[] args) {
        String str = "abcdefgh";
        String revc="";
        for(int i=str.length()-1;i>=0;i--){
            revc+=str.charAt(i);
        }
        System.out.println(revc);
    }
}