package com.android.ninja;

/**
 * This is a somewhat interactive presentation. Just navigate to each constructor and follow the directions.
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

            // To navigate to the class, cmd + click on the constructor/class/method...
            new FirstSteps(),
            new KeymapAndShortcuts(),
            new Debugger(), // Erik S mentioned having worked with a seasoned developer who uses sysout to debug.
            new CodeGeneration(),
            new PluginButterKnifeFragment(),
            new PostFix(new MainActivity(), 0),
            new LiveTemplate(),
            new LanguageInjection()
        };
    }
}
