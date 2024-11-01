package X4;

import Q5.I;
import Q5.t;
import android.content.Context;
import c5.C2052q;
import c5.O;
import c6.InterfaceC2072n;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import n6.N;
import org.json.JSONException;
import org.json.JSONObject;
import q5.C3775H;

/* loaded from: classes5.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11579a;

    /* renamed from: b, reason: collision with root package name */
    private final C2052q f11580b;

    /* renamed from: c, reason: collision with root package name */
    private final O f11581c;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f11582a;

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
            int i8 = this.f11582a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                p pVar = p.this;
                this.f11582a = 1;
                if (pVar.e(this) == e8) {
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
        int f11584a;

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
            if (this.f11584a == 0) {
                t.b(obj);
                String d8 = new C3775H(p.this.f11579a).O0(p.this.f11580b, p.this.f11581c, null).d();
                if (d8 != null && d8.length() != 0) {
                    try {
                        JSONObject jSONObject = new JSONObject(d8);
                        boolean z8 = true;
                        if (jSONObject.isNull("success") || jSONObject.getInt("success") != 1) {
                            z8 = false;
                        }
                        SettingsPreferences.f30529b.U0(p.this.f11579a, z8);
                    } catch (JSONException e8) {
                        e8.printStackTrace();
                        SettingsPreferences.f30529b.U0(p.this.f11579a, false);
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

    public p(Context context, C2052q deviceInfo, O settingsUTD) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(deviceInfo, "deviceInfo");
        AbstractC3292y.i(settingsUTD, "settingsUTD");
        this.f11579a = context;
        this.f11580b = deviceInfo;
        this.f11581c = settingsUTD;
        AbstractC3462k.d(N.a(C3445b0.b()), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object e(U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }
}
