package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.unit.IntSize;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextLayoutResult {
    public static final int $stable = 8;
    private final float firstBaseline;
    private final float lastBaseline;
    private final TextLayoutInput layoutInput;
    private final MultiParagraph multiParagraph;
    private final List<Rect> placeholderRects;
    private final long size;

    public /* synthetic */ TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j8, AbstractC3284p abstractC3284p) {
        this(textLayoutInput, multiParagraph, j8);
    }

    /* renamed from: copy-O0kMr_c$default, reason: not valid java name */
    public static /* synthetic */ TextLayoutResult m4639copyO0kMr_c$default(TextLayoutResult textLayoutResult, TextLayoutInput textLayoutInput, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            textLayoutInput = textLayoutResult.layoutInput;
        }
        if ((i8 & 2) != 0) {
            j8 = textLayoutResult.size;
        }
        return textLayoutResult.m4640copyO0kMr_c(textLayoutInput, j8);
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResult textLayoutResult, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        return textLayoutResult.getLineEnd(i8, z8);
    }

    /* renamed from: copy-O0kMr_c, reason: not valid java name */
    public final TextLayoutResult m4640copyO0kMr_c(TextLayoutInput textLayoutInput, long j8) {
        return new TextLayoutResult(textLayoutInput, this.multiParagraph, j8, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextLayoutResult)) {
            return false;
        }
        TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
        if (AbstractC3292y.d(this.layoutInput, textLayoutResult.layoutInput) && AbstractC3292y.d(this.multiParagraph, textLayoutResult.multiParagraph) && IntSize.m5319equalsimpl0(this.size, textLayoutResult.size) && this.firstBaseline == textLayoutResult.firstBaseline && this.lastBaseline == textLayoutResult.lastBaseline && AbstractC3292y.d(this.placeholderRects, textLayoutResult.placeholderRects)) {
            return true;
        }
        return false;
    }

    public final ResolvedTextDirection getBidiRunDirection(int i8) {
        return this.multiParagraph.getBidiRunDirection(i8);
    }

    public final Rect getBoundingBox(int i8) {
        return this.multiParagraph.getBoundingBox(i8);
    }

    public final Rect getCursorRect(int i8) {
        return this.multiParagraph.getCursorRect(i8);
    }

    public final boolean getDidOverflowHeight() {
        if (!this.multiParagraph.getDidExceedMaxLines() && IntSize.m5320getHeightimpl(this.size) >= this.multiParagraph.getHeight()) {
            return false;
        }
        return true;
    }

    public final boolean getDidOverflowWidth() {
        if (IntSize.m5321getWidthimpl(this.size) < this.multiParagraph.getWidth()) {
            return true;
        }
        return false;
    }

    public final float getFirstBaseline() {
        return this.firstBaseline;
    }

    public final boolean getHasVisualOverflow() {
        if (!getDidOverflowWidth() && !getDidOverflowHeight()) {
            return false;
        }
        return true;
    }

    public final float getHorizontalPosition(int i8, boolean z8) {
        return this.multiParagraph.getHorizontalPosition(i8, z8);
    }

    public final float getLastBaseline() {
        return this.lastBaseline;
    }

    public final TextLayoutInput getLayoutInput() {
        return this.layoutInput;
    }

    public final float getLineBottom(int i8) {
        return this.multiParagraph.getLineBottom(i8);
    }

    public final int getLineCount() {
        return this.multiParagraph.getLineCount();
    }

    public final int getLineEnd(int i8, boolean z8) {
        return this.multiParagraph.getLineEnd(i8, z8);
    }

    public final int getLineForOffset(int i8) {
        return this.multiParagraph.getLineForOffset(i8);
    }

    public final int getLineForVerticalPosition(float f8) {
        return this.multiParagraph.getLineForVerticalPosition(f8);
    }

    public final float getLineLeft(int i8) {
        return this.multiParagraph.getLineLeft(i8);
    }

    public final float getLineRight(int i8) {
        return this.multiParagraph.getLineRight(i8);
    }

    public final int getLineStart(int i8) {
        return this.multiParagraph.getLineStart(i8);
    }

    public final float getLineTop(int i8) {
        return this.multiParagraph.getLineTop(i8);
    }

    public final MultiParagraph getMultiParagraph() {
        return this.multiParagraph;
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m4641getOffsetForPositionk4lQ0M(long j8) {
        return this.multiParagraph.m4549getOffsetForPositionk4lQ0M(j8);
    }

    public final ResolvedTextDirection getParagraphDirection(int i8) {
        return this.multiParagraph.getParagraphDirection(i8);
    }

    public final Path getPathForRange(int i8, int i9) {
        return this.multiParagraph.getPathForRange(i8, i9);
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    /* renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m4642getSizeYbymL2g() {
        return this.size;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m4643getWordBoundaryjx7JFs(int i8) {
        return this.multiParagraph.m4550getWordBoundaryjx7JFs(i8);
    }

    public int hashCode() {
        return (((((((((this.layoutInput.hashCode() * 31) + this.multiParagraph.hashCode()) * 31) + IntSize.m5322hashCodeimpl(this.size)) * 31) + Float.floatToIntBits(this.firstBaseline)) * 31) + Float.floatToIntBits(this.lastBaseline)) * 31) + this.placeholderRects.hashCode();
    }

    public final boolean isLineEllipsized(int i8) {
        return this.multiParagraph.isLineEllipsized(i8);
    }

    public String toString() {
        return "TextLayoutResult(layoutInput=" + this.layoutInput + ", multiParagraph=" + this.multiParagraph + ", size=" + ((Object) IntSize.m5324toStringimpl(this.size)) + ", firstBaseline=" + this.firstBaseline + ", lastBaseline=" + this.lastBaseline + ", placeholderRects=" + this.placeholderRects + ')';
    }

    private TextLayoutResult(TextLayoutInput textLayoutInput, MultiParagraph multiParagraph, long j8) {
        this.layoutInput = textLayoutInput;
        this.multiParagraph = multiParagraph;
        this.size = j8;
        this.firstBaseline = multiParagraph.getFirstBaseline();
        this.lastBaseline = multiParagraph.getLastBaseline();
        this.placeholderRects = multiParagraph.getPlaceholderRects();
    }
}
