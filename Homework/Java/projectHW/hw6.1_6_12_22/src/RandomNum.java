public class RandomNum {


    public int[] randomNum() {
        int[] array;
        array = new int[5];
        System.out.println("random numbers output:");

        for (int i = 0; i < array.length; i++) {
            {
                array[i] = (int)(Math.random() * 5) ;
            }
            System.out.print(array[i] + " ");
        }
        return array;
    }

}

