package Q2;

import kotlin.jvm.internal.AbstractC3292y;
import x2.k;

/* loaded from: classes4.dex */
public final class a extends k {

    /* renamed from: f, reason: collision with root package name */
    private final String f8350f;

    /* renamed from: g, reason: collision with root package name */
    private final T2.a f8351g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(String str, T2.a accountStatus) {
        super(null, null, 0, null, null, 31, null);
        AbstractC3292y.i(accountStatus, "accountStatus");
        this.f8350f = str;
        this.f8351g = accountStatus;
    }

    @Override // x2.k
    public String a() {
        return "alreadyLoggedIntoLinkError";
    }

    @Override // x2.k
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (AbstractC3292y.d(this.f8350f, aVar.f8350f) && this.f8351g == aVar.f8351g) {
            return true;
        }
        return false;
    }

    @Override // x2.k
    public int hashCode() {
        int hashCode;
        String str = this.f8350f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return (hashCode * 31) + this.f8351g.hashCode();
    }

    @Override // x2.k, java.lang.Throwable
    public String toString() {
        return "AlreadyLoggedInLinkException(email=" + this.f8350f + ", accountStatus=" + this.f8351g + ")";
    }
}
