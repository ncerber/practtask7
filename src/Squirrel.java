import java.util.Arrays;

public class Squirrel {
    private final int[] nuts;

    public Squirrel(int[] nuts) {
        this.nuts = nuts;
        //System.out.println("");
        System.out.println(Arrays.toString(nuts));
    }

    public int getNuts(int index) {
        return nuts[index];
    }

    private int getFirstIndex() {
        int firstIndex = 0;
        if (nuts[0] < 0) {
            if(nuts.length<2) return 0;
            if (nuts[1] >= nuts[0]) firstIndex = 1;
        }
        return firstIndex;
    }

    public int maxNuts() {
        int iter = getFirstIndex();
        int nutsSum = 0;
        boolean isJump;
        while (iter < nuts.length) {
            nutsSum += nuts[iter];
            if (nutsSum<0) nutsSum = 0;
            isJump =false;
            if ((iter + 1) < nuts.length) {
                if(nuts[iter + 1] < 0){
                    if((iter + 2) < nuts.length){
                       if(nuts[iter + 1] <= nuts[iter + 2]){
                           isJump=true;
                       }
                    }
                }
            }

            if ((iter + 2) == nuts.length){
                if(nuts[iter+1]<0) break;
            }

            if(isJump){
                iter+=2;
            } else {
                iter++;
            }

        }
        return nutsSum;
    }

    int maxNuts2() {
        if (nuts.length > 1) {
            int arr[] = nuts.clone(); // создаем дублирующий массив
            // куда лучше прыгать на первый, а потом на второй или сразу
            //на второй пенек
            arr[1] = max(arr[1], arr[0] + arr[1]);

            // мы поняли как лучше прыгнуть на первые 2 пенька, теперь
            //разбираемся с остальными
            for (int i = 2; i < arr.length; i++) {
                // как лучше прыгнуть перепрыгнуть предыдущий пенек или
                //нет
                arr[i] = max(arr[i] + arr[i - 1], arr[i] + arr[i - 2]);
            }

            // таким образом мы проходим все элементы массив, кроме
            //последних двух
            // ведь последний элемент может быть отрицательным и возможно
            //туда
            // прыгать было не нужно (наш for просто проверяет все
            //элементы, в том числе
            // и последний), поэтому осталось сравнить 2 последних
            //элемента, как мы сравнивали
            // два первых и возвратить данное значение и проверить, что
            //оно больше 0
            int a = max(arr[arr.length - 2], arr[arr.length - 1]);
            return max(0, a);
        } else return max(0, nuts[0]); // если массив длинной 1, то мы
        //проверяем, надо ли вообще
        //прыгать на пенек, если он кривой, то вернем 0 орехов, а если
        //там есть орехи, то вернем их.
    }

    private int max(int a, int b) { // метод нахождения максимума
        if (a >= b) return a;
        return b;
    }
}
