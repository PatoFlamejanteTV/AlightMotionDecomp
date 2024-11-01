package androidx.compose.runtime;

import Q5.I;
import androidx.collection.MutableObjectIntMap;
import androidx.collection.MutableScatterMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionObserverHandle;
import androidx.compose.runtime.tooling.RecomposeScopeObserver;
import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class RecomposeScopeImpl implements ScopeUpdateScope, RecomposeScope {
    private Anchor anchor;
    private InterfaceC2072n block;
    private int currentToken;
    private int flags;
    private RecomposeScopeObserver observer;
    private RecomposeScopeOwner owner;
    private MutableScatterMap<DerivedState<?>, Object> trackedDependencies;
    private MutableObjectIntMap<Object> trackedInstances;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public final void adoptAnchoredScopes$runtime_release(SlotWriter slotWriter, List<Anchor> list, RecomposeScopeOwner recomposeScopeOwner) {
            RecomposeScopeImpl recomposeScopeImpl;
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    Object slot = slotWriter.slot(list.get(i8), 0);
                    if (slot instanceof RecomposeScopeImpl) {
                        recomposeScopeImpl = (RecomposeScopeImpl) slot;
                    } else {
                        recomposeScopeImpl = null;
                    }
                    if (recomposeScopeImpl != null) {
                        recomposeScopeImpl.adoptedBy(recomposeScopeOwner);
                    }
                }
            }
        }

        public final boolean hasAnchoredRecomposeScopes$runtime_release(SlotTable slotTable, List<Anchor> list) {
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i8 = 0; i8 < size; i8++) {
                    Anchor anchor = list.get(i8);
                    if (slotTable.ownsAnchor(anchor) && (slotTable.slot$runtime_release(slotTable.anchorIndex(anchor), 0) instanceof RecomposeScopeImpl)) {
                        return true;
                    }
                }
            }
            return false;
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public RecomposeScopeImpl(RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    @ExperimentalComposeRuntimeApi
    private static /* synthetic */ void getObserver$annotations() {
    }

    private final boolean getRereading() {
        if ((this.flags & 32) != 0) {
            return true;
        }
        return false;
    }

    private final void setRereading(boolean z8) {
        if (z8) {
            this.flags |= 32;
        } else {
            this.flags &= -33;
        }
    }

    private final void setSkipped(boolean z8) {
        if (z8) {
            this.flags |= 16;
        } else {
            this.flags &= -17;
        }
    }

    public final void adoptedBy(RecomposeScopeOwner recomposeScopeOwner) {
        this.owner = recomposeScopeOwner;
    }

    public final void compose(Composer composer) {
        I i8;
        InterfaceC2072n interfaceC2072n = this.block;
        RecomposeScopeObserver recomposeScopeObserver = this.observer;
        if (recomposeScopeObserver != null && interfaceC2072n != null) {
            recomposeScopeObserver.onBeginScopeComposition(this);
            try {
                interfaceC2072n.invoke(composer, 1);
                return;
            } finally {
                recomposeScopeObserver.onEndScopeComposition(this);
            }
        }
        if (interfaceC2072n != null) {
            interfaceC2072n.invoke(composer, 1);
            i8 = I.f8786a;
        } else {
            i8 = null;
        }
        if (i8 != null) {
        } else {
            throw new IllegalStateException("Invalid restart scope".toString());
        }
    }

    public final Function1 end(int i8) {
        MutableObjectIntMap<Object> mutableObjectIntMap = this.trackedInstances;
        if (mutableObjectIntMap == null || getSkipped$runtime_release()) {
            return null;
        }
        Object[] objArr = mutableObjectIntMap.keys;
        int[] iArr = mutableObjectIntMap.values;
        long[] jArr = mutableObjectIntMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return null;
        }
        int i9 = 0;
        while (true) {
            long j8 = jArr[i9];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i10 = 8 - ((~(i9 - length)) >>> 31);
                for (int i11 = 0; i11 < i10; i11++) {
                    if ((255 & j8) < 128) {
                        int i12 = (i9 << 3) + i11;
                        Object obj = objArr[i12];
                        if (iArr[i12] != i8) {
                            return new RecomposeScopeImpl$end$1$2(this, i8, mutableObjectIntMap);
                        }
                    }
                    j8 >>= 8;
                }
                if (i10 != 8) {
                    return null;
                }
            }
            if (i9 == length) {
                return null;
            }
            i9++;
        }
    }

    public final Anchor getAnchor() {
        return this.anchor;
    }

    public final boolean getCanRecompose() {
        if (this.block != null) {
            return true;
        }
        return false;
    }

    public final boolean getDefaultsInScope() {
        if ((this.flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getDefaultsInvalid() {
        if ((this.flags & 4) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getForcedRecompose() {
        if ((this.flags & 64) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getRequiresRecompose() {
        if ((this.flags & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getSkipped$runtime_release() {
        if ((this.flags & 16) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getUsed() {
        if ((this.flags & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean getValid() {
        boolean z8;
        if (this.owner == null) {
            return false;
        }
        Anchor anchor = this.anchor;
        if (anchor != null) {
            z8 = anchor.getValid();
        } else {
            z8 = false;
        }
        if (!z8) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.runtime.RecomposeScope
    public void invalidate() {
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.invalidate(this, null);
        }
    }

    public final InvalidationResult invalidateForResult(Object obj) {
        InvalidationResult invalidate;
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner == null || (invalidate = recomposeScopeOwner.invalidate(this, obj)) == null) {
            return InvalidationResult.IGNORED;
        }
        return invalidate;
    }

    public final boolean isConditional() {
        if (this.trackedDependencies != null) {
            return true;
        }
        return false;
    }

    public final boolean isInvalidFor(IdentityArraySet<Object> identityArraySet) {
        MutableScatterMap<DerivedState<?>, Object> mutableScatterMap;
        if (identityArraySet != null && (mutableScatterMap = this.trackedDependencies) != null && identityArraySet.isNotEmpty()) {
            if (!identityArraySet.isEmpty()) {
                for (Object obj : identityArraySet) {
                    if (obj instanceof DerivedState) {
                        DerivedState<?> derivedState = (DerivedState) obj;
                        SnapshotMutationPolicy<?> policy = derivedState.getPolicy();
                        if (policy == null) {
                            policy = SnapshotStateKt.structuralEqualityPolicy();
                        }
                        if (policy.equivalent(derivedState.getCurrentRecord().getCurrentValue(), mutableScatterMap.get(derivedState))) {
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @ExperimentalComposeRuntimeApi
    public final CompositionObserverHandle observe$runtime_release(final RecomposeScopeObserver recomposeScopeObserver) {
        Object obj;
        obj = RecomposeScopeImplKt.callbackLock;
        synchronized (obj) {
            this.observer = recomposeScopeObserver;
            I i8 = I.f8786a;
        }
        return new CompositionObserverHandle() { // from class: androidx.compose.runtime.RecomposeScopeImpl$observe$2
            @Override // androidx.compose.runtime.tooling.CompositionObserverHandle
            public void dispose() {
                Object obj2;
                RecomposeScopeObserver recomposeScopeObserver2;
                obj2 = RecomposeScopeImplKt.callbackLock;
                RecomposeScopeImpl recomposeScopeImpl = RecomposeScopeImpl.this;
                RecomposeScopeObserver recomposeScopeObserver3 = recomposeScopeObserver;
                synchronized (obj2) {
                    try {
                        recomposeScopeObserver2 = recomposeScopeImpl.observer;
                        if (AbstractC3292y.d(recomposeScopeObserver2, recomposeScopeObserver3)) {
                            recomposeScopeImpl.observer = null;
                        }
                        I i9 = I.f8786a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        };
    }

    public final boolean recordRead(Object obj) {
        int i8 = 0;
        if (getRereading()) {
            return false;
        }
        MutableObjectIntMap<Object> mutableObjectIntMap = this.trackedInstances;
        AbstractC3284p abstractC3284p = null;
        int i9 = 1;
        if (mutableObjectIntMap == null) {
            mutableObjectIntMap = new MutableObjectIntMap<>(0, 1, null);
            this.trackedInstances = mutableObjectIntMap;
        }
        if (mutableObjectIntMap.put(obj, this.currentToken, -1) == this.currentToken) {
            return true;
        }
        if (obj instanceof DerivedState) {
            MutableScatterMap<DerivedState<?>, Object> mutableScatterMap = this.trackedDependencies;
            if (mutableScatterMap == null) {
                mutableScatterMap = new MutableScatterMap<>(i8, i9, abstractC3284p);
                this.trackedDependencies = mutableScatterMap;
            }
            mutableScatterMap.set(obj, ((DerivedState) obj).getCurrentRecord().getCurrentValue());
        }
        return false;
    }

    public final void release() {
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null) {
            recomposeScopeOwner.recomposeScopeReleased(this);
        }
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
        RecomposeScopeObserver recomposeScopeObserver = this.observer;
        if (recomposeScopeObserver != null) {
            recomposeScopeObserver.onScopeDisposed(this);
        }
    }

    public final void rereadTrackedInstances() {
        MutableObjectIntMap<Object> mutableObjectIntMap;
        RecomposeScopeOwner recomposeScopeOwner = this.owner;
        if (recomposeScopeOwner != null && (mutableObjectIntMap = this.trackedInstances) != null) {
            setRereading(true);
            try {
                Object[] objArr = mutableObjectIntMap.keys;
                int[] iArr = mutableObjectIntMap.values;
                long[] jArr = mutableObjectIntMap.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j8 = jArr[i8];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((255 & j8) < 128) {
                                    int i11 = (i8 << 3) + i10;
                                    Object obj = objArr[i11];
                                    int i12 = iArr[i11];
                                    recomposeScopeOwner.recordReadOf(obj);
                                }
                                j8 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length) {
                            break;
                        } else {
                            i8++;
                        }
                    }
                }
            } finally {
                setRereading(false);
            }
        }
    }

    public final void scopeSkipped() {
        setSkipped(true);
    }

    public final void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public final void setDefaultsInScope(boolean z8) {
        if (z8) {
            this.flags |= 2;
        } else {
            this.flags &= -3;
        }
    }

    public final void setDefaultsInvalid(boolean z8) {
        if (z8) {
            this.flags |= 4;
        } else {
            this.flags &= -5;
        }
    }

    public final void setForcedRecompose(boolean z8) {
        if (z8) {
            this.flags |= 64;
        } else {
            this.flags &= -65;
        }
    }

    public final void setRequiresRecompose(boolean z8) {
        if (z8) {
            this.flags |= 8;
        } else {
            this.flags &= -9;
        }
    }

    public final void setUsed(boolean z8) {
        if (z8) {
            this.flags |= 1;
        } else {
            this.flags &= -2;
        }
    }

    public final void start(int i8) {
        this.currentToken = i8;
        setSkipped(false);
    }

    @Override // androidx.compose.runtime.ScopeUpdateScope
    public void updateScope(InterfaceC2072n interfaceC2072n) {
        this.block = interfaceC2072n;
    }
}
