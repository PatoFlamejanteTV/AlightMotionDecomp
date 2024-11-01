package androidx.compose.ui.text.android;

import Q5.InterfaceC1416k;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.Px;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.style.BaselineShiftSpan;
import androidx.compose.ui.text.android.style.IndentationFixSpanKt;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextLayout {
    public static final int $stable = 8;
    private final int bottomPadding;
    private final boolean didExceedMaxLines;
    private final boolean fallbackLineSpacing;
    private final boolean includePadding;
    private final boolean isBoringLayout;
    private final int lastLineExtra;
    private final Paint.FontMetricsInt lastLineFontMetrics;
    private final Layout layout;
    private final InterfaceC1416k layoutHelper$delegate;
    private final LayoutIntrinsics layoutIntrinsics;
    private final float leftPadding;
    private final int lineCount;
    private final LineHeightStyleSpan[] lineHeightSpans;
    private final Rect rect;
    private final float rightPadding;
    private final int topPadding;

    public TextLayout(CharSequence charSequence, float f8, TextPaint textPaint, int i8, TextUtils.TruncateAt truncateAt, int i9, float f9, @Px float f10, boolean z8, boolean z9, int i10, int i11, int i12, int i13, int i14, int i15, int[] iArr, int[] iArr2, LayoutIntrinsics layoutIntrinsics) {
        TextDirectionHeuristic textDirectionHeuristic;
        Layout create;
        long verticalPaddings;
        LineHeightStyleSpan[] lineHeightSpans;
        long lineHeightPaddings;
        Paint.FontMetricsInt lastLineMetrics;
        this.includePadding = z8;
        this.fallbackLineSpacing = z9;
        this.layoutIntrinsics = layoutIntrinsics;
        this.rect = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic textDirectionHeuristic2 = TextLayoutKt.getTextDirectionHeuristic(i9);
        Layout.Alignment alignment = TextAlignmentAdapter.INSTANCE.get(i8);
        boolean z10 = (charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(-1, length, BaselineShiftSpan.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics boringMetrics = layoutIntrinsics.getBoringMetrics();
            double d8 = f8;
            int ceil = (int) Math.ceil(d8);
            if (boringMetrics != null && layoutIntrinsics.getMaxIntrinsicWidth() <= f8 && !z10) {
                this.isBoringLayout = true;
                create = BoringLayoutFactory.INSTANCE.create(charSequence, textPaint, ceil, boringMetrics, alignment, z8, z9, truncateAt, ceil);
                textDirectionHeuristic = textDirectionHeuristic2;
            } else {
                this.isBoringLayout = false;
                textDirectionHeuristic = textDirectionHeuristic2;
                create = StaticLayoutFactory.INSTANCE.create(charSequence, textPaint, ceil, 0, charSequence.length(), textDirectionHeuristic2, alignment, i10, truncateAt, (int) Math.ceil(d8), f9, f10, i15, z8, z9, i11, i12, i13, i14, iArr, iArr2);
            }
            this.layout = create;
            Trace.endSection();
            int min = Math.min(create.getLineCount(), i10);
            this.lineCount = min;
            int i16 = min - 1;
            this.didExceedMaxLines = min >= i10 && (create.getEllipsisCount(i16) > 0 || create.getLineEnd(i16) != charSequence.length());
            verticalPaddings = TextLayoutKt.getVerticalPaddings(this);
            lineHeightSpans = TextLayoutKt.getLineHeightSpans(this);
            this.lineHeightSpans = lineHeightSpans;
            lineHeightPaddings = TextLayoutKt.getLineHeightPaddings(this, lineHeightSpans);
            this.topPadding = Math.max(VerticalPaddings.m4721getTopPaddingimpl(verticalPaddings), VerticalPaddings.m4721getTopPaddingimpl(lineHeightPaddings));
            this.bottomPadding = Math.max(VerticalPaddings.m4720getBottomPaddingimpl(verticalPaddings), VerticalPaddings.m4720getBottomPaddingimpl(lineHeightPaddings));
            lastLineMetrics = TextLayoutKt.getLastLineMetrics(this, textPaint, textDirectionHeuristic, lineHeightSpans);
            this.lastLineExtra = lastLineMetrics != null ? lastLineMetrics.bottom - ((int) getLineHeight(i16)) : 0;
            this.lastLineFontMetrics = lastLineMetrics;
            this.leftPadding = IndentationFixSpanKt.getEllipsizedLeftPadding$default(create, i16, null, 2, null);
            this.rightPadding = IndentationFixSpanKt.getEllipsizedRightPadding$default(create, i16, null, 2, null);
            this.layoutHelper$delegate = Q5.l.a(Q5.o.f8805c, new TextLayout$layoutHelper$2(this));
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getBottomPadding$ui_text_release$annotations() {
    }

    private final float getHorizontalPadding(int i8) {
        if (i8 == this.lineCount - 1) {
            return this.leftPadding + this.rightPadding;
        }
        return 0.0f;
    }

    @VisibleForTesting
    public static /* synthetic */ void getLayout$annotations() {
    }

    private final LayoutHelper getLayoutHelper() {
        return (LayoutHelper) this.layoutHelper$delegate.getValue();
    }

    public static /* synthetic */ float getPrimaryHorizontal$default(TextLayout textLayout, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        return textLayout.getPrimaryHorizontal(i8, z8);
    }

    public static /* synthetic */ float getSecondaryHorizontal$default(TextLayout textLayout, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        return textLayout.getSecondaryHorizontal(i8, z8);
    }

    @VisibleForTesting
    public static /* synthetic */ void getTopPadding$ui_text_release$annotations() {
    }

    public final void fillBoundingBoxes(int i8, int i9, float[] fArr, int i10) {
        float secondaryDownstream;
        float secondaryUpstream;
        int length = getText().length();
        if (i8 >= 0) {
            if (i8 < length) {
                if (i9 > i8) {
                    if (i9 <= length) {
                        if (fArr.length - i10 >= (i9 - i8) * 4) {
                            int lineForOffset = getLineForOffset(i8);
                            int lineForOffset2 = getLineForOffset(i9 - 1);
                            HorizontalPositionCache horizontalPositionCache = new HorizontalPositionCache(this);
                            if (lineForOffset > lineForOffset2) {
                                return;
                            }
                            while (true) {
                                int lineStart = getLineStart(lineForOffset);
                                int lineEnd = getLineEnd(lineForOffset);
                                int min = Math.min(i9, lineEnd);
                                float lineTop = getLineTop(lineForOffset);
                                float lineBottom = getLineBottom(lineForOffset);
                                boolean z8 = true;
                                if (getParagraphDirection(lineForOffset) != 1) {
                                    z8 = false;
                                }
                                boolean z9 = !z8;
                                for (int max = Math.max(i8, lineStart); max < min; max++) {
                                    boolean isRtlCharAt = isRtlCharAt(max);
                                    if (z8 && !isRtlCharAt) {
                                        secondaryDownstream = horizontalPositionCache.getPrimaryDownstream(max);
                                        secondaryUpstream = horizontalPositionCache.getPrimaryUpstream(max + 1);
                                    } else if (z8 && isRtlCharAt) {
                                        secondaryUpstream = horizontalPositionCache.getSecondaryDownstream(max);
                                        secondaryDownstream = horizontalPositionCache.getSecondaryUpstream(max + 1);
                                    } else if (z9 && isRtlCharAt) {
                                        secondaryUpstream = horizontalPositionCache.getPrimaryDownstream(max);
                                        secondaryDownstream = horizontalPositionCache.getPrimaryUpstream(max + 1);
                                    } else {
                                        secondaryDownstream = horizontalPositionCache.getSecondaryDownstream(max);
                                        secondaryUpstream = horizontalPositionCache.getSecondaryUpstream(max + 1);
                                    }
                                    fArr[i10] = secondaryDownstream;
                                    fArr[i10 + 1] = lineTop;
                                    fArr[i10 + 2] = secondaryUpstream;
                                    fArr[i10 + 3] = lineBottom;
                                    i10 += 4;
                                }
                                if (lineForOffset != lineForOffset2) {
                                    lineForOffset++;
                                } else {
                                    return;
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
                    }
                } else {
                    throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
                }
            } else {
                throw new IllegalArgumentException("startOffset must be less than text length".toString());
            }
        } else {
            throw new IllegalArgumentException("startOffset must be > 0".toString());
        }
    }

    public final int getBottomPadding$ui_text_release() {
        return this.bottomPadding;
    }

    public final RectF getBoundingBox(int i8) {
        boolean z8;
        float secondaryHorizontal;
        float secondaryHorizontal2;
        float primaryHorizontal;
        float primaryHorizontal2;
        int lineForOffset = getLineForOffset(i8);
        float lineTop = getLineTop(lineForOffset);
        float lineBottom = getLineBottom(lineForOffset);
        if (getParagraphDirection(lineForOffset) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        boolean isRtlCharAt = this.layout.isRtlCharAt(i8);
        if (z8 && !isRtlCharAt) {
            secondaryHorizontal = getPrimaryHorizontal(i8, false);
            secondaryHorizontal2 = getPrimaryHorizontal(i8 + 1, true);
        } else {
            if (z8 && isRtlCharAt) {
                primaryHorizontal = getSecondaryHorizontal(i8, false);
                primaryHorizontal2 = getSecondaryHorizontal(i8 + 1, true);
            } else if (isRtlCharAt) {
                primaryHorizontal = getPrimaryHorizontal(i8, false);
                primaryHorizontal2 = getPrimaryHorizontal(i8 + 1, true);
            } else {
                secondaryHorizontal = getSecondaryHorizontal(i8, false);
                secondaryHorizontal2 = getSecondaryHorizontal(i8 + 1, true);
            }
            float f8 = primaryHorizontal;
            secondaryHorizontal = primaryHorizontal2;
            secondaryHorizontal2 = f8;
        }
        return new RectF(secondaryHorizontal, lineTop, secondaryHorizontal2, lineBottom);
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final boolean getFallbackLineSpacing() {
        return this.fallbackLineSpacing;
    }

    public final int getHeight() {
        int height;
        if (this.didExceedMaxLines) {
            height = this.layout.getLineBottom(this.lineCount - 1);
        } else {
            height = this.layout.getHeight();
        }
        return height + this.topPadding + this.bottomPadding + this.lastLineExtra;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final LayoutIntrinsics getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    public final float getLineAscent(int i8) {
        int lineAscent;
        Paint.FontMetricsInt fontMetricsInt;
        if (i8 == this.lineCount - 1 && (fontMetricsInt = this.lastLineFontMetrics) != null) {
            lineAscent = fontMetricsInt.ascent;
        } else {
            lineAscent = this.layout.getLineAscent(i8);
        }
        return lineAscent;
    }

    public final float getLineBaseline(int i8) {
        float lineBaseline;
        float f8 = this.topPadding;
        if (i8 == this.lineCount - 1 && this.lastLineFontMetrics != null) {
            lineBaseline = getLineTop(i8) - this.lastLineFontMetrics.ascent;
        } else {
            lineBaseline = this.layout.getLineBaseline(i8);
        }
        return f8 + lineBaseline;
    }

    public final float getLineBottom(int i8) {
        int i9;
        if (i8 == this.lineCount - 1 && this.lastLineFontMetrics != null) {
            return this.layout.getLineBottom(i8 - 1) + this.lastLineFontMetrics.bottom;
        }
        float lineBottom = this.topPadding + this.layout.getLineBottom(i8);
        if (i8 == this.lineCount - 1) {
            i9 = this.bottomPadding;
        } else {
            i9 = 0;
        }
        return lineBottom + i9;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final float getLineDescent(int i8) {
        int lineDescent;
        Paint.FontMetricsInt fontMetricsInt;
        if (i8 == this.lineCount - 1 && (fontMetricsInt = this.lastLineFontMetrics) != null) {
            lineDescent = fontMetricsInt.descent;
        } else {
            lineDescent = this.layout.getLineDescent(i8);
        }
        return lineDescent;
    }

    public final int getLineEllipsisCount(int i8) {
        return this.layout.getEllipsisCount(i8);
    }

    public final int getLineEllipsisOffset(int i8) {
        return this.layout.getEllipsisStart(i8);
    }

    public final int getLineEnd(int i8) {
        if (this.layout.getEllipsisStart(i8) == 0) {
            return this.layout.getLineEnd(i8);
        }
        return this.layout.getText().length();
    }

    public final int getLineForOffset(int i8) {
        return this.layout.getLineForOffset(i8);
    }

    public final int getLineForVertical(int i8) {
        return this.layout.getLineForVertical(i8 - this.topPadding);
    }

    public final float getLineHeight(int i8) {
        return getLineBottom(i8) - getLineTop(i8);
    }

    public final float getLineLeft(int i8) {
        float f8;
        float lineLeft = this.layout.getLineLeft(i8);
        if (i8 == this.lineCount - 1) {
            f8 = this.leftPadding;
        } else {
            f8 = 0.0f;
        }
        return lineLeft + f8;
    }

    public final float getLineRight(int i8) {
        float f8;
        float lineRight = this.layout.getLineRight(i8);
        if (i8 == this.lineCount - 1) {
            f8 = this.rightPadding;
        } else {
            f8 = 0.0f;
        }
        return lineRight + f8;
    }

    public final int getLineStart(int i8) {
        return this.layout.getLineStart(i8);
    }

    public final float getLineTop(int i8) {
        int i9;
        float lineTop = this.layout.getLineTop(i8);
        if (i8 == 0) {
            i9 = 0;
        } else {
            i9 = this.topPadding;
        }
        return lineTop + i9;
    }

    public final int getLineVisibleEnd(int i8) {
        if (this.layout.getEllipsisStart(i8) == 0) {
            return getLayoutHelper().getLineVisibleEnd(i8);
        }
        return this.layout.getEllipsisStart(i8) + this.layout.getLineStart(i8);
    }

    public final float getLineWidth(int i8) {
        return this.layout.getLineWidth(i8);
    }

    public final float getMaxIntrinsicWidth() {
        return this.layoutIntrinsics.getMaxIntrinsicWidth();
    }

    public final float getMinIntrinsicWidth() {
        return this.layoutIntrinsics.getMinIntrinsicWidth();
    }

    public final int getOffsetForHorizontal(int i8, float f8) {
        return this.layout.getOffsetForHorizontal(i8, f8 + ((-1) * getHorizontalPadding(i8)));
    }

    public final int getParagraphDirection(int i8) {
        return this.layout.getParagraphDirection(i8);
    }

    public final float getPrimaryHorizontal(int i8, boolean z8) {
        return getLayoutHelper().getHorizontalPosition(i8, true, z8) + getHorizontalPadding(getLineForOffset(i8));
    }

    public final float getSecondaryHorizontal(int i8, boolean z8) {
        return getLayoutHelper().getHorizontalPosition(i8, false, z8) + getHorizontalPadding(getLineForOffset(i8));
    }

    public final void getSelectionPath(int i8, int i9, Path path) {
        this.layout.getSelectionPath(i8, i9, path);
        if (this.topPadding != 0 && !path.isEmpty()) {
            path.offset(0.0f, this.topPadding);
        }
    }

    public final CharSequence getText() {
        return this.layout.getText();
    }

    public final int getTopPadding$ui_text_release() {
        return this.topPadding;
    }

    public final boolean isFallbackLinespacingApplied$ui_text_release() {
        if (this.isBoringLayout) {
            BoringLayoutFactory boringLayoutFactory = BoringLayoutFactory.INSTANCE;
            Layout layout = this.layout;
            AbstractC3292y.g(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return boringLayoutFactory.isFallbackLineSpacingEnabled((BoringLayout) layout);
        }
        StaticLayoutFactory staticLayoutFactory = StaticLayoutFactory.INSTANCE;
        Layout layout2 = this.layout;
        AbstractC3292y.g(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return staticLayoutFactory.isFallbackLineSpacingEnabled((StaticLayout) layout2, this.fallbackLineSpacing);
    }

    public final boolean isLineEllipsized(int i8) {
        return TextLayoutKt.isLineEllipsized(this.layout, i8);
    }

    public final boolean isRtlCharAt(int i8) {
        return this.layout.isRtlCharAt(i8);
    }

    public final void paint(Canvas canvas) {
        TextAndroidCanvas textAndroidCanvas;
        if (!canvas.getClipBounds(this.rect)) {
            return;
        }
        int i8 = this.topPadding;
        if (i8 != 0) {
            canvas.translate(0.0f, i8);
        }
        textAndroidCanvas = TextLayoutKt.SharedTextAndroidCanvas;
        textAndroidCanvas.setCanvas(canvas);
        this.layout.draw(textAndroidCanvas);
        int i9 = this.topPadding;
        if (i9 != 0) {
            canvas.translate(0.0f, (-1) * i9);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ TextLayout(java.lang.CharSequence r24, float r25, android.text.TextPaint r26, int r27, android.text.TextUtils.TruncateAt r28, int r29, float r30, float r31, boolean r32, boolean r33, int r34, int r35, int r36, int r37, int r38, int r39, int[] r40, int[] r41, androidx.compose.ui.text.android.LayoutIntrinsics r42, int r43, kotlin.jvm.internal.AbstractC3284p r44) {
        /*
            Method dump skipped, instructions count: 180
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.TextLayout.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int, int, int[], int[], androidx.compose.ui.text.android.LayoutIntrinsics, int, kotlin.jvm.internal.p):void");
    }
}
