package androidx.compose.runtime.snapshots;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SnapshotKt$mergedWriteObserver$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ Function1 $parentObserver;
    final /* synthetic */ Function1 $writeObserver;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotKt$mergedWriteObserver$1(Function1 function1, Function1 function12) {
        super(1);
        this.$writeObserver = function1;
        this.$parentObserver = function12;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m2580invoke(obj);
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2580invoke(Object obj) {
        this.$writeObserver.invoke(obj);
        this.$parentObserver.invoke(obj);
    }
}
