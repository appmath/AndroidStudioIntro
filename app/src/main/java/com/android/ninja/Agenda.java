package com.android.ninja;

/**
 * Description
 * <p/>
 * Google field naming convention:
 * Non-public, non-static field names start with m.
 * Static field names start with s.
 * Other fields start with a lower case letter.
 * Public static final fields (constants) are ALL_CAPS_WITH_UNDERSCORES.
 *
 * @author Aziz Kadhi
 */
public class Agenda {

    public void flow() {
        Object[] obs = {
            // Jetbrains/Intellij IDEA history
            new FirstSteps(),
            new Debugger(), // Erik S mentioned having worked with a seasoned developer who uses sysout to debug.
            new KeymapAndShortcuts(),
            new CodeGeneration(),
            new PostFix(new MainActivity(), 0),
            new LiveTemplate(),
            new LanguageInjection()


        };
    }
}
