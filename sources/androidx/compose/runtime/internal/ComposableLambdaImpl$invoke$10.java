package androidx.compose.runtime.internal;

import Q5.I;
import androidx.compose.runtime.Composer;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ComposableLambdaImpl$invoke$10 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $changed;
    final /* synthetic */ Object $p1;
    final /* synthetic */ Object $p10;
    final /* synthetic */ Object $p2;
    final /* synthetic */ Object $p3;
    final /* synthetic */ Object $p4;
    final /* synthetic */ Object $p5;
    final /* synthetic */ Object $p6;
    final /* synthetic */ Object $p7;
    final /* synthetic */ Object $p8;
    final /* synthetic */ Object $p9;
    final /* synthetic */ ComposableLambdaImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ComposableLambdaImpl$invoke$10(ComposableLambdaImpl composableLambdaImpl, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i8) {
        super(2);
        this.this$0 = composableLambdaImpl;
        this.$p1 = obj;
        this.$p2 = obj2;
        this.$p3 = obj3;
        this.$p4 = obj4;
        this.$p5 = obj5;
        this.$p6 = obj6;
        this.$p7 = obj7;
        this.$p8 = obj8;
        this.$p9 = obj9;
        this.$p10 = obj10;
        this.$changed = i8;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    public final void invoke(Composer composer, int i8) {
        ComposableLambdaImpl composableLambdaImpl = this.this$0;
        Object obj = this.$p1;
        Object obj2 = this.$p2;
        Object obj3 = this.$p3;
        Object obj4 = this.$p4;
        Object obj5 = this.$p5;
        Object obj6 = this.$p6;
        Object obj7 = this.$p7;
        Object obj8 = this.$p8;
        Object obj9 = this.$p9;
        Object obj10 = this.$p10;
        int i9 = this.$changed;
        composableLambdaImpl.invoke(obj, obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, obj10, composer, i9 | 1, i9);
    }
}
