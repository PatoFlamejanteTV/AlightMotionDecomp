package com.uptodown.activities;

import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.C3445b0;
import org.json.JSONObject;
import q5.AbstractC3768A;
import q5.C3775H;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public final class N extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f29917a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f29918b;

    /* renamed from: c, reason: collision with root package name */
    private final q6.w f29919c;

    /* renamed from: d, reason: collision with root package name */
    private final q6.w f29920d;

    /* renamed from: e, reason: collision with root package name */
    private final q6.w f29921e;

    /* renamed from: f, reason: collision with root package name */
    private final q6.w f29922f;

    /* renamed from: g, reason: collision with root package name */
    private final q6.w f29923g;

    /* renamed from: h, reason: collision with root package name */
    private final q6.w f29924h;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final c5.J f29925a;

        public a(c5.J j8) {
            this.f29925a = j8;
        }

        public final c5.J a() {
            return this.f29925a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC3292y.d(this.f29925a, ((a) obj).f29925a);
        }

        public int hashCode() {
            c5.J j8 = this.f29925a;
            if (j8 == null) {
                return 0;
            }
            return j8.hashCode();
        }

        public String toString() {
            return "VirusTotalReportData(reportVT=" + this.f29925a + ')';
        }
    }

    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f29926a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f29928c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ boolean f29929d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f29930e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f29931f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Context context, boolean z8, long j8, long j9, U5.d dVar) {
            super(2, dVar);
            this.f29928c = context;
            this.f29929d = z8;
            this.f29930e = j8;
            this.f29931f = j9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f29928c, this.f29929d, this.f29930e, this.f29931f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            long j8;
            int i8;
            JSONObject jSONObject;
            V5.b.e();
            if (this.f29926a == 0) {
                Q5.t.b(obj);
                N.this.f29917a.setValue(AbstractC3768A.a.f37253a);
                C3775H c3775h = new C3775H(this.f29928c);
                if (!this.f29929d) {
                    j8 = this.f29930e;
                } else {
                    j8 = this.f29931f;
                }
                c5.K v02 = c3775h.v0(String.valueOf(j8));
                c5.J j9 = null;
                if (!v02.b() && v02.d() != null) {
                    String d8 = v02.d();
                    AbstractC3292y.f(d8);
                    if (d8.length() > 0) {
                        String d9 = v02.d();
                        AbstractC3292y.f(d9);
                        JSONObject jSONObject2 = new JSONObject(d9);
                        if (!jSONObject2.isNull("success")) {
                            i8 = jSONObject2.getInt("success");
                        } else {
                            i8 = 0;
                        }
                        if (!jSONObject2.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            jSONObject = jSONObject2.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                        } else {
                            jSONObject = null;
                        }
                        if (i8 == 1 && jSONObject != null) {
                            j9 = new c5.J();
                            j9.a(jSONObject);
                        }
                    }
                }
                N.this.f29917a.setValue(new AbstractC3768A.c(new a(j9)));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    public N() {
        q6.w a9 = AbstractC3815N.a(AbstractC3768A.b.f37254a);
        this.f29917a = a9;
        this.f29918b = a9;
        this.f29919c = AbstractC3815N.a(null);
        this.f29920d = AbstractC3815N.a(null);
        this.f29921e = AbstractC3815N.a(null);
        this.f29922f = AbstractC3815N.a(null);
        this.f29923g = AbstractC3815N.a(0L);
        this.f29924h = AbstractC3815N.a(Boolean.FALSE);
    }

    public final void b(Context context, long j8, long j9, boolean z8) {
        AbstractC3292y.i(context, "context");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new b(context, z8, j8, j9, null), 2, null);
    }

    public final q6.w c() {
        return this.f29919c;
    }

    public final q6.w d() {
        return this.f29920d;
    }

    public final InterfaceC3813L e() {
        return this.f29918b;
    }

    public final q6.w f() {
        return this.f29923g;
    }

    public final q6.w g() {
        return this.f29922f;
    }

    public final q6.w h() {
        return this.f29921e;
    }

    public final q6.w i() {
        return this.f29924h;
    }
}
