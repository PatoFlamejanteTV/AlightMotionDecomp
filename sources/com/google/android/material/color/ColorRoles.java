package com.google.android.material.color;

import androidx.annotation.ColorInt;

/* loaded from: classes3.dex */
public final class ColorRoles {
    private final int accent;
    private final int accentContainer;
    private final int onAccent;
    private final int onAccentContainer;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorRoles(@ColorInt int i8, @ColorInt int i9, @ColorInt int i10, @ColorInt int i11) {
        this.accent = i8;
        this.onAccent = i9;
        this.accentContainer = i10;
        this.onAccentContainer = i11;
    }

    @ColorInt
    public int getAccent() {
        return this.accent;
    }

    @ColorInt
    public int getAccentContainer() {
        return this.accentContainer;
    }

    @ColorInt
    public int getOnAccent() {
        return this.onAccent;
    }

    @ColorInt
    public int getOnAccentContainer() {
        return this.onAccentContainer;
    }
}
