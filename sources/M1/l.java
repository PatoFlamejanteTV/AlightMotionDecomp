package m1;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private final String f34937a;

    public l(String str) {
        this.f34937a = str;
    }

    public final String a() {
        return this.f34937a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof l) && AbstractC3292y.d(this.f34937a, ((l) obj).f34937a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f34937a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.f34937a + ')';
    }
}
