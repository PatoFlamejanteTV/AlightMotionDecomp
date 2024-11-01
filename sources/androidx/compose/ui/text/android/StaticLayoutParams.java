package androidx.compose.ui.text.android;

import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.jvm.internal.AbstractC3284p;

/* loaded from: classes.dex */
final class StaticLayoutParams {
    private final Layout.Alignment alignment;
    private final int breakStrategy;
    private final TextUtils.TruncateAt ellipsize;
    private final int ellipsizedWidth;
    private final int end;
    private final int hyphenationFrequency;
    private final boolean includePadding;
    private final int justificationMode;
    private final int[] leftIndents;
    private final int lineBreakStyle;
    private final int lineBreakWordStyle;
    private final float lineSpacingExtra;
    private final float lineSpacingMultiplier;
    private final int maxLines;
    private final TextPaint paint;
    private final int[] rightIndents;
    private final int start;
    private final CharSequence text;
    private final TextDirectionHeuristic textDir;
    private final boolean useFallbackLineSpacing;
    private final int width;

    public StaticLayoutParams(CharSequence charSequence, int i8, int i9, TextPaint textPaint, int i10, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i11, TextUtils.TruncateAt truncateAt, int i12, float f8, float f9, int i13, boolean z8, boolean z9, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2) {
        this.text = charSequence;
        this.start = i8;
        this.end = i9;
        this.paint = textPaint;
        this.width = i10;
        this.textDir = textDirectionHeuristic;
        this.alignment = alignment;
        this.maxLines = i11;
        this.ellipsize = truncateAt;
        this.ellipsizedWidth = i12;
        this.lineSpacingMultiplier = f8;
        this.lineSpacingExtra = f9;
        this.justificationMode = i13;
        this.includePadding = z8;
        this.useFallbackLineSpacing = z9;
        this.breakStrategy = i14;
        this.lineBreakStyle = i15;
        this.lineBreakWordStyle = i16;
        this.hyphenationFrequency = i17;
        this.leftIndents = iArr;
        this.rightIndents = iArr2;
        if (i8 >= 0 && i8 <= i9) {
            int length = charSequence.length();
            if (i9 < 0 || i9 > length) {
                throw new IllegalArgumentException("invalid end value".toString());
            }
            if (i11 < 0) {
                throw new IllegalArgumentException("invalid maxLines value".toString());
            }
            if (i10 < 0) {
                throw new IllegalArgumentException("invalid width value".toString());
            }
            if (i12 < 0) {
                throw new IllegalArgumentException("invalid ellipsizedWidth value".toString());
            }
            if (f8 < 0.0f) {
                throw new IllegalArgumentException("invalid lineSpacingMultiplier value".toString());
            }
            return;
        }
        throw new IllegalArgumentException("invalid start value".toString());
    }

    public final Layout.Alignment getAlignment() {
        return this.alignment;
    }

    public final int getBreakStrategy() {
        return this.breakStrategy;
    }

    public final TextUtils.TruncateAt getEllipsize() {
        return this.ellipsize;
    }

    public final int getEllipsizedWidth() {
        return this.ellipsizedWidth;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getHyphenationFrequency() {
        return this.hyphenationFrequency;
    }

    public final boolean getIncludePadding() {
        return this.includePadding;
    }

    public final int getJustificationMode() {
        return this.justificationMode;
    }

    public final int[] getLeftIndents() {
        return this.leftIndents;
    }

    public final int getLineBreakStyle() {
        return this.lineBreakStyle;
    }

    public final int getLineBreakWordStyle() {
        return this.lineBreakWordStyle;
    }

    public final float getLineSpacingExtra() {
        return this.lineSpacingExtra;
    }

    public final float getLineSpacingMultiplier() {
        return this.lineSpacingMultiplier;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final TextPaint getPaint() {
        return this.paint;
    }

    public final int[] getRightIndents() {
        return this.rightIndents;
    }

    public final int getStart() {
        return this.start;
    }

    public final CharSequence getText() {
        return this.text;
    }

    public final TextDirectionHeuristic getTextDir() {
        return this.textDir;
    }

    public final boolean getUseFallbackLineSpacing() {
        return this.useFallbackLineSpacing;
    }

    public final int getWidth() {
        return this.width;
    }

    public /* synthetic */ StaticLayoutParams(CharSequence charSequence, int i8, int i9, TextPaint textPaint, int i10, TextDirectionHeuristic textDirectionHeuristic, Layout.Alignment alignment, int i11, TextUtils.TruncateAt truncateAt, int i12, float f8, float f9, int i13, boolean z8, boolean z9, int i14, int i15, int i16, int i17, int[] iArr, int[] iArr2, int i18, AbstractC3284p abstractC3284p) {
        this(charSequence, (i18 & 2) != 0 ? 0 : i8, i9, textPaint, i10, textDirectionHeuristic, alignment, i11, truncateAt, i12, f8, f9, i13, z8, z9, i14, i15, i16, i17, iArr, iArr2);
    }
}
