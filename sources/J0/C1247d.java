package J0;

import J0.J;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: J0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1247d extends J.a {

    /* renamed from: a, reason: collision with root package name */
    private final String f3898a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3899b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3900c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1247d(String str, String str2, String str3) {
        if (str != null) {
            this.f3898a = str;
            this.f3899b = str2;
            this.f3900c = str3;
            return;
        }
        throw new NullPointerException("Null crashlyticsInstallId");
    }

    @Override // J0.J.a
    public String c() {
        return this.f3898a;
    }

    @Override // J0.J.a
    public String d() {
        return this.f3900c;
    }

    @Override // J0.J.a
    public String e() {
        return this.f3899b;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof J.a)) {
            return false;
        }
        J.a aVar = (J.a) obj;
        if (this.f3898a.equals(aVar.c()) && ((str = this.f3899b) != null ? str.equals(aVar.e()) : aVar.e() == null)) {
            String str2 = this.f3900c;
            if (str2 == null) {
                if (aVar.d() == null) {
                    return true;
                }
            } else if (str2.equals(aVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = (this.f3898a.hashCode() ^ 1000003) * 1000003;
        String str = this.f3899b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode2 ^ hashCode) * 1000003;
        String str2 = this.f3900c;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i9 ^ i8;
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f3898a + ", firebaseInstallationId=" + this.f3899b + ", firebaseAuthenticationToken=" + this.f3900c + "}";
    }
}
