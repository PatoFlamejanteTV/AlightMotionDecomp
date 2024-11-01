package androidx.compose.runtime.saveable;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class SaveableStateHolderKt$rememberSaveableStateHolder$1 extends AbstractC3293z implements Function0 {
    public static final SaveableStateHolderKt$rememberSaveableStateHolder$1 INSTANCE = new SaveableStateHolderKt$rememberSaveableStateHolder$1();

    SaveableStateHolderKt$rememberSaveableStateHolder$1() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final SaveableStateHolderImpl invoke() {
        return new SaveableStateHolderImpl(null, 1, null);
    }
}
