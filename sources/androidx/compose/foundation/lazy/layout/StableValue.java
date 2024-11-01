package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
final class StableValue<T> {
    private final T value;

    /* JADX WARN: Multi-variable type inference failed */
    private /* synthetic */ StableValue(Object obj) {
        this.value = obj;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ StableValue m737boximpl(Object obj) {
        return new StableValue(obj);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static <T> Object m738constructorimpl(T t8) {
        return t8;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m739equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof StableValue) && AbstractC3292y.d(obj, ((StableValue) obj2).m743unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m740equalsimpl0(Object obj, Object obj2) {
        return AbstractC3292y.d(obj, obj2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m741hashCodeimpl(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m742toStringimpl(Object obj) {
        return "StableValue(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m739equalsimpl(this.value, obj);
    }

    public final T getValue() {
        return this.value;
    }

    public int hashCode() {
        return m741hashCodeimpl(this.value);
    }

    public String toString() {
        return m742toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ Object m743unboximpl() {
        return this.value;
    }
}
