package lesson2;

import java.util.Arrays;
public class ArraysLesson {
    public static void main(String[] args) {
        // Объявление переменной массива
        int[] someArr;
//        int someArr[]; C-style
        someArr = new int[7];
        System.out.println(Arrays.toString(someArr));

        int[] someArr2 = {37, 48, 125, 983, -23, 0, -112};
        System.out.println(Arrays.toString(someArr2));

//       размер массива нельзя изменить, но можно узнать
        System.out.println(someArr.length); // 7
        System.out.println(someArr2.length); // 7

        // доступ к элементам массива
        System.out.println(someArr2[4]); // -23
        System.out.println(someArr2[1+2]); // 983

        System.out.println(someArr2[1] + someArr2[6]);
//        System.out.println(someArr2[123]); // ArrayIndexOutOfBoundsException

        someArr[2] = 456;
        System.out.println(Arrays.toString(someArr));

        someArr = new int[23];
        someArr2 = new int[]{23, 1, -10, 5};

        for (int i = 0; i < someArr2.length; i++) {
            someArr2[i] *= 2;
        }
        System.out.println(Arrays.toString(someArr2));


        someArr2 = new int[]{23, 1, -10, 5};

        for (int elem: someArr2){
            elem *= 2;
            System.out.println(elem);
        }
        System.out.println(Arrays.toString(someArr2));

        // копирование массивов
        someArr2 = new int[]{23, 1, -10, 5};
//        int[] arr = someArr2; - создание ссылки на существующий объект

        int[] cloneArr = someArr2.clone();


        someArr2 = new int[]{23, 1, -10, 5};
        someArr = new int[15];

        System.arraycopy(someArr2, 0, someArr, 3, 2);
        System.out.println(Arrays.toString(someArr));

        int[] copyArr = Arrays.copyOf(someArr2, 3);
        System.out.println(Arrays.toString(copyArr));

        // сравнение массивов
        someArr2 = new int[]{23, 1, -10, 5};
        someArr = new int[]{23, 1, -10, 5};

//        someArr == someArr2
//        someArr.equals(someArr2)
        System.out.println(Arrays.equals(someArr, someArr2));



        someArr = new int[]{12, -10, 123, 6};
        someArr2 = new int[]{23, 1, -10, 5};
        int[] resultArr = new int[someArr.length];

        for (int i = 0; i < someArr.length; i++) {
            resultArr[i] = someArr[i] + someArr2[i];
        }
        System.out.println(Arrays.toString(resultArr));

        // сортировка массива
        someArr = new int[]{12, -10, 123, 6};
        Arrays.sort(someArr); // Arrays.sort(arr, 1, 5);
        System.out.println(Arrays.toString(someArr));
        // алгоритм быстрой сортировки, сложность O(n log n)

        // поск в массиве.  бинарный поиск сложность O(log n)
        someArr = new int[]{-10, 6, 12, 123};
        System.out.println(Arrays.binarySearch(someArr, -10)); // 0
        System.out.println(Arrays.binarySearch(someArr, 15)); // -4

        int[][] newArr = new int[3][4];
        System.out.println(Arrays.deepToString(newArr));

        int[][] newArr2 = { {1, 2, 3}, {4, 5}, {7} };
        System.out.println(Arrays.deepToString(newArr2));
        System.out.println(newArr2[0][2]); // 3
        System.out.println(newArr2[1][1]); // 5

        for (int i = 0; i < newArr2.length; i++) {
//            newArr[0] - {1, 2, 3}
//            newArr[1] - {4, 5}
//            newArr[2] - {7}
            for (int j = 0; j < newArr2[i].length; j++) {
                newArr2[i][j] *= newArr2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(newArr2));
    }
}

//  VCS -> Share project on Github -> login, password