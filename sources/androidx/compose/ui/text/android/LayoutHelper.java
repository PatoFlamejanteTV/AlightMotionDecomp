package androidx.compose.ui.text.android;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import android.text.Layout;
import androidx.annotation.IntRange;
import androidx.compose.runtime.internal.StabilityInferred;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LayoutHelper {
    public static final int $stable = 8;
    private final boolean[] bidiProcessedParagraphs;
    private final Layout layout;
    private final List<Bidi> paragraphBidi;
    private final int paragraphCount;
    private final List<Integer> paragraphEnds;
    private char[] tmpBuffer;

    /* loaded from: classes.dex */
    private static final class BidiRun {
        private final int end;
        private final boolean isRtl;
        private final int start;

        public BidiRun(int i8, int i9, boolean z8) {
            this.start = i8;
            this.end = i9;
            this.isRtl = z8;
        }

        public static /* synthetic */ BidiRun copy$default(BidiRun bidiRun, int i8, int i9, boolean z8, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i8 = bidiRun.start;
            }
            if ((i10 & 2) != 0) {
                i9 = bidiRun.end;
            }
            if ((i10 & 4) != 0) {
                z8 = bidiRun.isRtl;
            }
            return bidiRun.copy(i8, i9, z8);
        }

        public final int component1() {
            return this.start;
        }

        public final int component2() {
            return this.end;
        }

        public final boolean component3() {
            return this.isRtl;
        }

        public final BidiRun copy(int i8, int i9, boolean z8) {
            return new BidiRun(i8, i9, z8);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BidiRun)) {
                return false;
            }
            BidiRun bidiRun = (BidiRun) obj;
            return this.start == bidiRun.start && this.end == bidiRun.end && this.isRtl == bidiRun.isRtl;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public int hashCode() {
            return (((this.start * 31) + this.end) * 31) + androidx.compose.foundation.a.a(this.isRtl);
        }

        public final boolean isRtl() {
            return this.isRtl;
        }

        public String toString() {
            return "BidiRun(start=" + this.start + ", end=" + this.end + ", isRtl=" + this.isRtl + ')';
        }
    }

    public LayoutHelper(Layout layout) {
        int i8;
        this.layout = layout;
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        do {
            int Q8 = l6.n.Q(this.layout.getText(), '\n', i9, false, 4, null);
            if (Q8 < 0) {
                i8 = this.layout.getText().length();
            } else {
                i8 = Q8 + 1;
            }
            i9 = i8;
            arrayList.add(Integer.valueOf(i9));
        } while (i9 < this.layout.getText().length());
        this.paragraphEnds = arrayList;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            arrayList2.add(null);
        }
        this.paragraphBidi = arrayList2;
        this.bidiProcessedParagraphs = new boolean[this.paragraphEnds.size()];
        this.paragraphCount = this.paragraphEnds.size();
    }

    private final float getDownstreamHorizontal(int i8, boolean z8) {
        int g8 = i6.m.g(i8, this.layout.getLineEnd(this.layout.getLineForOffset(i8)));
        if (z8) {
            return this.layout.getPrimaryHorizontal(g8);
        }
        return this.layout.getSecondaryHorizontal(g8);
    }

    public static /* synthetic */ int getParagraphForOffset$default(LayoutHelper layoutHelper, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        return layoutHelper.getParagraphForOffset(i8, z8);
    }

    private final int lineEndToVisibleEnd(int i8, int i9) {
        while (i8 > i9 && isLineEndSpace(this.layout.getText().charAt(i8 - 1))) {
            i8--;
        }
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:            if (r0.getRunCount() == 1) goto L21;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.text.Bidi analyzeBidi(int r12) {
        /*
            r11 = this;
            boolean[] r0 = r11.bidiProcessedParagraphs
            boolean r0 = r0[r12]
            if (r0 == 0) goto Lf
            java.util.List<java.text.Bidi> r0 = r11.paragraphBidi
            java.lang.Object r12 = r0.get(r12)
            java.text.Bidi r12 = (java.text.Bidi) r12
            return r12
        Lf:
            r0 = 0
            if (r12 != 0) goto L14
            r1 = 0
            goto L22
        L14:
            java.util.List<java.lang.Integer> r1 = r11.paragraphEnds
            int r2 = r12 + (-1)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
        L22:
            java.util.List<java.lang.Integer> r2 = r11.paragraphEnds
            java.lang.Object r2 = r2.get(r12)
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int r8 = r2 - r1
            char[] r3 = r11.tmpBuffer
            if (r3 == 0) goto L3a
            int r4 = r3.length
            if (r4 >= r8) goto L38
            goto L3a
        L38:
            r10 = r3
            goto L3d
        L3a:
            char[] r3 = new char[r8]
            goto L38
        L3d:
            android.text.Layout r3 = r11.layout
            java.lang.CharSequence r3 = r3.getText()
            android.text.TextUtils.getChars(r3, r1, r2, r10, r0)
            boolean r0 = java.text.Bidi.requiresBidi(r10, r0, r8)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            boolean r9 = r11.isRtlParagraph(r12)
            java.text.Bidi r0 = new java.text.Bidi
            r6 = 0
            r7 = 0
            r5 = 0
            r3 = r0
            r4 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            int r3 = r0.getRunCount()
            if (r3 != r2) goto L63
        L62:
            r0 = r1
        L63:
            java.util.List<java.text.Bidi> r3 = r11.paragraphBidi
            r3.set(r12, r0)
            boolean[] r3 = r11.bidiProcessedParagraphs
            r3[r12] = r2
            if (r0 == 0) goto L75
            char[] r12 = r11.tmpBuffer
            if (r10 != r12) goto L74
            r10 = r1
            goto L75
        L74:
            r10 = r12
        L75:
            r11.tmpBuffer = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.LayoutHelper.analyzeBidi(int):java.text.Bidi");
    }

    public final float getHorizontalPosition(int i8, boolean z8, boolean z9) {
        Bidi bidi;
        boolean z10;
        int i9 = i8;
        if (!z9) {
            return getDownstreamHorizontal(i8, z8);
        }
        int lineForOffset = LayoutCompatKt.getLineForOffset(this.layout, i9, z9);
        int lineStart = this.layout.getLineStart(lineForOffset);
        int lineEnd = this.layout.getLineEnd(lineForOffset);
        if (i9 != lineStart && i9 != lineEnd) {
            return getDownstreamHorizontal(i8, z8);
        }
        if (i9 != 0 && i9 != this.layout.getText().length()) {
            int paragraphForOffset = getParagraphForOffset(i9, z9);
            boolean isRtlParagraph = isRtlParagraph(paragraphForOffset);
            int lineEndToVisibleEnd = lineEndToVisibleEnd(lineEnd, lineStart);
            int paragraphStart = getParagraphStart(paragraphForOffset);
            int i10 = lineStart - paragraphStart;
            int i11 = lineEndToVisibleEnd - paragraphStart;
            Bidi analyzeBidi = analyzeBidi(paragraphForOffset);
            if (analyzeBidi != null) {
                bidi = analyzeBidi.createLineBidi(i10, i11);
            } else {
                bidi = null;
            }
            boolean z11 = false;
            if (bidi != null && bidi.getRunCount() != 1) {
                int runCount = bidi.getRunCount();
                BidiRun[] bidiRunArr = new BidiRun[runCount];
                for (int i12 = 0; i12 < runCount; i12++) {
                    int runStart = bidi.getRunStart(i12) + lineStart;
                    int runLimit = bidi.getRunLimit(i12) + lineStart;
                    if (bidi.getRunLevel(i12) % 2 == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bidiRunArr[i12] = new BidiRun(runStart, runLimit, z10);
                }
                int runCount2 = bidi.getRunCount();
                byte[] bArr = new byte[runCount2];
                for (int i13 = 0; i13 < runCount2; i13++) {
                    bArr[i13] = (byte) bidi.getRunLevel(i13);
                }
                Bidi.reorderVisually(bArr, 0, bidiRunArr, 0, runCount);
                int i14 = -1;
                if (i9 == lineStart) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= runCount) {
                            break;
                        }
                        if (bidiRunArr[i15].getStart() == i9) {
                            i14 = i15;
                            break;
                        }
                        i15++;
                    }
                    BidiRun bidiRun = bidiRunArr[i14];
                    if (z8 || isRtlParagraph == bidiRun.isRtl()) {
                        if (!isRtlParagraph) {
                            isRtlParagraph = true;
                        } else {
                            isRtlParagraph = false;
                        }
                    }
                    if (i14 == 0 && isRtlParagraph) {
                        return this.layout.getLineLeft(lineForOffset);
                    }
                    if (i14 == AbstractC1428l.i0(bidiRunArr) && !isRtlParagraph) {
                        return this.layout.getLineRight(lineForOffset);
                    }
                    if (isRtlParagraph) {
                        return this.layout.getPrimaryHorizontal(bidiRunArr[i14 - 1].getStart());
                    }
                    return this.layout.getPrimaryHorizontal(bidiRunArr[i14 + 1].getStart());
                }
                if (i9 > lineEndToVisibleEnd) {
                    i9 = lineEndToVisibleEnd(i9, lineStart);
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= runCount) {
                        break;
                    }
                    if (bidiRunArr[i16].getEnd() == i9) {
                        i14 = i16;
                        break;
                    }
                    i16++;
                }
                BidiRun bidiRun2 = bidiRunArr[i14];
                if (!z8 && isRtlParagraph != bidiRun2.isRtl()) {
                    isRtlParagraph = !isRtlParagraph;
                }
                if (i14 == 0 && isRtlParagraph) {
                    return this.layout.getLineLeft(lineForOffset);
                }
                if (i14 == AbstractC1428l.i0(bidiRunArr) && !isRtlParagraph) {
                    return this.layout.getLineRight(lineForOffset);
                }
                if (isRtlParagraph) {
                    return this.layout.getPrimaryHorizontal(bidiRunArr[i14 - 1].getEnd());
                }
                return this.layout.getPrimaryHorizontal(bidiRunArr[i14 + 1].getEnd());
            }
            boolean isRtlCharAt = this.layout.isRtlCharAt(lineStart);
            if (z8 || isRtlParagraph == isRtlCharAt) {
                if (!isRtlParagraph) {
                    isRtlParagraph = true;
                } else {
                    isRtlParagraph = false;
                }
            }
            if (i9 == lineStart) {
                z11 = isRtlParagraph;
            } else if (!isRtlParagraph) {
                z11 = true;
            }
            Layout layout = this.layout;
            if (z11) {
                return layout.getLineLeft(lineForOffset);
            }
            return layout.getLineRight(lineForOffset);
        }
        return getDownstreamHorizontal(i8, z8);
    }

    public final Layout getLayout() {
        return this.layout;
    }

    public final int getLineVisibleEnd(int i8) {
        return lineEndToVisibleEnd(this.layout.getLineEnd(i8), this.layout.getLineStart(i8));
    }

    public final int getParagraphCount() {
        return this.paragraphCount;
    }

    public final int getParagraphEnd(@IntRange(from = 0) int i8) {
        return this.paragraphEnds.get(i8).intValue();
    }

    public final int getParagraphForOffset(@IntRange(from = 0) int i8, boolean z8) {
        int i9;
        int l8 = AbstractC1435t.l(this.paragraphEnds, Integer.valueOf(i8), 0, 0, 6, null);
        if (l8 < 0) {
            i9 = -(l8 + 1);
        } else {
            i9 = l8 + 1;
        }
        if (z8 && i9 > 0) {
            int i10 = i9 - 1;
            if (i8 == this.paragraphEnds.get(i10).intValue()) {
                return i10;
            }
        }
        return i9;
    }

    public final int getParagraphStart(@IntRange(from = 0) int i8) {
        if (i8 == 0) {
            return 0;
        }
        return this.paragraphEnds.get(i8 - 1).intValue();
    }

    public final boolean isLineEndSpace(char c8) {
        if (c8 != ' ' && c8 != '\n' && c8 != 5760 && ((AbstractC3292y.k(c8, 8192) < 0 || AbstractC3292y.k(c8, 8202) > 0 || c8 == 8199) && c8 != 8287 && c8 != 12288)) {
            return false;
        }
        return true;
    }

    public final boolean isRtlParagraph(@IntRange(from = 0) int i8) {
        if (this.layout.getParagraphDirection(this.layout.getLineForOffset(getParagraphStart(i8))) == -1) {
            return true;
        }
        return false;
    }
}
