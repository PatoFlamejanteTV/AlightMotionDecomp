package L3;

import R5.a0;
import android.app.Application;
import android.content.Context;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.r;

/* loaded from: classes4.dex */
public interface g {

    /* renamed from: a, reason: collision with root package name */
    public static final a f5391a = a.f5392a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f5392a = new a();

        /* renamed from: L3.g$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0089a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f5393a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0089a(Context context) {
                super(0);
                this.f5393a = context;
            }

            @Override // kotlin.jvm.functions.Function0
            public final String invoke() {
                return r.f35413c.a(this.f5393a).f();
            }
        }

        private a() {
        }

        public final r a(Context appContext) {
            AbstractC3292y.i(appContext, "appContext");
            return r.f35413c.a(appContext);
        }

        public final Function0 b(Context appContext) {
            AbstractC3292y.i(appContext, "appContext");
            return new C0089a(appContext);
        }

        public final Context c(Application application) {
            AbstractC3292y.i(application, "application");
            return application;
        }

        public final boolean d() {
            return false;
        }

        public final Set e() {
            return a0.f();
        }
    }
}
