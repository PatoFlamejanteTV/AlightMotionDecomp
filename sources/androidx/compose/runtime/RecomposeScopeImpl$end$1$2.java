package androidx.compose.runtime;

import Q5.I;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RecomposeScopeImpl$end$1$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ MutableObjectIntMap<Object> $instances;
    final /* synthetic */ int $token;
    final /* synthetic */ RecomposeScopeImpl this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecomposeScopeImpl$end$1$2(RecomposeScopeImpl recomposeScopeImpl, int i8, MutableObjectIntMap<Object> mutableObjectIntMap) {
        super(1);
        this.this$0 = recomposeScopeImpl;
        this.$token = i8;
        this.$instances = mutableObjectIntMap;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Composition) obj);
        return I.f8786a;
    }

    public final void invoke(Composition composition) {
        int i8;
        MutableObjectIntMap mutableObjectIntMap;
        MutableScatterMap mutableScatterMap;
        Composition composition2 = composition;
        i8 = this.this$0.currentToken;
        if (i8 == this.$token) {
            MutableObjectIntMap<Object> mutableObjectIntMap2 = this.$instances;
            mutableObjectIntMap = this.this$0.trackedInstances;
            if (AbstractC3292y.d(mutableObjectIntMap2, mutableObjectIntMap) && (composition2 instanceof CompositionImpl)) {
                MutableObjectIntMap<Object> mutableObjectIntMap3 = this.$instances;
                int i9 = this.$token;
                RecomposeScopeImpl recomposeScopeImpl = this.this$0;
                long[] jArr = mutableObjectIntMap3.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    while (true) {
                        long j8 = jArr[i10];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            int i12 = 0;
                            while (i12 < i11) {
                                if ((255 & j8) < 128) {
                                    int i13 = (i10 << 3) + i12;
                                    Object obj = mutableObjectIntMap3.keys[i13];
                                    boolean z8 = mutableObjectIntMap3.values[i13] != i9;
                                    if (z8) {
                                        CompositionImpl compositionImpl = (CompositionImpl) composition2;
                                        compositionImpl.removeObservation$runtime_release(obj, recomposeScopeImpl);
                                        DerivedState<?> derivedState = obj instanceof DerivedState ? (DerivedState) obj : null;
                                        if (derivedState != null) {
                                            compositionImpl.removeDerivedStateObservation$runtime_release(derivedState);
                                            mutableScatterMap = recomposeScopeImpl.trackedDependencies;
                                            if (mutableScatterMap != null) {
                                                mutableScatterMap.remove(derivedState);
                                                if (mutableScatterMap.getSize() == 0) {
                                                    recomposeScopeImpl.trackedDependencies = null;
                                                }
                                            }
                                        }
                                    }
                                    if (z8) {
                                        mutableObjectIntMap3.removeValueAt(i13);
                                    }
                                }
                                j8 >>= 8;
                                i12++;
                                composition2 = composition;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                        composition2 = composition;
                    }
                }
                if (this.$instances.getSize() == 0) {
                    this.this$0.trackedInstances = null;
                }
            }
        }
    }
}
