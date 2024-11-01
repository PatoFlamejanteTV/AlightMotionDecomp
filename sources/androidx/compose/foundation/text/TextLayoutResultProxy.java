package androidx.compose.foundation.text;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextLayoutResultProxy {
    private LayoutCoordinates decorationBoxCoordinates;
    private LayoutCoordinates innerTextFieldCoordinates;
    private final TextLayoutResult value;

    public TextLayoutResultProxy(TextLayoutResult value) {
        AbstractC3292y.i(value, "value");
        this.value = value;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:            if (r2 == null) goto L11;     */
    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long m933coercedInVisibleBoundsOfInputTextMKHz9U(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r5.innerTextFieldCoordinates
            if (r0 == 0) goto L1e
            boolean r1 = r0.isAttached()
            if (r1 == 0) goto L16
            androidx.compose.ui.layout.LayoutCoordinates r1 = r5.decorationBoxCoordinates
            r2 = 0
            if (r1 == 0) goto L1c
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.ui.layout.c.c(r1, r0, r3, r4, r2)
            goto L1c
        L16:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L1c:
            if (r2 != 0) goto L24
        L1e:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L24:
            long r6 = androidx.compose.foundation.text.TextLayoutResultProxyKt.m938access$coerceIn3MmeM6k(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextLayoutResultProxy.m933coercedInVisibleBoundsOfInputTextMKHz9U(long):long");
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResultProxy textLayoutResultProxy, int i8, boolean z8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            z8 = false;
        }
        return textLayoutResultProxy.getLineEnd(i8, z8);
    }

    /* renamed from: getOffsetForPosition-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ int m934getOffsetForPosition3MmeM6k$default(TextLayoutResultProxy textLayoutResultProxy, long j8, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        return textLayoutResultProxy.m936getOffsetForPosition3MmeM6k(j8, z8);
    }

    /* renamed from: relativeToInputText-MK-Hz9U, reason: not valid java name */
    private final long m935relativeToInputTextMKHz9U(long j8) {
        Offset offset;
        long j9;
        LayoutCoordinates layoutCoordinates = this.innerTextFieldCoordinates;
        if (layoutCoordinates != null) {
            LayoutCoordinates layoutCoordinates2 = this.decorationBoxCoordinates;
            if (layoutCoordinates2 != null) {
                if (layoutCoordinates.isAttached() && layoutCoordinates2.isAttached()) {
                    j9 = layoutCoordinates.mo4116localPositionOfR5De75A(layoutCoordinates2, j8);
                } else {
                    j9 = j8;
                }
                offset = Offset.m2701boximpl(j9);
            } else {
                offset = null;
            }
            if (offset != null) {
                return offset.m2722unboximpl();
            }
            return j8;
        }
        return j8;
    }

    public final LayoutCoordinates getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    public final LayoutCoordinates getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final int getLineEnd(int i8, boolean z8) {
        return this.value.getLineEnd(i8, z8);
    }

    public final int getLineForVerticalPosition(float f8) {
        return this.value.getLineForVerticalPosition(Offset.m2713getYimpl(m935relativeToInputTextMKHz9U(m933coercedInVisibleBoundsOfInputTextMKHz9U(OffsetKt.Offset(0.0f, f8)))));
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m936getOffsetForPosition3MmeM6k(long j8, boolean z8) {
        if (z8) {
            j8 = m933coercedInVisibleBoundsOfInputTextMKHz9U(j8);
        }
        return this.value.m4641getOffsetForPositionk4lQ0M(m935relativeToInputTextMKHz9U(j8));
    }

    public final TextLayoutResult getValue() {
        return this.value;
    }

    /* renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m937isPositionOnTextk4lQ0M(long j8) {
        long m935relativeToInputTextMKHz9U = m935relativeToInputTextMKHz9U(m933coercedInVisibleBoundsOfInputTextMKHz9U(j8));
        int lineForVerticalPosition = this.value.getLineForVerticalPosition(Offset.m2713getYimpl(m935relativeToInputTextMKHz9U));
        if (Offset.m2712getXimpl(m935relativeToInputTextMKHz9U) >= this.value.getLineLeft(lineForVerticalPosition) && Offset.m2712getXimpl(m935relativeToInputTextMKHz9U) <= this.value.getLineRight(lineForVerticalPosition)) {
            return true;
        }
        return false;
    }

    public final void setDecorationBoxCoordinates(LayoutCoordinates layoutCoordinates) {
        this.decorationBoxCoordinates = layoutCoordinates;
    }

    public final void setInnerTextFieldCoordinates(LayoutCoordinates layoutCoordinates) {
        this.innerTextFieldCoordinates = layoutCoordinates;
    }
}
