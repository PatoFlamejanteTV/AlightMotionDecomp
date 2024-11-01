package com.inmobi.cmp.data.model;

import androidx.annotation.FontRes;
import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Keep
/* loaded from: classes4.dex */
public final class ChoiceStyle {
    private Integer boldFont;
    private ChoiceColor darkModeColors;
    private ChoiceColor lightModeColors;
    private Integer regularFont;
    private ThemeMode themeMode;

    @Keep
    /* loaded from: classes4.dex */
    public static final class Builder {

        @FontRes
        private Integer boldFont;
        private ChoiceColor darkModeColors;
        private ChoiceColor lightModeColors;

        @FontRes
        private Integer regularFont;
        private ThemeMode themeMode;

        public final ChoiceStyle build() {
            return new ChoiceStyle(this.themeMode, this.lightModeColors, this.darkModeColors, this.boldFont, this.regularFont, null);
        }

        public final Builder setBoldFont(@FontRes int i8) {
            this.boldFont = Integer.valueOf(i8);
            return this;
        }

        public final Builder setDarkModeColors(ChoiceColor darkModeColors) {
            AbstractC3292y.i(darkModeColors, "darkModeColors");
            this.darkModeColors = darkModeColors;
            return this;
        }

        public final Builder setLightModeColors(ChoiceColor lightModeColors) {
            AbstractC3292y.i(lightModeColors, "lightModeColors");
            this.lightModeColors = lightModeColors;
            return this;
        }

        public final Builder setRegularFont(@FontRes int i8) {
            this.regularFont = Integer.valueOf(i8);
            return this;
        }

        public final Builder setThemeMode(ThemeMode themeMode) {
            AbstractC3292y.i(themeMode, "themeMode");
            this.themeMode = themeMode;
            return this;
        }
    }

    public /* synthetic */ ChoiceStyle(ThemeMode themeMode, ChoiceColor choiceColor, ChoiceColor choiceColor2, Integer num, Integer num2, AbstractC3284p abstractC3284p) {
        this(themeMode, choiceColor, choiceColor2, num, num2);
    }

    public final Integer getBoldFont() {
        return this.boldFont;
    }

    public final ChoiceColor getDarkModeColors() {
        return this.darkModeColors;
    }

    public final ChoiceColor getLightModeColors() {
        return this.lightModeColors;
    }

    public final Integer getRegularFont() {
        return this.regularFont;
    }

    public final ThemeMode getThemeMode() {
        return this.themeMode;
    }

    public final void setBoldFont(Integer num) {
        this.boldFont = num;
    }

    public final void setDarkModeColors(ChoiceColor choiceColor) {
        this.darkModeColors = choiceColor;
    }

    public final void setLightModeColors(ChoiceColor choiceColor) {
        this.lightModeColors = choiceColor;
    }

    public final void setRegularFont(Integer num) {
        this.regularFont = num;
    }

    public final void setThemeMode(ThemeMode themeMode) {
        this.themeMode = themeMode;
    }

    private ChoiceStyle(ThemeMode themeMode, ChoiceColor choiceColor, ChoiceColor choiceColor2, @FontRes Integer num, @FontRes Integer num2) {
        this.themeMode = themeMode;
        this.lightModeColors = choiceColor;
        this.darkModeColors = choiceColor2;
        this.boldFont = num;
        this.regularFont = num2;
    }

    public ChoiceStyle() {
        this(null, null, null, null, null);
    }
}
