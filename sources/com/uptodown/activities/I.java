package com.uptodown.activities;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c5.T;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.AbstractC3769B;
import q5.C3775H;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public final class I extends ViewModel {

    /* renamed from: g, reason: collision with root package name */
    public static final a f29545g = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f29546a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f29547b;

    /* renamed from: c, reason: collision with root package name */
    private final q6.w f29548c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f29549d;

    /* renamed from: e, reason: collision with root package name */
    private final q6.w f29550e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3813L f29551f;

    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f29552a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29553b;

        public b(String id, String message) {
            AbstractC3292y.i(id, "id");
            AbstractC3292y.i(message, "message");
            this.f29552a = id;
            this.f29553b = message;
        }

        public final String a() {
            return this.f29552a;
        }

        public final String b() {
            return this.f29553b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC3292y.d(this.f29552a, bVar.f29552a) && AbstractC3292y.d(this.f29553b, bVar.f29553b);
        }

        public int hashCode() {
            return (this.f29552a.hashCode() * 31) + this.f29553b.hashCode();
        }

        public String toString() {
            return "UptodownTurboProductPriceData(id=" + this.f29552a + ", message=" + this.f29553b + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        private final String f29554a;

        /* renamed from: b, reason: collision with root package name */
        private final b f29555b;

        /* renamed from: c, reason: collision with root package name */
        private final b f29556c;

        public c(String name, b yearProduct, b monthProduct) {
            AbstractC3292y.i(name, "name");
            AbstractC3292y.i(yearProduct, "yearProduct");
            AbstractC3292y.i(monthProduct, "monthProduct");
            this.f29554a = name;
            this.f29555b = yearProduct;
            this.f29556c = monthProduct;
        }

        public final b a() {
            return this.f29556c;
        }

        public final b b() {
            return this.f29555b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return AbstractC3292y.d(this.f29554a, cVar.f29554a) && AbstractC3292y.d(this.f29555b, cVar.f29555b) && AbstractC3292y.d(this.f29556c, cVar.f29556c);
        }

        public int hashCode() {
            return (((this.f29554a.hashCode() * 31) + this.f29555b.hashCode()) * 31) + this.f29556c.hashCode();
        }

        public String toString() {
            return "UptodownTurboProductsData(name=" + this.f29554a + ", yearProduct=" + this.f29555b + ", monthProduct=" + this.f29556c + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final String f29557a;

        /* renamed from: b, reason: collision with root package name */
        private final String f29558b;

        /* renamed from: c, reason: collision with root package name */
        private final String f29559c;

        /* renamed from: d, reason: collision with root package name */
        private final String f29560d;

        /* renamed from: e, reason: collision with root package name */
        private final String f29561e;

        public d(String clientSecret, String publicKey, String ephemeralKey, String customerID, String buttonText) {
            AbstractC3292y.i(clientSecret, "clientSecret");
            AbstractC3292y.i(publicKey, "publicKey");
            AbstractC3292y.i(ephemeralKey, "ephemeralKey");
            AbstractC3292y.i(customerID, "customerID");
            AbstractC3292y.i(buttonText, "buttonText");
            this.f29557a = clientSecret;
            this.f29558b = publicKey;
            this.f29559c = ephemeralKey;
            this.f29560d = customerID;
            this.f29561e = buttonText;
        }

        public final String a() {
            return this.f29561e;
        }

        public final String b() {
            return this.f29557a;
        }

        public final String c() {
            return this.f29558b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return AbstractC3292y.d(this.f29557a, dVar.f29557a) && AbstractC3292y.d(this.f29558b, dVar.f29558b) && AbstractC3292y.d(this.f29559c, dVar.f29559c) && AbstractC3292y.d(this.f29560d, dVar.f29560d) && AbstractC3292y.d(this.f29561e, dVar.f29561e);
        }

        public int hashCode() {
            return (((((((this.f29557a.hashCode() * 31) + this.f29558b.hashCode()) * 31) + this.f29559c.hashCode()) * 31) + this.f29560d.hashCode()) * 31) + this.f29561e.hashCode();
        }

        public String toString() {
            return "UptodownTurboSubscriptionData(clientSecret=" + this.f29557a + ", publicKey=" + this.f29558b + ", ephemeralKey=" + this.f29559c + ", customerID=" + this.f29560d + ", buttonText=" + this.f29561e + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29562a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29564c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29565d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f29566e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f29567f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, String str, String str2, String str3, U5.d dVar) {
            super(2, dVar);
            this.f29564c = context;
            this.f29565d = str;
            this.f29566e = str2;
            this.f29567f = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f29564c, this.f29565d, this.f29566e, this.f29567f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            int i8;
            String str;
            String str2;
            String str3;
            String str4;
            boolean z8;
            boolean z9;
            boolean z10;
            boolean z11;
            V5.b.e();
            if (this.f29562a == 0) {
                Q5.t.b(obj);
                q6.w wVar = I.this.f29548c;
                AbstractC3769B.c cVar = AbstractC3769B.c.f37258a;
                wVar.setValue(cVar);
                c5.K i9 = new C3775H(this.f29564c).i(this.f29565d, this.f29566e, this.f29567f);
                if (!i9.b() && (d8 = i9.d()) != null && d8.length() != 0) {
                    String d9 = i9.d();
                    AbstractC3292y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    boolean z12 = false;
                    if (!jSONObject.isNull("success")) {
                        i8 = jSONObject.getInt("success");
                    } else {
                        i8 = 0;
                    }
                    if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        String str5 = null;
                        if (!jSONObject2.isNull("clientSecret")) {
                            str = jSONObject2.getString("clientSecret");
                        } else {
                            str = null;
                        }
                        if (!jSONObject2.isNull("publicKey")) {
                            str2 = jSONObject2.getString("publicKey");
                        } else {
                            str2 = null;
                        }
                        if (!jSONObject2.isNull("ephemeralKey")) {
                            str3 = jSONObject2.getString("ephemeralKey");
                        } else {
                            str3 = null;
                        }
                        if (!jSONObject2.isNull("customerID")) {
                            str4 = jSONObject2.getString("customerID");
                        } else {
                            str4 = null;
                        }
                        if (!jSONObject2.isNull("buttonText")) {
                            str5 = jSONObject2.getString("buttonText");
                        }
                        String str6 = str5;
                        if (str != null && str.length() != 0) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        if (!z8) {
                            if (str2 != null && str2.length() != 0) {
                                z9 = false;
                            } else {
                                z9 = true;
                            }
                            if (!z9) {
                                if (str3 != null && str3.length() != 0) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                if (!z10) {
                                    if (str4 != null && str4.length() != 0) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    if (!z11) {
                                        if (str6 == null || str6.length() == 0) {
                                            z12 = true;
                                        }
                                        if (!z12) {
                                            I.this.f29548c.setValue(new AbstractC3769B.d(new d(str, str2, str3, str4, str6)));
                                        }
                                    }
                                }
                            }
                        }
                        I.this.f29548c.setValue(cVar);
                    } else {
                        I.this.f29548c.setValue(cVar);
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29568a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29570c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(Context context, U5.d dVar) {
            super(2, dVar);
            this.f29570c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f29570c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            String str;
            String str2;
            String str3;
            V5.b.e();
            if (this.f29568a == 0) {
                Q5.t.b(obj);
                I.this.f29546a.setValue(AbstractC3769B.c.f37258a);
                c5.K i02 = new C3775H(this.f29570c).i0();
                if (!i02.b() && (d8 = i02.d()) != null && d8.length() != 0) {
                    String d9 = i02.d();
                    AbstractC3292y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (jSONObject.getInt("success") == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                        int length = jSONArray.length();
                        for (int i8 = 0; i8 < length; i8++) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i8);
                            String str4 = "";
                            if (jSONObject2.isNull("name")) {
                                str = "";
                            } else {
                                str = jSONObject2.getString("name");
                            }
                            if (!jSONObject2.isNull("prices")) {
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("prices");
                                if (jSONObject3.isNull("year")) {
                                    str2 = "";
                                } else {
                                    JSONObject jSONObject4 = jSONObject3.getJSONObject("year");
                                    if (jSONObject4.isNull("id")) {
                                        str3 = "";
                                    } else {
                                        str3 = jSONObject4.getString("id");
                                    }
                                    if (!jSONObject4.isNull("message")) {
                                        str4 = jSONObject4.getString("message");
                                    }
                                    str2 = str4;
                                    str4 = str3;
                                }
                                b bVar = new b(str4, str2);
                                if (!jSONObject3.isNull("month")) {
                                    JSONObject jSONObject5 = jSONObject3.getJSONObject("month");
                                    if (!jSONObject5.isNull("id")) {
                                        str4 = jSONObject5.getString("id");
                                    }
                                    if (!jSONObject5.isNull("message")) {
                                        str2 = jSONObject5.getString("message");
                                    }
                                }
                                I.this.f29546a.setValue(new AbstractC3769B.d(new c(str, bVar, new b(str4, str2))));
                            }
                        }
                    } else {
                        I.this.f29546a.setValue(AbstractC3769B.a.f37256a);
                    }
                } else {
                    I.this.f29546a.setValue(AbstractC3769B.a.f37256a);
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29571a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f29572b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ I f29573c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(Context context, I i8, U5.d dVar) {
            super(2, dVar);
            this.f29572b = context;
            this.f29573c = i8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f29572b, this.f29573c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String id;
            String d8;
            V5.b.e();
            if (this.f29571a == 0) {
                Q5.t.b(obj);
                C3775H c3775h = new C3775H(this.f29572b);
                T e8 = T.f15689k.e(this.f29572b);
                if (e8 != null && (id = e8.getId()) != null && id.length() != 0) {
                    String id2 = e8.getId();
                    AbstractC3292y.f(id2);
                    c5.K a02 = c3775h.a0(id2);
                    if (!a02.b() && (d8 = a02.d()) != null && d8.length() != 0) {
                        String d9 = a02.d();
                        AbstractC3292y.f(d9);
                        JSONObject jSONObject = new JSONObject(d9);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            if (!jSONObject2.isNull("url")) {
                                this.f29573c.f29550e.setValue(new AbstractC3769B.d(jSONObject2.getString("url")));
                            }
                        }
                    }
                }
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public I() {
        AbstractC3769B.b bVar = AbstractC3769B.b.f37257a;
        q6.w a9 = AbstractC3815N.a(bVar);
        this.f29546a = a9;
        this.f29547b = a9;
        q6.w a10 = AbstractC3815N.a(bVar);
        this.f29548c = a10;
        this.f29549d = a10;
        q6.w a11 = AbstractC3815N.a(bVar);
        this.f29550e = a11;
        this.f29551f = a11;
    }

    public final void d(Context context, String priceId, String userID, String productType) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(priceId, "priceId");
        AbstractC3292y.i(userID, "userID");
        AbstractC3292y.i(productType, "productType");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new e(context, userID, priceId, productType, null), 2, null);
    }

    public final InterfaceC3813L e() {
        return this.f29547b;
    }

    public final void f(Context context) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new f(context, null), 2, null);
    }

    public final InterfaceC3813L g() {
        return this.f29551f;
    }

    public final void h(Context context) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new g(context, this, null), 2, null);
    }

    public final InterfaceC3813L i() {
        return this.f29549d;
    }
}
