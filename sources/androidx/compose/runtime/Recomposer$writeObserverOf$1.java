package androidx.compose.runtime;

import Q5.I;
import androidx.compose.runtime.collection.IdentityArraySet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class Recomposer$writeObserverOf$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ ControlledComposition $composition;
    final /* synthetic */ IdentityArraySet<Object> $modifiedValues;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$writeObserverOf$1(ControlledComposition controlledComposition, IdentityArraySet<Object> identityArraySet) {
        super(1);
        this.$composition = controlledComposition;
        this.$modifiedValues = identityArraySet;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m2461invoke(obj);
        return I.f8786a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m2461invoke(Object obj) {
        this.$composition.recordWriteOf(obj);
        IdentityArraySet<Object> identityArraySet = this.$modifiedValues;
        if (identityArraySet != null) {
            identityArraySet.add(obj);
        }
    }
}
