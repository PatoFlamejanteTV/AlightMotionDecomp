package g3;

import R5.Q;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class s {

    /* renamed from: k, reason: collision with root package name */
    private static final a f32228k = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final String f32229a;

    /* renamed from: b, reason: collision with root package name */
    private final String f32230b;

    /* renamed from: c, reason: collision with root package name */
    private final Boolean f32231c;

    /* renamed from: d, reason: collision with root package name */
    private final String f32232d;

    /* renamed from: e, reason: collision with root package name */
    private final N f32233e;

    /* renamed from: f, reason: collision with root package name */
    private final String f32234f;

    /* renamed from: g, reason: collision with root package name */
    private final String f32235g;

    /* renamed from: h, reason: collision with root package name */
    private final String f32236h;

    /* renamed from: i, reason: collision with root package name */
    private final Integer f32237i;

    /* renamed from: j, reason: collision with root package name */
    private final String f32238j;

    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public s(String uniqueId, String str, Boolean bool, String str2, N n8, String str3, String str4, String str5, Integer num, String str6) {
        AbstractC3292y.i(uniqueId, "uniqueId");
        this.f32229a = uniqueId;
        this.f32230b = str;
        this.f32231c = bool;
        this.f32232d = str2;
        this.f32233e = n8;
        this.f32234f = str3;
        this.f32235g = str4;
        this.f32236h = str5;
        this.f32237i = num;
        this.f32238j = str6;
    }

    public final Map a() {
        String str;
        Q5.r a9 = Q5.x.a("unique_id", this.f32229a);
        Q5.r a10 = Q5.x.a("initial_institution", this.f32230b);
        Q5.r a11 = Q5.x.a("manual_entry_only", this.f32231c);
        Q5.r a12 = Q5.x.a("search_session", this.f32232d);
        N n8 = this.f32233e;
        if (n8 != null) {
            str = n8.b();
        } else {
            str = null;
        }
        return Q.k(a9, a10, a11, a12, Q5.x.a("verification_method", str), Q5.x.a("customer", this.f32235g), Q5.x.a("on_behalf_of", this.f32236h), Q5.x.a("hosted_surface", this.f32234f), Q5.x.a(RewardPlus.AMOUNT, this.f32237i), Q5.x.a("currency", this.f32238j));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        if (AbstractC3292y.d(this.f32229a, sVar.f32229a) && AbstractC3292y.d(this.f32230b, sVar.f32230b) && AbstractC3292y.d(this.f32231c, sVar.f32231c) && AbstractC3292y.d(this.f32232d, sVar.f32232d) && this.f32233e == sVar.f32233e && AbstractC3292y.d(this.f32234f, sVar.f32234f) && AbstractC3292y.d(this.f32235g, sVar.f32235g) && AbstractC3292y.d(this.f32236h, sVar.f32236h) && AbstractC3292y.d(this.f32237i, sVar.f32237i) && AbstractC3292y.d(this.f32238j, sVar.f32238j)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9 = this.f32229a.hashCode() * 31;
        String str = this.f32230b;
        int i8 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i9 = (hashCode9 + hashCode) * 31;
        Boolean bool = this.f32231c;
        if (bool == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = bool.hashCode();
        }
        int i10 = (i9 + hashCode2) * 31;
        String str2 = this.f32232d;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        N n8 = this.f32233e;
        if (n8 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = n8.hashCode();
        }
        int i12 = (i11 + hashCode4) * 31;
        String str3 = this.f32234f;
        if (str3 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str3.hashCode();
        }
        int i13 = (i12 + hashCode5) * 31;
        String str4 = this.f32235g;
        if (str4 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str4.hashCode();
        }
        int i14 = (i13 + hashCode6) * 31;
        String str5 = this.f32236h;
        if (str5 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str5.hashCode();
        }
        int i15 = (i14 + hashCode7) * 31;
        Integer num = this.f32237i;
        if (num == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = num.hashCode();
        }
        int i16 = (i15 + hashCode8) * 31;
        String str6 = this.f32238j;
        if (str6 != null) {
            i8 = str6.hashCode();
        }
        return i16 + i8;
    }

    public String toString() {
        return "CreateFinancialConnectionsSessionForDeferredPaymentParams(uniqueId=" + this.f32229a + ", initialInstitution=" + this.f32230b + ", manualEntryOnly=" + this.f32231c + ", searchSession=" + this.f32232d + ", verificationMethod=" + this.f32233e + ", hostedSurface=" + this.f32234f + ", customer=" + this.f32235g + ", onBehalfOf=" + this.f32236h + ", amount=" + this.f32237i + ", currency=" + this.f32238j + ")";
    }
}
