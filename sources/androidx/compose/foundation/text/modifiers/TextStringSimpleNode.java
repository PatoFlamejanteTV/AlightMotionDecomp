package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.T;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.DrawModifierNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.node.SemanticsModifierNodeKt;
import androidx.compose.ui.node.b;
import androidx.compose.ui.node.h;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Paragraph;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.a;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import e6.AbstractC2829a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextStringSimpleNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    private ParagraphLayoutCache _layoutCache;
    private Map<AlignmentLine, Integer> baselineCache;
    private FontFamily.Resolver fontFamilyResolver;
    private int maxLines;
    private int minLines;
    private int overflow;
    private ColorProducer overrideColor;
    private Function1 semanticsTextLayoutResult;
    private boolean softWrap;
    private TextStyle style;
    private String text;

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i8, boolean z8, int i9, int i10, ColorProducer colorProducer, AbstractC3284p abstractC3284p) {
        this(str, textStyle, resolver, i8, z8, i9, i10, colorProducer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache == null) {
            this._layoutCache = new ParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, null);
        }
        ParagraphLayoutCache paragraphLayoutCache = this._layoutCache;
        AbstractC3292y.f(paragraphLayoutCache);
        return paragraphLayoutCache;
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        AbstractC3292y.i(semanticsPropertyReceiver, "<this>");
        Function1 function1 = this.semanticsTextLayoutResult;
        if (function1 == null) {
            function1 = new TextStringSimpleNode$applySemantics$1(this);
            this.semanticsTextLayoutResult = function1;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(this.text, null, null, 6, null));
        SemanticsPropertiesKt.getTextLayoutResult$default(semanticsPropertyReceiver, null, function1, 1, null);
    }

    public final void doInvalidations(boolean z8, boolean z9, boolean z10) {
        if (!isAttached()) {
            return;
        }
        if (z9 || (z8 && this.semanticsTextLayoutResult != null)) {
            SemanticsModifierNodeKt.invalidateSemantics(this);
        }
        if (z9 || z10) {
            getLayoutCache().m968updateL6sJoHM(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
            LayoutModifierNodeKt.invalidateMeasurement(this);
            DrawModifierNodeKt.invalidateDraw(this);
        }
        if (z8) {
            DrawModifierNodeKt.invalidateDraw(this);
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void draw(ContentDrawScope contentDrawScope) {
        long m2984getUnspecified0d7_KjU;
        AbstractC3292y.i(contentDrawScope, "<this>");
        if (!isAttached()) {
            return;
        }
        Paragraph paragraph$foundation_release = getLayoutCache().getParagraph$foundation_release();
        if (paragraph$foundation_release != null) {
            Canvas canvas = contentDrawScope.getDrawContext().getCanvas();
            boolean didOverflow$foundation_release = getLayoutCache().getDidOverflow$foundation_release();
            if (didOverflow$foundation_release) {
                Rect m2752Recttz77jQw = RectKt.m2752Recttz77jQw(Offset.Companion.m2728getZeroF1C5BW0(), SizeKt.Size(IntSize.m5321getWidthimpl(getLayoutCache().m965getLayoutSizeYbymL2g$foundation_release()), IntSize.m5320getHeightimpl(getLayoutCache().m965getLayoutSizeYbymL2g$foundation_release())));
                canvas.save();
                T.o(canvas, m2752Recttz77jQw, 0, 2, null);
            }
            try {
                TextDecoration textDecoration = this.style.getTextDecoration();
                if (textDecoration == null) {
                    textDecoration = TextDecoration.Companion.getNone();
                }
                TextDecoration textDecoration2 = textDecoration;
                Shadow shadow = this.style.getShadow();
                if (shadow == null) {
                    shadow = Shadow.Companion.getNone();
                }
                Shadow shadow2 = shadow;
                DrawStyle drawStyle = this.style.getDrawStyle();
                if (drawStyle == null) {
                    drawStyle = Fill.INSTANCE;
                }
                DrawStyle drawStyle2 = drawStyle;
                Brush brush = this.style.getBrush();
                if (brush != null) {
                    a.d(paragraph$foundation_release, canvas, brush, this.style.getAlpha(), shadow2, textDecoration2, drawStyle2, 0, 64, null);
                } else {
                    ColorProducer colorProducer = this.overrideColor;
                    if (colorProducer != null) {
                        m2984getUnspecified0d7_KjU = colorProducer.mo1394invoke0d7_KjU();
                    } else {
                        m2984getUnspecified0d7_KjU = Color.Companion.m2984getUnspecified0d7_KjU();
                    }
                    Color.Companion companion = Color.Companion;
                    if (m2984getUnspecified0d7_KjU == companion.m2984getUnspecified0d7_KjU()) {
                        if (this.style.m4699getColor0d7_KjU() != companion.m2984getUnspecified0d7_KjU()) {
                            m2984getUnspecified0d7_KjU = this.style.m4699getColor0d7_KjU();
                        } else {
                            m2984getUnspecified0d7_KjU = companion.m2974getBlack0d7_KjU();
                        }
                    }
                    a.b(paragraph$foundation_release, canvas, m2984getUnspecified0d7_KjU, shadow2, textDecoration2, drawStyle2, 0, 32, null);
                }
                if (didOverflow$foundation_release) {
                    canvas.restore();
                    return;
                }
                return;
            } catch (Throwable th) {
                if (didOverflow$foundation_release) {
                    canvas.restore();
                }
                throw th;
            }
        }
        throw new IllegalArgumentException("no paragraph".toString());
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldClearDescendantSemantics() {
        return h.a(this);
    }

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public /* synthetic */ boolean getShouldMergeDescendantSemantics() {
        return h.b(this);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i8, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        return getLayoutCache(intrinsicMeasureScope).maxIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo340measure3p2s80s(MeasureScope measure, Measurable measurable, long j8) {
        AbstractC3292y.i(measure, "$this$measure");
        AbstractC3292y.i(measurable, "measurable");
        ParagraphLayoutCache layoutCache = getLayoutCache(measure);
        boolean m966layoutWithConstraintsK40F9xA = layoutCache.m966layoutWithConstraintsK40F9xA(j8, measure.getLayoutDirection());
        layoutCache.getObserveFontChanges$foundation_release();
        Paragraph paragraph$foundation_release = layoutCache.getParagraph$foundation_release();
        AbstractC3292y.f(paragraph$foundation_release);
        long m965getLayoutSizeYbymL2g$foundation_release = layoutCache.m965getLayoutSizeYbymL2g$foundation_release();
        if (m966layoutWithConstraintsK40F9xA) {
            LayoutModifierNodeKt.invalidateLayer(this);
            Map<AlignmentLine, Integer> map = this.baselineCache;
            if (map == null) {
                map = new LinkedHashMap<>(2);
            }
            map.put(AlignmentLineKt.getFirstBaseline(), Integer.valueOf(AbstractC2829a.d(paragraph$foundation_release.getFirstBaseline())));
            map.put(AlignmentLineKt.getLastBaseline(), Integer.valueOf(AbstractC2829a.d(paragraph$foundation_release.getLastBaseline())));
            this.baselineCache = map;
        }
        Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(Constraints.Companion.m5131fixedJhjzzOo(IntSize.m5321getWidthimpl(m965getLayoutSizeYbymL2g$foundation_release), IntSize.m5320getHeightimpl(m965getLayoutSizeYbymL2g$foundation_release)));
        int m5321getWidthimpl = IntSize.m5321getWidthimpl(m965getLayoutSizeYbymL2g$foundation_release);
        int m5320getHeightimpl = IntSize.m5320getHeightimpl(m965getLayoutSizeYbymL2g$foundation_release);
        Map<AlignmentLine, Integer> map2 = this.baselineCache;
        AbstractC3292y.f(map2);
        return measure.layout(m5321getWidthimpl, m5320getHeightimpl, map2, new TextStringSimpleNode$measure$1(mo4108measureBRTryo0));
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i8, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable measurable, int i8) {
        AbstractC3292y.i(intrinsicMeasureScope, "<this>");
        AbstractC3292y.i(measurable, "measurable");
        return getLayoutCache(intrinsicMeasureScope).minIntrinsicWidth(intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public /* synthetic */ void onMeasureResultChanged() {
        b.a(this);
    }

    public final boolean updateDraw(ColorProducer colorProducer, TextStyle style) {
        AbstractC3292y.i(style, "style");
        boolean z8 = !AbstractC3292y.d(colorProducer, this.overrideColor);
        this.overrideColor = colorProducer;
        if (z8 || !style.hasSameDrawAffectingAttributes(this.style)) {
            return true;
        }
        return false;
    }

    /* renamed from: updateLayoutRelatedArgs-HuAbxIM, reason: not valid java name */
    public final boolean m981updateLayoutRelatedArgsHuAbxIM(TextStyle style, int i8, int i9, boolean z8, FontFamily.Resolver fontFamilyResolver, int i10) {
        AbstractC3292y.i(style, "style");
        AbstractC3292y.i(fontFamilyResolver, "fontFamilyResolver");
        boolean z9 = !this.style.hasSameLayoutAffectingAttributes(style);
        this.style = style;
        if (this.minLines != i8) {
            this.minLines = i8;
            z9 = true;
        }
        if (this.maxLines != i9) {
            this.maxLines = i9;
            z9 = true;
        }
        if (this.softWrap != z8) {
            this.softWrap = z8;
            z9 = true;
        }
        if (!AbstractC3292y.d(this.fontFamilyResolver, fontFamilyResolver)) {
            this.fontFamilyResolver = fontFamilyResolver;
            z9 = true;
        }
        if (!TextOverflow.m5101equalsimpl0(this.overflow, i10)) {
            this.overflow = i10;
            return true;
        }
        return z9;
    }

    public final boolean updateText(String text) {
        AbstractC3292y.i(text, "text");
        if (AbstractC3292y.d(this.text, text)) {
            return false;
        }
        this.text = text;
        return true;
    }

    public /* synthetic */ TextStringSimpleNode(String str, TextStyle textStyle, FontFamily.Resolver resolver, int i8, boolean z8, int i9, int i10, ColorProducer colorProducer, int i11, AbstractC3284p abstractC3284p) {
        this(str, textStyle, resolver, (i11 & 8) != 0 ? TextOverflow.Companion.m5108getClipgIe3tQ8() : i8, (i11 & 16) != 0 ? true : z8, (i11 & 32) != 0 ? Integer.MAX_VALUE : i9, (i11 & 64) != 0 ? 1 : i10, (i11 & 128) != 0 ? null : colorProducer, null);
    }

    private TextStringSimpleNode(String text, TextStyle style, FontFamily.Resolver fontFamilyResolver, int i8, boolean z8, int i9, int i10, ColorProducer colorProducer) {
        AbstractC3292y.i(text, "text");
        AbstractC3292y.i(style, "style");
        AbstractC3292y.i(fontFamilyResolver, "fontFamilyResolver");
        this.text = text;
        this.style = style;
        this.fontFamilyResolver = fontFamilyResolver;
        this.overflow = i8;
        this.softWrap = z8;
        this.maxLines = i9;
        this.minLines = i10;
        this.overrideColor = colorProducer;
    }

    private final ParagraphLayoutCache getLayoutCache(Density density) {
        ParagraphLayoutCache layoutCache = getLayoutCache();
        layoutCache.setDensity$foundation_release(density);
        return layoutCache;
    }
}
