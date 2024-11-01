package Y2;

import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class m {

    /* loaded from: classes4.dex */
    public static final class a extends m {

        /* renamed from: a, reason: collision with root package name */
        private final String f12034a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String email) {
            super(null);
            AbstractC3292y.i(email, "email");
            this.f12034a = email;
        }

        public final String a() {
            return this.f12034a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if ((obj instanceof a) && AbstractC3292y.d(this.f12034a, ((a) obj).f12034a)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return this.f12034a.hashCode();
        }

        public String toString() {
            return "SignIn(email=" + this.f12034a + ")";
        }
    }

    /* loaded from: classes4.dex */
    public static final class b extends m {

        /* renamed from: a, reason: collision with root package name */
        private final String f12035a;

        /* renamed from: b, reason: collision with root package name */
        private final String f12036b;

        /* renamed from: c, reason: collision with root package name */
        private final String f12037c;

        /* renamed from: d, reason: collision with root package name */
        private final String f12038d;

        /* renamed from: e, reason: collision with root package name */
        private final l f12039e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String email, String phone, String country, String str, l consentAction) {
            super(null);
            AbstractC3292y.i(email, "email");
            AbstractC3292y.i(phone, "phone");
            AbstractC3292y.i(country, "country");
            AbstractC3292y.i(consentAction, "consentAction");
            this.f12035a = email;
            this.f12036b = phone;
            this.f12037c = country;
            this.f12038d = str;
            this.f12039e = consentAction;
        }

        public final l a() {
            return this.f12039e;
        }

        public final String b() {
            return this.f12037c;
        }

        public final String c() {
            return this.f12035a;
        }

        public final String d() {
            return this.f12038d;
        }

        public final String e() {
            return this.f12036b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (AbstractC3292y.d(this.f12035a, bVar.f12035a) && AbstractC3292y.d(this.f12036b, bVar.f12036b) && AbstractC3292y.d(this.f12037c, bVar.f12037c) && AbstractC3292y.d(this.f12038d, bVar.f12038d) && this.f12039e == bVar.f12039e) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = ((((this.f12035a.hashCode() * 31) + this.f12036b.hashCode()) * 31) + this.f12037c.hashCode()) * 31;
            String str = this.f12038d;
            if (str == null) {
                hashCode = 0;
            } else {
                hashCode = str.hashCode();
            }
            return ((hashCode2 + hashCode) * 31) + this.f12039e.hashCode();
        }

        public String toString() {
            return "SignUp(email=" + this.f12035a + ", phone=" + this.f12036b + ", country=" + this.f12037c + ", name=" + this.f12038d + ", consentAction=" + this.f12039e + ")";
        }
    }

    public /* synthetic */ m(AbstractC3284p abstractC3284p) {
        this();
    }

    private m() {
    }
}
