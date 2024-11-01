package com.google.android.material.color;

import androidx.annotation.NonNull;
import androidx.annotation.StyleRes;

/* loaded from: classes3.dex */
public class ColorContrastOptions {

    @StyleRes
    private final int highContrastThemeOverlayResourceId;

    @StyleRes
    private final int mediumContrastThemeOverlayResourceId;

    /* loaded from: classes3.dex */
    public static class Builder {

        @StyleRes
        private int highContrastThemeOverlayResourceId;

        @StyleRes
        private int mediumContrastThemeOverlayResourceId;

        @NonNull
        public ColorContrastOptions build() {
            return new ColorContrastOptions(this);
        }

        @NonNull
        public Builder setHighContrastThemeOverlay(@StyleRes int i8) {
            this.highContrastThemeOverlayResourceId = i8;
            return this;
        }

        @NonNull
        public Builder setMediumContrastThemeOverlay(@StyleRes int i8) {
            this.mediumContrastThemeOverlayResourceId = i8;
            return this;
        }
    }

    @StyleRes
    public int getHighContrastThemeOverlay() {
        return this.highContrastThemeOverlayResourceId;
    }

    @StyleRes
    public int getMediumContrastThemeOverlay() {
        return this.mediumContrastThemeOverlayResourceId;
    }

    private ColorContrastOptions(Builder builder) {
        this.mediumContrastThemeOverlayResourceId = builder.mediumContrastThemeOverlayResourceId;
        this.highContrastThemeOverlayResourceId = builder.highContrastThemeOverlayResourceId;
    }
}
