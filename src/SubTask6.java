public class SubTask6 {
    public static String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    final static double ALPHABET_COUNT = 26;
    public static void main(String[] args) {

    }
    private static int getNumberOfChar(char cha) {
        String upperCaseChar = String.valueOf(cha).
                trim()
                .toUpperCase();
        return alphabet.indexOf(upperCaseChar) + 1;
    }
    private static int getNumberOfColumn(String columnName) {

        int result = 0;

        double degree;

        if (!columnName.isEmpty()) {
            char[] inputCharArray = columnName.toCharArray();

            if (inputCharArray.length == 1) {
                result = getNumberOfChar(inputCharArray[0]);
            } else {
                degree = inputCharArray.length - 1;
                for(int i = 0; i < (inputCharArray.length - 1); i++)
                {
                    result += (getNumberOfChar(inputCharArray[i]) *  Math.pow(ALPHABET_COUNT, degree));
                    degree -= 1;
                }
                result += getNumberOfChar(inputCharArray[inputCharArray.length - 1]);
            }
        }
        return result;
    }

    private static String getStringNameOfColum(int numberOfColumn) {

        StringBuilder sb = new StringBuilder();
        while (numberOfColumn-- > 0) {
            sb.append(alphabet.charAt((int) (numberOfColumn % ALPHABET_COUNT)));
            numberOfColumn /= ALPHABET_COUNT;
        }
        return sb.reverse().toString();
    }

    private static int getNumberOfRightColumn(String columnName){
        return getNumberOfColumn(columnName) + 1;
    }

}



