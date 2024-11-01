package com.google.android.gms.internal.measurement;

import android.content.Context;

/* loaded from: classes3.dex */
final class U2 extends AbstractC2255t3 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16465a;

    /* renamed from: b, reason: collision with root package name */
    private final w0.k f16466b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public U2(Context context, w0.k kVar) {
        if (context != null) {
            this.f16465a = context;
            this.f16466b = kVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2255t3
    public final Context a() {
        return this.f16465a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.measurement.AbstractC2255t3
    public final w0.k b() {
        return this.f16466b;
    }

    public final boolean equals(Object obj) {
        w0.k kVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC2255t3) {
            AbstractC2255t3 abstractC2255t3 = (AbstractC2255t3) obj;
            if (this.f16465a.equals(abstractC2255t3.a()) && ((kVar = this.f16466b) != null ? kVar.equals(abstractC2255t3.b()) : abstractC2255t3.b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f16465a.hashCode() ^ 1000003) * 1000003;
        w0.k kVar = this.f16466b;
        if (kVar == null) {
            hashCode = 0;
        } else {
            hashCode = kVar.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        return "FlagsContext{context=" + String.valueOf(this.f16465a) + ", hermeticFileOverrides=" + String.valueOf(this.f16466b) + "}";
    }
}
