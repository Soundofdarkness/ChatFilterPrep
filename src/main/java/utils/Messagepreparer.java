package utils;

/**
 * Created by Eleria on 01.09.2016.
 */
public class Messagepreparer {


    public static String MessageLC(String message)
    {
        String lcMessage;
        lcMessage = message.toLowerCase();
        return lcMessage;
    }

    public static String MessagewithoutSpace(String message)
    {
        String WSmessage;
        WSmessage = message.replaceAll("\\s+","");
        return WSmessage;
    }
    public static String MessagewithoutCrap(String message)
    {
        String WCmessage;
        String message1;
        String message2;

        message1 = message.replaceAll("0","o");
        message2 = message1.replaceAll("1", "i");
        WCmessage = message2.replaceAll("3", "e");
        return WCmessage;
    }
}
