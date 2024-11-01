package g4;

import Q5.InterfaceC1412g;
import androidx.activity.result.ActivityResultRegistry;
import androidx.appcompat.app.AppCompatActivity;
import com.stripe.android.stripecardscan.cardscan.CardScanSheet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.InterfaceC3286s;

/* loaded from: classes4.dex */
public interface o {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32442a = a.f32443a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f32443a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: g4.o$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0747a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppCompatActivity f32444a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f32445b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function1 f32446c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0747a(AppCompatActivity appCompatActivity, String str, Function1 function1) {
                super(0);
                this.f32444a = appCompatActivity;
                this.f32445b = str;
                this.f32446c = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final f invoke() {
                return new f(CardScanSheet.Companion.create$default(CardScanSheet.Companion, this.f32444a, this.f32445b, new b(this.f32446c), (ActivityResultRegistry) null, 8, (Object) null));
            }
        }

        private a() {
        }

        public static /* synthetic */ o b(a aVar, AppCompatActivity appCompatActivity, String str, Function1 function1, p3.i iVar, Function0 function0, j jVar, int i8, Object obj) {
            if ((i8 & 16) != 0) {
                function0 = new C0747a(appCompatActivity, str, function1);
            }
            Function0 function02 = function0;
            if ((i8 & 32) != 0) {
                jVar = new e();
            }
            return aVar.a(appCompatActivity, str, function1, iVar, function02, jVar);
        }

        public final o a(AppCompatActivity activity, String stripePublishableKey, Function1 onFinished, p3.i errorReporter, Function0 provider, j isStripeCardScanAvailable) {
            AbstractC3292y.i(activity, "activity");
            AbstractC3292y.i(stripePublishableKey, "stripePublishableKey");
            AbstractC3292y.i(onFinished, "onFinished");
            AbstractC3292y.i(errorReporter, "errorReporter");
            AbstractC3292y.i(provider, "provider");
            AbstractC3292y.i(isStripeCardScanAvailable, "isStripeCardScanAvailable");
            if (isStripeCardScanAvailable.invoke()) {
                return (o) provider.invoke();
            }
            return new p(errorReporter);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b implements CardScanSheet.CardScanResultCallback, InterfaceC3286s {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f32447a;

        b(Function1 function) {
            AbstractC3292y.i(function, "function");
            this.f32447a = function;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof CardScanSheet.CardScanResultCallback) || !(obj instanceof InterfaceC3286s)) {
                return false;
            }
            return AbstractC3292y.d(getFunctionDelegate(), ((InterfaceC3286s) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.InterfaceC3286s
        public final InterfaceC1412g getFunctionDelegate() {
            return this.f32447a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    void a();
}
