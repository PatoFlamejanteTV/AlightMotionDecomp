package com.mbridge.msdk.foundation.tools;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* loaded from: classes4.dex */
public final class ar {
    public static void a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }
}
