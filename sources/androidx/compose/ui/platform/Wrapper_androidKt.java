package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.ui.R;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.UiApplier;
import c6.InterfaceC2072n;
import java.util.Collections;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class Wrapper_androidKt {
    private static final ViewGroup.LayoutParams DefaultLayoutParams = new ViewGroup.LayoutParams(-2, -2);

    @MainThread
    public static final ReusableComposition createSubcomposition(LayoutNode layoutNode, CompositionContext compositionContext) {
        return CompositionKt.ReusableComposition(new UiApplier(layoutNode), compositionContext);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    private static final Composition doSetContent(AndroidComposeView androidComposeView, CompositionContext compositionContext, InterfaceC2072n interfaceC2072n) {
        WrappedComposition wrappedComposition;
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            int i8 = R.id.inspection_slot_table_set;
            if (androidComposeView.getTag(i8) == null) {
                androidComposeView.setTag(i8, Collections.newSetFromMap(new WeakHashMap()));
            }
        }
        Composition Composition = CompositionKt.Composition(new UiApplier(androidComposeView.getRoot()), compositionContext);
        View view = androidComposeView.getView();
        int i9 = R.id.wrapped_composition_tag;
        Object tag = view.getTag(i9);
        if (tag instanceof WrappedComposition) {
            wrappedComposition = (WrappedComposition) tag;
        } else {
            wrappedComposition = null;
        }
        if (wrappedComposition == null) {
            wrappedComposition = new WrappedComposition(androidComposeView, Composition);
            androidComposeView.getView().setTag(i9, wrappedComposition);
        }
        wrappedComposition.setContent(interfaceC2072n);
        return wrappedComposition;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final Composition setContent(AbstractComposeView abstractComposeView, CompositionContext compositionContext, InterfaceC2072n interfaceC2072n) {
        GlobalSnapshotManager.INSTANCE.ensureStarted();
        AndroidComposeView androidComposeView = null;
        if (abstractComposeView.getChildCount() > 0) {
            View childAt = abstractComposeView.getChildAt(0);
            if (childAt instanceof AndroidComposeView) {
                androidComposeView = (AndroidComposeView) childAt;
            }
        } else {
            abstractComposeView.removeAllViews();
        }
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(abstractComposeView.getContext(), compositionContext.getEffectCoroutineContext());
            abstractComposeView.addView(androidComposeView.getView(), DefaultLayoutParams);
        }
        return doSetContent(androidComposeView, compositionContext, interfaceC2072n);
    }
}
