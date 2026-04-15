package ex2.view.component;
import java.io.PipedReader;
import java.util.*;


public class Table {
    private List<String> columns;
    private List<List<String>> rows;

    public Table(List<String> columns, List<List<Object>> rows) {
        this.columns = columns.stream().map(col -> Objects.toString(col)).toList();
        this.rows = rows.stream().map(row -> row.stream()
                        .map(field -> Objects.toString(field))
                        .toList()
        )
                .toList();

    }

    public  String getTable() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(createHeader());
        stringBuilder.append(createBody());
        return stringBuilder.toString();
    }
    private String createHeader() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(createRow(columns));
        columns.forEach(col -> {

        });
        return stringBuilder.toString();
    }
    private String createBody() {
        StringBuilder stringBuilder = new StringBuilder();
        rows.forEach(row -> stringBuilder.append(createRow(row)));//한 행식 넣는것
        return stringBuilder.toString();
    }
    private int getMaxWidth(int colIdex) {
        List<String> fieldNames = new ArrayList<>();
        fieldNames.add(columns.get(colIdex));
        fieldNames.addAll(rows.stream().map(row -> row.get(colIdex)).toList());
        return fieldNames.stream()
                .map(field -> field.length())
                .max(Comparator.comparingInt(i -> i))
                .get();
    }

    private String createRow(List<String> row) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("|");
        for ( int i = 0; i< row.size(); i++) {
            stringBuilder.append(createField(row.get(i), getMaxWidth(i)));
            stringBuilder.append("|");//why for문 밖이 아닌걸까
        }

        stringBuilder.append(" ");
        return stringBuilder.toString();
    }

    private String createField(String name, int maxWidth) {
        int blankSzie = maxWidth - name.length() / 2 + 2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\t");
        for (int i =0; i < blankSzie; i++) {
         stringBuilder.append(" ");

        }
        stringBuilder.append(name);
        for (int i =0; i < blankSzie; i++) {
            stringBuilder.append(" ");

        }
        return stringBuilder.toString();
    }
}
