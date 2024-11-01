package androidx.compose.ui.node;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class CenteredArray {
    private final int[] data;

    private /* synthetic */ CenteredArray(int[] iArr) {
        this.data = iArr;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CenteredArray m4189boximpl(int[] iArr) {
        return new CenteredArray(iArr);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int[] m4190constructorimpl(int[] iArr) {
        return iArr;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4191equalsimpl(int[] iArr, Object obj) {
        return (obj instanceof CenteredArray) && AbstractC3292y.d(iArr, ((CenteredArray) obj).m4198unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4192equalsimpl0(int[] iArr, int[] iArr2) {
        return AbstractC3292y.d(iArr, iArr2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final int m4193getimpl(int[] iArr, int i8) {
        return iArr[i8 + m4194getMidimpl(iArr)];
    }

    /* renamed from: getMid-impl, reason: not valid java name */
    private static final int m4194getMidimpl(int[] iArr) {
        return iArr.length / 2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4195hashCodeimpl(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m4196setimpl(int[] iArr, int i8, int i9) {
        iArr[i8 + m4194getMidimpl(iArr)] = i9;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m4197toStringimpl(int[] iArr) {
        return "CenteredArray(data=" + Arrays.toString(iArr) + ')';
    }

    public boolean equals(Object obj) {
        return m4191equalsimpl(this.data, obj);
    }

    public int hashCode() {
        return m4195hashCodeimpl(this.data);
    }

    public String toString() {
        return m4197toStringimpl(this.data);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int[] m4198unboximpl() {
        return this.data;
    }
}
