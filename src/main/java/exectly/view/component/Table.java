package exectly.view.component;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Table {
    private List<String> columns;
    private List<List<String>> rows;

    public Table(List<Object> columns, List<List<Object>> rows) {
        this.columns = columns.stream()
                .map(col -> Objects.toString(col))
                .toList();
        this.rows = rows.stream()
                .map(
                        row -> row.stream()
                        .map(field -> Objects.toString(field))
                        .toList()
                )
                .toList();
    }

    public String getTable() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(createHeader());
        stringBuilder.append(createBody());
        return stringBuilder.toString();
    }

    private String createHeader() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(createRow(columns));
        return stringBuilder.toString();
    }

    private String createBody() {
        StringBuilder stringBuilder = new StringBuilder();
        rows.forEach(row -> stringBuilder.append(createRow(row)));
        return stringBuilder.toString();
    }

    private int getMaxWidth(int colIndex) {
        List<String> fieldNames = new ArrayList<>();
        fieldNames.add(columns.get(colIndex));
        fieldNames.addAll(rows.stream().map(row -> row.get(colIndex)).toList());
        return fieldNames.stream()
                .map(field -> field.length())
                .max(Comparator.comparingInt(i -> i))
                .get();
    }

    private String createRow(List<String> row) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("|");
        for (int i = 0; i < row.size(); i++) {
            stringBuilder.append(createField(row.get(i), getMaxWidth(i)));
            stringBuilder.append("|");
        }
        stringBuilder.append("\n");

        return stringBuilder.toString();
    }

    public String createField(String name, int maxWidth) {
        int blankSize = ((maxWidth - name.length()) / 2) + 2;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < blankSize; i++) {
            stringBuilder.append(" ");
        }
        stringBuilder.append(name);
        for (int i = 0; i < blankSize; i++) {
            stringBuilder.append(" ");
        }
        return stringBuilder.toString();
    }

}
