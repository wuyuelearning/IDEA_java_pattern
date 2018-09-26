package codequality;


import java.util.HashMap;

public class part1 {
    public static void main(String[] args) {

//        suggestion3();
//        suggestion5();
//        suggestion7();
//        fun1();
        int[][] array={{},{}};
        System.out.println(Find(7,array));
    }



    private static boolean Find(int target, int [][] array) {
        if(array.length==0 || (array.length!=0  && array[0].length==0)){
            return false;
        }
        int i_max =array.length-1;  // 行数-1
        int j_max=array[0].length-1;   // 列数-1
        int max = array[i_max][j_max];
        if(target > max || target <array[0][0]){
            return false;
        }

        int i=0;
        int j=j_max;

        while (target != array[i][j]){
            if(target > array[i][j]){
                if(i<i_max){
                    i=i+1;
                } else {
                    return false;
                }
            } else if(target < array[i][j]){
                if(j>0){
                    j=j-1;
                } else {
                    return false;
                }
            }
        }
        return true;
    }


    private static void fun1() {

        int[] s = {1, 2, 4, 2, 3, 3, 4, 5, 5, 1, 1};
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i : s) {
            if (!hashMap.containsKey(i)) {
                hashMap.put(i, 1);
            } else {
                int temp = hashMap.get(i);
                hashMap.put(i, temp + 1);
            }
        }

        String s2="asdfasdf";



        for (Integer key : hashMap.keySet()) {
            System.out.println("key:  " + key + "value: " + hashMap.get(key));
        }

    }

    private static void suggestion7() {
        int count = 0;
        int s = 0;
        for (int i = 0; i < 10; i++) {
            s = count++;
            print("s:" + s);
            print("" + count);
        }
        print("out s " + s);
        print("out  " + count);
    }

    private static void print(String s) {
        System.out.println(s);
    }

    private static void suggestion3() {
        int i = 90;
        String s1 = String.valueOf(i < 100 ? 90 : 100);
        String s2 = String.valueOf(i < 100 ? 90 : 100.0);

        System.out.println("" + s1);
        System.out.println("" + s2);
        System.out.println("" + s1.equals(s2));
    }

    private static void suggestion5() {
        Client client = new Client();
        client.methodA("china", 0);
        client.methodA("china", "people");
        String s1 = null;
        Integer i = null;
        client.methodA("china", i);
        client.methodA("china", s1);
    }
}

class Client {
    public void methodA(String str, Integer... is) {

    }


    public void methodA(String str, String... is) {

    }

}