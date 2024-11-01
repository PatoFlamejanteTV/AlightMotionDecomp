package v2;

import kotlin.jvm.internal.AbstractC3284p;
import l6.n;

/* renamed from: v2.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4120a {

    /* renamed from: a, reason: collision with root package name */
    public static final C0908a f40423a = new C0908a(null);

    /* renamed from: b, reason: collision with root package name */
    private static final C4120a f40424b = new C4120a();

    /* renamed from: v2.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0908a {
        private C0908a() {
        }

        public final C4120a a() {
            return C4120a.f40424b;
        }

        public /* synthetic */ C0908a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public final String b(String str) {
        boolean z8;
        if (str != null && !n.T(str)) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (!z8) {
            if (!n.B(str, "sk_", false, 2, null)) {
                return str;
            }
            throw new IllegalArgumentException("Invalid Publishable Key: You are using a secret key instead of a publishable one. For more info, see https://stripe.com/docs/keys".toString());
        }
        throw new IllegalArgumentException("Invalid Publishable Key: You must use a valid Stripe API key to make a Stripe API request. For more info, see https://stripe.com/docs/keys".toString());
    }
}
