package androidx.compose.material3;

import androidx.compose.runtime.saveable.SaverScope;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SwipeableState$Companion$Saver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final SwipeableState$Companion$Saver$1 INSTANCE = new SwipeableState$Companion$Saver$1();

    SwipeableState$Companion$Saver$1() {
        super(2);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Object] */
    @Override // c6.InterfaceC2072n
    public final T invoke(SaverScope Saver, SwipeableState<T> it) {
        AbstractC3292y.i(Saver, "$this$Saver");
        AbstractC3292y.i(it, "it");
        return it.getCurrentValue();
    }
}
