package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextLayoutInput {
    public static final int $stable = 8;
    private Font.ResourceLoader _developerSuppliedResourceLoader;
    private final long constraints;
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private final LayoutDirection layoutDirection;
    private final int maxLines;
    private final int overflow;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i8, boolean z8, int i9, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j8, AbstractC3284p abstractC3284p) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) list, i8, z8, i9, density, layoutDirection, resourceLoader, j8);
    }

    /* renamed from: copy-hu-1Yfo$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutInput m4635copyhu1Yfo$default(TextLayoutInput textLayoutInput, AnnotatedString annotatedString, TextStyle textStyle, List list, int i8, boolean z8, int i9, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j8, int i10, Object obj) {
        AnnotatedString annotatedString2;
        TextStyle textStyle2;
        List list2;
        int i11;
        boolean z9;
        int i12;
        Density density2;
        LayoutDirection layoutDirection2;
        Font.ResourceLoader resourceLoader2;
        long j9;
        if ((i10 & 1) != 0) {
            annotatedString2 = textLayoutInput.text;
        } else {
            annotatedString2 = annotatedString;
        }
        if ((i10 & 2) != 0) {
            textStyle2 = textLayoutInput.style;
        } else {
            textStyle2 = textStyle;
        }
        if ((i10 & 4) != 0) {
            list2 = textLayoutInput.placeholders;
        } else {
            list2 = list;
        }
        if ((i10 & 8) != 0) {
            i11 = textLayoutInput.maxLines;
        } else {
            i11 = i8;
        }
        if ((i10 & 16) != 0) {
            z9 = textLayoutInput.softWrap;
        } else {
            z9 = z8;
        }
        if ((i10 & 32) != 0) {
            i12 = textLayoutInput.overflow;
        } else {
            i12 = i9;
        }
        if ((i10 & 64) != 0) {
            density2 = textLayoutInput.density;
        } else {
            density2 = density;
        }
        if ((i10 & 128) != 0) {
            layoutDirection2 = textLayoutInput.layoutDirection;
        } else {
            layoutDirection2 = layoutDirection;
        }
        if ((i10 & 256) != 0) {
            resourceLoader2 = textLayoutInput.getResourceLoader();
        } else {
            resourceLoader2 = resourceLoader;
        }
        if ((i10 & 512) != 0) {
            j9 = textLayoutInput.constraints;
        } else {
            j9 = j8;
        }
        return textLayoutInput.m4636copyhu1Yfo(annotatedString2, textStyle2, list2, i11, z9, i12, density2, layoutDirection2, resourceLoader2, j9);
    }

    public static /* synthetic */ void getResourceLoader$annotations() {
    }

    /* renamed from: copy-hu-1Yfo, reason: not valid java name */
    public final TextLayoutInput m4636copyhu1Yfo(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i8, boolean z8, int i9, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j8) {
        return new TextLayoutInput(annotatedString, textStyle, list, i8, z8, i9, density, layoutDirection, resourceLoader, this.fontFamilyResolver, j8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) obj;
        if (AbstractC3292y.d(this.text, textLayoutInput.text) && AbstractC3292y.d(this.style, textLayoutInput.style) && AbstractC3292y.d(this.placeholders, textLayoutInput.placeholders) && this.maxLines == textLayoutInput.maxLines && this.softWrap == textLayoutInput.softWrap && TextOverflow.m5101equalsimpl0(this.overflow, textLayoutInput.overflow) && AbstractC3292y.d(this.density, textLayoutInput.density) && this.layoutDirection == textLayoutInput.layoutDirection && AbstractC3292y.d(this.fontFamilyResolver, textLayoutInput.fontFamilyResolver) && Constraints.m5116equalsimpl0(this.constraints, textLayoutInput.constraints)) {
            return true;
        }
        return false;
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m4637getConstraintsmsEJaDk() {
        return this.constraints;
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

    public final int getMaxLines() {
        return this.maxLines;
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m4638getOverflowgIe3tQ8() {
        return this.overflow;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
    }

    public final Font.ResourceLoader getResourceLoader() {
        Font.ResourceLoader resourceLoader = this._developerSuppliedResourceLoader;
        if (resourceLoader == null) {
            return DeprecatedBridgeFontResourceLoader.Companion.from(this.fontFamilyResolver);
        }
        return resourceLoader;
    }

    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public final TextStyle getStyle() {
        return this.style;
    }

    public final AnnotatedString getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.placeholders.hashCode()) * 31) + this.maxLines) * 31) + androidx.compose.foundation.a.a(this.softWrap)) * 31) + TextOverflow.m5102hashCodeimpl(this.overflow)) * 31) + this.density.hashCode()) * 31) + this.layoutDirection.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + Constraints.m5126hashCodeimpl(this.constraints);
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.text) + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + ((Object) TextOverflow.m5103toStringimpl(this.overflow)) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) Constraints.m5128toStringimpl(this.constraints)) + ')';
    }

    public /* synthetic */ TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List list, int i8, boolean z8, int i9, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j8, AbstractC3284p abstractC3284p) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) list, i8, z8, i9, density, layoutDirection, resolver, j8);
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i8, boolean z8, int i9, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, FontFamily.Resolver resolver, long j8) {
        this.text = annotatedString;
        this.style = textStyle;
        this.placeholders = list;
        this.maxLines = i8;
        this.softWrap = z8;
        this.overflow = i9;
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.fontFamilyResolver = resolver;
        this.constraints = j8;
        this._developerSuppliedResourceLoader = resourceLoader;
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i8, boolean z8, int i9, Density density, LayoutDirection layoutDirection, Font.ResourceLoader resourceLoader, long j8) {
        this(annotatedString, textStyle, list, i8, z8, i9, density, layoutDirection, resourceLoader, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader), j8);
    }

    private TextLayoutInput(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i8, boolean z8, int i9, Density density, LayoutDirection layoutDirection, FontFamily.Resolver resolver, long j8) {
        this(annotatedString, textStyle, list, i8, z8, i9, density, layoutDirection, (Font.ResourceLoader) null, resolver, j8);
    }
}
