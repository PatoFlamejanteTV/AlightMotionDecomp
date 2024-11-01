package F2;

import d3.C2752d;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final com.stripe.android.model.j f2218a;

    /* renamed from: b, reason: collision with root package name */
    private final C2752d f2219b;

    public k(com.stripe.android.model.j elementsSession, C2752d metadata) {
        AbstractC3292y.i(elementsSession, "elementsSession");
        AbstractC3292y.i(metadata, "metadata");
        this.f2218a = elementsSession;
        this.f2219b = metadata;
    }

    public final com.stripe.android.model.j a() {
        return this.f2218a;
    }

    public final C2752d b() {
        return this.f2219b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (AbstractC3292y.d(this.f2218a, kVar.f2218a) && AbstractC3292y.d(this.f2219b, kVar.f2219b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.f2218a.hashCode() * 31) + this.f2219b.hashCode();
    }

    public String toString() {
        return "ElementsSessionWithMetadata(elementsSession=" + this.f2218a + ", metadata=" + this.f2219b + ")";
    }
}
