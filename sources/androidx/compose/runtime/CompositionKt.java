package androidx.compose.runtime;

import Q5.I;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class CompositionKt {
    private static final Object PendingApplyNoModifications = new Object();
    private static final CompositionServiceKey<CompositionImpl> CompositionImplServiceKey = new CompositionServiceKey<CompositionImpl>() { // from class: androidx.compose.runtime.CompositionKt$CompositionImplServiceKey$1
    };

    public static final Composition Composition(Applier<?> applier, CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    public static final ControlledComposition ControlledComposition(Applier<?> applier, CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    public static final ReusableComposition ReusableComposition(Applier<?> applier, CompositionContext compositionContext) {
        return new CompositionImpl(compositionContext, applier, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> void addValue(IdentityArrayMap<K, IdentityArraySet<V>> identityArrayMap, K k8, V v8) {
        if (identityArrayMap.contains(k8)) {
            IdentityArraySet<V> identityArraySet = identityArrayMap.get(k8);
            if (identityArraySet != null) {
                identityArraySet.add(v8);
                return;
            }
            return;
        }
        IdentityArraySet<V> identityArraySet2 = new IdentityArraySet<>();
        identityArraySet2.add(v8);
        I i8 = I.f8786a;
        identityArrayMap.set(k8, identityArraySet2);
    }

    public static final CompositionServiceKey<CompositionImpl> getCompositionImplServiceKey() {
        return CompositionImplServiceKey;
    }

    public static final <T> T getCompositionService(Composition composition, CompositionServiceKey<T> compositionServiceKey) {
        CompositionServices compositionServices;
        if (composition instanceof CompositionServices) {
            compositionServices = (CompositionServices) composition;
        } else {
            compositionServices = null;
        }
        if (compositionServices == null) {
            return null;
        }
        return (T) compositionServices.getCompositionService(compositionServiceKey);
    }

    @ExperimentalComposeApi
    public static final U5.g getRecomposeCoroutineContext(ControlledComposition controlledComposition) {
        CompositionImpl compositionImpl;
        U5.g recomposeContext;
        if (controlledComposition instanceof CompositionImpl) {
            compositionImpl = (CompositionImpl) controlledComposition;
        } else {
            compositionImpl = null;
        }
        if (compositionImpl == null || (recomposeContext = compositionImpl.getRecomposeContext()) == null) {
            return U5.h.f10149a;
        }
        return recomposeContext;
    }

    @ExperimentalComposeApi
    public static /* synthetic */ void getRecomposeCoroutineContext$annotations(ControlledComposition controlledComposition) {
    }

    private static final <E> void removeValueIf(HashSet<E> hashSet, Function1 function1) {
        Iterator<E> it = hashSet.iterator();
        while (it.hasNext()) {
            if (((Boolean) function1.invoke(it.next())).booleanValue()) {
                it.remove();
            }
        }
    }

    @ExperimentalComposeApi
    public static final Composition Composition(Applier<?> applier, CompositionContext compositionContext, U5.g gVar) {
        return new CompositionImpl(compositionContext, applier, gVar);
    }

    @ExperimentalComposeApi
    public static final ControlledComposition ControlledComposition(Applier<?> applier, CompositionContext compositionContext, U5.g gVar) {
        return new CompositionImpl(compositionContext, applier, gVar);
    }
}
