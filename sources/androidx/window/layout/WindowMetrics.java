package androidx.window.layout;

import android.graphics.Rect;
import androidx.annotation.RestrictTo;
import androidx.window.core.Bounds;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class WindowMetrics {
    private final Bounds _bounds;

    public WindowMetrics(Bounds _bounds) {
        AbstractC3292y.i(_bounds, "_bounds");
        this._bounds = _bounds;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AbstractC3292y.d(WindowMetrics.class, obj.getClass())) {
            return AbstractC3292y.d(this._bounds, ((WindowMetrics) obj)._bounds);
        }
        return false;
    }

    public final Rect getBounds() {
        return this._bounds.toRect();
    }

    public int hashCode() {
        return this._bounds.hashCode();
    }

    public String toString() {
        return "WindowMetrics { bounds: " + getBounds() + " }";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.TESTS})
    public WindowMetrics(Rect bounds) {
        this(new Bounds(bounds));
        AbstractC3292y.i(bounds, "bounds");
    }
}
