package l4;

import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final List f34696a;

    public f(List autocompletePredictions) {
        AbstractC3292y.i(autocompletePredictions, "autocompletePredictions");
        this.f34696a = autocompletePredictions;
    }

    public final List a() {
        return this.f34696a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof f) && AbstractC3292y.d(this.f34696a, ((f) obj).f34696a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f34696a.hashCode();
    }

    public String toString() {
        return "FindAutocompletePredictionsResponse(autocompletePredictions=" + this.f34696a + ")";
    }
}
