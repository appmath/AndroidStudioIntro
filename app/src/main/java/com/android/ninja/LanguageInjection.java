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
public class LanguageInjection {
    // Inject language: alt + enter then select Inject language or reference
    // Then invoke the fragment editor: alt + enter then select Edit JSON Fragment
    String jsonStr = "";

    // ^5[1-5][0-9]{5,}$
    String visaRegex = "";
}
