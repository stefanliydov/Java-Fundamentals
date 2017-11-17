package telephony;

import java.util.regex.Pattern;

public class Smartphone implements Calls,Browser {

    @Override
    public String call(String number) {
        Pattern pattern = Pattern.compile("[^\\d]");
        if(pattern.matcher(number).find()){
            return "Invalid number!";
        }
        return String.format("Calling... %s",number);
    }

    @Override
    public String browse(String url) {
        Pattern pattern = Pattern.compile("[\\d]");
        if(pattern.matcher(url).find()){
            return "Invalid URL!";
        }
        return String.format("Browsing: %s!",url);
    }

}
