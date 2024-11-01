package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AndroidPointerIconType implements PointerIcon {
    public static final int $stable = 0;
    private final int type;

    public AndroidPointerIconType(int i8) {
        this.type = i8;
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
        if (!AbstractC3292y.d(AndroidPointerIconType.class, cls)) {
            return false;
        }
        AbstractC3292y.g(obj, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.AndroidPointerIconType");
        if (this.type == ((AndroidPointerIconType) obj).type) {
            return true;
        }
        return false;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return this.type;
    }

    public String toString() {
        return "AndroidPointerIcon(type=" + this.type + ')';
    }
}
