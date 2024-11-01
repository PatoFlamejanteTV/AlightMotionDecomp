package com.google.android.material.sidesheet;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
final class SheetUtils {
    private SheetUtils() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean isSwipeMostlyHorizontal(float f8, float f9) {
        if (Math.abs(f8) > Math.abs(f9)) {
            return true;
        }
        return false;
    }
}
