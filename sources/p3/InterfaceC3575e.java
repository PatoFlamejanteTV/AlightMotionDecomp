package p3;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.r;
import n6.C3445b0;

/* renamed from: p3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3575e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f36193a = a.f36194a;

    /* renamed from: p3.e$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f36194a = new a();

        /* renamed from: p3.e$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0824a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f36195a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0824a(Context context) {
                super(0);
                this.f36195a = context;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return r.f35413c.a(this.f36195a).f();
            }
        }

        private a() {
        }

        public final U5.g a() {
            return C3445b0.b();
        }

        public final v2.d b() {
            return v2.d.f40434a.a(false);
        }

        public final Function0 c(Context context) {
            AbstractC3292y.i(context, "context");
            return new C0824a(context);
        }
    }
}
