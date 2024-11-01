package androidx.compose.ui.text;

import Q5.InterfaceC1416k;
import Q5.l;
import Q5.o;
import Q5.p;
import R5.AbstractC1435t;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.android.selection.WordBoundary;
import androidx.compose.ui.text.android.style.PlaceholderSpan;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidParagraphHelper_androidKt;
import androidx.compose.ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.ui.text.platform.AndroidTextPaint;
import androidx.compose.ui.text.platform.style.ShaderBrushSpan;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import i6.m;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidParagraph implements Paragraph {
    public static final int $stable = 8;
    private final CharSequence charSequence;
    private final long constraints;
    private final boolean ellipsis;
    private final TextLayout layout;
    private final int maxLines;
    private final AndroidParagraphIntrinsics paragraphIntrinsics;
    private final List<Rect> placeholderRects;
    private final InterfaceC1416k wordBoundary$delegate;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ResolvedTextDirection.values().length];
            try {
                iArr[ResolvedTextDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ResolvedTextDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i8, boolean z8, long j8, AbstractC3284p abstractC3284p) {
        this(androidParagraphIntrinsics, i8, z8, j8);
    }

    private final TextLayout constructTextLayout(int i8, int i9, TextUtils.TruncateAt truncateAt, int i10, int i11, int i12, int i13, int i14) {
        return new TextLayout(this.charSequence, getWidth(), getTextPaint$ui_text_release(), i8, truncateAt, this.paragraphIntrinsics.getTextDirectionHeuristic$ui_text_release(), 1.0f, 0.0f, AndroidParagraphHelper_androidKt.isIncludeFontPaddingEnabled(this.paragraphIntrinsics.getStyle()), true, i10, i12, i13, i14, i11, i9, null, null, this.paragraphIntrinsics.getLayoutIntrinsics$ui_text_release(), 196736, null);
    }

    @VisibleForTesting
    public static /* synthetic */ void getCharSequence$ui_text_release$annotations() {
    }

    private final ShaderBrushSpan[] getShaderBrushSpans(TextLayout textLayout) {
        if (!(textLayout.getText() instanceof Spanned)) {
            return new ShaderBrushSpan[0];
        }
        CharSequence text = textLayout.getText();
        AbstractC3292y.g(text, "null cannot be cast to non-null type android.text.Spanned");
        ShaderBrushSpan[] shaderBrushSpanArr = (ShaderBrushSpan[]) ((Spanned) text).getSpans(0, textLayout.getText().length(), ShaderBrushSpan.class);
        if (shaderBrushSpanArr.length == 0) {
            return new ShaderBrushSpan[0];
        }
        return shaderBrushSpanArr;
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextLocale$ui_text_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getTextPaint$ui_text_release$annotations() {
    }

    private final WordBoundary getWordBoundary() {
        return (WordBoundary) this.wordBoundary$delegate.getValue();
    }

    private final void paint(Canvas canvas) {
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.save();
            nativeCanvas.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.layout.paint(nativeCanvas);
        if (getDidExceedMaxLines()) {
            nativeCanvas.restore();
        }
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public void mo4518fillBoundingBoxes8ffj60Q(long j8, float[] fArr, @IntRange(from = 0) int i8) {
        this.layout.fillBoundingBoxes(TextRange.m4667getMinimpl(j8), TextRange.m4666getMaximpl(j8), fArr, i8);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection getBidiRunDirection(int i8) {
        if (this.layout.isRtlCharAt(i8)) {
            return ResolvedTextDirection.Rtl;
        }
        return ResolvedTextDirection.Ltr;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Rect getBoundingBox(int i8) {
        if (i8 >= 0 && i8 < this.charSequence.length()) {
            RectF boundingBox = this.layout.getBoundingBox(i8);
            return new Rect(boundingBox.left, boundingBox.top, boundingBox.right, boundingBox.bottom);
        }
        throw new IllegalArgumentException(("offset(" + i8 + ") is out of bounds [0," + this.charSequence.length() + ')').toString());
    }

    public final CharSequence getCharSequence$ui_text_release() {
        return this.charSequence;
    }

    /* renamed from: getConstraints-msEJaDk, reason: not valid java name */
    public final long m4519getConstraintsmsEJaDk() {
        return this.constraints;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Rect getCursorRect(int i8) {
        if (i8 >= 0 && i8 <= this.charSequence.length()) {
            float primaryHorizontal$default = TextLayout.getPrimaryHorizontal$default(this.layout, i8, false, 2, null);
            int lineForOffset = this.layout.getLineForOffset(i8);
            return new Rect(primaryHorizontal$default, this.layout.getLineTop(lineForOffset), primaryHorizontal$default, this.layout.getLineBottom(lineForOffset));
        }
        throw new IllegalArgumentException(("offset(" + i8 + ") is out of bounds [0," + this.charSequence.length() + ']').toString());
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean getDidExceedMaxLines() {
        return this.layout.getDidExceedMaxLines();
    }

    public final boolean getEllipsis() {
        return this.ellipsis;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getFirstBaseline() {
        return getLineBaseline$ui_text_release(0);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHeight() {
        return this.layout.getHeight();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getHorizontalPosition(int i8, boolean z8) {
        if (z8) {
            return TextLayout.getPrimaryHorizontal$default(this.layout, i8, false, 2, null);
        }
        return TextLayout.getSecondaryHorizontal$default(this.layout, i8, false, 2, null);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLastBaseline() {
        return getLineBaseline$ui_text_release(getLineCount() - 1);
    }

    public final float getLineAscent$ui_text_release(int i8) {
        return this.layout.getLineAscent(i8);
    }

    public final float getLineBaseline$ui_text_release(int i8) {
        return this.layout.getLineBaseline(i8);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineBottom(int i8) {
        return this.layout.getLineBottom(i8);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineCount() {
        return this.layout.getLineCount();
    }

    public final float getLineDescent$ui_text_release(int i8) {
        return this.layout.getLineDescent(i8);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineEnd(int i8, boolean z8) {
        if (z8) {
            return this.layout.getLineVisibleEnd(i8);
        }
        return this.layout.getLineEnd(i8);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForOffset(int i8) {
        return this.layout.getLineForOffset(i8);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineForVerticalPosition(float f8) {
        return this.layout.getLineForVertical((int) f8);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineHeight(int i8) {
        return this.layout.getLineHeight(i8);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineLeft(int i8) {
        return this.layout.getLineLeft(i8);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineRight(int i8) {
        return this.layout.getLineRight(i8);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public int getLineStart(int i8) {
        return this.layout.getLineStart(i8);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineTop(int i8) {
        return this.layout.getLineTop(i8);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getLineWidth(int i8) {
        return this.layout.getLineWidth(i8);
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMaxIntrinsicWidth() {
        return this.paragraphIntrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getMinIntrinsicWidth() {
        return this.paragraphIntrinsics.getMinIntrinsicWidth();
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public int mo4520getOffsetForPositionk4lQ0M(long j8) {
        return this.layout.getOffsetForHorizontal(this.layout.getLineForVertical((int) Offset.m2713getYimpl(j8)), Offset.m2712getXimpl(j8));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public ResolvedTextDirection getParagraphDirection(int i8) {
        if (this.layout.getParagraphDirection(this.layout.getLineForOffset(i8)) == 1) {
            return ResolvedTextDirection.Ltr;
        }
        return ResolvedTextDirection.Rtl;
    }

    public final AndroidParagraphIntrinsics getParagraphIntrinsics() {
        return this.paragraphIntrinsics;
    }

    @Override // androidx.compose.ui.text.Paragraph
    public Path getPathForRange(int i8, int i9) {
        if (i8 >= 0 && i8 <= i9 && i9 <= this.charSequence.length()) {
            android.graphics.Path path = new android.graphics.Path();
            this.layout.getSelectionPath(i8, i9, path);
            return AndroidPath_androidKt.asComposePath(path);
        }
        throw new IllegalArgumentException(("start(" + i8 + ") or end(" + i9 + ") is out of range [0.." + this.charSequence.length() + "], or start > end!").toString());
    }

    @Override // androidx.compose.ui.text.Paragraph
    public List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final Locale getTextLocale$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint$ui_text_release().getTextLocale();
    }

    public final AndroidTextPaint getTextPaint$ui_text_release() {
        return this.paragraphIntrinsics.getTextPaint$ui_text_release();
    }

    @Override // androidx.compose.ui.text.Paragraph
    public float getWidth() {
        return Constraints.m5123getMaxWidthimpl(this.constraints);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public long mo4521getWordBoundaryjx7JFs(int i8) {
        return TextRangeKt.TextRange(getWordBoundary().getWordStart(i8), getWordBoundary().getWordEnd(i8));
    }

    @Override // androidx.compose.ui.text.Paragraph
    public boolean isLineEllipsized(int i8) {
        return this.layout.isLineEllipsized(i8);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-LG529CI, reason: not valid java name */
    public void mo4522paintLG529CI(Canvas canvas, long j8, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i8) {
        int m4921getBlendMode0nO6VwU = getTextPaint$ui_text_release().m4921getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m4924setColor8_81llA(j8);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m4922setBlendModes9anfk8(i8);
        paint(canvas);
        getTextPaint$ui_text_release().m4922setBlendModes9anfk8(m4921getBlendMode0nO6VwU);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public void mo4523paintRPmYEkk(Canvas canvas, long j8, Shadow shadow, TextDecoration textDecoration) {
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m4924setColor8_81llA(j8);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        paint(canvas);
    }

    @Override // androidx.compose.ui.text.Paragraph
    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public void mo4524painthn5TExg(Canvas canvas, Brush brush, float f8, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i8) {
        int m4921getBlendMode0nO6VwU = getTextPaint$ui_text_release().m4921getBlendMode0nO6VwU();
        AndroidTextPaint textPaint$ui_text_release = getTextPaint$ui_text_release();
        textPaint$ui_text_release.m4923setBrush12SF9DM(brush, SizeKt.Size(getWidth(), getHeight()), f8);
        textPaint$ui_text_release.setShadow(shadow);
        textPaint$ui_text_release.setTextDecoration(textDecoration);
        textPaint$ui_text_release.setDrawStyle(drawStyle);
        textPaint$ui_text_release.m4922setBlendModes9anfk8(i8);
        paint(canvas);
        getTextPaint$ui_text_release().m4922setBlendModes9anfk8(m4921getBlendMode0nO6VwU);
    }

    public /* synthetic */ AndroidParagraph(String str, TextStyle textStyle, List list, List list2, int i8, boolean z8, long j8, FontFamily.Resolver resolver, Density density, AbstractC3284p abstractC3284p) {
        this(str, textStyle, list, list2, i8, z8, j8, resolver, density);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x01a9. Please report as an issue. */
    private AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i8, boolean z8, long j8) {
        boolean shouldAttachIndentationFixSpan;
        CharSequence charSequence$ui_text_release;
        int m4530toLayoutAlignaXe7zB0;
        int m4532toLayoutHyphenationFrequency3fSNIE;
        int m4531toLayoutBreakStrategyxImikfE;
        int m4533toLayoutLineBreakStylehpcqdu8;
        int m4534toLayoutLineBreakWordStylewPN0Rpw;
        List<Rect> list;
        Rect rect;
        float horizontalPosition;
        float lineBaseline;
        int heightPx;
        float lineTop;
        float f8;
        float lineBaseline2;
        int numberOfLinesThatFitMaxHeight;
        this.paragraphIntrinsics = androidParagraphIntrinsics;
        this.maxLines = i8;
        this.ellipsis = z8;
        this.constraints = j8;
        if (Constraints.m5124getMinHeightimpl(j8) != 0 || Constraints.m5125getMinWidthimpl(j8) != 0) {
            throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
        }
        if (i8 >= 1) {
            TextStyle style = androidParagraphIntrinsics.getStyle();
            shouldAttachIndentationFixSpan = AndroidParagraph_androidKt.shouldAttachIndentationFixSpan(style, z8);
            if (shouldAttachIndentationFixSpan) {
                charSequence$ui_text_release = AndroidParagraph_androidKt.attachIndentationFixSpan(androidParagraphIntrinsics.getCharSequence$ui_text_release());
            } else {
                charSequence$ui_text_release = androidParagraphIntrinsics.getCharSequence$ui_text_release();
            }
            this.charSequence = charSequence$ui_text_release;
            m4530toLayoutAlignaXe7zB0 = AndroidParagraph_androidKt.m4530toLayoutAlignaXe7zB0(style.m4710getTextAligne0LSkKk());
            boolean m5055equalsimpl0 = TextAlign.m5055equalsimpl0(style.m4710getTextAligne0LSkKk(), TextAlign.Companion.m5061getJustifye0LSkKk());
            m4532toLayoutHyphenationFrequency3fSNIE = AndroidParagraph_androidKt.m4532toLayoutHyphenationFrequency3fSNIE(style.getParagraphStyle$ui_text_release().m4579getHyphensvmbZdU8());
            m4531toLayoutBreakStrategyxImikfE = AndroidParagraph_androidKt.m4531toLayoutBreakStrategyxImikfE(LineBreak.m4979getStrategyfcGXIks(style.m4707getLineBreakrAG3T2k()));
            m4533toLayoutLineBreakStylehpcqdu8 = AndroidParagraph_androidKt.m4533toLayoutLineBreakStylehpcqdu8(LineBreak.m4980getStrictnessusljTpc(style.m4707getLineBreakrAG3T2k()));
            m4534toLayoutLineBreakWordStylewPN0Rpw = AndroidParagraph_androidKt.m4534toLayoutLineBreakWordStylewPN0Rpw(LineBreak.m4981getWordBreakjp8hJ3c(style.m4707getLineBreakrAG3T2k()));
            TextUtils.TruncateAt truncateAt = z8 ? TextUtils.TruncateAt.END : null;
            TextLayout constructTextLayout = constructTextLayout(m4530toLayoutAlignaXe7zB0, m5055equalsimpl0 ? 1 : 0, truncateAt, i8, m4532toLayoutHyphenationFrequency3fSNIE, m4531toLayoutBreakStrategyxImikfE, m4533toLayoutLineBreakStylehpcqdu8, m4534toLayoutLineBreakWordStylewPN0Rpw);
            if (z8 && constructTextLayout.getHeight() > Constraints.m5122getMaxHeightimpl(j8) && i8 > 1) {
                numberOfLinesThatFitMaxHeight = AndroidParagraph_androidKt.numberOfLinesThatFitMaxHeight(constructTextLayout, Constraints.m5122getMaxHeightimpl(j8));
                if (numberOfLinesThatFitMaxHeight >= 0 && numberOfLinesThatFitMaxHeight != i8) {
                    constructTextLayout = constructTextLayout(m4530toLayoutAlignaXe7zB0, m5055equalsimpl0 ? 1 : 0, truncateAt, m.d(numberOfLinesThatFitMaxHeight, 1), m4532toLayoutHyphenationFrequency3fSNIE, m4531toLayoutBreakStrategyxImikfE, m4533toLayoutLineBreakStylehpcqdu8, m4534toLayoutLineBreakWordStylewPN0Rpw);
                }
                this.layout = constructTextLayout;
            } else {
                this.layout = constructTextLayout;
            }
            getTextPaint$ui_text_release().m4923setBrush12SF9DM(style.getBrush(), SizeKt.Size(getWidth(), getHeight()), style.getAlpha());
            for (ShaderBrushSpan shaderBrushSpan : getShaderBrushSpans(this.layout)) {
                shaderBrushSpan.m4942setSizeuvyYCjk(SizeKt.Size(getWidth(), getHeight()));
            }
            CharSequence charSequence = this.charSequence;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                Object[] spans = spanned.getSpans(0, charSequence.length(), PlaceholderSpan.class);
                ArrayList arrayList = new ArrayList(spans.length);
                for (Object obj : spans) {
                    PlaceholderSpan placeholderSpan = (PlaceholderSpan) obj;
                    int spanStart = spanned.getSpanStart(placeholderSpan);
                    int spanEnd = spanned.getSpanEnd(placeholderSpan);
                    int lineForOffset = this.layout.getLineForOffset(spanStart);
                    boolean z9 = lineForOffset >= this.maxLines;
                    boolean z10 = this.layout.getLineEllipsisCount(lineForOffset) > 0 && spanEnd > this.layout.getLineEllipsisOffset(lineForOffset);
                    boolean z11 = spanEnd > this.layout.getLineEnd(lineForOffset);
                    if (z10 || z11 || z9) {
                        rect = null;
                    } else {
                        int i9 = WhenMappings.$EnumSwitchMapping$0[getBidiRunDirection(spanStart).ordinal()];
                        if (i9 != 1) {
                            if (i9 != 2) {
                                throw new p();
                            }
                            horizontalPosition = getHorizontalPosition(spanStart, true) - placeholderSpan.getWidthPx();
                        } else {
                            horizontalPosition = getHorizontalPosition(spanStart, true);
                        }
                        float widthPx = placeholderSpan.getWidthPx() + horizontalPosition;
                        TextLayout textLayout = this.layout;
                        switch (placeholderSpan.getVerticalAlign()) {
                            case 0:
                                lineBaseline = textLayout.getLineBaseline(lineForOffset);
                                heightPx = placeholderSpan.getHeightPx();
                                lineTop = lineBaseline - heightPx;
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 1:
                                lineTop = textLayout.getLineTop(lineForOffset);
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 2:
                                lineBaseline = textLayout.getLineBottom(lineForOffset);
                                heightPx = placeholderSpan.getHeightPx();
                                lineTop = lineBaseline - heightPx;
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 3:
                                lineTop = ((textLayout.getLineTop(lineForOffset) + textLayout.getLineBottom(lineForOffset)) - placeholderSpan.getHeightPx()) / 2;
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 4:
                                f8 = placeholderSpan.getFontMetrics().ascent;
                                lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                                lineTop = f8 + lineBaseline2;
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 5:
                                lineTop = (placeholderSpan.getFontMetrics().descent + textLayout.getLineBaseline(lineForOffset)) - placeholderSpan.getHeightPx();
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            case 6:
                                Paint.FontMetricsInt fontMetrics = placeholderSpan.getFontMetrics();
                                f8 = ((fontMetrics.ascent + fontMetrics.descent) - placeholderSpan.getHeightPx()) / 2;
                                lineBaseline2 = textLayout.getLineBaseline(lineForOffset);
                                lineTop = f8 + lineBaseline2;
                                rect = new Rect(horizontalPosition, lineTop, widthPx, placeholderSpan.getHeightPx() + lineTop);
                                break;
                            default:
                                throw new IllegalStateException("unexpected verticalAlignment");
                        }
                    }
                    arrayList.add(rect);
                }
                list = arrayList;
            } else {
                list = AbstractC1435t.m();
            }
            this.placeholderRects = list;
            this.wordBoundary$delegate = l.a(o.f8805c, new AndroidParagraph$wordBoundary$2(this));
            return;
        }
        throw new IllegalArgumentException("maxLines should be greater than 0".toString());
    }

    private AndroidParagraph(String str, TextStyle textStyle, List<AnnotatedString.Range<SpanStyle>> list, List<AnnotatedString.Range<Placeholder>> list2, int i8, boolean z8, long j8, FontFamily.Resolver resolver, Density density) {
        this(new AndroidParagraphIntrinsics(str, textStyle, list, list2, resolver, density), i8, z8, j8, null);
    }
}
