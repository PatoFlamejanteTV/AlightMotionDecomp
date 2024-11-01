package l3;

import Q5.InterfaceC1412g;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistryOwner;
import com.stripe.android.payments.bankaccount.navigation.CollectBankAccountContract;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.InterfaceC3286s;

/* renamed from: l3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC3326e {

    /* renamed from: a, reason: collision with root package name */
    public static final a f34670a = a.f34671a;

    /* renamed from: l3.e$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f34671a = new a();

        private a() {
        }

        public final InterfaceC3326e a(String hostedSurface, ActivityResultRegistryOwner activityResultRegistryOwner, Function1 callback) {
            AbstractC3292y.i(hostedSurface, "hostedSurface");
            AbstractC3292y.i(activityResultRegistryOwner, "activityResultRegistryOwner");
            AbstractC3292y.i(callback, "callback");
            ActivityResultLauncher register = activityResultRegistryOwner.getActivityResultRegistry().register("CollectBankAccountLauncher", new CollectBankAccountContract(), new b(callback));
            AbstractC3292y.f(register);
            return new C3323b(register, hostedSurface);
        }
    }

    /* renamed from: l3.e$b */
    /* loaded from: classes4.dex */
    static final class b implements ActivityResultCallback, InterfaceC3286s {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f34672a;

        b(Function1 function) {
            AbstractC3292y.i(function, "function");
            this.f34672a = function;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ActivityResultCallback) || !(obj instanceof InterfaceC3286s)) {
                return false;
            }
            return AbstractC3292y.d(getFunctionDelegate(), ((InterfaceC3286s) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.InterfaceC3286s
        public final InterfaceC1412g getFunctionDelegate() {
            return this.f34672a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.activity.result.ActivityResultCallback
        public final /* synthetic */ void onActivityResult(Object obj) {
            this.f34672a.invoke(obj);
        }
    }

    void a(String str, String str2, String str3, InterfaceC3322a interfaceC3322a);

    void b(String str, String str2, InterfaceC3322a interfaceC3322a, String str3, String str4, String str5);

    void c(String str, String str2, InterfaceC3322a interfaceC3322a, String str3, String str4, String str5, Integer num, String str6);

    void d(String str, String str2, String str3, InterfaceC3322a interfaceC3322a);

    void unregister();
}
