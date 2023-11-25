import java.util.Date;
import java.text.Format;
import java.text.SimpleDateFormat;

public class AlfredQuotes {
    
    public String basicGreeting() {
        // Greeting with day period
        SimpleDateFormat format = new SimpleDateFormat("HH");
        Date date = new Date();
        int liveHour = Integer.parseInt(format.format(date));
        System.out.println(liveHour);
        String dayPeriod;
        if (liveHour<12 && liveHour>=4){
            dayPeriod = "morning";
        }else if (liveHour>= 12 && liveHour< 20){
            dayPeriod = "afternoon"; 
        }else{
            dayPeriod = "evening";
        }
        return (String.format("Good %s, lovely to see you. how rea you?",dayPeriod));
    }
    
    public String guestGreeting(String name) {
        // YOUR CODE HERE
        String guest = String.format("Hello, %s. Lovely to see you",name);
        return guest;
    }

    public String guestGreeting(String name, String dayPeriod) {
        // YOUR CODE HERE
        String guest = String.format("Good %s, %s. Lovely to see you",dayPeriod, name);
        return guest;
    }
    
    public String dateAnnouncement() {
        // YOUR CODE HERE
        Date date = new Date();
        return "It is currently " + date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // YOUR CODE HERE
        int alexis = conversation.indexOf("Alexis");
        int alfred = conversation.indexOf("Alfred");
        if (alexis >= 0){
            return "Right away, sir";
        }else if (alfred >= 0){
            return "At your service";
        }else{
            return "Right. And with that I shall retire.";
        }
    }
    
	// NINJA BONUS
	// See the specs to overload the guestGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}