package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class DislikeAnalyzer {
    private DislikeAnalyzer() {
        throw new UnsupportedOperationException();
    }

    public static Hct fixIfDisliked(Hct hct) {
        if (isDisliked(hct)) {
            return Hct.from(hct.getHue(), hct.getChroma(), 70.0d);
        }
        return hct;
    }

    public static boolean isDisliked(Hct hct) {
        boolean z8;
        boolean z9;
        boolean z10;
        if (Math.round(hct.getHue()) >= 90.0d && Math.round(hct.getHue()) <= 111.0d) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (Math.round(hct.getChroma()) > 16.0d) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (Math.round(hct.getTone()) < 65.0d) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z8 || !z9 || !z10) {
            return false;
        }
        return true;
    }
}
