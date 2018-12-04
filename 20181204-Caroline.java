Past paper 2015
main idea: String, class
public class HiddenWord{
    private String realWord;
    public HiddenWord(String s1){
        realWord=s1;
    }
    public String getHint(String guess){
    String temp="";
    for(int i=0;i<guess.length();i++){
        if(realWord.subString(i,i+1).equals(guess.subString(i,i+1)){
            temp=temp+realWord.subString(i,i+1);
        }
        else if(realWord.indexOf(guess.subString(i,i+1)!=-1){
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
