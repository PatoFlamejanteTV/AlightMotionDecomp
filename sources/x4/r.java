package X4;

import Q5.I;
import Q5.t;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import b5.InterfaceC1975D;
import c5.C2041f;
import c5.C2043h;
import c5.K;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.uptodown.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.InterfaceC3488x0;
import n6.M;
import org.json.JSONObject;
import q5.C3775H;
import q5.C3791p;
import q5.C3795t;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    private Context f11587a;

    /* renamed from: b, reason: collision with root package name */
    private C2043h f11588b;

    /* renamed from: c, reason: collision with root package name */
    private C2041f f11589c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC1975D f11590d;

    /* renamed from: e, reason: collision with root package name */
    private M f11591e;

    /* renamed from: f, reason: collision with root package name */
    private String f11592f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11593a;

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
            int i8 = this.f11593a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                r rVar = r.this;
                this.f11593a = 1;
                if (rVar.m(this) == e8) {
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
        int f11595a;

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
            if (this.f11595a == 0) {
                t.b(obj);
                if (r.this.f11589c != null) {
                    C2041f c2041f = r.this.f11589c;
                    AbstractC3292y.f(c2041f);
                    if (c2041f.e0() == null) {
                        r rVar = r.this;
                        Context context = rVar.f11587a;
                        C2041f c2041f2 = r.this.f11589c;
                        AbstractC3292y.f(c2041f2);
                        String Q8 = c2041f2.Q();
                        AbstractC3292y.f(Q8);
                        C2041f c2041f3 = r.this.f11589c;
                        AbstractC3292y.f(c2041f3);
                        String x8 = c2041f3.x();
                        AbstractC3292y.f(x8);
                        rVar.f11592f = rVar.i(context, Q8, x8);
                        C2041f c2041f4 = r.this.f11589c;
                        AbstractC3292y.f(c2041f4);
                        c2041f4.M0(r.this.f11592f);
                        C3791p a9 = C3791p.f37286s.a(r.this.f11587a);
                        a9.a();
                        C2041f c2041f5 = r.this.f11589c;
                        AbstractC3292y.f(c2041f5);
                        a9.k1(c2041f5);
                        a9.i();
                    } else {
                        r rVar2 = r.this;
                        C2041f c2041f6 = rVar2.f11589c;
                        AbstractC3292y.f(c2041f6);
                        rVar2.f11592f = c2041f6.e0();
                    }
                } else if (r.this.f11588b != null) {
                    C2043h c2043h = r.this.f11588b;
                    AbstractC3292y.f(c2043h);
                    if (c2043h.X0() == null) {
                        r rVar3 = r.this;
                        Context context2 = rVar3.f11587a;
                        C2043h c2043h2 = r.this.f11588b;
                        AbstractC3292y.f(c2043h2);
                        String v02 = c2043h2.v0();
                        AbstractC3292y.f(v02);
                        C2043h c2043h3 = r.this.f11588b;
                        AbstractC3292y.f(c2043h3);
                        String o02 = c2043h3.o0();
                        AbstractC3292y.f(o02);
                        rVar3.f11592f = rVar3.i(context2, v02, o02);
                    } else {
                        r rVar4 = r.this;
                        C2043h c2043h4 = rVar4.f11588b;
                        AbstractC3292y.f(c2043h4);
                        rVar4.f11592f = c2043h4.X0();
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

    public r(Context context, C2043h c2043h, C2041f c2041f, InterfaceC1975D interfaceC1975D, M scope) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(scope, "scope");
        this.f11587a = context;
        this.f11588b = c2043h;
        this.f11589c = c2041f;
        this.f11590d = interfaceC1975D;
        this.f11591e = scope;
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String i(Context context, String str, String str2) {
        int i8;
        K o02 = new C3775H(context).o0(str, str2);
        if (o02.d() != null) {
            String d8 = o02.d();
            AbstractC3292y.f(d8);
            if (d8.length() > 0) {
                String d9 = o02.d();
                AbstractC3292y.f(d9);
                JSONObject jSONObject = new JSONObject(d9);
                if (!jSONObject.isNull("success")) {
                    i8 = jSONObject.getInt("success");
                } else {
                    i8 = 0;
                }
                if (i8 == 1 && !jSONObject.isNull(DataSchemeDataSource.SCHEME_DATA)) {
                    JSONObject jSONObject2 = jSONObject.getJSONObject(DataSchemeDataSource.SCHEME_DATA);
                    if (!jSONObject2.isNull("app_url")) {
                        return jSONObject2.getString("app_url");
                    }
                }
            }
        }
        return null;
    }

    private final void j(String str, String str2, String str3) {
        if (str3 != null) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.addFlags(524288);
            intent.setType("text/plain");
            intent.putExtra("android.intent.extra.SUBJECT", this.f11587a.getString(R.string.share_app_details_msg, str));
            intent.putExtra("android.intent.extra.TEXT", str3);
            Context context = this.f11587a;
            context.startActivity(Intent.createChooser(intent, context.getString(R.string.option_button_share)));
            Bundle bundle = new Bundle();
            bundle.putString("packagename", str2);
            new C3795t(this.f11587a).e("share_app", bundle);
            return;
        }
        InterfaceC1975D interfaceC1975D = this.f11590d;
        if (interfaceC1975D != null) {
            interfaceC1975D.a(str);
        }
    }

    private final void k() {
        InterfaceC3488x0 d8;
        d8 = AbstractC3462k.d(this.f11591e, null, null, new a(null), 3, null);
        d8.u(new Function1() { // from class: X4.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                I l8;
                l8 = r.l(r.this, (Throwable) obj);
                return l8;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final I l(r rVar, Throwable th) {
        C2041f c2041f = rVar.f11589c;
        if (c2041f != null) {
            AbstractC3292y.f(c2041f);
            String z8 = c2041f.z();
            AbstractC3292y.f(z8);
            C2041f c2041f2 = rVar.f11589c;
            AbstractC3292y.f(c2041f2);
            String Q8 = c2041f2.Q();
            AbstractC3292y.f(Q8);
            rVar.j(z8, Q8, rVar.f11592f);
        } else {
            C2043h c2043h = rVar.f11588b;
            if (c2043h != null) {
                AbstractC3292y.f(c2043h);
                String q02 = c2043h.q0();
                AbstractC3292y.f(q02);
                C2043h c2043h2 = rVar.f11588b;
                AbstractC3292y.f(c2043h2);
                String v02 = c2043h2.v0();
                AbstractC3292y.f(v02);
                rVar.j(q02, v02, rVar.f11592f);
            }
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }
}
