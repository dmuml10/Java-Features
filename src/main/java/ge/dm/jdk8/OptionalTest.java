package ge.dm.jdk8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {

    private void testOptional() {
        Optional<String> optional = Optional.empty();

        String str = "value";
        Optional<String> optional2 = Optional.of(str);

        Optional<String> optional3 = Optional.ofNullable(getString());

        List<String> listOpt = getList().orElseGet(ArrayList::new);
    }

    private String getString() {
        return "String";
    }

    private Optional<List<String>> getList() {
        return Optional.empty();
    }

}
