class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        while (rowIndex > 0) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int i = 0; i < integers.size() - 1; i++) {
                temp.add(integers.get(i) + integers.get(i + 1));
            }
            temp.add(1);
            integers = temp;
            rowIndex--;
        }
        return integers;
    }

}