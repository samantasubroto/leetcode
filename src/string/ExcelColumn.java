package string;

public class ExcelColumn {
    public static int excelColumnToNumber(String column) {
        int result = 0;
        for(int i=0;i<column.length(); i++) {
            char ch = column.charAt(i);
            int value = ch - 'A' + 1;
            result = result * 26 + value;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(excelColumnToNumber("AB"));
    }
}
