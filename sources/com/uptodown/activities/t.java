package com.uptodown.activities;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c5.C2034D;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
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
public final class t extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f30568a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f30569b;

    /* renamed from: c, reason: collision with root package name */
    private final q6.w f30570c;

    /* renamed from: d, reason: collision with root package name */
    private final q6.w f30571d;

    /* renamed from: e, reason: collision with root package name */
    private final q6.w f30572e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f30573f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f30574g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f30575h;

    /* renamed from: i, reason: collision with root package name */
    private int f30576i;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final C2034D f30577a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f30578b;

        public a(C2034D organization, boolean z8) {
            AbstractC3292y.i(organization, "organization");
            this.f30577a = organization;
            this.f30578b = z8;
        }

        public final boolean a() {
            return this.f30578b;
        }

        public final C2034D b() {
            return this.f30577a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3292y.d(this.f30577a, aVar.f30577a) && this.f30578b == aVar.f30578b;
        }

        public int hashCode() {
            return (this.f30577a.hashCode() * 31) + androidx.compose.foundation.a.a(this.f30578b);
        }

        public String toString() {
            return "OrganizationData(organization=" + this.f30577a + ", moreDataAdded=" + this.f30578b + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30579a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30581c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, U5.d dVar) {
            super(2, dVar);
            this.f30581c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f30581c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            V5.b.e();
            if (this.f30579a == 0) {
                Q5.t.b(obj);
                t.this.n(true);
                t.this.m(false);
                c5.K K8 = new C3775H(this.f30581c).K(((Number) t.this.j().getValue()).longValue());
                if (!K8.b() && (d8 = K8.d()) != null && d8.length() != 0) {
                    String d9 = K8.d();
                    AbstractC3292y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        C2034D c2034d = (C2034D) t.this.f30570c.getValue();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3292y.h(jSONObject2, "getJSONObject(...)");
                        c2034d.o(jSONObject2);
                    } else if (jSONObject.getInt("success") == 1) {
                        t.this.m(true);
                    }
                }
                t.this.f30568a.setValue(new AbstractC3768A.c(new a((C2034D) t.this.f30570c.getValue(), false)));
                t.this.n(false);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30582a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30584c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context, U5.d dVar) {
            super(2, dVar);
            this.f30584c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f30584c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            String d8;
            V5.b.e();
            if (this.f30582a == 0) {
                Q5.t.b(obj);
                t.this.f30568a.setValue(AbstractC3768A.a.f37253a);
                t.this.n(true);
                c5.K J8 = new C3775H(this.f30584c).J(((Number) t.this.j().getValue()).longValue(), t.this.f30576i);
                if (!J8.b() && (d8 = J8.d()) != null && d8.length() != 0) {
                    String d9 = J8.d();
                    AbstractC3292y.f(d9);
                    JSONObject jSONObject = new JSONObject(d9);
                    if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                        C2034D c2034d = (C2034D) t.this.f30570c.getValue();
                        C2034D c2034d2 = (C2034D) t.this.f30570c.getValue();
                        JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                        AbstractC3292y.h(jSONArray, "getJSONArray(...)");
                        c2034d.p(c2034d2.n(jSONArray));
                    } else if (J8.b() && J8.e() == 404) {
                        t.this.m(true);
                        t.this.f30568a.setValue(AbstractC3768A.b.f37254a);
                    }
                    t.this.f30568a.setValue(new AbstractC3768A.c(new a((C2034D) t.this.f30570c.getValue(), true)));
                    int i8 = t.this.f30576i;
                    t.this.f30576i = i8 + 1;
                    kotlin.coroutines.jvm.internal.b.c(i8);
                } else {
                    t.this.m(true);
                    t.this.f30568a.setValue(AbstractC3768A.b.f37254a);
                }
                t.this.n(false);
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public t() {
        q6.w a9 = AbstractC3815N.a(AbstractC3768A.a.f37253a);
        this.f30568a = a9;
        this.f30569b = a9;
        this.f30570c = AbstractC3815N.a(new C2034D());
        this.f30571d = AbstractC3815N.a(0L);
        this.f30572e = AbstractC3815N.a("");
        this.f30576i = 2;
    }

    public final void e(Context context) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new b(context, null), 2, null);
    }

    public final void f(Context context) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new c(context, null), 2, null);
    }

    public final boolean g() {
        return this.f30574g;
    }

    public final InterfaceC3813L h() {
        return this.f30569b;
    }

    public final boolean i() {
        return this.f30573f;
    }

    public final q6.w j() {
        return this.f30571d;
    }

    public final q6.w k() {
        return this.f30572e;
    }

    public final boolean l() {
        return this.f30575h;
    }

    public final void m(boolean z8) {
        this.f30574g = z8;
    }

    public final void n(boolean z8) {
        this.f30573f = z8;
    }

    public final void o(boolean z8) {
        this.f30575h = z8;
    }
}
