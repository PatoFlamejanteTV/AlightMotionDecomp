package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AndroidPointerIcon implements PointerIcon {
    public static final int $stable = 0;
    private final android.view.PointerIcon pointerIcon;

    public AndroidPointerIcon(android.view.PointerIcon pointerIcon) {
        this.pointerIcon = pointerIcon;
    }

    public boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!AbstractC3292y.d(AndroidPointerIcon.class, cls)) {
            return false;
        }
        AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIcon");
        return AbstractC3292y.d(this.pointerIcon, ((AndroidPointerIcon) obj).pointerIcon);
    }

    public final android.view.PointerIcon getPointerIcon() {
        return this.pointerIcon;
    }

    public int hashCode() {
        int hashCode;
        hashCode = this.pointerIcon.hashCode();
        return hashCode;
    }

    public String toString() {
        return "AndroidPointerIcon(pointerIcon=" + this.pointerIcon + ')';
    }
}
