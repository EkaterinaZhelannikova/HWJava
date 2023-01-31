//Дана строка sql-запроса "select * from students where ".
//Сформируйте часть WHERE этого запроса, используя StringBuilder.
//Данные приведены ниже в виде json строки.
//Если значение null, то параметр не должен попадать в запрос.
//Входная строка:
//{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//Выходная строка:
//select * from students where name = "Ivanov" and country = "Russia" and city = "Moscow"

package Sem2;
import java.util.Objects;

public class task1 {
    public static final String sql = "select * from students where ";
    public static final String param = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} ";

    public static void main(String[] args) {
        String str = param.replace("{", "").replace("}", "").replace(" ", "");
        String[] new_str = str.split(",");
        StringBuilder str_bui = new StringBuilder(sql);
        for (int i = 0; i < new_str.length; ++i) {
            String[] el = new_str[i].split(":");
            if (!Objects.equals(el[1], "\"null\"")) {
                str_bui.append(el[0].replace("\"", "")).append(" = ").append(el[1]);
                if (i < new_str.length - 2) {
                    str_bui.append(" and ");
                }
            }
        }
        System.out.print(str_bui);
    }
}
