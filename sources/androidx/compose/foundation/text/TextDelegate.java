package androidx.compose.foundation.text;

import R5.AbstractC1435t;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.MultiParagraphIntrinsics;
import androidx.compose.ui.text.Placeholder;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextPainter;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.TextStyleKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import i6.m;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
@InternalFoundationTextApi
/* loaded from: classes.dex */
public final class TextDelegate {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Density density;
    private final FontFamily.Resolver fontFamilyResolver;
    private LayoutDirection intrinsicsLayoutDirection;
    private final int maxLines;
    private final int minLines;
    private final int overflow;
    private MultiParagraphIntrinsics paragraphIntrinsics;
    private final List<AnnotatedString.Range<Placeholder>> placeholders;
    private final boolean softWrap;
    private final TextStyle style;
    private final AnnotatedString text;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final void paint(Canvas canvas, TextLayoutResult textLayoutResult) {
            AbstractC3292y.i(canvas, "canvas");
            AbstractC3292y.i(textLayoutResult, "textLayoutResult");
            TextPainter.INSTANCE.paint(canvas, textLayoutResult);
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i8, int i9, boolean z8, int i10, Density density, FontFamily.Resolver resolver, List list, AbstractC3284p abstractC3284p) {
        this(annotatedString, textStyle, i8, i9, z8, i10, density, resolver, list);
    }

    private final MultiParagraphIntrinsics getNonNullIntrinsics() {
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics != null) {
            return multiParagraphIntrinsics;
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* renamed from: layout-NN6Ew-U$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m896layoutNN6EwU$default(TextDelegate textDelegate, long j8, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            textLayoutResult = null;
        }
        return textDelegate.m899layoutNN6EwU(j8, layoutDirection, textLayoutResult);
    }

    /* renamed from: layoutText-K40F9xA, reason: not valid java name */
    private final MultiParagraph m897layoutTextK40F9xA(long j8, LayoutDirection layoutDirection) {
        int m5123getMaxWidthimpl;
        int i8;
        layoutIntrinsics(layoutDirection);
        int m5125getMinWidthimpl = Constraints.m5125getMinWidthimpl(j8);
        if ((this.softWrap || TextOverflow.m5101equalsimpl0(this.overflow, TextOverflow.Companion.m5109getEllipsisgIe3tQ8())) && Constraints.m5119getHasBoundedWidthimpl(j8)) {
            m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(j8);
        } else {
            m5123getMaxWidthimpl = Integer.MAX_VALUE;
        }
        if (!this.softWrap && TextOverflow.m5101equalsimpl0(this.overflow, TextOverflow.Companion.m5109getEllipsisgIe3tQ8())) {
            i8 = 1;
        } else {
            i8 = this.maxLines;
        }
        if (m5125getMinWidthimpl != m5123getMaxWidthimpl) {
            m5123getMaxWidthimpl = m.k(getMaxIntrinsicWidth(), m5125getMinWidthimpl, m5123getMaxWidthimpl);
        }
        return new MultiParagraph(getNonNullIntrinsics(), ConstraintsKt.Constraints$default(0, m5123getMaxWidthimpl, 0, Constraints.m5122getMaxHeightimpl(j8), 5, null), i8, TextOverflow.m5101equalsimpl0(this.overflow, TextOverflow.Companion.m5109getEllipsisgIe3tQ8()), null);
    }

    public final Density getDensity() {
        return this.density;
    }

    public final FontFamily.Resolver getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    public final LayoutDirection getIntrinsicsLayoutDirection$foundation_release() {
        return this.intrinsicsLayoutDirection;
    }

