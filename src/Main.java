public class Main {
    public static void main(String[] args){
        //part 1
        int[] heights = new int[3];
        System.out.println(heights[0]);
        System.out.println(heights[1]);
        System.out.println(heights[2]);

        heights[0] = 78;
        heights[1] = 72;
        heights[2] = 69;
        System.out.println(heights[0]);
        System.out.println(heights[1]);
        System.out.println(heights[2]);

        //part 2
        boolean[] bools = {true, false, true, false, true, false};

        bools[0] = false;
        System.out.println(bools.length);
        System.out.println(bools[0]);
        System.out.println(bools[5]);

        //part 3
        String[] alphabeticalNames = {"Abby", "David", "Charlie", "Lauren"};

        String temp = alphabeticalNames[1];
        alphabeticalNames[1] = alphabeticalNames[2];
        alphabeticalNames[2] = temp;

        System.out.println(alphabeticalNames[0]);
        System.out.println(alphabeticalNames[1]);
        System.out.println(alphabeticalNames[2]);
        System.out.println(alphabeticalNames[3]);

        //part 4
        double[] array1 = {7.5, 10.0};
        double[] array2 = {8.2, 14.8};
        double[] array3 = {(array1[0] + array2[0]), (array1[1] * array2[1])};

        System.out.println(array3[0]);
        System.out.println(array3[1]);

        //part 5
        String[] animals = new String[4];
        System.out.println(animals[0]);
        System.out.println(animals[1]);
        System.out.println(animals[2]);
        System.out.println(animals[3]);

        animals[0] = "dog";
        animals[1] = "camel";
        animals[2] = "aardvark";
        animals[3] = "bunny";

        System.out.println(animals[0]);
        System.out.println(animals[1]);
        System.out.println(animals[2]);
        System.out.println(animals[3]);

        //part 6
        Dog dog1 = new Dog("Sparky", 4);
        Dog dog2 = new Dog("Toby", 7);
        Dog dog3 = new Dog("Fiona", 12);

        Dog[] dogs = {dog1, dog2, dog3};
        System.out.println(dogs[0].getName());
        System.out.println(dogs[1].getName());
        System.out.println(dogs[2].getName());

        //part 7
        int[] ints1 = {2, 4, 6, 8, 10};
        int[] ints2 = ints1;
        ints2[3] = 15;
        System.out.println(ints1[3]);
        System.out.println(ints2[3]);

        //part 8
        String[] myStrs = {"hi", "bye", "what", "purple"};
        int arrLen = myStrs.length;
        int strLen = myStrs[3].length();
        System.out.println(arrLen + strLen);

        String str = myStrs[2].substring(1, 3);
        System.out.println(str);

    }
}
