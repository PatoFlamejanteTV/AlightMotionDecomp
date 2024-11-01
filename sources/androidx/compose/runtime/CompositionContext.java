package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.tooling.CompositionData;
import c6.InterfaceC2072n;
import java.util.Set;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class CompositionContext {
    public static final int $stable = 0;

    public abstract void composeInitial$runtime_release(ControlledComposition controlledComposition, InterfaceC2072n interfaceC2072n);

    public abstract void deletedMovableContent$runtime_release(MovableContentStateReference movableContentStateReference);

    public void doneComposing$runtime_release() {
    }

    public abstract boolean getCollectingParameterInformation$runtime_release();

    public abstract boolean getCollectingSourceInformation$runtime_release();

    public PersistentCompositionLocalMap getCompositionLocalScope$runtime_release() {
        return CompositionContextKt.access$getEmptyPersistentCompositionLocalMap$p();
    }

    public abstract int getCompoundHashKey$runtime_release();

    public abstract U5.g getEffectCoroutineContext();

    public CompositionObserverHolder getObserverHolder$runtime_release() {
        return null;
    }

    public abstract U5.g getRecomposeCoroutineContext$runtime_release();

    public abstract void insertMovableContent$runtime_release(MovableContentStateReference movableContentStateReference);

    public abstract void invalidate$runtime_release(ControlledComposition controlledComposition);

    public abstract void invalidateScope$runtime_release(RecomposeScopeImpl recomposeScopeImpl);

    public abstract void movableContentStateReleased$runtime_release(MovableContentStateReference movableContentStateReference, MovableContentState movableContentState);

    public MovableContentState movableContentStateResolve$runtime_release(MovableContentStateReference movableContentStateReference) {
        return null;
    }

    public void recordInspectionTable$runtime_release(Set<CompositionData> set) {
    }

    public void registerComposer$runtime_release(Composer composer) {
    }

    public abstract void registerComposition$runtime_release(ControlledComposition controlledComposition);

    public abstract void reportRemovedComposition$runtime_release(ControlledComposition controlledComposition);

    public void startComposing$runtime_release() {
    }

    public void unregisterComposer$runtime_release(Composer composer) {
    }

    public abstract void unregisterComposition$runtime_release(ControlledComposition controlledComposition);
}
