/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter07;

/**
 *
 * @author 19502
 */
public class HiddenWord
{

    private String hiddenWord;
    private boolean isInWord = false;

    public HiddenWord(String word)
    {
        hiddenWord = word;
    }

    public String getHint(String guess)
    {
        String hint = "";
        for (int i = 0; i < guess.length(); i++) {
            for (int j = 0; j < guess.length(); j++) {
                if (guess.charAt(i) == hiddenWord.charAt(j)){
                    isInWord = true;
                }
            }
            if (guess.charAt(i) == hiddenWord.charAt(i)){
                hint += guess.substring(i, i + 1);
            }
            else if (isInWord){
                hint += "+";
            }
            else {
                hint += "*";
            }
            isInWord = false;
        }
        return hint;
    }
}
