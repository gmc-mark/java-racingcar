package race;

import org.junit.jupiter.api.*;

import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RaceTest {
    @Test
    void splitText() {
        final Race race = new Race();
    }

    @Test
    void validUserInputText() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, NoSuchFieldException {
        final Race race = new Race();
        String input = "abc,def";
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
        race.userInterfaceInput();
//        System.setOut(new PrintStream(new ByteArrayOutputStream()));

        final Field userInputText = race.getClass().getDeclaredField("userInputText");
        userInputText.setAccessible(true);
        assertThat((String)userInputText.get(race)).isEqualTo("abc,def");

//        final Method userInterfaceInput = race.getClass().getDeclaredMethod("userInterfaceInput");
//        userInterfaceInput.setAccessible(Boolean.TRUE);
//        userInterfaceInput.invoke(race);

    }
}