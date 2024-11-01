package androidx.compose.ui.platform;

import android.content.res.Configuration;
import androidx.compose.runtime.MutableState;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ MutableState<Configuration> $configuration$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$1$1(MutableState<Configuration> mutableState) {
        super(1);
        this.$configuration$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Configuration) obj);
        return Q5.I.f8786a;
    }

    public final void invoke(Configuration configuration) {
        this.$configuration$delegate.setValue(new Configuration(configuration));
    }
}
