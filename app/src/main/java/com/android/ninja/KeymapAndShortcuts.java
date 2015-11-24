package com.android.ninja;


import android.widget.ImageView;

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
public class KeymapAndShortcuts {
    String nameIsAName;

    // IntelliJ was designed to be used 100% without a mouse (and no need for tabs!)

    // The MOST important shortcut: find the shortcut associated with an action
    // CMD + SHIFT + A

    // Reformat code: cmd + option + l
    // Optimize imports: ctrl + option + o

    public void updateYourKeymap() {
        // Settings -> Keymap -> right click on a entry and select: Add Keyboard Shortcut
    }

    public void codeKatas( ) {
        // Quick doc: fn + F1
        // Parameter info: cmd + p
        new ImageView(new MainActivity()).getBaseline();

        // Smart type completion: ctrl + space
        StringBuilder builder = new ;

        // Complete current statement: cmd + shift + enter
        if (builder == null)

        // Hippie completion: option + /
        String someLongNameStr;
        String s;
        String so;


    }

    public void navigation() {

        // Move back/forward: cmd + [/]
        // Show/hide Project/Structure/x: cmd + 1/cmd + 7/cmd + x
        // Split editor vertically

        // Alternative to using "Structure" navigation pane: fn + cmd + F12
        // Open file/folder in Finder: fn + option + cmd + F12

        // Recent files: cmd + e
        // Recent edited files: cmd + shift + e

        // Bookmarks
        // Create bookmark: ctrl + shift + x where x = [0-9]
        // Go to bookmark: ctrl + [0-9]
        // New basic: fn + F3
        // Show all bookmarks: cmd + fn + F3

        // A favorite of mine...Go to next highlighted error
        // fn + F2

        refactorValue();
    }

    public static void moveMe() {
        // The F6 family of crucial refactorings:
        // 1) Rename: cmd + shift + F6
        // 3) Change method signature: cmd + fn + F6
        // 2) Move: fn + F6
    }


    public void refactorValue() {
        // cmd + option + v, f, c, or p
        // 1) var: v
        // 2) field: f
        // 3) constant: c
        // 4) parameter: p
        // Use the value below to create a var, field, constant and parameter;
         100;
    }

    public void textEditing() {
        // Clipboard history: cmd + shift + v
        // Paste simple (very convenient when you copying text from an external source): cmd + option + shift + v

        // Expand (shrink) selection: cmd + w  (cmd + shift + w)
        String aziz = "scooter fan/boy";
        int[] horsepower = {10, 20, 30, 40, 50};
        for (int hp : horsepower) {
            System.out.println(hp);
        }
        // cmd + d (duplicate)
        String replicateMe = null;

        // cmd + y or cmd + backspace
        String deleteMe;

        // cmd + shift + arrow up/down
        String moveMeUpOrDown;

        // cmd + shift + u
        String toggleCase;

        // ctrl + shift + j  (join)
        String joinMe = "You say I am crazy " +
            "Cause you don't think I know what you have done";
    }

    public void textNavigation() {
        // Move caret from start to end of the statement (and vice versa): cmd + arrow
        String moveCaretToStartEnd = "She has a new album, I really like her voice";

        // Move caret between camel hump words: option + arrow
        String moveCaretBetweenCamelHumps = "theSpeedOfLightCannotBeAchievedByASolidObject";

        // Select camel hump chunks: option + shift + arrow (vs cmd + shift + arrow)
        String selectCamelHumps = "theSpeedOfLightCannotBeAchievedByASolidObject";

    }


    // I hated how everyone else was describing how to achieve something so simple.
    public void advancedTextEditing() {
        // Sublime style code editing.

        // Multi-cursor selection: alt + shift + mouse
        // Multi-edit: select the target (word), cmd + CTRL + g
        int moveMouseRight;
        int moveMouseLeft;
        int moveMouseUp;
        int moveMouseDown;

        // Column selection mode: cmd + shift + 8
    }

    private int findMe;
}
