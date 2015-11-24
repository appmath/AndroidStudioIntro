package com.android.ninja;

import android.os.Parcelable;

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
public class CodeGeneration {

    public void surroundWith() {
        // cmd + option + t
        System.out.println("Hello");


        // To unwrap/delete/undo: cmd + shift + delete
        System.out.println();
    }


    // Code generator: cmd + n
    // Code "fixer": option  +  enter
    static class CrucialInfoParcelable implements Parcelable {



        // Create fields by moving the cursor inside the parameter and clicking on option + enter + c (c as in create)
        public CrucialInfoParcelable(int age, String name) {
        }
    }


}

interface ImplementMe {
    /**
     * First thing
     * @param isLazy
     */
    void doOneThing(boolean isLazy);

    /**
     * Second thing
     * @param txt
     */
    void doAnotherThing(String txt);

    /**
     * Snoopy
     * @return
     */
    String whatsMyName();
}

class Implementer implements ImplementMe {
  // The hard way.
}

// Generate getters/setters/toString/equals...
class Model{

    String look = "right";
    String see = "left";
    String watch = "above";


}

