package androidx.compose.ui.platform;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 extends AbstractC3293z implements Function1 {
    public static final DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1 INSTANCE = new DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1();

    DisposableSaveableStateRegistry_androidKt$DisposableSaveableStateRegistry$saveableStateRegistry$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Object obj) {
        boolean canBeSavedToBundle;
        canBeSavedToBundle = DisposableSaveableStateRegistry_androidKt.canBeSavedToBundle(obj);
        return Boolean.valueOf(canBeSavedToBundle);
    }
}
