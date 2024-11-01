package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.platform.a1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ViewFactoryHolder<T extends View> extends AndroidViewHolder implements ViewRootForInspector {
    public static final int $stable = 8;
    private final int compositeKeyHash;
    private final NestedScrollDispatcher dispatcher;
    private Function1 releaseBlock;
    private Function1 resetBlock;
    private SaveableStateRegistry.Entry savableRegistryEntry;
    private final String saveStateKey;
    private final SaveableStateRegistry saveStateRegistry;
    private final T typedView;
    private Function1 updateBlock;

    /* synthetic */ ViewFactoryHolder(Context context, CompositionContext compositionContext, View view, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, int i8, Owner owner, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : compositionContext, view, (i9 & 8) != 0 ? new NestedScrollDispatcher() : nestedScrollDispatcher, saveableStateRegistry, i8, owner);
    }

    private final void registerSaveStateProvider() {
        SaveableStateRegistry saveableStateRegistry = this.saveStateRegistry;
        if (saveableStateRegistry != null) {
            setSavableRegistryEntry(saveableStateRegistry.registerProvider(this.saveStateKey, new ViewFactoryHolder$registerSaveStateProvider$1(this)));
        }
    }

    private final void setSavableRegistryEntry(SaveableStateRegistry.Entry entry) {
        SaveableStateRegistry.Entry entry2 = this.savableRegistryEntry;
        if (entry2 != null) {
            entry2.unregister();
        }
        this.savableRegistryEntry = entry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void unregisterSaveStateProvider() {
        setSavableRegistryEntry(null);
    }

    public final NestedScrollDispatcher getDispatcher() {
        return this.dispatcher;
    }

    public final Function1 getReleaseBlock() {
        return this.releaseBlock;
    }

    public final Function1 getResetBlock() {
        return this.resetBlock;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public /* synthetic */ AbstractComposeView getSubCompositionView() {
        return a1.a(this);
    }

    public final Function1 getUpdateBlock() {
        return this.updateBlock;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public View getViewRoot() {
        return this;
    }

    public final void setReleaseBlock(Function1 function1) {
        this.releaseBlock = function1;
        setRelease(new ViewFactoryHolder$releaseBlock$1(this));
    }

    public final void setResetBlock(Function1 function1) {
        this.resetBlock = function1;
        setReset(new ViewFactoryHolder$resetBlock$1(this));
    }

    public final void setUpdateBlock(Function1 function1) {
        this.updateBlock = function1;
        setUpdate(new ViewFactoryHolder$updateBlock$1(this));
    }

    private ViewFactoryHolder(Context context, CompositionContext compositionContext, T t8, NestedScrollDispatcher nestedScrollDispatcher, SaveableStateRegistry saveableStateRegistry, int i8, Owner owner) {
        super(context, compositionContext, i8, nestedScrollDispatcher, t8, owner);
        this.typedView = t8;
        this.dispatcher = nestedScrollDispatcher;
        this.saveStateRegistry = saveableStateRegistry;
        this.compositeKeyHash = i8;
        setClipChildren(false);
        String valueOf = String.valueOf(i8);
        this.saveStateKey = valueOf;
        Object consumeRestored = saveableStateRegistry != null ? saveableStateRegistry.consumeRestored(valueOf) : null;
        SparseArray<Parcelable> sparseArray = consumeRestored instanceof SparseArray ? (SparseArray) consumeRestored : null;
        if (sparseArray != null) {
            t8.restoreHierarchyState(sparseArray);
        }
        registerSaveStateProvider();
        this.updateBlock = AndroidView_androidKt.getNoOpUpdate();
        this.resetBlock = AndroidView_androidKt.getNoOpUpdate();
        this.releaseBlock = AndroidView_androidKt.getNoOpUpdate();
    }

    public /* synthetic */ ViewFactoryHolder(Context context, Function1 function1, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i8, Owner owner, int i9, AbstractC3284p abstractC3284p) {
        this(context, function1, (i9 & 4) != 0 ? null : compositionContext, saveableStateRegistry, i8, owner);
    }

    public ViewFactoryHolder(Context context, Function1 function1, CompositionContext compositionContext, SaveableStateRegistry saveableStateRegistry, int i8, Owner owner) {
        this(context, compositionContext, (View) function1.invoke(context), null, saveableStateRegistry, i8, owner, 8, null);
    }
}
