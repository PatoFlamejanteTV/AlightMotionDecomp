package t3;

import Q5.InterfaceC1412g;
import androidx.appcompat.app.AppCompatActivity;
import com.stripe.android.financialconnections.FinancialConnectionsSheetResultCallback;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForDataLauncher;
import com.stripe.android.financialconnections.launcher.FinancialConnectionsSheetForInstantDebitsLauncher;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.InterfaceC3286s;

/* loaded from: classes4.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final a f39468a = a.f39469a;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f39469a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: t3.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0889a extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppCompatActivity f39470a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f39471b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0889a(AppCompatActivity appCompatActivity, Function1 function1) {
                super(0);
                this.f39470a = appCompatActivity;
                this.f39471b = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C4006b invoke() {
                return new C4006b(new FinancialConnectionsSheetForDataLauncher(this.f39470a, new b(this.f39471b)));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes4.dex */
        public static final class b extends AbstractC3293z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ AppCompatActivity f39472a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f39473b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(AppCompatActivity appCompatActivity, Function1 function1) {
                super(0);
                this.f39472a = appCompatActivity;
                this.f39473b = function1;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final C4006b invoke() {
                return new C4006b(new FinancialConnectionsSheetForInstantDebitsLauncher(this.f39472a, this.f39473b));
            }
        }

        private a() {
        }

        public static /* synthetic */ c b(a aVar, AppCompatActivity appCompatActivity, Function1 function1, Function0 function0, d dVar, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                function0 = new C0889a(appCompatActivity, function1);
            }
            if ((i8 & 8) != 0) {
                dVar = C4005a.f39466a;
            }
            return aVar.a(appCompatActivity, function1, function0, dVar);
        }

        public static /* synthetic */ c d(a aVar, AppCompatActivity appCompatActivity, Function1 function1, Function0 function0, d dVar, int i8, Object obj) {
            if ((i8 & 4) != 0) {
                function0 = new b(appCompatActivity, function1);
            }
            if ((i8 & 8) != 0) {
                dVar = C4005a.f39466a;
            }
            return aVar.c(appCompatActivity, function1, function0, dVar);
        }

        public final c a(AppCompatActivity activity, Function1 onComplete, Function0 provider, d isFinancialConnectionsAvailable) {
            AbstractC3292y.i(activity, "activity");
            AbstractC3292y.i(onComplete, "onComplete");
            AbstractC3292y.i(provider, "provider");
            AbstractC3292y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            if (isFinancialConnectionsAvailable.invoke()) {
                return (c) provider.invoke();
            }
            return new e();
        }

        public final c c(AppCompatActivity activity, Function1 onComplete, Function0 provider, d isFinancialConnectionsAvailable) {
            AbstractC3292y.i(activity, "activity");
            AbstractC3292y.i(onComplete, "onComplete");
            AbstractC3292y.i(provider, "provider");
            AbstractC3292y.i(isFinancialConnectionsAvailable, "isFinancialConnectionsAvailable");
            if (isFinancialConnectionsAvailable.invoke()) {
                return (c) provider.invoke();
            }
            return new e();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class b implements FinancialConnectionsSheetResultCallback, InterfaceC3286s {

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ Function1 f39474a;

        b(Function1 function) {
            AbstractC3292y.i(function, "function");
            this.f39474a = function;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof FinancialConnectionsSheetResultCallback) || !(obj instanceof InterfaceC3286s)) {
                return false;
            }
            return AbstractC3292y.d(getFunctionDelegate(), ((InterfaceC3286s) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.InterfaceC3286s
        public final InterfaceC1412g getFunctionDelegate() {
            return this.f39474a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    void a(String str, String str2, String str3);
}
