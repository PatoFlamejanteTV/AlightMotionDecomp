package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ConsumedData {
    public static final int $stable = 8;
    private boolean downChange;
    private boolean positionChange;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ConsumedData() {
        /*
            r3 = this;
            r0 = 3
            r1 = 0
            r2 = 0
            r3.<init>(r2, r2, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.ConsumedData.<init>():void");
    }

    public static /* synthetic */ void getDownChange$annotations() {
    }

    public static /* synthetic */ void getPositionChange$annotations() {
    }

    public final boolean getDownChange() {
        return this.downChange;
    }

    public final boolean getPositionChange() {
        return this.positionChange;
    }

    public final void setDownChange(boolean z8) {
        this.downChange = z8;
    }

    public final void setPositionChange(boolean z8) {
        this.positionChange = z8;
    }

    public ConsumedData(boolean z8, boolean z9) {
        this.positionChange = z8;
        this.downChange = z9;
    }

    public /* synthetic */ ConsumedData(boolean z8, boolean z9, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? false : z9);
    }
}
