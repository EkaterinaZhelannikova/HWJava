//Дана строка sql-запроса "select * from students where ".
//Сформируйте часть WHERE этого запроса, используя StringBuilder.
//Данные приведены ниже в виде json строки.
//Если значение null, то параметр не должен попадать в запрос.
//Входная строка:
//{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
//Выходная строка:
//select * from students where name = "Ivanov" and country = "Russia" and city = "Moscow"

package Sem2;

import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) {
        Map<String, String> param = new HashMap<String, String>();
        param.put("name", "Ivanov");
        param.put("country", "Russia");
        param.put("city", "Moscow");
        param.put("age", null);
        System.out.println(getQuery(param));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder result = new StringBuilder();
        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getValue() != null) {
                result.append(pair.getKey() +" = '" + pair.getValue()+"' and ");
            }
        }
        result.delete(result.length() - 5, result.length());
        return result.toString();
    }
}
