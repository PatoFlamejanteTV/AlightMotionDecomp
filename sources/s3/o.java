package s3;

import android.content.Context;
import androidx.activity.result.ActivityResultLauncher;
import com.stripe.android.a;
import com.stripe.android.view.InterfaceC2668p;
import k3.C3235a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n2.q;
import q3.C3632a;
import y5.InterfaceC4247a;

/* loaded from: classes4.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f39042a = new a(null);

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: s3.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        static final class C0882a extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC4247a f39043a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ C3235a f39044b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0882a(InterfaceC4247a interfaceC4247a, C3235a c3235a) {
                super(1);
                this.f39043a = interfaceC4247a;
                this.f39044b = c3235a;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final n2.q invoke(InterfaceC2668p host) {
                AbstractC3292y.i(host, "host");
                ActivityResultLauncher f8 = ((C3632a) this.f39043a.get()).f();
                if (f8 != null) {
                    return new q.b(f8);
                }
                return new q.a(host, this.f39044b);
            }
        }

        /* loaded from: classes4.dex */
        static final class b extends AbstractC3293z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ InterfaceC4247a f39045a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(InterfaceC4247a interfaceC4247a) {
                super(1);
                this.f39045a = interfaceC4247a;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final com.stripe.android.a invoke(InterfaceC2668p host) {
                AbstractC3292y.i(host, "host");
                ActivityResultLauncher g8 = ((C3632a) this.f39045a.get()).g();
                if (g8 != null) {
                    return new a.c(g8);
                }
                return new a.b(host);
            }
        }

        private a() {
        }

        public final C3235a a(Context context) {
            AbstractC3292y.i(context, "context");
            return C3235a.f34401b.a(context);
        }

        public final Function1 b(InterfaceC4247a lazyRegistry, C3235a defaultReturnUrl) {
            AbstractC3292y.i(lazyRegistry, "lazyRegistry");
            AbstractC3292y.i(defaultReturnUrl, "defaultReturnUrl");
            return new C0882a(lazyRegistry, defaultReturnUrl);
        }

        public final Function1 c(InterfaceC4247a lazyRegistry) {
            AbstractC3292y.i(lazyRegistry, "lazyRegistry");
            return new b(lazyRegistry);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }
}
