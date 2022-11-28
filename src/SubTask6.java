public class SubTask6 {
    public static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {


    }

    private static int getNumberOfChar(char cha) {
        return alphabet.indexOf(cha) + 1;
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

        String stringNumber = "";
        if(numberOfColumn > 0 && numberOfColumn <= 26){
            stringNumber = alphabet.substring(numberOfColumn - 1,numberOfColumn);

        } else if (numberOfColumn > 26) {

            int firstIndexOfChar;
            int secondIndexOfChar;

            firstIndexOfChar = numberOfColumn / 26;
            secondIndexOfChar = (numberOfColumn % 26);

            stringNumber = alphabet.substring(firstIndexOfChar - 1, firstIndexOfChar) +
                    alphabet.substring(secondIndexOfChar - 1, secondIndexOfChar);


        }


        return stringNumber.toUpperCase();
    }

    private static int getNumberOfRightColumn(String columnName){
        return getNumberOfColumn(columnName) + 1;

    }


}




