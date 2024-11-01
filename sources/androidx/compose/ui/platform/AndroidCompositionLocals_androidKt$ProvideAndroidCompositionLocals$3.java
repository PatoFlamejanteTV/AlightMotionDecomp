package androidx.compose.ui.platform;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ AndroidComposeView $owner;
    final /* synthetic */ AndroidUriHandler $uriHandler;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidCompositionLocals_androidKt$ProvideAndroidCompositionLocals$3(AndroidComposeView androidComposeView, AndroidUriHandler androidUriHandler, InterfaceC2072n interfaceC2072n) {
        super(2);
        this.$owner = androidComposeView;
        this.$uriHandler = androidUriHandler;
        this.$content = interfaceC2072n;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return Q5.I.f8786a;
    }

    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1471621628, i8, -1, "androidx.compose.ui.platform.ProvideAndroidCompositionLocals.<anonymous> (AndroidCompositionLocals.android.kt:118)");
        }
        CompositionLocalsKt.ProvideCommonCompositionLocals(this.$owner, this.$uriHandler, this.$content, composer, 72);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
