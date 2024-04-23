public class Utlproject_4 {
    public static void main(String[] args) {
        float[] floatArray = {34.456f, 5.456f, 12.456f, 48.456f};
        float min = floatArray[0];
        for (int i = 1; i < floatArray.length; i++) {
            if (floatArray[i] < min) {
                min = floatArray[i];
            }
        }
        System.out.println(min);

        float max = floatArray[0];
        for (int i = 1; i < floatArray.length; i++) {
            if (floatArray[i] > max) {
                max = floatArray[i];
            }
        }
        System.out.println(max);

        float sum = 0;
        for (int i = 0; i < floatArray.length; i++) {
            if (floatArray[i] > 0) {
                sum = sum + floatArray[i];
            }
        }
        System.out.println(sum);
    }
}