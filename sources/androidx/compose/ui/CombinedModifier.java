package androidx.compose.ui;

import androidx.compose.runtime.internal.StabilityInferred;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class CombinedModifier implements Modifier {
    public static final int $stable = 0;
    private final Modifier inner;
    private final Modifier outer;

    public CombinedModifier(Modifier modifier, Modifier modifier2) {
        this.outer = modifier;
        this.inner = modifier2;
    }

    @Override // androidx.compose.ui.Modifier
    public boolean all(Function1 function1) {
        if (this.outer.all(function1) && this.inner.all(function1)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.Modifier
    public boolean any(Function1 function1) {
        if (!this.outer.any(function1) && !this.inner.any(function1)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof CombinedModifier) {
            CombinedModifier combinedModifier = (CombinedModifier) obj;
            if (AbstractC3292y.d(this.outer, combinedModifier.outer) && AbstractC3292y.d(this.inner, combinedModifier.inner)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.Modifier
    public <R> R foldIn(R r8, InterfaceC2072n interfaceC2072n) {
        return (R) this.inner.foldIn(this.outer.foldIn(r8, interfaceC2072n), interfaceC2072n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.Modifier
    public <R> R foldOut(R r8, InterfaceC2072n interfaceC2072n) {
        return (R) this.outer.foldOut(this.inner.foldOut(r8, interfaceC2072n), interfaceC2072n);
    }

    public final Modifier getInner$ui_release() {
        return this.inner;
    }

    public final Modifier getOuter$ui_release() {
        return this.outer;
    }

    public int hashCode() {
        return this.outer.hashCode() + (this.inner.hashCode() * 31);
    }

    @Override // androidx.compose.ui.Modifier
    public /* synthetic */ Modifier then(Modifier modifier) {
        return a.a(this, modifier);
    }

    public String toString() {
        return '[' + ((String) foldIn("", CombinedModifier$toString$1.INSTANCE)) + ']';
    }
}
