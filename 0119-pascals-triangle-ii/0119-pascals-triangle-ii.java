class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<>();
        if (rowIndex == 0) result.add(1);
        if (rowIndex >= 1) result.add(1);

        for (int row = 1; row <= rowIndex; row++) {
            List<Integer> list = new ArrayList<>(Arrays.asList(1, 1));
            List<Integer> lastRow = result;
            int end = row - 1;
            for (int i = 1; i <= end; i++) {
                list.add(i, lastRow.get(i) + lastRow.get(i - 1));
            }
            result = list;
        }
        return result;
    }
}