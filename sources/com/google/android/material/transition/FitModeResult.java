package com.google.android.material.transition;

/* loaded from: classes3.dex */
class FitModeResult {
    final float currentEndHeight;
    final float currentEndWidth;
    final float currentStartHeight;
    final float currentStartWidth;
    final float endScale;
    final float startScale;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FitModeResult(float f8, float f9, float f10, float f11, float f12, float f13) {
        this.startScale = f8;
        this.endScale = f9;
        this.currentStartWidth = f10;
        this.currentStartHeight = f11;
        this.currentEndWidth = f12;
        this.currentEndHeight = f13;
    }
}
