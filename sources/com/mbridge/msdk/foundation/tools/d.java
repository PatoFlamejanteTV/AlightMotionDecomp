package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes4.dex */
public class d {
    public static boolean a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            Resources resources = context.getResources();
            if (resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android")) <= 0) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            ad.a("DomainSameTool", th.getMessage(), th);
            return false;
        }
    }
}
