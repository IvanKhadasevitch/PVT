import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WhichMeansString {
    private static volatile WhichMeansString INSTANCE = null;


    private static final Pattern EMAIL_REGEX =
            Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$", Pattern.CASE_INSENSITIVE);
    private static final Pattern PHONE_REGEX =
            Pattern.compile("^\\+375\\s?\\(?[0-9]{3}\\)?\\s?[0-9]{3}-?[0-9]{2}-?[0-9]{2}$", Pattern.CASE_INSENSITIVE);
    private static final Pattern SURNAME_REGEX =
            Pattern.compile("^([\\p{Alpha}&&[^\\p{Punct}\\d]]{1,30})|([А-Яа-я&&[^\\p{Punct}\\d]]{1,30})$", Pattern.CASE_INSENSITIVE);
    private static final Pattern NUMBER_SOCIAL_INSURANCE_REGEX =
            Pattern.compile("^[1-6][0-9]{6}[ABCHKEM][0-9]{3}PB[0-9]$");

    private WhichMeansString() {
    }

    public static WhichMeansString getInstance() {
        WhichMeansString itemService = INSTANCE;
        if (itemService == null) {
            synchronized (WhichMeansString.class) {         // важно синхронизация !!!
                itemService = INSTANCE;
                if (itemService == null) {
                    INSTANCE = itemService = new WhichMeansString();
                }
            }
        }

        return itemService;
    }

    public  StringType stringIs(String str) {
        if (str == null) {
            return StringType.NOT_DEFINE;
        }

        str = str.trim();
        Matcher matcher = PHONE_REGEX.matcher(str);
        if (matcher.matches()) {
            return StringType.PHONE;
        }

        matcher = EMAIL_REGEX.matcher(str);
        if (matcher.matches()) {
            return StringType.EMAIL;
        }

        matcher = SURNAME_REGEX.matcher(str);
        if (matcher.matches()) {
            return StringType.SURNAME;
        }

        matcher = NUMBER_SOCIAL_INSURANCE_REGEX.matcher(str);
        if (matcher.matches()) {
            return StringType.NUMBER_SOCIAL_INSURANCE;
        }

        return StringType.NOT_DEFINE;

    }

//    public static void main(String[] args){
//        WhichMeansString whichMeansString = WhichMeansString.getInstance();
//        String st = "+375 (017) 123-12-12  ";
//        System.out.printf("[%s] is [%s] \n",st, whichMeansString.stringIs(st));
//        st = " pyshkin@gmail.com ";
//        System.out.printf("[%s] is [%s] \n",st, whichMeansString.stringIs(st));
//        st = " pyshkin@gmail...com ";
//        System.out.printf("[%s] is [%s]\n",st, whichMeansString.stringIs(st));
//        st = " pyshkin ";
//        System.out.printf("[%s] is [%s]\n",st, whichMeansString.stringIs(st));
//        st = " Иванов ";
//        System.out.printf("[%s] is [%s]\n",st, whichMeansString.stringIs(st));
//        st = "   3020374A016PB4 ";
//        System.out.printf("[%s] is [%s]\n",st, whichMeansString.stringIs(st));
//        st = "  ddd3020374A016PB4 ";
//        System.out.printf("[%s] is [%s]\n",st, whichMeansString.stringIs(st));
//        st = " 1..pyshkin@gmail.com ";
//        System.out.printf("[%s] is [%s]\n",st, whichMeansString.stringIs(st));
//        st = "+375 (017)123-12-12  ";
//        System.out.printf("[%s] is [%s]\n",st, whichMeansString.stringIs(st));
//        st = null;
//        System.out.printf("[%s] is [%s]\n",st, whichMeansString.stringIs(st));
//
//    }
}
