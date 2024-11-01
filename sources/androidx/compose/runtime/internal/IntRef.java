package androidx.compose.runtime.internal;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.AbstractC3335a;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class IntRef {
    public static final int $stable = 8;
    private int element;

    public IntRef() {
        this(0, 1, null);
    }

    public final int getElement() {
        return this.element;
    }

    public final void setElement(int i8) {
        this.element = i8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("IntRef(element = ");
        sb.append(this.element);
        sb.append(")@");
        String num = Integer.toString(hashCode(), AbstractC3335a.a(16));
        AbstractC3292y.h(num, "toString(this, checkRadix(radix))");
        sb.append(num);
        return sb.toString();
    }

    public IntRef(int i8) {
        this.element = i8;
    }

    public /* synthetic */ IntRef(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? 0 : i8);
    }
}
