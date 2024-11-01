package androidx.activity.compose;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.ComponentActivity;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import c6.InterfaceC2072n;

/* loaded from: classes.dex */
public final class ComponentActivityKt {
    private static final ViewGroup.LayoutParams DefaultActivityContentLayoutParams = new ViewGroup.LayoutParams(-2, -2);

    public static final void setContent(ComponentActivity componentActivity, CompositionContext compositionContext, InterfaceC2072n interfaceC2072n) {
        ComposeView composeView;
        View childAt = ((ViewGroup) componentActivity.getWindow().getDecorView().findViewById(android.R.id.content)).getChildAt(0);
        if (childAt instanceof ComposeView) {
            composeView = (ComposeView) childAt;
        } else {
            composeView = null;
        }
        if (composeView != null) {
            composeView.setParentCompositionContext(compositionContext);
            composeView.setContent(interfaceC2072n);
            return;
        }
        ComposeView composeView2 = new ComposeView(componentActivity, null, 0, 6, null);
        composeView2.setParentCompositionContext(compositionContext);
        composeView2.setContent(interfaceC2072n);
        setOwners(componentActivity);
        componentActivity.setContentView(composeView2, DefaultActivityContentLayoutParams);
    }

    public static /* synthetic */ void setContent$default(ComponentActivity componentActivity, CompositionContext compositionContext, InterfaceC2072n interfaceC2072n, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            compositionContext = null;
        }
        setContent(componentActivity, compositionContext, interfaceC2072n);
    }

    private static final void setOwners(ComponentActivity componentActivity) {
        View decorView = componentActivity.getWindow().getDecorView();
        if (ViewTreeLifecycleOwner.get(decorView) == null) {
            ViewTreeLifecycleOwner.set(decorView, componentActivity);
        }
        if (ViewTreeViewModelStoreOwner.get(decorView) == null) {
            ViewTreeViewModelStoreOwner.set(decorView, componentActivity);
        }
        if (ViewTreeSavedStateRegistryOwner.get(decorView) == null) {
            ViewTreeSavedStateRegistryOwner.set(decorView, componentActivity);
        }
    }
}
