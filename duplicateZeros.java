public class duplicateZeros {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (j >= n) break;

            if (arr[i] == 0) {
                if (j < n) {
                    temp[j] = 0;
                    j++;
                }
                if (j < n) {
                    temp[j] = 0;
                }
            } else {
                temp[j] = arr[i];
            }
            j++;
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
