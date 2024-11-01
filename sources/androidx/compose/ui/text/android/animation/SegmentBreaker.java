package androidx.compose.ui.text.android.animation;

import Q5.I;
import Q5.p;
import R5.AbstractC1435t;
import android.text.Layout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.android.LayoutCompatKt;
import androidx.compose.ui.text.android.LayoutHelper;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class SegmentBreaker {
    public static final int $stable = 0;
    public static final SegmentBreaker INSTANCE = new SegmentBreaker();

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentType.values().length];
            try {
                iArr[SegmentType.Document.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentType.Paragraph.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SegmentType.Line.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SegmentType.Word.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[SegmentType.Character.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private SegmentBreaker() {
    }

    private final List<Integer> breakInWords(LayoutHelper layoutHelper) {
        List<Integer> breakWithBreakIterator = breakWithBreakIterator(layoutHelper.getLayout().getText(), BreakIterator.getLineInstance(Locale.getDefault()));
        TreeSet treeSet = new TreeSet();
        int size = breakWithBreakIterator.size();
        for (int i8 = 0; i8 < size; i8++) {
            treeSet.add(Integer.valueOf(breakWithBreakIterator.get(i8).intValue()));
        }
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i9 = 0; i9 < paragraphCount; i9++) {
            Bidi analyzeBidi = layoutHelper.analyzeBidi(i9);
            if (analyzeBidi != null) {
                int paragraphStart = layoutHelper.getParagraphStart(i9);
                int runCount = analyzeBidi.getRunCount();
                for (int i10 = 0; i10 < runCount; i10++) {
                    treeSet.add(Integer.valueOf(analyzeBidi.getRunStart(i10) + paragraphStart));
                }
            }
        }
        return AbstractC1435t.W0(treeSet);
    }

    private final List<Segment> breakSegmentWithChar(LayoutHelper layoutHelper, boolean z8) {
        boolean z9;
        boolean z10;
        ArrayList arrayList = new ArrayList();
        List<Integer> breakOffsets = breakOffsets(layoutHelper, SegmentType.Character);
        if (breakOffsets.size() != 0) {
            boolean z11 = true;
            if (breakOffsets.size() != 1) {
                ArrayList arrayList2 = new ArrayList();
                boolean z12 = false;
                Integer num = breakOffsets.get(0);
                int o8 = AbstractC1435t.o(breakOffsets);
                int i8 = 0;
                while (i8 < o8) {
                    i8++;
                    Integer num2 = breakOffsets.get(i8);
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    Layout layout = layoutHelper.getLayout();
                    if (!z8 || intValue != intValue2 + 1 || !layoutHelper.isLineEndSpace(layout.getText().charAt(intValue2))) {
                        int lineForOffset = LayoutCompatKt.getLineForOffset(layout, intValue2, z12);
                        if (layout.getParagraphDirection(lineForOffset) == -1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        boolean isRtlCharAt = layout.isRtlCharAt(intValue2);
                        if (isRtlCharAt != z9) {
                            z11 = false;
                        }
                        int ceil = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue2, z11, z12));
                        if (isRtlCharAt == z9) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int ceil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue, z10, true));
                        arrayList.add(new Segment(intValue2, intValue, Math.min(ceil, ceil2), layout.getLineTop(lineForOffset), Math.max(ceil, ceil2), layout.getLineBottom(lineForOffset)));
                    }
                    arrayList2.add(I.f8786a);
                    num = num2;
                    z11 = true;
                    z12 = false;
                }
                return arrayList;
            }
        }
        AbstractC1435t.m();
        return arrayList;
    }

    private final List<Segment> breakSegmentWithDocument(LayoutHelper layoutHelper) {
        return AbstractC1435t.e(new Segment(0, layoutHelper.getLayout().getText().length(), 0, 0, layoutHelper.getLayout().getWidth(), layoutHelper.getLayout().getHeight()));
    }

    private final List<Segment> breakSegmentWithLine(LayoutHelper layoutHelper, boolean z8) {
        int i8;
        int width;
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int lineCount = layoutHelper.getLayout().getLineCount();
        for (int i9 = 0; i9 < lineCount; i9++) {
            int lineStart = layout.getLineStart(i9);
            int lineEnd = layout.getLineEnd(i9);
            if (z8) {
                i8 = (int) Math.ceil(layout.getLineLeft(i9));
            } else {
                i8 = 0;
            }
            int lineTop = layout.getLineTop(i9);
            if (z8) {
                width = (int) Math.ceil(layout.getLineRight(i9));
            } else {
                width = layout.getWidth();
            }
            arrayList.add(new Segment(lineStart, lineEnd, i8, lineTop, width, layout.getLineBottom(i9)));
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithParagraph(LayoutHelper layoutHelper) {
        ArrayList arrayList = new ArrayList();
        Layout layout = layoutHelper.getLayout();
        int paragraphCount = layoutHelper.getParagraphCount();
        for (int i8 = 0; i8 < paragraphCount; i8++) {
            int paragraphStart = layoutHelper.getParagraphStart(i8);
            int paragraphEnd = layoutHelper.getParagraphEnd(i8);
            arrayList.add(new Segment(paragraphStart, paragraphEnd, 0, layout.getLineTop(LayoutCompatKt.getLineForOffset(layout, paragraphStart, false)), layout.getWidth(), layout.getLineBottom(LayoutCompatKt.getLineForOffset(layout, paragraphEnd, true))));
        }
        return arrayList;
    }

    private final List<Segment> breakSegmentWithWord(LayoutHelper layoutHelper, boolean z8) {
        boolean z9;
        boolean z10;
        int i8;
        Layout layout = layoutHelper.getLayout();
        int ceil = (int) Math.ceil(layout.getPaint().measureText(" "));
        List<Integer> breakOffsets = breakOffsets(layoutHelper, SegmentType.Word);
        if (breakOffsets.size() != 0) {
            boolean z11 = true;
            if (breakOffsets.size() != 1) {
                ArrayList arrayList = new ArrayList();
                boolean z12 = false;
                Integer num = breakOffsets.get(0);
                int o8 = AbstractC1435t.o(breakOffsets);
                int i9 = 0;
                while (i9 < o8) {
                    i9++;
                    Integer num2 = breakOffsets.get(i9);
                    int intValue = num2.intValue();
                    int intValue2 = num.intValue();
                    int lineForOffset = LayoutCompatKt.getLineForOffset(layout, intValue2, z12);
                    if (layout.getParagraphDirection(lineForOffset) == -1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    boolean isRtlCharAt = layout.isRtlCharAt(intValue2);
                    if (isRtlCharAt != z9) {
                        z11 = false;
                    }
                    int ceil2 = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue2, z11, z12));
                    if (isRtlCharAt == z9) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    int ceil3 = (int) Math.ceil(layoutHelper.getHorizontalPosition(intValue, z10, true));
                    int min = Math.min(ceil2, ceil3);
                    int max = Math.max(ceil2, ceil3);
                    if (z8 && intValue != 0 && layout.getText().charAt(intValue - 1) == ' ') {
                        i8 = lineForOffset;
                        if (layout.getLineEnd(i8) != intValue) {
                            if (isRtlCharAt) {
                                min += ceil;
                            } else {
                                max -= ceil;
                            }
                        }
                    } else {
                        i8 = lineForOffset;
                    }
                    arrayList.add(new Segment(intValue2, intValue, min, layout.getLineTop(i8), max, layout.getLineBottom(i8)));
                    num = num2;
                    z11 = true;
                    z12 = false;
                }
                return arrayList;
            }
        }
        return AbstractC1435t.m();
    }

    private final List<Integer> breakWithBreakIterator(CharSequence charSequence, BreakIterator breakIterator) {
        CharSequenceCharacterIterator charSequenceCharacterIterator = new CharSequenceCharacterIterator(charSequence, 0, charSequence.length());
        List<Integer> s8 = AbstractC1435t.s(0);
        breakIterator.setText(charSequenceCharacterIterator);
        while (breakIterator.next() != -1) {
            s8.add(Integer.valueOf(breakIterator.current()));
        }
        return s8;
    }

    public final List<Integer> breakOffsets(LayoutHelper layoutHelper, SegmentType segmentType) {
        int i8 = 0;
        Layout layout = layoutHelper.getLayout();
        CharSequence text = layout.getText();
        int i9 = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 == 5) {
                            return breakWithBreakIterator(text, BreakIterator.getCharacterInstance(Locale.getDefault()));
                        }
                        throw new p();
                    }
                    return breakInWords(layoutHelper);
                }
                List<Integer> s8 = AbstractC1435t.s(0);
                int lineCount = layout.getLineCount();
                while (i8 < lineCount) {
                    s8.add(Integer.valueOf(layout.getLineEnd(i8)));
                    i8++;
                }
                return s8;
            }
            List<Integer> s9 = AbstractC1435t.s(0);
            int paragraphCount = layoutHelper.getParagraphCount();
            while (i8 < paragraphCount) {
                s9.add(Integer.valueOf(layoutHelper.getParagraphEnd(i8)));
                i8++;
            }
            return s9;
        }
        return AbstractC1435t.p(0, Integer.valueOf(text.length()));
    }

    public final List<Segment> breakSegments(LayoutHelper layoutHelper, SegmentType segmentType, boolean z8) {
        int i8 = WhenMappings.$EnumSwitchMapping$0[segmentType.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 == 5) {
                            return breakSegmentWithChar(layoutHelper, z8);
                        }
                        throw new p();
                    }
                    return breakSegmentWithWord(layoutHelper, z8);
                }
                return breakSegmentWithLine(layoutHelper, z8);
            }
            return breakSegmentWithParagraph(layoutHelper);
        }
        return breakSegmentWithDocument(layoutHelper);
    }
}
