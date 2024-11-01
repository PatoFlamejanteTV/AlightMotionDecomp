package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AndroidFontResolveInterceptor implements PlatformResolveInterceptor {
    public static final int $stable = 0;
    private final int fontWeightAdjustment;

    public AndroidFontResolveInterceptor(int i8) {
        this.fontWeightAdjustment = i8;
    }

    private final int component1() {
        return this.fontWeightAdjustment;
    }

    public static /* synthetic */ AndroidFontResolveInterceptor copy$default(AndroidFontResolveInterceptor androidFontResolveInterceptor, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            i8 = androidFontResolveInterceptor.fontWeightAdjustment;
        }
        return androidFontResolveInterceptor.copy(i8);
    }

    public final AndroidFontResolveInterceptor copy(int i8) {
        return new AndroidFontResolveInterceptor(i8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AndroidFontResolveInterceptor) && this.fontWeightAdjustment == ((AndroidFontResolveInterceptor) obj).fontWeightAdjustment;
    }

    public int hashCode() {
        return this.fontWeightAdjustment;
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    public /* synthetic */ FontFamily interceptFontFamily(FontFamily fontFamily) {
        return c.a(this, fontFamily);
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    /* renamed from: interceptFontStyle-T2F_aPo, reason: not valid java name */
    public /* synthetic */ int mo4732interceptFontStyleT2F_aPo(int i8) {
        return c.b(this, i8);
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    /* renamed from: interceptFontSynthesis-Mscr08Y, reason: not valid java name */
    public /* synthetic */ int mo4733interceptFontSynthesisMscr08Y(int i8) {
        return c.c(this, i8);
    }

    @Override // androidx.compose.ui.text.font.PlatformResolveInterceptor
    public FontWeight interceptFontWeight(FontWeight fontWeight) {
        int i8 = this.fontWeightAdjustment;
        if (i8 != 0 && i8 != Integer.MAX_VALUE) {
            return new FontWeight(i6.m.k(fontWeight.getWeight() + this.fontWeightAdjustment, 1, 1000));
        }
        return fontWeight;
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.fontWeightAdjustment + ')';
    }
}
