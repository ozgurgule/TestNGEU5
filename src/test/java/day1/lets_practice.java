package day1;

public class lets_practice {
    public static void main(String[] args) {
        shownumber(25, 45);

        int [] array = new int[]{10, 20, 30, 50};

        System.out.println("FİRST ARRAY İS = " + array[1]);

        for(int i = 0; i<array.length;i++){
            System.out.print(array[i]+ " , ");
            System.out.println();


        }


    }

    public static void shownumber(int i, int b) {
        int sum = i + b;
        System.out.println("SUM = " + sum);
    }
}
