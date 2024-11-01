package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.foundation.MutatePriority;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.AnchoredDraggableState$doAnchoredDrag$2", f = "AnchoredDraggable.kt", l = {441}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnchoredDraggableState$doAnchoredDrag$2 extends l implements InterfaceC2072n {
    final /* synthetic */ InterfaceC2073o $block;
    final /* synthetic */ MutatePriority $dragPriority;
    final /* synthetic */ T $targetValue;
    int label;
    final /* synthetic */ AnchoredDraggableState<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.material.AnchoredDraggableState$doAnchoredDrag$2$1", f = "AnchoredDraggable.kt", l = {443}, m = "invokeSuspend")
    /* renamed from: androidx.compose.material.AnchoredDraggableState$doAnchoredDrag$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements Function1 {
        final /* synthetic */ InterfaceC2073o $block;
        final /* synthetic */ T $targetValue;
        int label;
        final /* synthetic */ AnchoredDraggableState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(T t8, AnchoredDraggableState<T> anchoredDraggableState, InterfaceC2073o interfaceC2073o, d dVar) {
            super(1, dVar);
            this.$targetValue = t8;
            this.this$0 = anchoredDraggableState;
            this.$block = interfaceC2073o;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(d dVar) {
            return new AnonymousClass1(this.$targetValue, this.this$0, this.$block, dVar);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(d dVar) {
            return ((AnonymousClass1) create(dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AnchoredDragScope anchoredDragScope;
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
                T t8 = this.$targetValue;
                if (t8 != 0) {
                    this.this$0.setAnimationTarget(t8);
                }
                InterfaceC2073o interfaceC2073o = this.$block;
                anchoredDragScope = ((AnchoredDraggableState) this.this$0).anchoredDragScope;
                Map anchors$material_release = this.this$0.getAnchors$material_release();
                this.label = 1;
                if (interfaceC2073o.invoke(anchoredDragScope, anchors$material_release, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnchoredDraggableState$doAnchoredDrag$2(T t8, AnchoredDraggableState<T> anchoredDraggableState, MutatePriority mutatePriority, InterfaceC2073o interfaceC2073o, d dVar) {
        super(2, dVar);
        this.$targetValue = t8;
        this.this$0 = anchoredDraggableState;
        this.$dragPriority = mutatePriority;
        this.$block = interfaceC2073o;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new AnchoredDraggableState$doAnchoredDrag$2(this.$targetValue, this.this$0, this.$dragPriority, this.$block, dVar);
    }

    /* JADX WARN: Finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        InternalMutatorMutex internalMutatorMutex;
        Object obj3;
        Object e8 = V5.b.e();
        int i8 = this.label;
        Object obj4 = null;
        try {
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                if (this.$targetValue == 0 || this.this$0.getAnchors$material_release().containsKey(this.$targetValue)) {
                    internalMutatorMutex = ((AnchoredDraggableState) this.this$0).dragMutex;
                    MutatePriority mutatePriority = this.$dragPriority;
                    AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$targetValue, this.this$0, this.$block, null);
                    this.label = 1;
                    if (internalMutatorMutex.mutate(mutatePriority, anonymousClass1, this) == e8) {
                        return e8;
                    }
                } else {
                    if (((Boolean) this.this$0.getConfirmValueChange$material_release().invoke(this.$targetValue)).booleanValue()) {
                        this.this$0.setCurrentValue(this.$targetValue);
                    }
                    return I.f8786a;
                }
            }
            if (this.$targetValue != 0) {
                this.this$0.setAnimationTarget(null);
            }
            Set entrySet = this.this$0.getAnchors$material_release().entrySet();
            AnchoredDraggableState<T> anchoredDraggableState = this.this$0;
            Iterator it = entrySet.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj3 = it.next();
                    if (Math.abs(((Number) ((Map.Entry) obj3).getValue()).floatValue() - anchoredDraggableState.getOffset()) < 0.5f) {
                        break;
                    }
                } else {
                    obj3 = null;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj3;
            if (entry != null) {
                obj4 = entry.getKey();
            }
            if (obj4 != null && ((Boolean) this.this$0.getConfirmValueChange$material_release().invoke(obj4)).booleanValue()) {
                this.this$0.setCurrentValue(obj4);
            }
            return I.f8786a;
        } catch (Throwable th) {
            if (this.$targetValue != 0) {
                this.this$0.setAnimationTarget(null);
            }
            Set entrySet2 = this.this$0.getAnchors$material_release().entrySet();
            AnchoredDraggableState<T> anchoredDraggableState2 = this.this$0;
            Iterator it2 = entrySet2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (Math.abs(((Number) ((Map.Entry) obj2).getValue()).floatValue() - anchoredDraggableState2.getOffset()) < 0.5f) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            Map.Entry entry2 = (Map.Entry) obj2;
            if (entry2 != null) {
                obj4 = entry2.getKey();
            }
            if (obj4 != null && ((Boolean) this.this$0.getConfirmValueChange$material_release().invoke(obj4)).booleanValue()) {
                this.this$0.setCurrentValue(obj4);
            }
            throw th;
        }
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((AnchoredDraggableState$doAnchoredDrag$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
