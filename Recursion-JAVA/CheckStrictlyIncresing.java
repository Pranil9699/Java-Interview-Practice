class CheckStrictlyIncresing{
    public static boolean toSorted(int[] arr, int idex) {
        if (idex == arr.length - 1)
            return true;

        // if(arr[idex] < arr[idex+1]){
        // check the Array is sorted
        // return toSorted(arr, idex+1);
        // }
        // else{
        // return false;
        // }

        if (arr[idex] >= arr[idex + 1]) {
            // checking the array is Unsorted
            return false;
        }
        return toSorted(arr, idex + 1);
    }

    public static void main(String[] args) {
        int[] Array = { 1, 2, 2, 34, 89, 98 };
        System.out.println(toSorted(Array, 0));
    }
}
