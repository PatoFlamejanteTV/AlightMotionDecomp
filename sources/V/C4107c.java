package v;

import android.content.Context;

/* renamed from: v.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C4107c extends AbstractC4112h {

    /* renamed from: a, reason: collision with root package name */
    private final Context f40395a;

    /* renamed from: b, reason: collision with root package name */
    private final E.a f40396b;

    /* renamed from: c, reason: collision with root package name */
    private final E.a f40397c;

    /* renamed from: d, reason: collision with root package name */
    private final String f40398d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C4107c(Context context, E.a aVar, E.a aVar2, String str) {
        if (context != null) {
            this.f40395a = context;
            if (aVar != null) {
                this.f40396b = aVar;
                if (aVar2 != null) {
                    this.f40397c = aVar2;
                    if (str != null) {
                        this.f40398d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    @Override // v.AbstractC4112h
    public Context b() {
        return this.f40395a;
    }

    @Override // v.AbstractC4112h
    public String c() {
        return this.f40398d;
    }

    @Override // v.AbstractC4112h
    public E.a d() {
        return this.f40397c;
    }

    @Override // v.AbstractC4112h
    public E.a e() {
        return this.f40396b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC4112h)) {
            return false;
        }
        AbstractC4112h abstractC4112h = (AbstractC4112h) obj;
        if (this.f40395a.equals(abstractC4112h.b()) && this.f40396b.equals(abstractC4112h.e()) && this.f40397c.equals(abstractC4112h.d()) && this.f40398d.equals(abstractC4112h.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f40395a.hashCode() ^ 1000003) * 1000003) ^ this.f40396b.hashCode()) * 1000003) ^ this.f40397c.hashCode()) * 1000003) ^ this.f40398d.hashCode();
    }

    public String toString() {
        return "CreationContext{applicationContext=" + this.f40395a + ", wallClock=" + this.f40396b + ", monotonicClock=" + this.f40397c + ", backendName=" + this.f40398d + "}";
    }
}
