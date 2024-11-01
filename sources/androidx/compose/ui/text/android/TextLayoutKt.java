package androidx.compose.ui.text.android;

import R5.AbstractC1428l;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import androidx.compose.ui.text.android.style.LineHeightStyleSpan;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextLayoutKt {
    private static final TextAndroidCanvas SharedTextAndroidCanvas = new TextAndroidCanvas();
    private static final long ZeroVerticalPadding = VerticalPaddings(0, 0);

    public static final long VerticalPaddings(int i8, int i9) {
        return VerticalPaddings.m4717constructorimpl((i9 & 4294967295L) | (i8 << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Paint.FontMetricsInt getLastLineMetrics(TextLayout textLayout, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        boolean z8;
        boolean trimLastLineBottom;
        int lineCount = textLayout.getLineCount() - 1;
        if (textLayout.getLayout().getLineStart(lineCount) == textLayout.getLayout().getLineEnd(lineCount)) {
            if (lineHeightStyleSpanArr.length == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (true ^ z8) {
                SpannableString spannableString = new SpannableString("\u200b");
                LineHeightStyleSpan lineHeightStyleSpan = (LineHeightStyleSpan) AbstractC1428l.c0(lineHeightStyleSpanArr);
                int length = spannableString.length();
                if (lineCount != 0 && lineHeightStyleSpan.getTrimLastLineBottom()) {
                    trimLastLineBottom = false;
                } else {
                    trimLastLineBottom = lineHeightStyleSpan.getTrimLastLineBottom();
                }
                spannableString.setSpan(lineHeightStyleSpan.copy$ui_text_release(0, length, trimLastLineBottom), 0, spannableString.length(), 33);
                StaticLayout create$default = StaticLayoutFactory.create$default(StaticLayoutFactory.INSTANCE, spannableString, textPaint, Integer.MAX_VALUE, 0, spannableString.length(), textDirectionHeuristic, null, 0, null, 0, 0.0f, 0.0f, 0, textLayout.getIncludePadding(), textLayout.getFallbackLineSpacing(), 0, 0, 0, 0, null, null, 2072512, null);
                Paint.FontMetricsInt fontMetricsInt = new Paint.FontMetricsInt();
                fontMetricsInt.ascent = create$default.getLineAscent(0);
                fontMetricsInt.descent = create$default.getLineDescent(0);
                fontMetricsInt.top = create$default.getLineTop(0);
                fontMetricsInt.bottom = create$default.getLineBottom(0);
                return fontMetricsInt;
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getLineHeightPaddings(TextLayout textLayout, LineHeightStyleSpan[] lineHeightStyleSpanArr) {
        int i8 = 0;
        int i9 = 0;
        for (LineHeightStyleSpan lineHeightStyleSpan : lineHeightStyleSpanArr) {
            if (lineHeightStyleSpan.getFirstAscentDiff() < 0) {
                i8 = Math.max(i8, Math.abs(lineHeightStyleSpan.getFirstAscentDiff()));
            }
            if (lineHeightStyleSpan.getLastDescentDiff() < 0) {
                i9 = Math.max(i8, Math.abs(lineHeightStyleSpan.getLastDescentDiff()));
            }
        }
        if (i8 == 0 && i9 == 0) {
            return ZeroVerticalPadding;
        }
        return VerticalPaddings(i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyleSpan[] getLineHeightSpans(TextLayout textLayout) {
        if (!(textLayout.getText() instanceof Spanned)) {
            return new LineHeightStyleSpan[0];
        }
        CharSequence text = textLayout.getText();
        AbstractC3292y.g(text, "null cannot be cast to non-null type android.text.Spanned");
        LineHeightStyleSpan[] lineHeightStyleSpanArr = (LineHeightStyleSpan[]) ((Spanned) text).getSpans(0, textLayout.getText().length(), LineHeightStyleSpan.class);
        if (lineHeightStyleSpanArr.length == 0) {
            return new LineHeightStyleSpan[0];
        }
        return lineHeightStyleSpanArr;
    }

    public static final TextDirectionHeuristic getTextDirectionHeuristic(int i8) {
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 != 4) {
                            if (i8 != 5) {
                                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            }
                            return TextDirectionHeuristics.LOCALE;
                        }
                        return TextDirectionHeuristics.ANYRTL_LTR;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        return TextDirectionHeuristics.LTR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long getVerticalPaddings(TextLayout textLayout) {
        int topPadding;
        int bottomPadding;
        if (!textLayout.getIncludePadding() && !textLayout.isFallbackLinespacingApplied$ui_text_release()) {
            TextPaint paint = textLayout.getLayout().getPaint();
            CharSequence text = textLayout.getLayout().getText();
            Rect charSequenceBounds = PaintExtensionsKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(0), textLayout.getLayout().getLineEnd(0));
            int lineAscent = textLayout.getLayout().getLineAscent(0);
            int i8 = charSequenceBounds.top;
            if (i8 < lineAscent) {
                topPadding = lineAscent - i8;
            } else {
                topPadding = textLayout.getLayout().getTopPadding();
            }
            if (textLayout.getLineCount() != 1) {
                int lineCount = textLayout.getLineCount() - 1;
                charSequenceBounds = PaintExtensionsKt.getCharSequenceBounds(paint, text, textLayout.getLayout().getLineStart(lineCount), textLayout.getLayout().getLineEnd(lineCount));
            }
            int lineDescent = textLayout.getLayout().getLineDescent(textLayout.getLineCount() - 1);
            int i9 = charSequenceBounds.bottom;
            if (i9 > lineDescent) {
                bottomPadding = i9 - lineDescent;
            } else {
                bottomPadding = textLayout.getLayout().getBottomPadding();
            }
            if (topPadding == 0 && bottomPadding == 0) {
                return ZeroVerticalPadding;
            }
            return VerticalPaddings(topPadding, bottomPadding);
        }
        return ZeroVerticalPadding;
    }

    public static final boolean isLineEllipsized(Layout layout, int i8) {
        if (layout.getEllipsisCount(i8) > 0) {
            return true;
        }
        return false;
    }
}
