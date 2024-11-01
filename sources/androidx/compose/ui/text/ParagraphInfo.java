package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Path;
import i6.m;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ParagraphInfo {
    public static final int $stable = 8;
    private float bottom;
    private final int endIndex;
    private int endLineIndex;
    private final Paragraph paragraph;
    private final int startIndex;
    private int startLineIndex;
    private float top;

    public ParagraphInfo(Paragraph paragraph, int i8, int i9, int i10, int i11, float f8, float f9) {
        this.paragraph = paragraph;
        this.startIndex = i8;
        this.endIndex = i9;
        this.startLineIndex = i10;
        this.endLineIndex = i11;
        this.top = f8;
        this.bottom = f9;
    }

    public static /* synthetic */ ParagraphInfo copy$default(ParagraphInfo paragraphInfo, Paragraph paragraph, int i8, int i9, int i10, int i11, float f8, float f9, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            paragraph = paragraphInfo.paragraph;
        }
        if ((i12 & 2) != 0) {
            i8 = paragraphInfo.startIndex;
        }
        int i13 = i8;
        if ((i12 & 4) != 0) {
            i9 = paragraphInfo.endIndex;
        }
        int i14 = i9;
        if ((i12 & 8) != 0) {
            i10 = paragraphInfo.startLineIndex;
        }
        int i15 = i10;
        if ((i12 & 16) != 0) {
            i11 = paragraphInfo.endLineIndex;
        }
        int i16 = i11;
        if ((i12 & 32) != 0) {
            f8 = paragraphInfo.top;
        }
        float f10 = f8;
        if ((i12 & 64) != 0) {
            f9 = paragraphInfo.bottom;
        }
        return paragraphInfo.copy(paragraph, i13, i14, i15, i16, f10, f9);
    }

    public final Paragraph component1() {
        return this.paragraph;
    }

    public final int component2() {
        return this.startIndex;
    }

    public final int component3() {
        return this.endIndex;
    }

    public final int component4() {
        return this.startLineIndex;
    }

    public final int component5() {
        return this.endLineIndex;
    }

    public final float component6() {
        return this.top;
    }

    public final float component7() {
        return this.bottom;
    }

    public final ParagraphInfo copy(Paragraph paragraph, int i8, int i9, int i10, int i11, float f8, float f9) {
        return new ParagraphInfo(paragraph, i8, i9, i10, i11, f8, f9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParagraphInfo)) {
            return false;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) obj;
        return AbstractC3292y.d(this.paragraph, paragraphInfo.paragraph) && this.startIndex == paragraphInfo.startIndex && this.endIndex == paragraphInfo.endIndex && this.startLineIndex == paragraphInfo.startLineIndex && this.endLineIndex == paragraphInfo.endLineIndex && Float.compare(this.top, paragraphInfo.top) == 0 && Float.compare(this.bottom, paragraphInfo.bottom) == 0;
    }

    public final float getBottom() {
        return this.bottom;
    }

    public final int getEndIndex() {
        return this.endIndex;
    }

    public final int getEndLineIndex() {
        return this.endLineIndex;
    }

    public final int getLength() {
        return this.endIndex - this.startIndex;
    }

    public final Paragraph getParagraph() {
        return this.paragraph;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public final int getStartLineIndex() {
        return this.startLineIndex;
    }

    public final float getTop() {
        return this.top;
    }

    public int hashCode() {
        return (((((((((((this.paragraph.hashCode() * 31) + this.startIndex) * 31) + this.endIndex) * 31) + this.startLineIndex) * 31) + this.endLineIndex) * 31) + Float.floatToIntBits(this.top)) * 31) + Float.floatToIntBits(this.bottom);
    }

    public final void setBottom(float f8) {
        this.bottom = f8;
    }

    public final void setEndLineIndex(int i8) {
        this.endLineIndex = i8;
    }

    public final void setStartLineIndex(int i8) {
        this.startLineIndex = i8;
    }

    public final void setTop(float f8) {
        this.top = f8;
    }

    public final Rect toGlobal(Rect rect) {
        return rect.m2749translatek4lQ0M(OffsetKt.Offset(0.0f, this.top));
    }

    /* renamed from: toGlobal-GEjPoXI, reason: not valid java name */
    public final long m4558toGlobalGEjPoXI(long j8) {
        return TextRangeKt.TextRange(toGlobalIndex(TextRange.m4669getStartimpl(j8)), toGlobalIndex(TextRange.m4664getEndimpl(j8)));
    }

    public final int toGlobalIndex(int i8) {
        return i8 + this.startIndex;
    }

    public final int toGlobalLineIndex(int i8) {
        return i8 + this.startLineIndex;
    }

    public final float toGlobalYPosition(float f8) {
        return f8 + this.top;
    }

    /* renamed from: toLocal-MK-Hz9U, reason: not valid java name */
    public final long m4559toLocalMKHz9U(long j8) {
        return OffsetKt.Offset(Offset.m2712getXimpl(j8), Offset.m2713getYimpl(j8) - this.top);
    }

    public final int toLocalIndex(int i8) {
        return m.k(i8, this.startIndex, this.endIndex) - this.startIndex;
    }

    public final int toLocalLineIndex(int i8) {
        return i8 - this.startLineIndex;
    }

    public final float toLocalYPosition(float f8) {
        return f8 - this.top;
    }

    public String toString() {
        return "ParagraphInfo(paragraph=" + this.paragraph + ", startIndex=" + this.startIndex + ", endIndex=" + this.endIndex + ", startLineIndex=" + this.startLineIndex + ", endLineIndex=" + this.endLineIndex + ", top=" + this.top + ", bottom=" + this.bottom + ')';
    }

    public final Path toGlobal(Path path) {
        path.mo2849translatek4lQ0M(OffsetKt.Offset(0.0f, this.top));
        return path;
    }

    public /* synthetic */ ParagraphInfo(Paragraph paragraph, int i8, int i9, int i10, int i11, float f8, float f9, int i12, AbstractC3284p abstractC3284p) {
        this(paragraph, i8, i9, (i12 & 8) != 0 ? -1 : i10, (i12 & 16) != 0 ? -1 : i11, (i12 & 32) != 0 ? -1.0f : f8, (i12 & 64) != 0 ? -1.0f : f9);
    }
}
