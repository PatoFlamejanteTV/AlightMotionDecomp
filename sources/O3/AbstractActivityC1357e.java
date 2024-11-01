package O3;

import android.os.Build;
import android.os.Bundle;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.WindowCompat;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* renamed from: O3.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractActivityC1357e extends AppCompatActivity {

    /* renamed from: a, reason: collision with root package name */
    private boolean f7545a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: O3.e$a */
    /* loaded from: classes4.dex */
    public static final class a extends AbstractC3293z implements Function1 {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((OnBackPressedCallback) obj);
            return Q5.I.f8786a;
        }

        public final void invoke(OnBackPressedCallback addCallback) {
            AbstractC3292y.i(addCallback, "$this$addCallback");
            AbstractActivityC1357e.this.k().C();
        }
    }

    private final void l() {
        if (Build.VERSION.SDK_INT < 30) {
            return;
        }
        WindowCompat.setDecorFitsSystemWindows(getWindow(), false);
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        A4.c.a(this);
    }

    public abstract R3.a k();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void m(boolean z8) {
        this.f7545a = z8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f7545a) {
            return;
        }
        l();
        OnBackPressedDispatcher onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC3292y.h(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        OnBackPressedDispatcherKt.addCallback$default(onBackPressedDispatcher, null, false, new a(), 3, null);
    }
}
