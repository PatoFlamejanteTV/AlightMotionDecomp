package com.google.android.material.color;

import android.os.Build;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class i {
    public static ColorResourcesOverride a() {
        int i8 = Build.VERSION.SDK_INT;
        if (30 <= i8 && i8 <= 33) {
            return ResourcesLoaderColorResourcesOverride.getInstance();
        }
        if (i8 >= 34) {
            return ResourcesLoaderColorResourcesOverride.getInstance();
        }
        return null;
    }
}
