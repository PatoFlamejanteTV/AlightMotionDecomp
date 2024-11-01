package X4;

import Q5.I;
import Q5.t;
import android.content.Context;
import c5.K;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import org.json.JSONArray;
import org.json.JSONObject;
import q5.C3775H;
import q5.C3791p;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11526a;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11527a;

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
            int i8 = this.f11527a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                k kVar = k.this;
                this.f11527a = 1;
                if (kVar.c(this) == e8) {
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
        int f11529a;

        b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            long j8;
            int i8;
            V5.b.e();
            if (this.f11529a == 0) {
                t.b(obj);
                C3791p a9 = C3791p.f37286s.a(k.this.f11526a);
                a9.a();
                if (a9.j0() > 0) {
                    K h02 = new C3775H(k.this.f11526a).h0();
                    if (!h02.b() && h02.d() != null) {
                        String d8 = h02.d();
                        AbstractC3292y.f(d8);
                        JSONObject jSONObject = new JSONObject(d8);
                        if (!jSONObject.isNull("success") && jSONObject.getInt("success") == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                            JSONArray jSONArray = jSONObject.getJSONArray(DataSchemeDataSource.SCHEME_DATA);
                            int length = jSONArray.length();
                            for (int i9 = 0; i9 < length; i9++) {
                                JSONObject jSONObject2 = jSONArray.getJSONObject(i9);
                                if (!jSONObject2.isNull("packageName")) {
                                    if (!jSONObject2.isNull("appID")) {
                                        j8 = jSONObject2.getLong("appID");
                                    } else {
                                        j8 = 0;
                                    }
                                    if (!jSONObject2.isNull("hasOldVersions")) {
                                        i8 = jSONObject2.getInt("hasOldVersions");
                                    } else {
                                        i8 = 0;
                                    }
                                    String string = jSONObject2.getString("packageName");
                                    AbstractC3292y.h(string, "getString(...)");
                                    a9.t1(string, j8, i8);
                                }
                            }
                            a9.i1();
                        }
                    }
                }
                a9.i();
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public k(Context context, M scope) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(scope, "scope");
        this.f11526a = context;
        AbstractC3462k.d(scope, null, null, new a(null), 3, null);
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
