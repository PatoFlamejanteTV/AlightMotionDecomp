package com.uptodown.activities;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c5.C2043h;
import c5.M;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.AbstractC3768A;
import q5.C3775H;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public final class v extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f30621a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f30622b;

    /* renamed from: c, reason: collision with root package name */
    private final q6.w f30623c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f30624d;

    /* renamed from: e, reason: collision with root package name */
    private final q6.w f30625e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC3813L f30626f;

    /* renamed from: g, reason: collision with root package name */
    private q6.w f30627g;

    /* renamed from: h, reason: collision with root package name */
    private q6.w f30628h;

    /* renamed from: i, reason: collision with root package name */
    private q6.w f30629i;

    /* renamed from: j, reason: collision with root package name */
    private q6.w f30630j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f30631k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f30632l;

    /* renamed from: m, reason: collision with root package name */
    private int f30633m;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f30634a;

        public a(ArrayList reviews) {
            AbstractC3292y.i(reviews, "reviews");
            this.f30634a = reviews;
        }

        public final ArrayList a() {
            return this.f30634a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3292y.d(this.f30634a, ((a) obj).f30634a);
        }

        public int hashCode() {
            return this.f30634a.hashCode();
        }

        public String toString() {
            return "ReviewsData(reviews=" + this.f30634a + ')';
        }
    }

    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f30635a;

        /* renamed from: b, reason: collision with root package name */
        private final int f30636b;

        public b(int i8, int i9) {
            this.f30635a = i8;
            this.f30636b = i9;
        }

        public final int a() {
            return this.f30636b;
        }

        public final int b() {
            return this.f30635a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f30635a == bVar.f30635a && this.f30636b == bVar.f30636b;
        }

        public int hashCode() {
            return (this.f30635a * 31) + this.f30636b;
        }

        public String toString() {
            return "SendReviewData(success=" + this.f30635a + ", statusCode=" + this.f30636b + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30637a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30639c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, U5.d dVar) {
            super(2, dVar);
            this.f30639c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f30639c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            JSONArray jSONArray;
            V5.b.e();
            if (this.f30637a == 0) {
                Q5.t.b(obj);
                v.this.f30621a.setValue(AbstractC3768A.a.f37253a);
                ArrayList arrayList = new ArrayList();
                C3775H c3775h = new C3775H(this.f30639c);
                Object value = v.this.e().getValue();
                AbstractC3292y.f(value);
                c5.K W8 = c3775h.W(((C2043h) value).h(), 20, v.this.j(), (String) v.this.k().getValue());
                if (!W8.b() && W8.d() != null) {
                    String d8 = W8.d();
                    AbstractC3292y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull("success")) {
                        i8 = jSONObject.getInt("success");
                    } else {
                        i8 = 0;
                    }
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                    } else {
                        jSONArray = null;
                    }
                    if (i8 == 1 && jSONArray != null) {
                        int length = jSONArray.length();
                        for (int i9 = 0; i9 < length; i9++) {
                            M.b bVar = c5.M.f15633o;
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                            AbstractC3292y.h(jSONObject2, "getJSONObject(...)");
                            arrayList.add(bVar.a(jSONObject2));
                        }
                    }
                } else {
                    v.this.q(false);
                }
                v.this.f30621a.setValue(new AbstractC3768A.c(new a(arrayList)));
                v vVar = v.this;
                vVar.s(vVar.j() + arrayList.size());
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30640a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c5.M f30641b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30642c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ v f30643d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c5.M m8, Context context, v vVar, U5.d dVar) {
            super(2, dVar);
            this.f30641b = m8;
            this.f30642c = context;
            this.f30643d = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f30641b, this.f30642c, this.f30643d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f30640a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                M.b bVar = c5.M.f15633o;
                c5.M m8 = this.f30641b;
                Context context = this.f30642c;
                this.f30640a = 1;
                obj = bVar.c(m8, context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f30643d.f30625e.setValue(new AbstractC3768A.c(new M.c(this.f30641b, ((Number) obj).intValue())));
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30644a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f30645b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30646c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ v f30647d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(Context context, String str, v vVar, U5.d dVar) {
            super(2, dVar);
            this.f30645b = context;
            this.f30646c = str;
            this.f30647d = vVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f30645b, this.f30646c, this.f30647d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i8;
            V5.b.e();
            if (this.f30644a == 0) {
                Q5.t.b(obj);
                M.b bVar = c5.M.f15633o;
                int i9 = 0;
                if (!bVar.b(this.f30645b, this.f30646c)) {
                    bVar.f(this.f30645b, this.f30646c, String.valueOf(System.currentTimeMillis()));
                    C3775H c3775h = new C3775H(this.f30645b);
                    c5.M m8 = new c5.M();
                    m8.c0(this.f30646c);
                    m8.b0(((Number) this.f30647d.m().getValue()).intValue());
                    Object value = this.f30647d.e().getValue();
                    AbstractC3292y.f(value);
                    c5.K J02 = c3775h.J0(((C2043h) value).h(), m8);
                    i8 = J02.e();
                    if (!J02.b() && J02.d() != null) {
                        String d8 = J02.d();
                        AbstractC3292y.f(d8);
                        JSONObject jSONObject = new JSONObject(d8);
                        if (!jSONObject.isNull("success")) {
                            i9 = jSONObject.getInt("success");
                        }
                    }
                } else {
                    i8 = 0;
                }
                this.f30647d.f30623c.setValue(new AbstractC3768A.c(new b(i9, i8)));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public v() {
        q6.w a9 = AbstractC3815N.a(AbstractC3768A.a.f37253a);
        this.f30621a = a9;
        this.f30622b = a9;
        AbstractC3768A.b bVar = AbstractC3768A.b.f37254a;
        q6.w a10 = AbstractC3815N.a(bVar);
        this.f30623c = a10;
        this.f30624d = a10;
        q6.w a11 = AbstractC3815N.a(bVar);
        this.f30625e = a11;
        this.f30626f = a11;
        this.f30627g = AbstractC3815N.a(null);
        this.f30628h = AbstractC3815N.a(null);
        this.f30629i = AbstractC3815N.a("date");
        this.f30630j = AbstractC3815N.a(-1);
        this.f30631k = true;
    }

    public final void d(Context context) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new c(context, null), 2, null);
    }

    public final q6.w e() {
        return this.f30627g;
    }

    public final InterfaceC3813L f() {
        return this.f30622b;
    }

    public final boolean g() {
        return this.f30631k;
    }

    public final boolean h() {
        return this.f30632l;
    }

    public final q6.w i() {
        return this.f30628h;
    }

    public final int j() {
        return this.f30633m;
    }

    public final q6.w k() {
        return this.f30629i;
    }

    public final InterfaceC3813L l() {
        return this.f30626f;
    }

    public final q6.w m() {
        return this.f30630j;
    }

    public final InterfaceC3813L n() {
        return this.f30624d;
    }

    public final void o(Context context, c5.M review) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(review, "review");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new d(review, context, this, null), 2, null);
    }

    public final void p(Context context, String str) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new e(context, str, this, null), 2, null);
    }

    public final void q(boolean z8) {
        this.f30631k = z8;
    }

    public final void r(boolean z8) {
        this.f30632l = z8;
    }

    public final void s(int i8) {
        this.f30633m = i8;
    }
}
