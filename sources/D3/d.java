package D3;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final C2.c f1243a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f1244b;

    public d(C2.c cVar, boolean z8) {
        this.f1243a = cVar;
        this.f1244b = z8;
    }

    public final boolean a() {
        return this.f1244b;
    }

    public final C2.c b() {
        return this.f1243a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (AbstractC3292y.d(this.f1243a, dVar.f1243a) && this.f1244b == dVar.f1244b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        C2.c cVar = this.f1243a;
        if (cVar == null) {
            hashCode = 0;
        } else {
            hashCode = cVar.hashCode();
        }
        return (hashCode * 31) + androidx.compose.foundation.a.a(this.f1244b);
    }

    public String toString() {
        return "MandateText(text=" + this.f1243a + ", showAbovePrimaryButton=" + this.f1244b + ")";
    }
}
