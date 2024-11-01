package androidx.compose.ui.text;

import R5.AbstractC1435t;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.font.DelegatingFontLoaderForDeprecatedUsage_androidKt;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.platform.AndroidMultiParagraphDraw_androidKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import i6.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.P;
import kotlin.jvm.internal.Q;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class MultiParagraph {
    public static final int $stable = 8;
    private final boolean didExceedMaxLines;
    private final float height;
    private final MultiParagraphIntrinsics intrinsics;
    private final int lineCount;
    private final int maxLines;
    private final List<ParagraphInfo> paragraphInfoList;
    private final List<Rect> placeholderRects;
    private final float width;

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j8, Density density, FontFamily.Resolver resolver, List list, int i8, boolean z8, AbstractC3284p abstractC3284p) {
        this(annotatedString, textStyle, j8, density, resolver, (List<AnnotatedString.Range<Placeholder>>) list, i8, z8);
    }

    private final AnnotatedString getAnnotatedString() {
        return this.intrinsics.getAnnotatedString();
    }

    public static /* synthetic */ int getLineEnd$default(MultiParagraph multiParagraph, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        return multiParagraph.getLineEnd(i8, z8);
    }

    /* renamed from: paint-LG529CI$default, reason: not valid java name */
    public static /* synthetic */ void m4545paintLG529CI$default(MultiParagraph multiParagraph, Canvas canvas, long j8, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i8, int i9, Object obj) {
        long j9;
        Shadow shadow2;
        TextDecoration textDecoration2;
        int i10;
        if ((i9 & 2) != 0) {
            j9 = Color.Companion.m2984getUnspecified0d7_KjU();
        } else {
            j9 = j8;
        }
        DrawStyle drawStyle2 = null;
        if ((i9 & 4) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i9 & 8) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i9 & 16) == 0) {
            drawStyle2 = drawStyle;
        }
        if ((i9 & 32) != 0) {
            i10 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
        } else {
            i10 = i8;
        }
        multiParagraph.m4551paintLG529CI(canvas, j9, shadow2, textDecoration2, drawStyle2, i10);
    }

    /* renamed from: paint-RPmYEkk$default, reason: not valid java name */
    public static /* synthetic */ void m4546paintRPmYEkk$default(MultiParagraph multiParagraph, Canvas canvas, long j8, Shadow shadow, TextDecoration textDecoration, int i8, Object obj) {
        Shadow shadow2;
        TextDecoration textDecoration2;
        if ((i8 & 2) != 0) {
            j8 = Color.Companion.m2984getUnspecified0d7_KjU();
        }
        long j9 = j8;
        if ((i8 & 4) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i8 & 8) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        multiParagraph.m4552paintRPmYEkk(canvas, j9, shadow2, textDecoration2);
    }

    /* renamed from: paint-hn5TExg$default, reason: not valid java name */
    public static /* synthetic */ void m4547painthn5TExg$default(MultiParagraph multiParagraph, Canvas canvas, Brush brush, float f8, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i8, int i9, Object obj) {
        float f9;
        Shadow shadow2;
        TextDecoration textDecoration2;
        DrawStyle drawStyle2;
        int i10;
        if ((i9 & 4) != 0) {
            f9 = Float.NaN;
        } else {
            f9 = f8;
        }
        if ((i9 & 8) != 0) {
            shadow2 = null;
        } else {
            shadow2 = shadow;
        }
        if ((i9 & 16) != 0) {
            textDecoration2 = null;
        } else {
            textDecoration2 = textDecoration;
        }
        if ((i9 & 32) != 0) {
            drawStyle2 = null;
        } else {
            drawStyle2 = drawStyle;
        }
        if ((i9 & 64) != 0) {
            i10 = DrawScope.Companion.m3421getDefaultBlendMode0nO6VwU();
        } else {
            i10 = i8;
        }
        multiParagraph.m4553painthn5TExg(canvas, brush, f9, shadow2, textDecoration2, drawStyle2, i10);
    }

    private final void requireIndexInRange(int i8) {
        if (i8 >= 0 && i8 < getAnnotatedString().getText().length()) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i8 + ") is out of bounds [0, " + getAnnotatedString().length() + ')').toString());
    }

    private final void requireIndexInRangeInclusiveEnd(int i8) {
        if (i8 >= 0 && i8 <= getAnnotatedString().getText().length()) {
            return;
        }
        throw new IllegalArgumentException(("offset(" + i8 + ") is out of bounds [0, " + getAnnotatedString().length() + ']').toString());
    }

    private final void requireLineIndexInRange(int i8) {
        if (i8 >= 0 && i8 < this.lineCount) {
            return;
        }
        throw new IllegalArgumentException(("lineIndex(" + i8 + ") is out of bounds [0, " + this.lineCount + ')').toString());
    }

    /* renamed from: fillBoundingBoxes-8ffj60Q, reason: not valid java name */
    public final float[] m4548fillBoundingBoxes8ffj60Q(long j8, float[] fArr, @IntRange(from = 0) int i8) {
        requireIndexInRange(TextRange.m4667getMinimpl(j8));
        requireIndexInRangeInclusiveEnd(TextRange.m4666getMaximpl(j8));
        Q q8 = new Q();
        q8.f34571a = i8;
        MultiParagraphKt.m4554findParagraphsByRangeSbBc2M(this.paragraphInfoList, j8, new MultiParagraph$fillBoundingBoxes$1(j8, fArr, q8, new P()));
        return fArr;
    }

    public final ResolvedTextDirection getBidiRunDirection(int i8) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i8);
        if (i8 == getAnnotatedString().length()) {
            findParagraphByIndex = AbstractC1435t.o(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i8);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getBidiRunDirection(paragraphInfo.toLocalIndex(i8));
    }

    public final Rect getBoundingBox(int i8) {
        requireIndexInRange(i8);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i8));
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getBoundingBox(paragraphInfo.toLocalIndex(i8)));
    }

    public final Rect getCursorRect(int i8) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i8);
        if (i8 == getAnnotatedString().length()) {
            findParagraphByIndex = AbstractC1435t.o(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i8);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.toGlobal(paragraphInfo.getParagraph().getCursorRect(paragraphInfo.toLocalIndex(i8)));
    }

    public final boolean getDidExceedMaxLines() {
        return this.didExceedMaxLines;
    }

    public final float getFirstBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        return this.paragraphInfoList.get(0).getParagraph().getFirstBaseline();
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getHorizontalPosition(int i8, boolean z8) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i8);
        if (i8 == getAnnotatedString().length()) {
            findParagraphByIndex = AbstractC1435t.o(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i8);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getHorizontalPosition(paragraphInfo.toLocalIndex(i8), z8);
    }

    public final MultiParagraphIntrinsics getIntrinsics() {
        return this.intrinsics;
    }

    public final float getLastBaseline() {
        if (this.paragraphInfoList.isEmpty()) {
            return 0.0f;
        }
        ParagraphInfo paragraphInfo = (ParagraphInfo) AbstractC1435t.y0(this.paragraphInfoList);
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLastBaseline());
    }

    public final float getLineBottom(int i8) {
        requireLineIndexInRange(i8);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i8));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineBottom(paragraphInfo.toLocalLineIndex(i8)));
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    public final int getLineEnd(int i8, boolean z8) {
        requireLineIndexInRange(i8);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i8));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineEnd(paragraphInfo.toLocalLineIndex(i8), z8));
    }

    public final int getLineForOffset(int i8) {
        int findParagraphByIndex;
        if (i8 >= getAnnotatedString().length()) {
            findParagraphByIndex = AbstractC1435t.o(this.paragraphInfoList);
        } else if (i8 < 0) {
            findParagraphByIndex = 0;
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i8);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForOffset(paragraphInfo.toLocalIndex(i8)));
    }

    public final int getLineForVerticalPosition(float f8) {
        int findParagraphByY;
        if (f8 <= 0.0f) {
            findParagraphByY = 0;
        } else if (f8 >= this.height) {
            findParagraphByY = AbstractC1435t.o(this.paragraphInfoList);
        } else {
            findParagraphByY = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, f8);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByY);
        if (paragraphInfo.getLength() == 0) {
            return paragraphInfo.getStartLineIndex();
        }
        return paragraphInfo.toGlobalLineIndex(paragraphInfo.getParagraph().getLineForVerticalPosition(paragraphInfo.toLocalYPosition(f8)));
    }

    public final float getLineHeight(int i8) {
        requireLineIndexInRange(i8);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i8));
        return paragraphInfo.getParagraph().getLineHeight(paragraphInfo.toLocalLineIndex(i8));
    }

    public final float getLineLeft(int i8) {
        requireLineIndexInRange(i8);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i8));
        return paragraphInfo.getParagraph().getLineLeft(paragraphInfo.toLocalLineIndex(i8));
    }

    public final float getLineRight(int i8) {
        requireLineIndexInRange(i8);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i8));
        return paragraphInfo.getParagraph().getLineRight(paragraphInfo.toLocalLineIndex(i8));
    }

    public final int getLineStart(int i8) {
        requireLineIndexInRange(i8);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i8));
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().getLineStart(paragraphInfo.toLocalLineIndex(i8)));
    }

    public final float getLineTop(int i8) {
        requireLineIndexInRange(i8);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i8));
        return paragraphInfo.toGlobalYPosition(paragraphInfo.getParagraph().getLineTop(paragraphInfo.toLocalLineIndex(i8)));
    }

    public final float getLineWidth(int i8) {
        requireLineIndexInRange(i8);
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i8));
        return paragraphInfo.getParagraph().getLineWidth(paragraphInfo.toLocalLineIndex(i8));
    }

    public final float getMaxIntrinsicWidth() {
        return this.intrinsics.getMaxIntrinsicWidth();
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final float getMinIntrinsicWidth() {
        return this.intrinsics.getMinIntrinsicWidth();
    }

    /* renamed from: getOffsetForPosition-k-4lQ0M, reason: not valid java name */
    public final int m4549getOffsetForPositionk4lQ0M(long j8) {
        int findParagraphByY;
        if (Offset.m2713getYimpl(j8) <= 0.0f) {
            findParagraphByY = 0;
        } else if (Offset.m2713getYimpl(j8) >= this.height) {
            findParagraphByY = AbstractC1435t.o(this.paragraphInfoList);
        } else {
            findParagraphByY = MultiParagraphKt.findParagraphByY(this.paragraphInfoList, Offset.m2713getYimpl(j8));
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByY);
        if (paragraphInfo.getLength() == 0) {
            return paragraphInfo.getStartIndex();
        }
        return paragraphInfo.toGlobalIndex(paragraphInfo.getParagraph().mo4520getOffsetForPositionk4lQ0M(paragraphInfo.m4559toLocalMKHz9U(j8)));
    }

    public final ResolvedTextDirection getParagraphDirection(int i8) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i8);
        if (i8 == getAnnotatedString().length()) {
            findParagraphByIndex = AbstractC1435t.o(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i8);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.getParagraph().getParagraphDirection(paragraphInfo.toLocalIndex(i8));
    }

    public final List<ParagraphInfo> getParagraphInfoList$ui_text_release() {
        return this.paragraphInfoList;
    }

    public final Path getPathForRange(int i8, int i9) {
        if (i8 >= 0 && i8 <= i9 && i9 <= getAnnotatedString().getText().length()) {
            if (i8 == i9) {
                return AndroidPath_androidKt.Path();
            }
            Path Path = AndroidPath_androidKt.Path();
            MultiParagraphKt.m4554findParagraphsByRangeSbBc2M(this.paragraphInfoList, TextRangeKt.TextRange(i8, i9), new MultiParagraph$getPathForRange$2(Path, i8, i9));
            return Path;
        }
        throw new IllegalArgumentException(("Start(" + i8 + ") or End(" + i9 + ") is out of range [0.." + getAnnotatedString().getText().length() + "), or start > end!").toString());
    }

    public final List<Rect> getPlaceholderRects() {
        return this.placeholderRects;
    }

    public final float getWidth() {
        return this.width;
    }

    /* renamed from: getWordBoundary--jx7JFs, reason: not valid java name */
    public final long m4550getWordBoundaryjx7JFs(int i8) {
        int findParagraphByIndex;
        requireIndexInRangeInclusiveEnd(i8);
        if (i8 == getAnnotatedString().length()) {
            findParagraphByIndex = AbstractC1435t.o(this.paragraphInfoList);
        } else {
            findParagraphByIndex = MultiParagraphKt.findParagraphByIndex(this.paragraphInfoList, i8);
        }
        ParagraphInfo paragraphInfo = this.paragraphInfoList.get(findParagraphByIndex);
        return paragraphInfo.m4558toGlobalGEjPoXI(paragraphInfo.getParagraph().mo4521getWordBoundaryjx7JFs(paragraphInfo.toLocalIndex(i8)));
    }

    public final boolean isLineEllipsized(int i8) {
        requireLineIndexInRange(i8);
        return this.paragraphInfoList.get(MultiParagraphKt.findParagraphByLineIndex(this.paragraphInfoList, i8)).getParagraph().isLineEllipsized(i8);
    }

    /* renamed from: paint-LG529CI, reason: not valid java name */
    public final void m4551paintLG529CI(Canvas canvas, long j8, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i8) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            ParagraphInfo paragraphInfo = list.get(i9);
            paragraphInfo.getParagraph().mo4522paintLG529CI(canvas, j8, shadow, textDecoration, drawStyle, i8);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* renamed from: paint-RPmYEkk, reason: not valid java name */
    public final /* synthetic */ void m4552paintRPmYEkk(Canvas canvas, long j8, Shadow shadow, TextDecoration textDecoration) {
        canvas.save();
        List<ParagraphInfo> list = this.paragraphInfoList;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            ParagraphInfo paragraphInfo = list.get(i8);
            paragraphInfo.getParagraph().mo4523paintRPmYEkk(canvas, j8, shadow, textDecoration);
            canvas.translate(0.0f, paragraphInfo.getParagraph().getHeight());
        }
        canvas.restore();
    }

    /* renamed from: paint-hn5TExg, reason: not valid java name */
    public final void m4553painthn5TExg(Canvas canvas, Brush brush, float f8, Shadow shadow, TextDecoration textDecoration, DrawStyle drawStyle, int i8) {
        AndroidMultiParagraphDraw_androidKt.m4911drawMultiParagraph7AXcY_I(this, canvas, brush, f8, shadow, textDecoration, drawStyle, i8);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j8, int i8, boolean z8, AbstractC3284p abstractC3284p) {
        this(multiParagraphIntrinsics, j8, i8, z8);
    }

    private MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j8, int i8, boolean z8) {
        boolean z9;
        int m5122getMaxHeightimpl;
        this.intrinsics = multiParagraphIntrinsics;
        this.maxLines = i8;
        if (Constraints.m5125getMinWidthimpl(j8) == 0 && Constraints.m5124getMinHeightimpl(j8) == 0) {
            ArrayList arrayList = new ArrayList();
            List<ParagraphIntrinsicInfo> infoList$ui_text_release = multiParagraphIntrinsics.getInfoList$ui_text_release();
            int size = infoList$ui_text_release.size();
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            float f8 = 0.0f;
            while (i10 < size) {
                ParagraphIntrinsicInfo paragraphIntrinsicInfo = infoList$ui_text_release.get(i10);
                ParagraphIntrinsics intrinsics = paragraphIntrinsicInfo.getIntrinsics();
                int m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(j8);
                if (Constraints.m5118getHasBoundedHeightimpl(j8)) {
                    m5122getMaxHeightimpl = m.d(Constraints.m5122getMaxHeightimpl(j8) - ParagraphKt.ceilToInt(f8), i9);
                } else {
                    m5122getMaxHeightimpl = Constraints.m5122getMaxHeightimpl(j8);
                }
                Paragraph m4562Paragraph_EkL_Y = ParagraphKt.m4562Paragraph_EkL_Y(intrinsics, ConstraintsKt.Constraints$default(0, m5123getMaxWidthimpl, 0, m5122getMaxHeightimpl, 5, null), this.maxLines - i11, z8);
                float height = f8 + m4562Paragraph_EkL_Y.getHeight();
                int lineCount = i11 + m4562Paragraph_EkL_Y.getLineCount();
                List<ParagraphIntrinsicInfo> list = infoList$ui_text_release;
                arrayList.add(new ParagraphInfo(m4562Paragraph_EkL_Y, paragraphIntrinsicInfo.getStartIndex(), paragraphIntrinsicInfo.getEndIndex(), i11, lineCount, f8, height));
                if (m4562Paragraph_EkL_Y.getDidExceedMaxLines() || (lineCount == this.maxLines && i10 != AbstractC1435t.o(this.intrinsics.getInfoList$ui_text_release()))) {
                    z9 = true;
                    i11 = lineCount;
                    f8 = height;
                    break;
                } else {
                    i10++;
                    i11 = lineCount;
                    f8 = height;
                    i9 = 0;
                    infoList$ui_text_release = list;
                }
            }
            z9 = false;
            this.height = f8;
            this.lineCount = i11;
            this.didExceedMaxLines = z9;
            this.paragraphInfoList = arrayList;
            this.width = Constraints.m5123getMaxWidthimpl(j8);
            List<Rect> arrayList2 = new ArrayList<>(arrayList.size());
            int size2 = arrayList.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ParagraphInfo paragraphInfo = (ParagraphInfo) arrayList.get(i12);
                List<Rect> placeholderRects = paragraphInfo.getParagraph().getPlaceholderRects();
                ArrayList arrayList3 = new ArrayList(placeholderRects.size());
                int size3 = placeholderRects.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    Rect rect = placeholderRects.get(i13);
                    arrayList3.add(rect != null ? paragraphInfo.toGlobal(rect) : null);
                }
                AbstractC1435t.C(arrayList2, arrayList3);
            }
            if (arrayList2.size() < this.intrinsics.getPlaceholders().size()) {
                int size4 = this.intrinsics.getPlaceholders().size() - arrayList2.size();
                ArrayList arrayList4 = new ArrayList(size4);
                for (int i14 = 0; i14 < size4; i14++) {
                    arrayList4.add(null);
                }
                arrayList2 = AbstractC1435t.G0(arrayList2, arrayList4);
            }
            this.placeholderRects = arrayList2;
            return;
        }
        throw new IllegalArgumentException("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.".toString());
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, long j8, int i8, boolean z8, int i9, AbstractC3284p abstractC3284p) {
        this(multiParagraphIntrinsics, j8, (i9 & 4) != 0 ? Integer.MAX_VALUE : i8, (i9 & 8) != 0 ? false : z8, null);
    }

    public /* synthetic */ MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i8, boolean z8, float f8, int i9, AbstractC3284p abstractC3284p) {
        this(multiParagraphIntrinsics, (i9 & 2) != 0 ? Integer.MAX_VALUE : i8, (i9 & 4) != 0 ? false : z8, f8);
    }

    public MultiParagraph(MultiParagraphIntrinsics multiParagraphIntrinsics, int i8, boolean z8, float f8) {
        this(multiParagraphIntrinsics, ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f8), 0, 0, 13, null), i8, z8, null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List list, int i8, boolean z8, float f8, Density density, Font.ResourceLoader resourceLoader, int i9, AbstractC3284p abstractC3284p) {
        this(annotatedString, textStyle, (List<AnnotatedString.Range<Placeholder>>) ((i9 & 4) != 0 ? AbstractC1435t.m() : list), (i9 & 8) != 0 ? Integer.MAX_VALUE : i8, (i9 & 16) != 0 ? false : z8, f8, density, resourceLoader);
    }

    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, List<AnnotatedString.Range<Placeholder>> list, int i8, boolean z8, float f8, Density density, Font.ResourceLoader resourceLoader) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, DelegatingFontLoaderForDeprecatedUsage_androidKt.createFontFamilyResolver(resourceLoader)), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f8), 0, 0, 13, null), i8, z8, null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f8, Density density, FontFamily.Resolver resolver, List list, int i8, boolean z8, int i9, AbstractC3284p abstractC3284p) {
        this(annotatedString, textStyle, f8, density, resolver, (List<AnnotatedString.Range<Placeholder>>) ((i9 & 32) != 0 ? AbstractC1435t.m() : list), (i9 & 64) != 0 ? Integer.MAX_VALUE : i8, (i9 & 128) != 0 ? false : z8);
    }

    public MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, float f8, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i8, boolean z8) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), ConstraintsKt.Constraints$default(0, ParagraphKt.ceilToInt(f8), 0, 0, 13, null), i8, z8, null);
    }

    public /* synthetic */ MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j8, Density density, FontFamily.Resolver resolver, List list, int i8, boolean z8, int i9, AbstractC3284p abstractC3284p) {
        this(annotatedString, textStyle, j8, density, resolver, (i9 & 32) != 0 ? AbstractC1435t.m() : list, (i9 & 64) != 0 ? Integer.MAX_VALUE : i8, (i9 & 128) != 0 ? false : z8, null);
    }

    private MultiParagraph(AnnotatedString annotatedString, TextStyle textStyle, long j8, Density density, FontFamily.Resolver resolver, List<AnnotatedString.Range<Placeholder>> list, int i8, boolean z8) {
        this(new MultiParagraphIntrinsics(annotatedString, textStyle, list, density, resolver), j8, i8, z8, null);
    }
}
