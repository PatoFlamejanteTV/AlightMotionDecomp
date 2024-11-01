package androidx.compose.runtime.saveable;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SaveableHolder$valueProvider$1 extends AbstractC3293z implements Function0 {
    final /* synthetic */ SaveableHolder<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveableHolder$valueProvider$1(SaveableHolder<T> saveableHolder) {
        super(0);
        this.this$0 = saveableHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Saver saver;
        Object obj;
        saver = ((SaveableHolder) this.this$0).saver;
        SaveableHolder<T> saveableHolder = this.this$0;
        obj = ((SaveableHolder) saveableHolder).value;
        if (obj != null) {
            return saver.save(saveableHolder, obj);
        }
        throw new IllegalArgumentException("Value should be initialized".toString());
    }
}
