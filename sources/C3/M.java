package C3;

import B2.C0953e;
import C3.M;
import J3.e;
import J3.h;
import O3.C1362j;
import O3.InterfaceC1371t;
import android.content.Context;
import android.content.pm.PackageManager;
import com.stripe.android.paymentsheet.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import v3.C4125e;
import z3.C4268b;
import z3.InterfaceC4267a;

/* loaded from: classes4.dex */
public abstract class M {

    /* renamed from: a, reason: collision with root package name */
    public static final a f780a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: C3.M$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0016a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f781a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ U5.g f782b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0016a(Context context, U5.g gVar) {
                super(1);
                this.f781a = context;
                this.f782b = gVar;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C4125e invoke(w.i iVar) {
                String str;
                Context context = this.f781a;
                if (iVar != null) {
                    str = iVar.getId();
                } else {
                    str = null;
                }
                return new C4125e(context, str, this.f782b);
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N5.a f783a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(N5.a aVar) {
                super(0);
                this.f783a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return ((n2.r) this.f783a.get()).f();
            }
        }

        /* loaded from: classes4.dex */
        static final class c extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ N5.a f784a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(N5.a aVar) {
                super(0);
                this.f784a = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return ((n2.r) this.f784a.get()).h();
            }
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String c(N5.a paymentConfiguration) {
            AbstractC3292y.i(paymentConfiguration, "$paymentConfiguration");
            return ((n2.r) paymentConfiguration.get()).f();
        }

        public final C0953e b(Context context, final N5.a paymentConfiguration) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(paymentConfiguration, "paymentConfiguration");
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            if (packageName == null) {
                packageName = "";
            }
            return new C0953e(packageManager, E2.a.f1549a.a(context), packageName, new N5.a() { // from class: C3.L
                @Override // N5.a
                public final Object get() {
                    String c8;
                    c8 = M.a.c(N5.a.this);
                    return c8;
                }
            }, new I2.c(new B2.u(context)), null, 32, null);
        }

        public final com.stripe.android.paymentsheet.paymentdatacollection.bacs.b d() {
            return com.stripe.android.paymentsheet.paymentdatacollection.bacs.g.f27481a;
        }

        public final InterfaceC4267a e() {
            return new C4268b();
        }

        public final E2.d f() {
            return E2.c.f1550b.a();
        }

        public final boolean g() {
            return false;
        }

        public final n2.r h(Context appContext) {
            AbstractC3292y.i(appContext, "appContext");
            return n2.r.f35413c.a(appContext);
        }

        public final Function1 i(Context appContext, U5.g workContext) {
            AbstractC3292y.i(appContext, "appContext");
            AbstractC3292y.i(workContext, "workContext");
            return new C0016a(appContext, workContext);
        }

        public final Function0 j(N5.a paymentConfiguration) {
            AbstractC3292y.i(paymentConfiguration, "paymentConfiguration");
            return new b(paymentConfiguration);
        }

        public final Function0 k(N5.a paymentConfiguration) {
            AbstractC3292y.i(paymentConfiguration, "paymentConfiguration");
            return new c(paymentConfiguration);
        }

        public final e.a l() {
            return h.b.f4118a;
        }

        public final InterfaceC1371t.a m() {
            return C1362j.a.f7608a;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }
}
