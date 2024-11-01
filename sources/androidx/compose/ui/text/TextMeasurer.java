package androidx.compose.ui.text;

import R5.AbstractC1435t;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.text.AnnotatedString;
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

@Immutable
/* loaded from: classes.dex */
public final class TextMeasurer {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int cacheSize;
    private final Density defaultDensity;
    private final FontFamily.Resolver defaultFontFamilyResolver;
    private final LayoutDirection defaultLayoutDirection;
    private final TextLayoutCache textLayoutCache;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final TextLayoutResult layout(TextLayoutInput textLayoutInput) {
            int m5123getMaxWidthimpl;
            int maxLines;
            MultiParagraphIntrinsics multiParagraphIntrinsics = new MultiParagraphIntrinsics(textLayoutInput.getText(), TextStyleKt.resolveDefaults(textLayoutInput.getStyle(), textLayoutInput.getLayoutDirection()), textLayoutInput.getPlaceholders(), textLayoutInput.getDensity(), textLayoutInput.getFontFamilyResolver());
            int m5125getMinWidthimpl = Constraints.m5125getMinWidthimpl(textLayoutInput.m4637getConstraintsmsEJaDk());
            if ((textLayoutInput.getSoftWrap() || TextOverflow.m5101equalsimpl0(textLayoutInput.m4638getOverflowgIe3tQ8(), TextOverflow.Companion.m5109getEllipsisgIe3tQ8())) && Constraints.m5119getHasBoundedWidthimpl(textLayoutInput.m4637getConstraintsmsEJaDk())) {
                m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(textLayoutInput.m4637getConstraintsmsEJaDk());
            } else {
                m5123getMaxWidthimpl = Integer.MAX_VALUE;
            }
            if (!textLayoutInput.getSoftWrap() && TextOverflow.m5101equalsimpl0(textLayoutInput.m4638getOverflowgIe3tQ8(), TextOverflow.Companion.m5109getEllipsisgIe3tQ8())) {
                maxLines = 1;
            } else {
                maxLines = textLayoutInput.getMaxLines();
            }
            if (m5125getMinWidthimpl != m5123getMaxWidthimpl) {
                m5123getMaxWidthimpl = m.k(ParagraphKt.ceilToInt(multiParagraphIntrinsics.getMaxIntrinsicWidth()), m5125getMinWidthimpl, m5123getMaxWidthimpl);
            }
            return new TextLayoutResult(textLayoutInput, new MultiParagraph(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, m5123getMaxWidthimpl, 0, Constraints.m5122getMaxHeightimpl(textLayoutInput.m4637getConstraintsmsEJaDk()), 5, null), maxLines, TextOverflow.m5101equalsimpl0(textLayoutInput.m4638getOverflowgIe3tQ8(), TextOverflow.Companion.m5109getEllipsisgIe3tQ8()), null), ConstraintsKt.m5134constrain4WqzIAM(textLayoutInput.m4637getConstraintsmsEJaDk(), IntSizeKt.IntSize((int) Math.ceil(r2.getWidth()), (int) Math.ceil(r2.getHeight()))), null);
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i8) {
        this.defaultFontFamilyResolver = resolver;
        this.defaultDensity = density;
        this.defaultLayoutDirection = layoutDirection;
        this.cacheSize = i8;
        this.textLayoutCache = i8 > 0 ? new TextLayoutCache(i8) : null;
    }

    /* renamed from: measure-wNUYSr0$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m4644measurewNUYSr0$default(TextMeasurer textMeasurer, String str, TextStyle textStyle, int i8, boolean z8, int i9, long j8, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z9, int i10, Object obj) {
        TextStyle textStyle2;
        int i11;
        boolean z10;
        int i12;
        long j9;
        LayoutDirection layoutDirection2;
        Density density2;
        FontFamily.Resolver resolver2;
        boolean z11;
        if ((i10 & 2) != 0) {
            textStyle2 = TextStyle.Companion.getDefault();
        } else {
            textStyle2 = textStyle;
        }
        if ((i10 & 4) != 0) {
            i11 = TextOverflow.Companion.m5108getClipgIe3tQ8();
        } else {
            i11 = i8;
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        } else {
            z10 = z8;
        }
        if ((i10 & 16) != 0) {
            i12 = Integer.MAX_VALUE;
        } else {
            i12 = i9;
        }
        if ((i10 & 32) != 0) {
            j9 = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        } else {
            j9 = j8;
        }
        if ((i10 & 64) != 0) {
            layoutDirection2 = textMeasurer.defaultLayoutDirection;
        } else {
            layoutDirection2 = layoutDirection;
        }
        if ((i10 & 128) != 0) {
            density2 = textMeasurer.defaultDensity;
        } else {
            density2 = density;
        }
        if ((i10 & 256) != 0) {
            resolver2 = textMeasurer.defaultFontFamilyResolver;
        } else {
            resolver2 = resolver;
        }
        if ((i10 & 512) != 0) {
            z11 = false;
        } else {
            z11 = z9;
        }
        return textMeasurer.m4646measurewNUYSr0(str, textStyle2, i11, z10, i12, j9, layoutDirection2, density2, resolver2, z11);
    }

    /* renamed from: measure-xDpz5zY$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m4645measurexDpz5zY$default(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, int i8, boolean z8, int i9, List list, long j8, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z9, int i10, Object obj) {
        TextStyle textStyle2;
        int i11;
        boolean z10;
        int i12;
        List list2;
        long j9;
        LayoutDirection layoutDirection2;
        Density density2;
        FontFamily.Resolver resolver2;
        boolean z11;
        if ((i10 & 2) != 0) {
            textStyle2 = TextStyle.Companion.getDefault();
        } else {
            textStyle2 = textStyle;
        }
        if ((i10 & 4) != 0) {
            i11 = TextOverflow.Companion.m5108getClipgIe3tQ8();
        } else {
            i11 = i8;
        }
        if ((i10 & 8) != 0) {
            z10 = true;
        } else {
            z10 = z8;
        }
        if ((i10 & 16) != 0) {
            i12 = Integer.MAX_VALUE;
        } else {
            i12 = i9;
        }
        if ((i10 & 32) != 0) {
            list2 = AbstractC1435t.m();
        } else {
            list2 = list;
        }
        if ((i10 & 64) != 0) {
            j9 = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15, null);
        } else {
            j9 = j8;
        }
        if ((i10 & 128) != 0) {
            layoutDirection2 = textMeasurer.defaultLayoutDirection;
        } else {
            layoutDirection2 = layoutDirection;
        }
        if ((i10 & 256) != 0) {
            density2 = textMeasurer.defaultDensity;
        } else {
            density2 = density;
        }
        if ((i10 & 512) != 0) {
            resolver2 = textMeasurer.defaultFontFamilyResolver;
        } else {
            resolver2 = resolver;
        }
        if ((i10 & 1024) != 0) {
            z11 = false;
        } else {
            z11 = z9;
        }
        return textMeasurer.m4647measurexDpz5zY(annotatedString, textStyle2, i11, z10, i12, list2, j9, layoutDirection2, density2, resolver2, z11);
    }

    @Stable
    /* renamed from: measure-wNUYSr0, reason: not valid java name */
    public final TextLayoutResult m4646measurewNUYSr0(String str, TextStyle textStyle, int i8, boolean z8, int i9, long j8, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z9) {
        return m4645measurexDpz5zY$default(this, new AnnotatedString(str, null, null, 6, null), textStyle, i8, z8, i9, null, j8, layoutDirection, density, resolver, z9, 32, null);
    }

    @Stable
    /* renamed from: measure-xDpz5zY, reason: not valid java name */
    public final TextLayoutResult m4647measurexDpz5zY(AnnotatedString annotatedString, TextStyle textStyle, int i8, boolean z8, int i9, List<AnnotatedString.Range<Placeholder>> list, long j8, LayoutDirection layoutDirection, Density density, FontFamily.Resolver resolver, boolean z9) {
        TextLayoutResult textLayoutResult;
        TextLayoutCache textLayoutCache;
        TextLayoutInput textLayoutInput = new TextLayoutInput(annotatedString, textStyle, list, i9, z8, i8, density, layoutDirection, resolver, j8, (AbstractC3284p) null);
        if (!z9 && (textLayoutCache = this.textLayoutCache) != null) {
            textLayoutResult = textLayoutCache.get(textLayoutInput);
        } else {
            textLayoutResult = null;
        }
        if (textLayoutResult == null) {
            TextLayoutResult layout = Companion.layout(textLayoutInput);
            TextLayoutCache textLayoutCache2 = this.textLayoutCache;
            if (textLayoutCache2 != null) {
                textLayoutCache2.put(textLayoutInput, layout);
                return layout;
            }
            return layout;
        }
        return textLayoutResult.m4640copyO0kMr_c(textLayoutInput, ConstraintsKt.m5134constrain4WqzIAM(j8, IntSizeKt.IntSize(ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getWidth()), ParagraphKt.ceilToInt(textLayoutResult.getMultiParagraph().getHeight()))));
    }

    public /* synthetic */ TextMeasurer(FontFamily.Resolver resolver, Density density, LayoutDirection layoutDirection, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(resolver, density, layoutDirection, (i9 & 8) != 0 ? TextMeasurerKt.DefaultCacheSize : i8);
    }
}
