package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ScrollableKt$pointerScrollable$1 extends AbstractC3293z implements Function1 {
    public static final ScrollableKt$pointerScrollable$1 INSTANCE = new ScrollableKt$pointerScrollable$1();

    ScrollableKt$pointerScrollable$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(PointerInputChange down) {
        AbstractC3292y.i(down, "down");
        return Boolean.valueOf(!PointerType.m4054equalsimpl0(down.m3996getTypeT8wyACA(), PointerType.Companion.m4059getMouseT8wyACA()));
    }
}
