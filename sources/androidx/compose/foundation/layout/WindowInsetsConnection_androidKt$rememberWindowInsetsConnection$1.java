package androidx.compose.foundation.layout;

import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ WindowInsetsNestedScrollConnection $connection;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection) {
        super(1);
        this.$connection = windowInsetsNestedScrollConnection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
        AbstractC3292y.i(DisposableEffect, "$this$DisposableEffect");
        final WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection = this.$connection;
        return new DisposableEffectResult() { // from class: androidx.compose.foundation.layout.WindowInsetsConnection_androidKt$rememberWindowInsetsConnection$1$invoke$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                WindowInsetsNestedScrollConnection.this.dispose();
            }
        };
    }
}