    public final int getMaxIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMaxIntrinsicWidth());
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getMinIntrinsicWidth() {
        return TextDelegateKt.ceilToIntPx(getNonNullIntrinsics().getMinIntrinsicWidth());
    }

    public final int getMinLines() {
        return this.minLines;
    }

    /* renamed from: getOverflow-gIe3tQ8, reason: not valid java name */
    public final int m898getOverflowgIe3tQ8() {
        return this.overflow;
    }

    public final MultiParagraphIntrinsics getParagraphIntrinsics$foundation_release() {
        return this.paragraphIntrinsics;
    }

    public final List<AnnotatedString.Range<Placeholder>> getPlaceholders() {
        return this.placeholders;
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

    /* renamed from: layout-NN6Ew-U, reason: not valid java name */
    public final TextLayoutResult m899layoutNN6EwU(long j8, LayoutDirection layoutDirection, TextLayoutResult textLayoutResult) {
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        if (textLayoutResult != null && TextLayoutHelperKt.m932canReuse7_7YC6M(textLayoutResult, this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, j8)) {
            return textLayoutResult.m4640copyO0kMr_c(new TextLayoutInput(textLayoutResult.getLayoutInput().getText(), this.style, textLayoutResult.getLayoutInput().getPlaceholders(), textLayoutResult.getLayoutInput().getMaxLines(), textLayoutResult.getLayoutInput().getSoftWrap(), textLayoutResult.getLayoutInput().m4638getOverflowgIe3tQ8(), textLayoutResult.getLayoutInput().getDensity(), textLayoutResult.getLayoutInput().getLayoutDirection(), textLayoutResult.getLayoutInput().getFontFamilyResolver(), j8, (AbstractC3284p) null), ConstraintsKt.m5134constrain4WqzIAM(j8, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getWidth()), TextDelegateKt.ceilToIntPx(textLayoutResult.getMultiParagraph().getHeight()))));
        }
        MultiParagraph m897layoutTextK40F9xA = m897layoutTextK40F9xA(j8, layoutDirection);
        return new TextLayoutResult(new TextLayoutInput(this.text, this.style, this.placeholders, this.maxLines, this.softWrap, this.overflow, this.density, layoutDirection, this.fontFamilyResolver, j8, (AbstractC3284p) null), m897layoutTextK40F9xA, ConstraintsKt.m5134constrain4WqzIAM(j8, IntSizeKt.IntSize(TextDelegateKt.ceilToIntPx(m897layoutTextK40F9xA.getWidth()), TextDelegateKt.ceilToIntPx(m897layoutTextK40F9xA.getHeight()))), null);
    }

    public final void layoutIntrinsics(LayoutDirection layoutDirection) {
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        MultiParagraphIntrinsics multiParagraphIntrinsics = this.paragraphIntrinsics;
        if (multiParagraphIntrinsics == null || layoutDirection != this.intrinsicsLayoutDirection || multiParagraphIntrinsics.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            multiParagraphIntrinsics = new MultiParagraphIntrinsics(this.text, TextStyleKt.resolveDefaults(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    public final void setIntrinsicsLayoutDirection$foundation_release(LayoutDirection layoutDirection) {
        this.intrinsicsLayoutDirection = layoutDirection;
    }

    public final void setParagraphIntrinsics$foundation_release(MultiParagraphIntrinsics multiParagraphIntrinsics) {
        this.paragraphIntrinsics = multiParagraphIntrinsics;
    }

    private TextDelegate(AnnotatedString text, TextStyle style, int i8, int i9, boolean z8, int i10, Density density, FontFamily.Resolver fontFamilyResolver, List<AnnotatedString.Range<Placeholder>> placeholders) {
        AbstractC3292y.i(text, "text");
        AbstractC3292y.i(style, "style");
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(fontFamilyResolver, "fontFamilyResolver");
        AbstractC3292y.i(placeholders, "placeholders");
        this.text = text;
        this.style = style;
        this.maxLines = i8;
        this.minLines = i9;
        this.softWrap = z8;
        this.overflow = i10;
        this.density = density;
        this.fontFamilyResolver = fontFamilyResolver;
        this.placeholders = placeholders;
        if (i8 <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i9 <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        if (i9 > i8) {
            throw new IllegalStateException("Check failed.".toString());
        }
    }

    public /* synthetic */ TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, int i8, int i9, boolean z8, int i10, Density density, FontFamily.Resolver resolver, List list, int i11, AbstractC3284p abstractC3284p) {
        this(annotatedString, textStyle, (i11 & 4) != 0 ? Integer.MAX_VALUE : i8, (i11 & 8) != 0 ? 1 : i9, (i11 & 16) != 0 ? true : z8, (i11 & 32) != 0 ? TextOverflow.Companion.m5108getClipgIe3tQ8() : i10, density, resolver, (i11 & 256) != 0 ? AbstractC1435t.m() : list, null);
    }
}
