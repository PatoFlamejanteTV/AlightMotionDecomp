package X4;

import Q5.I;
import Q5.t;
import android.content.Context;
import c5.K;
import c6.InterfaceC2072n;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import n6.N;
import org.json.JSONObject;
import q5.C3775H;

/* loaded from: classes5.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private Context f11568a;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11569a;

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
            int i8 = this.f11569a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                n nVar = n.this;
                this.f11569a = 1;
                if (nVar.c(this) == e8) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11571a;

        b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f11571a == 0) {
                t.b(obj);
                K x02 = new C3775H(n.this.f11568a).x0();
                if (!x02.b() && x02.d() != null) {
                    String d8 = x02.d();
                    AbstractC3292y.f(d8);
                    JSONObject jSONObject = new JSONObject(d8);
                    if (!jSONObject.isNull("is_request_in_eea_or_unknown")) {
                        boolean z8 = jSONObject.getBoolean("is_request_in_eea_or_unknown");
                        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
                        aVar.E0(n.this.f11568a, z8);
                        aVar.F0(n.this.f11568a, true);
                    }
                }
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public n(Context context) {
        AbstractC3292y.i(context, "context");
        this.f11568a = context;
        AbstractC3462k.d(N.a(C3445b0.b()), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object c(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }
}
