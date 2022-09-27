package javabasic.g_method;
    /*
        方法练习
     */
public class $2_MethodExercise {
        public static void main(String[] args) {
            // 静态初始化定义数组
            int[] array = {1, 3, 5, 7, 9, 4, 8, 2};
            // 调用方法遍历数组
            arrayPrint(array);
            // 调用方法求数组最大值
            System.out.println("数组最大值为: " + arrayMax(array));
            // 调用方法判断数字是否存在于数组
            System.out.println(arrayNumExist(7, array));
            // 调用方法复制数组
            arrayPrint(copyOfRange(array, 1, 3));
        }
        
        /* 数组遍历 */
        public static void arrayPrint (int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (i == array.length - 1) {
                    System.out.println(", " + array[i] + "}");
                } else if (i == 0) {
                    System.out.print("{" + array[i]);
                } else {
                    System.out.print(", " + array[i]);
                }
            }
        }
        
        /* 求最大值并返回数据 */
        public static int arrayMax (int[] array) {
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                max = max > array[i] ? max : array[i];
            }
            return max;
        }
        
        /* 判断数组中某一个数字是否存在, 并将结果返回调用处 */
        public static boolean arrayNumExist (int num, int[] array) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == num) {
                    System.out.println("数字存在");
                    return true;
                }
                }
            System.out.println("该数字不存在");
            return false;
        }
        
        /*
            复制数组:
                需求: 定义一个方法, copyOfRange(int[] array, int from, int to)
                      将数组中索引from(包含from)开始, 到索引to结束(不包含to)的元素赋值到新数组中
                      , 并将新数组返回
         */
        public static int[] copyOfRange(int[] array, int from, int to) {
            int[] arrayCopy = new int[to - from];
            int count = 0;
            for (int i = from; i < to; i++) {
                arrayCopy[count] = array[i];
                count++;
            }
            return arrayCopy;
        }
}
