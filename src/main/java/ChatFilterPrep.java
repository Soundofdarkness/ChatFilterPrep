/**
 * Created by Eleria on 01.09.2016.
 */

public class ChatFilterPrep {

    public static String PrepMessage(String message)
    {
        String message1;
        String message2;
        String Prepmessage;

        message1 = utils.Messagepreparer.MessageLC(message); //Converts everything to LowerCase
        message2 = utils.Messagepreparer.MessagewithoutSpace(message1); //Removes Space
        Prepmessage = utils.Messagepreparer.MessagewithoutCrap(message2); //Coverts 0, .. to o

        return Prepmessage;
    }



}
