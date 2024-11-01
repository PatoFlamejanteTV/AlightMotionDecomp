package com.uptodown.activities;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c5.M;
import c5.T;
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
public final class L extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f29593a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f29594b;

    /* renamed from: c, reason: collision with root package name */
    private final q6.w f29595c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC3813L f29596d;

    /* renamed from: e, reason: collision with root package name */
    private q6.w f29597e;

    /* renamed from: f, reason: collision with root package name */
    private q6.w f29598f;

    /* renamed from: g, reason: collision with root package name */
    private q6.w f29599g;

    /* renamed from: h, reason: collision with root package name */
    private q6.w f29600h;

    /* renamed from: i, reason: collision with root package name */
    private q6.w f29601i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f29602j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f29603k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f29604l;

    /* renamed from: m, reason: collision with root package name */
    private int f29605m;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final T f29606a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f29607b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f29608c;

        public a(T t8, ArrayList reviews, boolean z8) {
            AbstractC3292y.i(reviews, "reviews");
            this.f29606a = t8;
            this.f29607b = reviews;
            this.f29608c = z8;
        }

        public final ArrayList a() {
            return this.f29607b;
        }

        public final T b() {
            return this.f29606a;
        }

        public final boolean c() {
            return this.f29608c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3292y.d(this.f29606a, aVar.f29606a) && AbstractC3292y.d(this.f29607b, aVar.f29607b) && this.f29608c == aVar.f29608c;
        }

        public int hashCode() {
            T t8 = this.f29606a;
            return ((((t8 == null ? 0 : t8.hashCode()) * 31) + this.f29607b.hashCode()) * 31) + androidx.compose.foundation.a.a(this.f29608c);
        }

        public String toString() {
            return "UserCommentsData(user=" + this.f29606a + ", reviews=" + this.f29607b + ", userExists=" + this.f29608c + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29609a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29611c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, U5.d dVar) {
            super(2, dVar);
            this.f29611c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f29611c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            T t8;
            V5.b.e();
            if (this.f29609a == 0) {
                Q5.t.b(obj);
                if (L.this.f29603k) {
                    ArrayList arrayList = new ArrayList();
                    C3775H c3775h = new C3775H(this.f29611c);
                    Object value = L.this.m().getValue();
                    AbstractC3292y.f(value);
                    c5.K q02 = c3775h.q0((String) value, 10, L.this.j());
                    T t9 = null;
                    JSONArray jSONArray = null;
                    t9 = null;
                    t9 = null;
                    if (!q02.b() && q02.d() != null) {
                        String d8 = q02.d();
                        AbstractC3292y.f(d8);
                        JSONObject jSONObject = new JSONObject(d8);
                        if (!jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                            if (!jSONObject2.isNull("user")) {
                                t8 = new T();
                                JSONObject jSONObject3 = jSONObject2.getJSONObject("user");
                                AbstractC3292y.h(jSONObject3, "getJSONObject(...)");
                                t8.i(jSONObject3);
                                L.this.n().setValue(t8.s());
                                L.this.l().setValue(t8.b());
                                L.this.o().setValue(t8.w());
                                L.this.p().setValue(kotlin.coroutines.jvm.internal.b.a(t8.z()));
                            } else {
                                t8 = null;
                            }
                            if (!jSONObject2.isNull("comments")) {
                                jSONArray = jSONObject2.getJSONArray("comments");
                            }
                            if (jSONArray == null) {
                                L.this.f29603k = false;
                            } else {
                                int length = jSONArray.length();
                                for (int i8 = 0; i8 < length; i8++) {
                                    M.b bVar = c5.M.f15633o;
                                    JSONObject jSONObject4 = jSONArray.getJSONObject(i8);
                                    AbstractC3292y.h(jSONObject4, "getJSONObject(...)");
                                    arrayList.add(bVar.g(jSONObject4));
                                }
                            }
                            t9 = t8;
                        }
                    } else if (q02.e() == 404) {
                        L.this.f29602j = false;
                    }
                    L l8 = L.this;
                    l8.s(l8.j() + arrayList.size());
                    L.this.f29593a.setValue(new AbstractC3768A.c(new a(t9, arrayList, L.this.f29602j)));
                }
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
        int f29612a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c5.M f29613b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29614c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ L f29615d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(c5.M m8, Context context, L l8, U5.d dVar) {
            super(2, dVar);
            this.f29613b = m8;
            this.f29614c = context;
            this.f29615d = l8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f29613b, this.f29614c, this.f29615d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f29612a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                M.b bVar = c5.M.f15633o;
                c5.M m8 = this.f29613b;
                Context context = this.f29614c;
                this.f29612a = 1;
                obj = bVar.c(m8, context, this);
                if (obj == e8) {
                    return e8;
                }
            }
            this.f29615d.f29595c.setValue(new AbstractC3768A.c(new M.c(this.f29613b, ((Number) obj).intValue())));
            return Q5.I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public L() {
        AbstractC3768A.a aVar = AbstractC3768A.a.f37253a;
        q6.w a9 = AbstractC3815N.a(aVar);
        this.f29593a = a9;
        this.f29594b = a9;
        q6.w a10 = AbstractC3815N.a(aVar);
        this.f29595c = a10;
        this.f29596d = a10;
        this.f29597e = AbstractC3815N.a("");
        this.f29598f = AbstractC3815N.a("");
        this.f29599g = AbstractC3815N.a("");
        this.f29600h = AbstractC3815N.a("");
        this.f29601i = AbstractC3815N.a(Boolean.FALSE);
        this.f29602j = true;
        this.f29603k = true;
    }

    public final void g(Context context) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new b(context, null), 2, null);
    }

    public final InterfaceC3813L h() {
        return this.f29594b;
    }

    public final boolean i() {
        return this.f29604l;
    }

    public final int j() {
        return this.f29605m;
    }

    public final InterfaceC3813L k() {
        return this.f29596d;
    }

    public final q6.w l() {
        return this.f29599g;
    }

    public final q6.w m() {
        return this.f29597e;
    }

    public final q6.w n() {
        return this.f29598f;
    }

    public final q6.w o() {
        return this.f29600h;
    }

    public final q6.w p() {
        return this.f29601i;
    }

    public final void q(Context context, c5.M review) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(review, "review");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new c(review, context, this, null), 2, null);
    }

    public final void r(boolean z8) {
        this.f29604l = z8;
    }

    public final void s(int i8) {
        this.f29605m = i8;
    }
}
