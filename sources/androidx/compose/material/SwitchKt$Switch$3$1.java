package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.SwitchKt$Switch$3$1", f = "Switch.kt", l = {126}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SwitchKt$Switch$3$1 extends l implements InterfaceC2072n {
    final /* synthetic */ AnchoredDraggableState<Boolean> $anchoredDraggableState;
    final /* synthetic */ State<Boolean> $currentChecked$delegate;
    final /* synthetic */ State<Function1> $currentOnCheckedChange$delegate;
    final /* synthetic */ MutableState<Boolean> $forceAnimationCheck$delegate;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.SwitchKt$Switch$3$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        final /* synthetic */ AnchoredDraggableState<Boolean> $anchoredDraggableState;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AnchoredDraggableState<Boolean> anchoredDraggableState) {
            super(0);
            this.$anchoredDraggableState = anchoredDraggableState;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return this.$anchoredDraggableState.getCurrentValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.SwitchKt$Switch$3$1$2", f = "Switch.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.SwitchKt$Switch$3$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends l implements InterfaceC2072n {
        final /* synthetic */ State<Boolean> $currentChecked$delegate;
        final /* synthetic */ State<Function1> $currentOnCheckedChange$delegate;
        final /* synthetic */ MutableState<Boolean> $forceAnimationCheck$delegate;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(State<Boolean> state, State<? extends Function1> state2, MutableState<Boolean> mutableState, d dVar) {
            super(2, dVar);
            this.$currentChecked$delegate = state;
            this.$currentOnCheckedChange$delegate = state2;
            this.$forceAnimationCheck$delegate = mutableState;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, dVar);
            anonymousClass2.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass2;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (d) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean Switch$lambda$8;
            Function1 Switch$lambda$7;
            boolean Switch$lambda$3;
            V5.b.e();
            if (this.label == 0) {
                t.b(obj);
                boolean z8 = this.Z$0;
                Switch$lambda$8 = SwitchKt.Switch$lambda$8(this.$currentChecked$delegate);
                if (Switch$lambda$8 != z8) {
                    Switch$lambda$7 = SwitchKt.Switch$lambda$7(this.$currentOnCheckedChange$delegate);
                    if (Switch$lambda$7 != null) {
                        Switch$lambda$7.invoke(kotlin.coroutines.jvm.internal.b.a(z8));
                    }
                    MutableState<Boolean> mutableState = this.$forceAnimationCheck$delegate;
                    Switch$lambda$3 = SwitchKt.Switch$lambda$3(mutableState);
                    SwitchKt.Switch$lambda$4(mutableState, !Switch$lambda$3);
                }
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(boolean z8, d dVar) {
            return ((AnonymousClass2) create(Boolean.valueOf(z8), dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SwitchKt$Switch$3$1(AnchoredDraggableState<Boolean> anchoredDraggableState, State<Boolean> state, State<? extends Function1> state2, MutableState<Boolean> mutableState, d dVar) {
        super(2, dVar);
        this.$anchoredDraggableState = anchoredDraggableState;
        this.$currentChecked$delegate = state;
        this.$currentOnCheckedChange$delegate = state2;
        this.$forceAnimationCheck$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new SwitchKt$Switch$3$1(this.$anchoredDraggableState, this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            InterfaceC3821f snapshotFlow = SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.$anchoredDraggableState));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$currentChecked$delegate, this.$currentOnCheckedChange$delegate, this.$forceAnimationCheck$delegate, null);
            this.label = 1;
            if (AbstractC3823h.j(snapshotFlow, anonymousClass2, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((SwitchKt$Switch$3$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
