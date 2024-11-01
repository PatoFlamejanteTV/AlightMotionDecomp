package androidx.compose.foundation.text;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class TextFieldSize {
    private Density density;
    private FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection layoutDirection;
    private long minSize;
    private TextStyle resolvedStyle;
    private Object typeface;

    public TextFieldSize(LayoutDirection layoutDirection, Density density, FontFamily.Resolver fontFamilyResolver, TextStyle resolvedStyle, Object typeface) {
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(fontFamilyResolver, "fontFamilyResolver");
        AbstractC3292y.i(resolvedStyle, "resolvedStyle");
        AbstractC3292y.i(typeface, "typeface");
        this.layoutDirection = layoutDirection;
        this.density = density;
        this.fontFamilyResolver = fontFamilyResolver;
        this.resolvedStyle = resolvedStyle;
        this.typeface = typeface;
        this.minSize = m925computeMinSizeYbymL2g();
    }

    /* renamed from: computeMinSize-YbymL2g, reason: not valid java name */
    private final long m925computeMinSizeYbymL2g() {
        return TextFieldDelegateKt.computeSizeForDefaultText$default(this.resolvedStyle, this.density, this.fontFamilyResolver, null, 0, 24, null);
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    /* renamed from: getMinSize-YbymL2g, reason: not valid java name */
    public final long m926getMinSizeYbymL2g() {
        return this.minSize;
    }

    public final TextStyle getResolvedStyle() {
        return this.resolvedStyle;
    }

    public final Object getTypeface() {
        return this.typeface;
    }

    public final void setDensity(Density density) {
        AbstractC3292y.i(density, "<set-?>");
        this.density = density;
    }

    public final void setFontFamilyResolver(FontFamily.Resolver resolver) {
        AbstractC3292y.i(resolver, "<set-?>");
        this.fontFamilyResolver = resolver;
    }

    public final void setLayoutDirection(LayoutDirection layoutDirection) {
        AbstractC3292y.i(layoutDirection, "<set-?>");
        this.layoutDirection = layoutDirection;
    }

    public final void setResolvedStyle(TextStyle textStyle) {
        AbstractC3292y.i(textStyle, "<set-?>");
        this.resolvedStyle = textStyle;
    }

    public final void setTypeface(Object obj) {
        AbstractC3292y.i(obj, "<set-?>");
        this.typeface = obj;
    }

    public final void update(LayoutDirection layoutDirection, Density density, FontFamily.Resolver fontFamilyResolver, TextStyle resolvedStyle, Object typeface) {
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(fontFamilyResolver, "fontFamilyResolver");
        AbstractC3292y.i(resolvedStyle, "resolvedStyle");
        AbstractC3292y.i(typeface, "typeface");
        if (layoutDirection != this.layoutDirection || !AbstractC3292y.d(density, this.density) || !AbstractC3292y.d(fontFamilyResolver, this.fontFamilyResolver) || !AbstractC3292y.d(resolvedStyle, this.resolvedStyle) || !AbstractC3292y.d(typeface, this.typeface)) {
            this.layoutDirection = layoutDirection;
            this.density = density;
            this.fontFamilyResolver = fontFamilyResolver;
            this.resolvedStyle = resolvedStyle;
            this.typeface = typeface;
            this.minSize = m925computeMinSizeYbymL2g();
        }
    }
}
