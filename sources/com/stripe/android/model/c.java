package com.stripe.android.model;

import R5.Q;
import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.m;
import g3.InterfaceC2910i;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public final class c implements InterfaceC2910i {

    /* renamed from: a, reason: collision with root package name */
    private final String f25463a;

    /* renamed from: b, reason: collision with root package name */
    private final String f25464b;

    /* renamed from: c, reason: collision with root package name */
    private final p f25465c;

    /* renamed from: d, reason: collision with root package name */
    private String f25466d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f25467e;

    /* renamed from: f, reason: collision with root package name */
    private String f25468f;

    /* renamed from: g, reason: collision with root package name */
    private m f25469g;

    /* renamed from: h, reason: collision with root package name */
    public static final a f25461h = new a(null);

    /* renamed from: i, reason: collision with root package name */
    public static final int f25462i = 8;
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public static /* synthetic */ c c(a aVar, p pVar, String str, m mVar, String str2, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                mVar = null;
            }
            if ((i8 & 8) != 0) {
                str2 = null;
            }
            return aVar.a(pVar, str, mVar, str2);
        }

        public static /* synthetic */ c d(a aVar, String str, String str2, m mVar, String str3, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                mVar = null;
            }
            if ((i8 & 8) != 0) {
                str3 = null;
            }
            return aVar.b(str, str2, mVar, str3);
        }

        public final c a(p paymentMethodCreateParams, String clientSecret, m mVar, String str) {
            AbstractC3292y.i(paymentMethodCreateParams, "paymentMethodCreateParams");
            AbstractC3292y.i(clientSecret, "clientSecret");
            return new c(clientSecret, null, paymentMethodCreateParams, null, false, str, mVar, 26, null);
        }

        public final c b(String paymentMethodId, String clientSecret, m mVar, String str) {
            AbstractC3292y.i(paymentMethodId, "paymentMethodId");
            AbstractC3292y.i(clientSecret, "clientSecret");
            return new c(clientSecret, paymentMethodId, null, null, false, str, mVar, 28, null);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c createFromParcel(Parcel parcel) {
            AbstractC3292y.i(parcel, "parcel");
            return new c(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : p.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0 ? m.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c[] newArray(int i8) {
            return new c[i8];
        }
    }

    public c(String clientSecret, String str, p pVar, String str2, boolean z8, String str3, m mVar) {
        AbstractC3292y.i(clientSecret, "clientSecret");
        this.f25463a = clientSecret;
        this.f25464b = str;
        this.f25465c = pVar;
        this.f25466d = str2;
        this.f25467e = z8;
        this.f25468f = str3;
        this.f25469g = mVar;
    }

    public static /* synthetic */ c b(c cVar, String str, String str2, p pVar, String str3, boolean z8, String str4, m mVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = cVar.f25463a;
        }
        if ((i8 & 2) != 0) {
            str2 = cVar.f25464b;
        }
        String str5 = str2;
        if ((i8 & 4) != 0) {
            pVar = cVar.f25465c;
        }
        p pVar2 = pVar;
        if ((i8 & 8) != 0) {
            str3 = cVar.f25466d;
        }
        String str6 = str3;
        if ((i8 & 16) != 0) {
            z8 = cVar.f25467e;
        }
        boolean z9 = z8;
        if ((i8 & 32) != 0) {
            str4 = cVar.f25468f;
        }
        String str7 = str4;
        if ((i8 & 64) != 0) {
            mVar = cVar.f25469g;
        }
        return cVar.a(str, str5, pVar2, str6, z9, str7, mVar);
    }

    private final Map f() {
        Map B8;
        m mVar = this.f25469g;
        if (mVar == null || (B8 = mVar.B()) == null) {
            p pVar = this.f25465c;
            if (pVar != null && pVar.s() && this.f25468f == null) {
                return new m(m.c.a.f25543e.a()).B();
            }
            return null;
        }
        return B8;
    }

    private final Map i() {
        p pVar = this.f25465c;
        if (pVar != null) {
            return Q.e(Q5.x.a("payment_method_data", pVar.B()));
        }
        String str = this.f25464b;
        if (str != null) {
            return Q.e(Q5.x.a("payment_method", str));
        }
        return Q.h();
    }

    @Override // g3.InterfaceC2910i
    public String A() {
        return this.f25466d;
    }

    @Override // g3.InterfaceC2900J
    public Map B() {
        Map map;
        Map map2;
        Map k8 = Q.k(Q5.x.a("client_secret", d()), Q5.x.a("use_stripe_sdk", Boolean.valueOf(this.f25467e)));
        String A8 = A();
        Map map3 = null;
        if (A8 != null) {
            map = Q.e(Q5.x.a("return_url", A8));
        } else {
            map = null;
        }
        if (map == null) {
            map = Q.h();
        }
        Map q8 = Q.q(k8, map);
        String str = this.f25468f;
        if (str != null) {
            map2 = Q.e(Q5.x.a("mandate", str));
        } else {
            map2 = null;
        }
        if (map2 == null) {
            map2 = Q.h();
        }
        Map q9 = Q.q(q8, map2);
        Map f8 = f();
        if (f8 != null) {
            map3 = Q.e(Q5.x.a("mandate_data", f8));
        }
        if (map3 == null) {
            map3 = Q.h();
        }
        return Q.q(Q.q(q9, map3), i());
    }

    @Override // g3.InterfaceC2910i
    public void V(String str) {
        this.f25466d = str;
    }

    public final c a(String clientSecret, String str, p pVar, String str2, boolean z8, String str3, m mVar) {
        AbstractC3292y.i(clientSecret, "clientSecret");
        return new c(clientSecret, str, pVar, str2, z8, str3, mVar);
    }

    @Override // g3.InterfaceC2910i
    public /* synthetic */ String d() {
        return this.f25463a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return AbstractC3292y.d(this.f25463a, cVar.f25463a) && AbstractC3292y.d(this.f25464b, cVar.f25464b) && AbstractC3292y.d(this.f25465c, cVar.f25465c) && AbstractC3292y.d(this.f25466d, cVar.f25466d) && this.f25467e == cVar.f25467e && AbstractC3292y.d(this.f25468f, cVar.f25468f) && AbstractC3292y.d(this.f25469g, cVar.f25469g);
    }

    public final /* synthetic */ p h() {
        return this.f25465c;
    }

    public int hashCode() {
        int hashCode = this.f25463a.hashCode() * 31;
        String str = this.f25464b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        p pVar = this.f25465c;
        int hashCode3 = (hashCode2 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        String str2 = this.f25466d;
        int hashCode4 = (((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + androidx.compose.foundation.a.a(this.f25467e)) * 31;
        String str3 = this.f25468f;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        m mVar = this.f25469g;
        return hashCode5 + (mVar != null ? mVar.hashCode() : 0);
    }

    @Override // g3.InterfaceC2910i
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public c E(boolean z8) {
        return b(this, null, null, null, null, z8, null, null, 111, null);
    }

    public String toString() {
        return "ConfirmSetupIntentParams(clientSecret=" + this.f25463a + ", paymentMethodId=" + this.f25464b + ", paymentMethodCreateParams=" + this.f25465c + ", returnUrl=" + this.f25466d + ", useStripeSdk=" + this.f25467e + ", mandateId=" + this.f25468f + ", mandateData=" + this.f25469g + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i8) {
        AbstractC3292y.i(out, "out");
        out.writeString(this.f25463a);
        out.writeString(this.f25464b);
        p pVar = this.f25465c;
        if (pVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            pVar.writeToParcel(out, i8);
        }
        out.writeString(this.f25466d);
        out.writeInt(this.f25467e ? 1 : 0);
        out.writeString(this.f25468f);
        m mVar = this.f25469g;
        if (mVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mVar.writeToParcel(out, i8);
        }
    }

    public /* synthetic */ c(String str, String str2, p pVar, String str3, boolean z8, String str4, m mVar, int i8, AbstractC3284p abstractC3284p) {
        this(str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? null : pVar, (i8 & 8) != 0 ? null : str3, (i8 & 16) != 0 ? false : z8, (i8 & 32) != 0 ? null : str4, (i8 & 64) == 0 ? mVar : null);
    }
}
