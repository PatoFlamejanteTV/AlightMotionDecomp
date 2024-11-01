package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class VNode {
    public static final int $stable = 8;
    private Function1 invalidateListener;

    private VNode() {
    }

    public abstract void draw(DrawScope drawScope);

    public Function1 getInvalidateListener$ui_release() {
        return this.invalidateListener;
    }

    public final void invalidate() {
        Function1 invalidateListener$ui_release = getInvalidateListener$ui_release();
        if (invalidateListener$ui_release != null) {
            invalidateListener$ui_release.invoke(this);
        }
    }

    public void setInvalidateListener$ui_release(Function1 function1) {
        this.invalidateListener = function1;
    }

    public /* synthetic */ VNode(AbstractC3284p abstractC3284p) {
        this();
    }
}
