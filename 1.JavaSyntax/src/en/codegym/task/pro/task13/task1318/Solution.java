package en.codegym.task.pro.task13.task1318;

/* 
Next month, please
*/
//this works but won't verify
public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }


    public static Month getNextMonth(Month month) {
        int index = month.ordinal();
        index++;
        if (index >= Month.values().length) {
            index = 0;
        }
        Month result = Month.values()[index];
        return result;
    }
}

