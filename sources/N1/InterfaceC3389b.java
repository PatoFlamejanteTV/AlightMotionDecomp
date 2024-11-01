package n1;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: n1.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3389b {

    /* renamed from: n1.b$a */
    /* loaded from: classes4.dex */
    public enum a {
        CRASHLYTICS,
        PERFORMANCE,
        MATT_SAYS_HI
    }

    /* renamed from: n1.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0806b {

        /* renamed from: a, reason: collision with root package name */
        private final String f35088a;

        public C0806b(String sessionId) {
            AbstractC3292y.i(sessionId, "sessionId");
            this.f35088a = sessionId;
        }

        public final String a() {
            return this.f35088a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof C0806b) && AbstractC3292y.d(this.f35088a, ((C0806b) obj).f35088a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f35088a.hashCode();
        }

        public String toString() {
            return "SessionDetails(sessionId=" + this.f35088a + ')';
        }
    }

    boolean a();

    a b();

    void c(C0806b c0806b);
}
