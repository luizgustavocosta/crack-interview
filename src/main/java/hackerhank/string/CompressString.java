package hackerhank.string;

public class CompressString {

    public static void main(String[] args) {
        String value = "AAABCCDDEEFFGA";
        String expected = "A3BC2D2E2F2GA";
        String extracted = extract(value);
        System.out.println(extracted);
        System.out.println(extract("aabcc"));
        System.out.println(compressByCCE("aabcc"));

    }

    private static String compressByCCE(String value) {
        int count = 0;
        char previousChar = value.charAt(1);
        char[] valueAsArray = value.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char letter : valueAsArray) {
            if (letter == previousChar) {
                count++;
            } else {
                builder.append(count).append(previousChar);
                previousChar = letter;
                count = 1;
            }
        }
        builder.append(count).append(previousChar);
        return builder.toString();
    }

    private static String extract(String value) {
        int count = 0;
        char previousChar = 0;
        char[] inputChars = value.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char inputChar : inputChars) {
            if (inputChar == previousChar) {
                count++;
            } else {
                if (previousChar != 0) {
                    builder.append(previousChar).append(count);
                }
                previousChar = inputChar;
                count = 1;
            }
        }
        return builder.append(previousChar).append(count).toString();
    }
}
