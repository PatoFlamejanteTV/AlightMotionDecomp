package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class JoinedKey {
    public static final int $stable = 8;
    private final Object left;
    private final Object right;

    public JoinedKey(Object obj, Object obj2) {
        this.left = obj;
        this.right = obj2;
    }

    public static /* synthetic */ JoinedKey copy$default(JoinedKey joinedKey, Object obj, Object obj2, int i8, Object obj3) {
        if ((i8 & 1) != 0) {
            obj = joinedKey.left;
        }
        if ((i8 & 2) != 0) {
            obj2 = joinedKey.right;
        }
        return joinedKey.copy(obj, obj2);
    }

    private final int hashCodeOf(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final Object component1() {
        return this.left;
    }

    public final Object component2() {
        return this.right;
    }

    public final JoinedKey copy(Object obj, Object obj2) {
        return new JoinedKey(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JoinedKey)) {
            return false;
        }
        JoinedKey joinedKey = (JoinedKey) obj;
        return AbstractC3292y.d(this.left, joinedKey.left) && AbstractC3292y.d(this.right, joinedKey.right);
    }

    public final Object getLeft() {
        return this.left;
    }

    public final Object getRight() {
        return this.right;
    }

    public int hashCode() {
        return (hashCodeOf(this.left) * 31) + hashCodeOf(this.right);
    }

    public String toString() {
        return "JoinedKey(left=" + this.left + ", right=" + this.right + ')';
    }
}
