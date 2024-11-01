package androidx.compose.ui.platform;

import androidx.savedstate.SavedStateRegistry;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ SavedStateRegistry $androidxRegistry;
    final /* synthetic */ String $key;
    final /* synthetic */ boolean $registered;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$1(boolean z8, SavedStateRegistry savedStateRegistry, String str) {
        super(0);
        this.$registered = z8;
        this.$androidxRegistry = savedStateRegistry;
        this.$key = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m4438invoke();
        return Q5.I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m4438invoke() {
        if (this.$registered) {
            this.$androidxRegistry.unregisterSavedStateProvider(this.$key);
        }
    }
}
