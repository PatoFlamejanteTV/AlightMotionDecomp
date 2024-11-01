package androidx.compose.ui.platform;

import android.content.res.Configuration;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidComposeView$configurationChangeObserver$1 extends AbstractC3293z implements Function1 {
    public static final AndroidComposeView$configurationChangeObserver$1 INSTANCE = new AndroidComposeView$configurationChangeObserver$1();

    AndroidComposeView$configurationChangeObserver$1() {
        super(1);
    }

    public final void invoke(Configuration configuration) {
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Configuration) obj);
        return Q5.I.f8786a;
    }
}
