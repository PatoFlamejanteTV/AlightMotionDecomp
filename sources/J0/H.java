package J0;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class H {

    /* renamed from: a, reason: collision with root package name */
    private final String f3860a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3861b;

    public H(String str, String str2) {
        this.f3860a = str;
        this.f3861b = str2;
    }

    public final String a() {
        return this.f3861b;
    }

    public final String b() {
        return this.f3860a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h8 = (H) obj;
        if (AbstractC3292y.d(this.f3860a, h8.f3860a) && AbstractC3292y.d(this.f3861b, h8.f3861b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        String str = this.f3860a;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = hashCode * 31;
        String str2 = this.f3861b;
        if (str2 != null) {
            i8 = str2.hashCode();
        }
        return i9 + i8;
    }

    public String toString() {
        return "FirebaseInstallationId(fid=" + this.f3860a + ", authToken=" + this.f3861b + ')';
    }
}
