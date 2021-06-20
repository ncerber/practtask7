public class Separator {
    int[] array;

    public Separator(int[] array){
        this.array = array;
    }

    public int[] odd() {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) count++;
        }

        int[] oddArray = new int[count];
        int iter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                oddArray[iter++] = array[i];
            }
        }

        return oddArray;
    }

    public int[] even() {
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) count++;
        }

        int[] evenArray = new int[count];
        int iter = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] % 2 == 0) {
                evenArray[iter++] = array[i];
            }
        }

        return evenArray;
    }
}
