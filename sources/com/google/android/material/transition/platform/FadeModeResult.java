package com.google.android.material.transition.platform;

import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes3.dex */
class FadeModeResult {
    final int endAlpha;
    final boolean endOnTop;
    final int startAlpha;

    private FadeModeResult(int i8, int i9, boolean z8) {
        this.startAlpha = i8;
        this.endAlpha = i9;
        this.endOnTop = z8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FadeModeResult endOnTop(int i8, int i9) {
        return new FadeModeResult(i8, i9, true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static FadeModeResult startOnTop(int i8, int i9) {
        return new FadeModeResult(i8, i9, false);
    }
}
