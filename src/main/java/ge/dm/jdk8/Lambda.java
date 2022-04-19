package ge.dm.jdk8;

import java.util.ArrayList;
import java.util.List;

public class Lambda {

    private static List<Integer> intList = new ArrayList<>();

    public static void main(String[] args) {
        for (int i=0; i< 100; i++) {
            intList.add(i);
        }

        intList.stream().map(Integer::longValue);
        intList.stream().map(User::new);
    }


}

class User {
    User(Integer age) {

    }
}
