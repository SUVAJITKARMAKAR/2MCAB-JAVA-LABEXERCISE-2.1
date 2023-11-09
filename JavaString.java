import java.util.Arrays;

public class JavaString {
    public static void main(String[] args) throws Exception {

        String paragraph = "    We realizes that while our workers were thriving, the surrounding villages were still suffering. It became our goal to uplift their quality of life as well. I remember seeing a family of 4 on a motorbike in the heavy Bombay rain — I knew I wanted to do more for these families who were risking their lives for lack of an alternative. The alternative mentioned here is the Tata Nano, which soon after came as the worlds cheapest car on retail at a starting price of only Rs 1 lakh. These were the words of Ratan Tata in a recent post by Humans of Bombay which formed the basis of his decision to come up with a car like Tata Nano.";
        String sampletext = "Hello there I am Suvajit Karmakar and I am here learning Java Programming, all thanks to Cynthia ma'am";


        //PRINTING THE STRING 
        System.out.println("THE PARAGRAPH -> " + paragraph);
        System.out.println();

        //STRING chatAT() METHOD
        System.out.println("THE STIRNG AT SPECIFIED POSITION IS ->" + paragraph.charAt(56));
        System.out.println();

        //STRING compareTo() METHOD
        int compareToResult = paragraph.compareTo(sampletext);
        System.out.println("compareTo() ->  " + compareToResult);
        System.out.println();

        //STRING concat() METHOD
        String concatenatedStr = paragraph.concat(" " + sampletext);
        System.out.println("concat() ->  " + concatenatedStr);
        System.out.println();

        //STRING contains() METHOD
        boolean containsResult = concatenatedStr.contains("srrounding villages were still suff");
        System.out.println("contains() -> " + containsResult);
        System.out.println();

        //STRING endsWith() METHOD
        boolean endsWithResult = concatenatedStr.endsWith("thri");
        System.out.println("endsWith() ->  " + endsWithResult);
        System.out.println();

        //STIRNG equalsTo() METHOD
        boolean areEqual = paragraph.equals("learning here Java Programming");
        System.out.println("equals() -> " + areEqual);
        System.out.println();

        //STRING equalsIgnoreCase() METHOD
        boolean equalsIgnoreCaseResult = paragraph.equalsIgnoreCase(sampletext);
        System.out.println("equalsIgnoreCase() -> " + equalsIgnoreCaseResult);
        System.out.println();

        //STRING format() METHOD
        String formattedStr = String.format("I pray and , %s!", "Wish to make my parents proud and work for my country!");
        System.out.println("format() -> " + formattedStr);
        System.out.println();

        //STIRNG getBytes() METHOD
        byte[] bytes = paragraph.getBytes();
        System.out.println("getBytes() -> " + Arrays.toString(bytes));
        System.out.println();

        //STRING getChars() METHOD
        char[] charArray = new char[5];
        paragraph.getChars(0, 5, charArray, 0);
        System.out.println("getChars() -> " + Arrays.toString(charArray));
        System.out.println();

        //STRING indexOf() METHOD
        int indexOfResult = paragraph.indexOf('i');
        System.out.println("indexOf() -> " + indexOfResult);
        System.out.println();

        //STRING intern() METHOD
        String internedStr = paragraph.intern();
        System.out.println("intern() -> " + (internedStr == paragraph));
        System.out.println();

        //STRING isEmpty() METHOD
        boolean isEmptyResult = paragraph.isEmpty();
        System.out.println("isEmpty() -> " + isEmptyResult);
        System.out.println();

        //STRING join() METHOD
        String joinedStr = String.join("-", "HELLO", "I AM ", "SUVAJIT KARMAKAR", "&", "I", "AM", "MENTALLY SICK");
        System.out.println("join() -> " + joinedStr);
        System.out.println();

        //STRING lastIndexOf() METHOD
        int lastIndexOfResult = paragraph.lastIndexOf("still");
        System.out.println("lastIndexOf() -> " + lastIndexOfResult);
        System.out.println();

        //STIRNG length() METHOD
        int lengthResult = paragraph.length();
        System.out.println("length() -> " + lengthResult);
        System.out.println();

        //STRING replace() METHOD 
        String replacedStr = paragraph.replace("Hello", "Hola");
        System.out.println("replace() -> " + replacedStr);
        System.out.println();

        //STIRNG replceAll() METHOD
        String replacedAllStr = paragraph.replaceAll("Hello", "Bonjour");
        System.out.println("replaceAll() -> " + replacedAllStr);
        System.out.println();

        //STRING split() METHOD
        String[] splitStr = paragraph.split(" ");
        System.out.println("split() -> " + Arrays.toString(splitStr));
        System.out.println();

        //STRING startsWith() METHOD
        boolean startsWithResult = paragraph.startsWith("Hello");
        System.out.println("startsWith() -> " + startsWithResult);
        System.out.println();

        //STRING subString() METHOD
        String substringResult = paragraph.substring(6, 11);
        System.out.println("substring() ->  " + substringResult);
        System.out.println();

        //STRING toCharArray() METHOD
        char[] charAnotherArray = paragraph.toCharArray();
        System.out.println("toCharArray() -> " + Arrays.toString(charAnotherArray));
        System.out.println();

        //STRING tolowerCase() METHOD
        String lowercaseStr = paragraph.toLowerCase();
        System.out.println("toLowerCase() -> " + lowercaseStr);
        System.out.println();

        //STRING toUpperCase() METHOD
        String uppercaseStr = paragraph.toUpperCase();
        System.out.println("toUpperCase(): " + uppercaseStr);
        System.out.println();

        //STRING trim() METHOD
        String trimmedStr = paragraph.trim();
        System.out.println("trim() -> " + trimmedStr);
        System.out.println();

        //STRING valueOf() METHOD
        int number = 42;
        String valueOfString = String.valueOf(number);
        System.out.println("valueOf() ->  " + valueOfString);
        System.out.println();
    }
}