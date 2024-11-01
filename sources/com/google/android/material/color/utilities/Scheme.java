package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class Scheme {
    private int background;
    private int error;
    private int errorContainer;
    private int inverseOnSurface;
    private int inversePrimary;
    private int inverseSurface;
    private int onBackground;
    private int onError;
    private int onErrorContainer;
    private int onPrimary;
    private int onPrimaryContainer;
    private int onSecondary;
    private int onSecondaryContainer;
    private int onSurface;
    private int onSurfaceVariant;
    private int onTertiary;
    private int onTertiaryContainer;
    private int outline;
    private int outlineVariant;
    private int primary;
    private int primaryContainer;
    private int scrim;
    private int secondary;
    private int secondaryContainer;
    private int shadow;
    private int surface;
    private int surfaceVariant;
    private int tertiary;
    private int tertiaryContainer;

    public Scheme() {
    }

    public static Scheme dark(int i8) {
        return darkFromCorePalette(CorePalette.of(i8));
    }

    public static Scheme darkContent(int i8) {
        return darkFromCorePalette(CorePalette.contentOf(i8));
    }

    private static Scheme darkFromCorePalette(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.f18253a1.tone(80)).withOnPrimary(corePalette.f18253a1.tone(20)).withPrimaryContainer(corePalette.f18253a1.tone(30)).withOnPrimaryContainer(corePalette.f18253a1.tone(90)).withSecondary(corePalette.f18254a2.tone(80)).withOnSecondary(corePalette.f18254a2.tone(20)).withSecondaryContainer(corePalette.f18254a2.tone(30)).withOnSecondaryContainer(corePalette.f18254a2.tone(90)).withTertiary(corePalette.f18255a3.tone(80)).withOnTertiary(corePalette.f18255a3.tone(20)).withTertiaryContainer(corePalette.f18255a3.tone(30)).withOnTertiaryContainer(corePalette.f18255a3.tone(90)).withError(corePalette.error.tone(80)).withOnError(corePalette.error.tone(20)).withErrorContainer(corePalette.error.tone(30)).withOnErrorContainer(corePalette.error.tone(80)).withBackground(corePalette.f18256n1.tone(10)).withOnBackground(corePalette.f18256n1.tone(90)).withSurface(corePalette.f18256n1.tone(10)).withOnSurface(corePalette.f18256n1.tone(90)).withSurfaceVariant(corePalette.f18257n2.tone(30)).withOnSurfaceVariant(corePalette.f18257n2.tone(80)).withOutline(corePalette.f18257n2.tone(60)).withOutlineVariant(corePalette.f18257n2.tone(30)).withShadow(corePalette.f18256n1.tone(0)).withScrim(corePalette.f18256n1.tone(0)).withInverseSurface(corePalette.f18256n1.tone(90)).withInverseOnSurface(corePalette.f18256n1.tone(20)).withInversePrimary(corePalette.f18253a1.tone(40));
    }

    public static Scheme light(int i8) {
        return lightFromCorePalette(CorePalette.of(i8));
    }

    public static Scheme lightContent(int i8) {
        return lightFromCorePalette(CorePalette.contentOf(i8));
    }

    private static Scheme lightFromCorePalette(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.f18253a1.tone(40)).withOnPrimary(corePalette.f18253a1.tone(100)).withPrimaryContainer(corePalette.f18253a1.tone(90)).withOnPrimaryContainer(corePalette.f18253a1.tone(10)).withSecondary(corePalette.f18254a2.tone(40)).withOnSecondary(corePalette.f18254a2.tone(100)).withSecondaryContainer(corePalette.f18254a2.tone(90)).withOnSecondaryContainer(corePalette.f18254a2.tone(10)).withTertiary(corePalette.f18255a3.tone(40)).withOnTertiary(corePalette.f18255a3.tone(100)).withTertiaryContainer(corePalette.f18255a3.tone(90)).withOnTertiaryContainer(corePalette.f18255a3.tone(10)).withError(corePalette.error.tone(40)).withOnError(corePalette.error.tone(100)).withErrorContainer(corePalette.error.tone(90)).withOnErrorContainer(corePalette.error.tone(10)).withBackground(corePalette.f18256n1.tone(99)).withOnBackground(corePalette.f18256n1.tone(10)).withSurface(corePalette.f18256n1.tone(99)).withOnSurface(corePalette.f18256n1.tone(10)).withSurfaceVariant(corePalette.f18257n2.tone(90)).withOnSurfaceVariant(corePalette.f18257n2.tone(30)).withOutline(corePalette.f18257n2.tone(50)).withOutlineVariant(corePalette.f18257n2.tone(80)).withShadow(corePalette.f18256n1.tone(0)).withScrim(corePalette.f18256n1.tone(0)).withInverseSurface(corePalette.f18256n1.tone(20)).withInverseOnSurface(corePalette.f18256n1.tone(95)).withInversePrimary(corePalette.f18253a1.tone(80));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scheme) || !super.equals(obj)) {
            return false;
        }
        Scheme scheme = (Scheme) obj;
        if (this.primary == scheme.primary && this.onPrimary == scheme.onPrimary && this.primaryContainer == scheme.primaryContainer && this.onPrimaryContainer == scheme.onPrimaryContainer && this.secondary == scheme.secondary && this.onSecondary == scheme.onSecondary && this.secondaryContainer == scheme.secondaryContainer && this.onSecondaryContainer == scheme.onSecondaryContainer && this.tertiary == scheme.tertiary && this.onTertiary == scheme.onTertiary && this.tertiaryContainer == scheme.tertiaryContainer && this.onTertiaryContainer == scheme.onTertiaryContainer && this.error == scheme.error && this.onError == scheme.onError && this.errorContainer == scheme.errorContainer && this.onErrorContainer == scheme.onErrorContainer && this.background == scheme.background && this.onBackground == scheme.onBackground && this.surface == scheme.surface && this.onSurface == scheme.onSurface && this.surfaceVariant == scheme.surfaceVariant && this.onSurfaceVariant == scheme.onSurfaceVariant && this.outline == scheme.outline && this.outlineVariant == scheme.outlineVariant && this.shadow == scheme.shadow && this.scrim == scheme.scrim && this.inverseSurface == scheme.inverseSurface && this.inverseOnSurface == scheme.inverseOnSurface && this.inversePrimary == scheme.inversePrimary) {
            return true;
        }
        return false;
    }

    public int getBackground() {
        return this.background;
    }

    public int getError() {
        return this.error;
    }

    public int getErrorContainer() {
        return this.errorContainer;
    }

    public int getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    public int getInversePrimary() {
        return this.inversePrimary;
    }

    public int getInverseSurface() {
        return this.inverseSurface;
    }

    public int getOnBackground() {
        return this.onBackground;
    }

    public int getOnError() {
        return this.onError;
    }

    public int getOnErrorContainer() {
        return this.onErrorContainer;
    }

    public int getOnPrimary() {
        return this.onPrimary;
    }

    public int getOnPrimaryContainer() {
        return this.onPrimaryContainer;
    }

    public int getOnSecondary() {
        return this.onSecondary;
    }

    public int getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    public int getOnSurface() {
        return this.onSurface;
    }

    public int getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    public int getOnTertiary() {
        return this.onTertiary;
    }

    public int getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    public int getOutline() {
        return this.outline;
    }

    public int getOutlineVariant() {
        return this.outlineVariant;
    }

    public int getPrimary() {
        return this.primary;
    }

    public int getPrimaryContainer() {
        return this.primaryContainer;
    }

    public int getScrim() {
        return this.scrim;
    }

    public int getSecondary() {
        return this.secondary;
    }

    public int getSecondaryContainer() {
        return this.secondaryContainer;
    }

    public int getShadow() {
        return this.shadow;
    }

    public int getSurface() {
        return this.surface;
    }

    public int getSurfaceVariant() {
        return this.surfaceVariant;
    }

    public int getTertiary() {
        return this.tertiary;
    }

    public int getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.primary) * 31) + this.onPrimary) * 31) + this.primaryContainer) * 31) + this.onPrimaryContainer) * 31) + this.secondary) * 31) + this.onSecondary) * 31) + this.secondaryContainer) * 31) + this.onSecondaryContainer) * 31) + this.tertiary) * 31) + this.onTertiary) * 31) + this.tertiaryContainer) * 31) + this.onTertiaryContainer) * 31) + this.error) * 31) + this.onError) * 31) + this.errorContainer) * 31) + this.onErrorContainer) * 31) + this.background) * 31) + this.onBackground) * 31) + this.surface) * 31) + this.onSurface) * 31) + this.surfaceVariant) * 31) + this.onSurfaceVariant) * 31) + this.outline) * 31) + this.outlineVariant) * 31) + this.shadow) * 31) + this.scrim) * 31) + this.inverseSurface) * 31) + this.inverseOnSurface) * 31) + this.inversePrimary;
    }

    public void setBackground(int i8) {
        this.background = i8;
    }

    public void setError(int i8) {
        this.error = i8;
    }

    public void setErrorContainer(int i8) {
        this.errorContainer = i8;
    }

    public void setInverseOnSurface(int i8) {
        this.inverseOnSurface = i8;
    }

    public void setInversePrimary(int i8) {
        this.inversePrimary = i8;
    }

    public void setInverseSurface(int i8) {
        this.inverseSurface = i8;
    }

    public void setOnBackground(int i8) {
        this.onBackground = i8;
    }

    public void setOnError(int i8) {
        this.onError = i8;
    }

    public void setOnErrorContainer(int i8) {
        this.onErrorContainer = i8;
    }

    public void setOnPrimary(int i8) {
        this.onPrimary = i8;
    }

    public void setOnPrimaryContainer(int i8) {
        this.onPrimaryContainer = i8;
    }

    public void setOnSecondary(int i8) {
        this.onSecondary = i8;
    }

    public void setOnSecondaryContainer(int i8) {
        this.onSecondaryContainer = i8;
    }

    public void setOnSurface(int i8) {
        this.onSurface = i8;
    }

    public void setOnSurfaceVariant(int i8) {
        this.onSurfaceVariant = i8;
    }

    public void setOnTertiary(int i8) {
        this.onTertiary = i8;
    }

    public void setOnTertiaryContainer(int i8) {
        this.onTertiaryContainer = i8;
    }

    public void setOutline(int i8) {
        this.outline = i8;
    }

    public void setOutlineVariant(int i8) {
        this.outlineVariant = i8;
    }

    public void setPrimary(int i8) {
        this.primary = i8;
    }

    public void setPrimaryContainer(int i8) {
        this.primaryContainer = i8;
    }

    public void setScrim(int i8) {
        this.scrim = i8;
    }

    public void setSecondary(int i8) {
        this.secondary = i8;
    }

    public void setSecondaryContainer(int i8) {
        this.secondaryContainer = i8;
    }

    public void setShadow(int i8) {
        this.shadow = i8;
    }

    public void setSurface(int i8) {
        this.surface = i8;
    }

    public void setSurfaceVariant(int i8) {
        this.surfaceVariant = i8;
    }

    public void setTertiary(int i8) {
        this.tertiary = i8;
    }

    public void setTertiaryContainer(int i8) {
        this.tertiaryContainer = i8;
    }

    public String toString() {
        return "Scheme{primary=" + this.primary + ", onPrimary=" + this.onPrimary + ", primaryContainer=" + this.primaryContainer + ", onPrimaryContainer=" + this.onPrimaryContainer + ", secondary=" + this.secondary + ", onSecondary=" + this.onSecondary + ", secondaryContainer=" + this.secondaryContainer + ", onSecondaryContainer=" + this.onSecondaryContainer + ", tertiary=" + this.tertiary + ", onTertiary=" + this.onTertiary + ", tertiaryContainer=" + this.tertiaryContainer + ", onTertiaryContainer=" + this.onTertiaryContainer + ", error=" + this.error + ", onError=" + this.onError + ", errorContainer=" + this.errorContainer + ", onErrorContainer=" + this.onErrorContainer + ", background=" + this.background + ", onBackground=" + this.onBackground + ", surface=" + this.surface + ", onSurface=" + this.onSurface + ", surfaceVariant=" + this.surfaceVariant + ", onSurfaceVariant=" + this.onSurfaceVariant + ", outline=" + this.outline + ", outlineVariant=" + this.outlineVariant + ", shadow=" + this.shadow + ", scrim=" + this.scrim + ", inverseSurface=" + this.inverseSurface + ", inverseOnSurface=" + this.inverseOnSurface + ", inversePrimary=" + this.inversePrimary + '}';
    }

    public Scheme withBackground(int i8) {
        this.background = i8;
        return this;
    }

    public Scheme withError(int i8) {
        this.error = i8;
        return this;
    }

    public Scheme withErrorContainer(int i8) {
        this.errorContainer = i8;
        return this;
    }

    public Scheme withInverseOnSurface(int i8) {
        this.inverseOnSurface = i8;
        return this;
    }

    public Scheme withInversePrimary(int i8) {
        this.inversePrimary = i8;
        return this;
    }

    public Scheme withInverseSurface(int i8) {
        this.inverseSurface = i8;
        return this;
    }

    public Scheme withOnBackground(int i8) {
        this.onBackground = i8;
        return this;
    }

    public Scheme withOnError(int i8) {
        this.onError = i8;
        return this;
    }

    public Scheme withOnErrorContainer(int i8) {
        this.onErrorContainer = i8;
        return this;
    }

    public Scheme withOnPrimary(int i8) {
        this.onPrimary = i8;
        return this;
    }

    public Scheme withOnPrimaryContainer(int i8) {
        this.onPrimaryContainer = i8;
        return this;
    }

    public Scheme withOnSecondary(int i8) {
        this.onSecondary = i8;
        return this;
    }

    public Scheme withOnSecondaryContainer(int i8) {
        this.onSecondaryContainer = i8;
        return this;
    }

    public Scheme withOnSurface(int i8) {
        this.onSurface = i8;
        return this;
    }

    public Scheme withOnSurfaceVariant(int i8) {
        this.onSurfaceVariant = i8;
        return this;
    }

    public Scheme withOnTertiary(int i8) {
        this.onTertiary = i8;
        return this;
    }

    public Scheme withOnTertiaryContainer(int i8) {
        this.onTertiaryContainer = i8;
        return this;
    }

    public Scheme withOutline(int i8) {
        this.outline = i8;
        return this;
    }

    public Scheme withOutlineVariant(int i8) {
        this.outlineVariant = i8;
        return this;
    }

    public Scheme withPrimary(int i8) {
        this.primary = i8;
        return this;
    }

    public Scheme withPrimaryContainer(int i8) {
        this.primaryContainer = i8;
        return this;
    }

    public Scheme withScrim(int i8) {
        this.scrim = i8;
        return this;
    }

    public Scheme withSecondary(int i8) {
        this.secondary = i8;
        return this;
    }

    public Scheme withSecondaryContainer(int i8) {
        this.secondaryContainer = i8;
        return this;
    }

    public Scheme withShadow(int i8) {
        this.shadow = i8;
        return this;
    }

    public Scheme withSurface(int i8) {
        this.surface = i8;
        return this;
    }

    public Scheme withSurfaceVariant(int i8) {
        this.surfaceVariant = i8;
        return this;
    }

    public Scheme withTertiary(int i8) {
        this.tertiary = i8;
        return this;
    }

    public Scheme withTertiaryContainer(int i8) {
        this.tertiaryContainer = i8;
        return this;
    }

    public Scheme(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36) {
        this.primary = i8;
        this.onPrimary = i9;
        this.primaryContainer = i10;
        this.onPrimaryContainer = i11;
        this.secondary = i12;
        this.onSecondary = i13;
        this.secondaryContainer = i14;
        this.onSecondaryContainer = i15;
        this.tertiary = i16;
        this.onTertiary = i17;
        this.tertiaryContainer = i18;
        this.onTertiaryContainer = i19;
        this.error = i20;
        this.onError = i21;
        this.errorContainer = i22;
        this.onErrorContainer = i23;
        this.background = i24;
        this.onBackground = i25;
        this.surface = i26;
        this.onSurface = i27;
        this.surfaceVariant = i28;
        this.onSurfaceVariant = i29;
        this.outline = i30;
        this.outlineVariant = i31;
        this.shadow = i32;
        this.scrim = i33;
        this.inverseSurface = i34;
        this.inverseOnSurface = i35;
        this.inversePrimary = i36;
    }
}
