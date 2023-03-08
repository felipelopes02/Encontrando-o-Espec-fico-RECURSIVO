public static boolean contains(int[] arr, int num) {
    if (arr.length == 0) {
        return false;
    }
    
    if (arr[0] == num) {
        return true;
    }
    
    int[] rest = Arrays.copyOfRange(arr, 1, arr.length);
    return contains(rest, num);
}
