package com.example.bukola_omotoso.jifyymovies.Model;

import android.support.v4.app.Fragment;

/**
 * Created by bukola_omotoso on 15/03/16.
 */
public class Utilities {

    private static Fragment currentFragment;

    public static Fragment getCurrentFragment() {
        return currentFragment;
    }

    public static void setCurrentFragment(Fragment currentFragment) {
        Utilities.currentFragment = currentFragment;
    }
}
