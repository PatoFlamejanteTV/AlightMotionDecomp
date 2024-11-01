package X4;

import Q5.I;
import Q5.t;
import android.content.Context;
import androidx.work.PeriodicWorkRequest;
import c5.C2053s;
import c5.K;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.activities.preferences.SettingsPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import n6.N;
import org.json.JSONObject;
import q5.C3775H;
import q5.C3791p;
import q5.C3795t;
import q5.C3797v;

/* loaded from: classes5.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final b f11573b = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f11574a;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11575a;

        a(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f11575a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                o oVar = o.this;
                this.f11575a = 1;
                if (oVar.g(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11577a;

        c(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f11577a == 0) {
                t.b(obj);
                if (o.this.e()) {
                    C3791p a9 = C3791p.f37286s.a(o.this.f11574a);
                    a9.a();
                    ArrayList d02 = a9.d0();
                    a9.i();
                    if (d02.size() > 0) {
                        C3775H c3775h = new C3775H(o.this.f11574a);
                        C3795t c3795t = new C3795t(o.this.f11574a);
                        K c8 = c3775h.c();
                        c3795t.f("elasticGetMinVersion", c8);
                        if (c3775h.g(c8) && c8.d() != null) {
                            String d8 = c8.d();
                            AbstractC3292y.f(d8);
                            JSONObject jSONObject = new JSONObject(d8);
                            if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1) {
                                JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                                if (!jSONObject2.isNull("result") && jSONObject2.getInt("result") == 1) {
                                    K A02 = c3775h.A0(d02);
                                    c3795t.f("elasticPostEvents", A02);
                                    if (c3775h.g(A02) && A02.d() != null) {
                                        String d9 = A02.d();
                                        AbstractC3292y.f(d9);
                                        JSONObject jSONObject3 = new JSONObject(d9);
                                        if (!jSONObject3.isNull("success") && jSONObject3.getInt("success") == 1) {
                                            a9.a();
                                            Iterator it = d02.iterator();
                                            AbstractC3292y.h(it, "iterator(...)");
                                            while (it.hasNext()) {
                                                Object next = it.next();
                                                AbstractC3292y.h(next, "next(...)");
                                                a9.E(((C2053s) next).a());
                                            }
                                            a9.i();
                                        }
                                    }
                                }
                            }
                        }
                        o oVar = o.this;
                        oVar.f(oVar.f11574a);
                    }
                }
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public o(Context context) {
        AbstractC3292y.i(context, "context");
        this.f11574a = context;
        AbstractC3462k.d(N.a(C3445b0.b()), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e() {
        if (C3797v.f37313a.d()) {
            SettingsPreferences.a aVar = SettingsPreferences.f30529b;
            long u8 = aVar.u(this.f11574a);
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - u8 > PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS) {
                aVar.M0(this.f11574a, currentTimeMillis);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(Context context) {
        C3791p a9 = C3791p.f37286s.a(context);
        a9.a();
        a9.I();
        a9.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new c(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }
}
