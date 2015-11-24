package com.android.ninja;

import android.media.Image;
import android.os.Parcelable;
import android.util.Log;
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
public class LiveTemplate {
    private static final String LOG_TAG = LiveTemplate.class.getSimpleName();


    // Create constants: psfx

    // Create method

    // Logging
    public void logging() {
    }


    // Show xml example

    // Android-specific templates
    public void androidSpecificTemplates() {
        // gone/visible: new ImageView(new MainActivity())


        int[] nums = {1, 2, 3};

    }

    // Start an activity: start


    // Use Parcelable template.
    class Model implements Parcelable {


        String look = "right";
        String see = "left";
        String watch = "above";

        // Parcelable

    }
}
