package x2;

import R5.AbstractC1435t;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* renamed from: x2.a */
/* loaded from: classes4.dex */
public final class C4207a extends k {

    /* renamed from: f */
    public static final C0932a f40944f = new C0932a(null);

    /* renamed from: x2.a$a */
    /* loaded from: classes4.dex */
    public static final class C0932a {
        private C0932a() {
        }

        public static /* synthetic */ C4207a b(C0932a c0932a, IOException iOException, String str, int i8, Object obj) {
            if ((i8 & 2) != 0) {
                str = null;
            }
            return c0932a.a(iOException, str);
        }

        public final /* synthetic */ C4207a a(IOException e8, String str) {
            AbstractC3292y.i(e8, "e");
            String str2 = "(" + str + ")";
            if (str == null || n.T(str)) {
                str2 = null;
            }
            return new C4207a("IOException during API request to " + AbstractC1435t.w0(AbstractC1435t.r("Stripe", str2), " ", null, null, 0, null, null, 62, null) + ": " + e8.getMessage() + ". Please check your internet connection and try again. If this problem persists, you should check Stripe's service status at https://twitter.com/stripestatus, or let us know at support@stripe.com.", e8);
        }

        public /* synthetic */ C0932a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public C4207a(String str, Throwable th) {
        super(null, null, 0, th, str, 7, null);
    }

    @Override // x2.k
    public String a() {
        return "connectionError";
    }
}
