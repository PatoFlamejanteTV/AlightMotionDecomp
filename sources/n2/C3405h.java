package n2;

import Q5.InterfaceC1416k;
import Q5.s;
import android.content.Context;
import android.content.SharedPreferences;
import c6.InterfaceC2072n;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import j3.C3153d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3458i;
import n6.M;
import org.json.JSONObject;

/* renamed from: n2.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3405h implements InterfaceC3408k {

    /* renamed from: c, reason: collision with root package name */
    private static final a f35338c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f35339d = 8;

    /* renamed from: a, reason: collision with root package name */
    private final U5.g f35340a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC1416k f35341b;

    /* renamed from: n2.h$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: n2.h$b */
    /* loaded from: classes4.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f35342a;

        /* renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f35343b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: n2.h$b$a */
        /* loaded from: classes4.dex */
        public static final class a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ JSONObject f35345a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(JSONObject jSONObject) {
                super(0);
                this.f35345a = jSONObject;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Long invoke() {
                return Long.valueOf(this.f35345a.optLong(CampaignEx.JSON_KEY_TIMESTAMP, -1L));
            }
        }

        b(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            b bVar = new b(dVar);
            bVar.f35343b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object b9;
            V5.b.e();
            if (this.f35342a == 0) {
                Q5.t.b(obj);
                C3405h c3405h = C3405h.this;
                try {
                    s.a aVar = Q5.s.f8810b;
                    String string = c3405h.d().getString("key_fraud_detection_data", null);
                    if (string == null) {
                        string = "";
                    }
                    JSONObject jSONObject = new JSONObject(string);
                    b9 = Q5.s.b(new h3.r(new a(jSONObject)).a(jSONObject));
                } catch (Throwable th) {
                    s.a aVar2 = Q5.s.f8810b;
                    b9 = Q5.s.b(Q5.t.a(th));
                }
                if (Q5.s.g(b9)) {
                    return null;
                }
                return b9;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* renamed from: n2.h$c */
    /* loaded from: classes4.dex */
    static final class c extends AbstractC3293z implements Function0 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f35346a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Context context) {
            super(0);
            this.f35346a = context;
        }

        @Override // kotlin.jvm.functions.Function0
        public final SharedPreferences invoke() {
            return this.f35346a.getSharedPreferences("FraudDetectionDataStore", 0);
        }
    }

    public C3405h(Context context, U5.g workContext) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(workContext, "workContext");
        this.f35340a = workContext;
        this.f35341b = Q5.l.b(new c(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences d() {
        return (SharedPreferences) this.f35341b.getValue();
    }

    @Override // n2.InterfaceC3408k
    public Object a(U5.d dVar) {
        return AbstractC3458i.g(this.f35340a, new b(null), dVar);
    }

    @Override // n2.InterfaceC3408k
    public void b(C3153d fraudDetectionData) {
        AbstractC3292y.i(fraudDetectionData, "fraudDetectionData");
        SharedPreferences d8 = d();
        AbstractC3292y.h(d8, "<get-prefs>(...)");
        SharedPreferences.Editor edit = d8.edit();
        edit.putString("key_fraud_detection_data", fraudDetectionData.l().toString());
        edit.apply();
    }
}
