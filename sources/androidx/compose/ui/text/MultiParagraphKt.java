package androidx.compose.ui.text;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class MultiParagraphKt {
    private static final <T> int fastBinarySearch(List<? extends T> list, Function1 function1) {
        int size = list.size() - 1;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            int intValue = ((Number) function1.invoke(list.get(i9))).intValue();
            if (intValue < 0) {
                i8 = i9 + 1;
            } else if (intValue > 0) {
                size = i9 - 1;
            } else {
                return i9;
            }
        }
        return -(i8 + 1);
    }

    public static final int findParagraphByIndex(List<ParagraphInfo> list, int i8) {
        char c8;
        int size = list.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i10);
            if (paragraphInfo.getStartIndex() > i8) {
                c8 = 1;
            } else if (paragraphInfo.getEndIndex() <= i8) {
                c8 = 65535;
            } else {
                c8 = 0;
            }
            if (c8 < 0) {
                i9 = i10 + 1;
            } else if (c8 > 0) {
                size = i10 - 1;
            } else {
                return i10;
            }
        }
        return -(i9 + 1);
    }

    public static final int findParagraphByLineIndex(List<ParagraphInfo> list, int i8) {
        char c8;
        int size = list.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i10);
            if (paragraphInfo.getStartLineIndex() > i8) {
                c8 = 1;
            } else if (paragraphInfo.getEndLineIndex() <= i8) {
                c8 = 65535;
            } else {
                c8 = 0;
            }
            if (c8 < 0) {
                i9 = i10 + 1;
            } else if (c8 > 0) {
                size = i10 - 1;
            } else {
                return i10;
            }
        }
        return -(i9 + 1);
    }

    public static final int findParagraphByY(List<ParagraphInfo> list, float f8) {
        char c8;
        int size = list.size() - 1;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            ParagraphInfo paragraphInfo = list.get(i9);
            if (paragraphInfo.getTop() > f8) {
                c8 = 1;
            } else if (paragraphInfo.getBottom() <= f8) {
                c8 = 65535;
            } else {
                c8 = 0;
            }
            if (c8 < 0) {
                i8 = i9 + 1;
            } else if (c8 > 0) {
                size = i9 - 1;
            } else {
                return i9;
            }
        }
        return -(i8 + 1);
    }

    /* renamed from: findParagraphsByRange-Sb-Bc2M, reason: not valid java name */
    public static final void m4554findParagraphsByRangeSbBc2M(List<ParagraphInfo> list, long j8, Function1 function1) {
        int size = list.size();
        for (int findParagraphByIndex = findParagraphByIndex(list, TextRange.m4667getMinimpl(j8)); findParagraphByIndex < size; findParagraphByIndex++) {
            ParagraphInfo paragraphInfo = list.get(findParagraphByIndex);
            if (paragraphInfo.getStartIndex() < TextRange.m4666getMaximpl(j8)) {
                if (paragraphInfo.getStartIndex() != paragraphInfo.getEndIndex()) {
                    function1.invoke(paragraphInfo);
                }
            } else {
                return;
            }
        }
    }
}
