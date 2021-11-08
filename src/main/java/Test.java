import service.SimpleList;
import service.impl.SimpleListImpl;

public class Test {

    public static void main (String[] args) throws Exception {
        String str1 = "первый";
        String str2 = "второй";
        String str3 = "третий";
        String str4 = "четвёртый";
        String str5 = "пятый";
        String str6 = "шестой";
        SimpleList<String> listString = new SimpleListImpl<String>();

        listString.add(str1);
        listString.add(str2);
        listString.add(str3);
        listString.add(str4);
        listString.add(str5);
        listString.add(str6);
        listString.add(str5);
        listString.add(str4);
        listString.add(str3);
        listString.add(str2);
        listString.add(str1);
        System.out.print(listString.size());

        listString.remove(5);
        listString.remove(7);
        listString.remove(720);

        listString.insert(1000, str1);

        listString.size();

    }
}
