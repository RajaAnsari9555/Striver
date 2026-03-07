public class printsubsequence {
  public static void  printSSQ(String s ,String currSum){
    if(s.length() == 0){
        System.out.println(currSum);
        return;
    }
       char curr = s.charAt(0);

       String remString = s.substring(1);
       //! if character wants to go into the currSum
       printSSQ(remString, currSum+curr);

       //!if charcter don,t want ot go into the currSum
       printSSQ(remString, currSum);
  }
    public static void main(String[] args) {
        
    }
}