package androidx.compose.ui.draw;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DrawResult {
    public static final int $stable = 8;
    private Function1 block;

    public DrawResult(Function1 function1) {
        this.block = function1;
    }

    public final Function1 getBlock$ui_release() {
        return this.block;
    }

    public final void setBlock$ui_release(Function1 function1) {
        this.block = function1;
    }
}
