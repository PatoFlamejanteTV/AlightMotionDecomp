package androidx.compose.runtime.saveable;

import Q5.I;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RememberSaveableKt$rememberSaveable$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ String $finalKey;
    final /* synthetic */ SaveableHolder<T> $holder;
    final /* synthetic */ Object[] $inputs;
    final /* synthetic */ SaveableStateRegistry $registry;
    final /* synthetic */ Saver<T, ? extends Object> $saver;
    final /* synthetic */ T $value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberSaveableKt$rememberSaveable$1(SaveableHolder<T> saveableHolder, Saver<T, ? extends Object> saver, SaveableStateRegistry saveableStateRegistry, String str, T t8, Object[] objArr) {
        super(0);
        this.$holder = saveableHolder;
        this.$saver = saver;
        this.$registry = saveableStateRegistry;
        this.$finalKey = str;
        this.$value = t8;
        this.$inputs = objArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m2561invoke();
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2561invoke() {
        this.$holder.update(this.$saver, this.$registry, this.$finalKey, this.$value, this.$inputs);
    }
}
