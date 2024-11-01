package androidx.compose.runtime.saveable;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaveableStateHolderImpl$RegistryHolder$registry$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ SaveableStateHolderImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveableStateHolderImpl$RegistryHolder$registry$1(SaveableStateHolderImpl saveableStateHolderImpl) {
        super(1);
        this.this$0 = saveableStateHolderImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        SaveableStateRegistry parentSaveableStateRegistry = this.this$0.getParentSaveableStateRegistry();
        return Boolean.valueOf(parentSaveableStateRegistry != null ? parentSaveableStateRegistry.canBeSaved(obj) : true);
    }
}
