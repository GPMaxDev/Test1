public class SubTask6 {
    public static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {

       System.out.println(getStringNameOfColum(702));
       System.out.println(getNumberOfColumn("ZZ"));
        System.out.println(getNumberOfChar('r'));
        System.out.println(getNumberOfRightColumn("ZY"));

    }

    private static int getNumberOfChar(char cha) {
        String upperCaseChar = String.valueOf(cha).
                                     trim()
                                    .toUpperCase();
        return alphabet.indexOf(upperCaseChar) + 1;
    }

    private static int getNumberOfColumn(String columnName) {

        int result = 0;

        if (!columnName.isEmpty()) {
            char[] inputCharArray = columnName.toCharArray();

            if (inputCharArray.length == 1) {
               result = getNumberOfChar(inputCharArray[0]);
            } else {
               result = (getNumberOfChar(inputCharArray[0]) * 26) + getNumberOfChar(inputCharArray[1]);
            }
        }
        return result;
    }

    private static String getStringNameOfColum(int numberOfColumn){

        int firstIndexOfChar;
        int secondIndexOfChar;

        StringBuilder stringBuilder = new StringBuilder();

        if(numberOfColumn > 0 && numberOfColumn <= 26){
            stringBuilder.append(alphabet.charAt(numberOfColumn - 1));

        } else if (numberOfColumn > 26) {
            firstIndexOfChar = numberOfColumn / 26;
            secondIndexOfChar = (numberOfColumn % 26);
            if(secondIndexOfChar == 0){
                firstIndexOfChar -=1;
                secondIndexOfChar = 26;
            }
            stringBuilder.append(alphabet.charAt(firstIndexOfChar - 1));
            stringBuilder.append(alphabet.charAt(secondIndexOfChar - 1));

        }

        return stringBuilder.toString().toUpperCase();
    }

    private static int getNumberOfRightColumn(String columnName){
        return getNumberOfColumn(columnName) + 1;

    }


}




