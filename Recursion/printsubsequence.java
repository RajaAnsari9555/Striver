public class printsubsequence {
    static void printSSQ(String s , String currAns){ //"abc" , ""

    //! base condition

    if(s.length() == 0){
        System.out.println(currAns);
        return;
    }

        char curr = s.charAt(0); //a

        String remString = s.substring(1);//"bc"

        // character wants to go into the curr ans

        printSSQ(remString, currAns+curr); //"a" "ab" ,"abc"

        //character don,t want to goes into currAns
        printSSQ(remString, currAns);
    }
    public static void main(String[] args) {
        printSSQ("abc", "");
    }
}
