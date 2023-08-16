package en.codegym.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Tuesday"));
        System.out.println(getTranslationForDayOfWeek("Friday"));
        System.out.println(getTranslationForDayOfWeek("Funday"));
    }

    public static String getTranslationForDayOfWeek(String en) {
        String pigLatin;
        if (en.toLowerCase().equals("monday")) {
            pigLatin = "Ondaymay";
        } else if (en.toLowerCase().equals("tuesday")) {
            pigLatin = "Uesdaytay";
        } else if (en.toLowerCase().equals("wednesday")) {
            pigLatin = "Ednesdayway";
        } else if (en.toLowerCase().equals("thursday")) {
            pigLatin = "Ursdaythay";
        } else if (en.toLowerCase().equals("friday")) {
            pigLatin = "Idayfray";
        } else if (en.toLowerCase().equals("saturday")) {
            pigLatin = "Aturdaysay";
        } else if (en.toLowerCase().equals("sunday")) {
            pigLatin = "Undaysay";
        } else {
            pigLatin = "Invalid day of the week";
        }
        return pigLatin;
    }
}
