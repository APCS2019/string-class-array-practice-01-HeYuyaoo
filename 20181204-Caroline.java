Past paper 2015
main idea: String, class
public class HiddenWord{
    private String puzzle;
    public HiddenWord(String s1){
        puzzle=s1;
    }
    public String getHint(String guess){
    String temp="";
    for(int i=0;i<guess.length();i++){
        if(realWord.subString(i,i+1).equals(guess.subString(i,i+1)){
            temp=temp+puzzle.subString(i,i+1);
        }
        else if(puzzle.indexOf(guess.subString(i,i+1)!=-1){
            temp=temp+"+";
        }
         else{
         temp=temp+"*";
        }
     }
     return temp;
     }   
  }
}
