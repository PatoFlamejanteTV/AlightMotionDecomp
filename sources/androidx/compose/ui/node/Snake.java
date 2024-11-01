package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class Snake {
    private final int[] data;

    private /* synthetic */ Snake(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: addDiagonalToStack-impl, reason: not valid java name */
    public static final void m4378addDiagonalToStackimpl(int[] iArr, IntStack intStack) {
        if (m4386getHasAdditionOrRemovalimpl(iArr)) {
            if (m4387getReverseimpl(iArr)) {
                intStack.pushDiagonal(m4388getStartXimpl(iArr), m4389getStartYimpl(iArr), m4383getDiagonalSizeimpl(iArr));
                return;
            } else if (m4391isAdditionimpl(iArr)) {
                intStack.pushDiagonal(m4388getStartXimpl(iArr), m4389getStartYimpl(iArr) + 1, m4383getDiagonalSizeimpl(iArr));
                return;
            } else {
                intStack.pushDiagonal(m4388getStartXimpl(iArr) + 1, m4389getStartYimpl(iArr), m4383getDiagonalSizeimpl(iArr));
                return;
            }
        }
        intStack.pushDiagonal(m4388getStartXimpl(iArr), m4389getStartYimpl(iArr), m4384getEndXimpl(iArr) - m4388getStartXimpl(iArr));
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Snake m4379boximpl(int[] iArr) {
        return new Snake(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m4380constructorimpl(int[] iArr) {
        return iArr;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4381equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof Snake) && AbstractC3292y.d(iArr, ((Snake) obj).m4393unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4382equalsimpl0(int[] iArr, int[] iArr2) {
        return AbstractC3292y.d(iArr, iArr2);
    }

    /* renamed from: getDiagonalSize-impl, reason: not valid java name */
    public static final int m4383getDiagonalSizeimpl(int[] iArr) {
        return Math.min(m4384getEndXimpl(iArr) - m4388getStartXimpl(iArr), m4385getEndYimpl(iArr) - m4389getStartYimpl(iArr));
    }

    /* renamed from: getEndX-impl, reason: not valid java name */
    public static final int m4384getEndXimpl(int[] iArr) {
        return iArr[2];
    }

    /* renamed from: getEndY-impl, reason: not valid java name */
    public static final int m4385getEndYimpl(int[] iArr) {
        return iArr[3];
    }

    /* renamed from: getHasAdditionOrRemoval-impl, reason: not valid java name */
    private static final boolean m4386getHasAdditionOrRemovalimpl(int[] iArr) {
        if (m4385getEndYimpl(iArr) - m4389getStartYimpl(iArr) != m4384getEndXimpl(iArr) - m4388getStartXimpl(iArr)) {
            return true;
        }
        return false;
    }

    /* renamed from: getReverse-impl, reason: not valid java name */
    public static final boolean m4387getReverseimpl(int[] iArr) {
        if (iArr[4] != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: getStartX-impl, reason: not valid java name */
    public static final int m4388getStartXimpl(int[] iArr) {
        return iArr[0];
    }

    /* renamed from: getStartY-impl, reason: not valid java name */
    public static final int m4389getStartYimpl(int[] iArr) {
        return iArr[1];
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4390hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: isAddition-impl, reason: not valid java name */
    private static final boolean m4391isAdditionimpl(int[] iArr) {
        if (m4385getEndYimpl(iArr) - m4389getStartYimpl(iArr) > m4384getEndXimpl(iArr) - m4388getStartXimpl(iArr)) {
            return true;
        }
        return false;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4392toStringimpl(int[] iArr) {
        return "Snake(" + m4388getStartXimpl(iArr) + ',' + m4389getStartYimpl(iArr) + ',' + m4384getEndXimpl(iArr) + ',' + m4385getEndYimpl(iArr) + ',' + m4387getReverseimpl(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m4381equalsimpl(this.data, obj);
    }

    public final int[] getData() {
        return this.data;
    }

    public int hashCode() {
        return m4390hashCodeimpl(this.data);
    }

    public String toString() {
        return m4392toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m4393unboximpl() {
        return this.data;
    }
}
