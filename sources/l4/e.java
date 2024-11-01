package l4;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final g f34695a;

    public e(g place) {
        AbstractC3292y.i(place, "place");
        this.f34695a = place;
    }

    public final g a() {
        return this.f34695a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof e) && AbstractC3292y.d(this.f34695a, ((e) obj).f34695a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f34695a.hashCode();
    }

    public String toString() {
        return "FetchPlaceResponse(place=" + this.f34695a + ")";
    }
}
