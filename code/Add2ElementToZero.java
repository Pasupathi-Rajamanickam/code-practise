 public static void main(String... s) {
        int[] array = new int[] { -15, -14, -13, -2, -1, 2, 3, 4, 5, 6, 12, 43, 53, 66 };

        int start = 0, end = array.length - 1, positiveStart = -1;
        while (true) {
            if (array[start] > 0) {
                positiveStart = start;
                break;
            }
            int pivot = start + ((end - start) / 2);
            if (array[pivot] < 0) {
                start = pivot + 1; //
                end = start + pivot;
            } else {
                start = 0;
                end = pivot;
            }
        }
        boolean found = false;
        for (int i = 0; i < positiveStart - 1; i++) {
            for (int j = positiveStart; j < array.length; j++) {
                int total = array[i] + array[j];
                if (total == 0) {
                    found = true;
                    System.out.println(i + " " + j);
                    break;
                } else if (total > 0) {
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        System.out.println(found);

    }
