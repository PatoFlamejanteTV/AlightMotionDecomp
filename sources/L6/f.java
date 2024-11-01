package l6;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    private final String f34771a;

    /* renamed from: b, reason: collision with root package name */
    private final i6.i f34772b;

    public f(String value, i6.i range) {
        AbstractC3292y.i(value, "value");
        AbstractC3292y.i(range, "range");
        this.f34771a = value;
        this.f34772b = range;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (AbstractC3292y.d(this.f34771a, fVar.f34771a) && AbstractC3292y.d(this.f34772b, fVar.f34772b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f34771a.hashCode() * 31) + this.f34772b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f34771a + ", range=" + this.f34772b + ')';
    }
}
