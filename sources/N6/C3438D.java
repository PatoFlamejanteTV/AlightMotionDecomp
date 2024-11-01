package n6;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: n6.D, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3438D {

    /* renamed from: a, reason: collision with root package name */
    public final Object f35627a;

    /* renamed from: b, reason: collision with root package name */
    public final Function1 f35628b;

    public C3438D(Object obj, Function1 function1) {
        this.f35627a = obj;
        this.f35628b = function1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3438D)) {
            return false;
        }
        C3438D c3438d = (C3438D) obj;
        if (AbstractC3292y.d(this.f35627a, c3438d.f35627a) && AbstractC3292y.d(this.f35628b, c3438d.f35628b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.f35627a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (hashCode * 31) + this.f35628b.hashCode();
    }

    public String toString() {
        return "CompletedWithCancellation(result=" + this.f35627a + ", onCancellation=" + this.f35628b + ')';
    }
}
