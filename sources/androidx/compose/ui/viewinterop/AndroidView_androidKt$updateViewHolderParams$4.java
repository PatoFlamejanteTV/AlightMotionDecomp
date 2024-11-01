package androidx.compose.ui.viewinterop;

import Q5.I;
import androidx.compose.ui.node.LayoutNode;
import androidx.savedstate.SavedStateRegistryOwner;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidView_androidKt$updateViewHolderParams$4 extends AbstractC3293z implements InterfaceC2072n {
    public static final AndroidView_androidKt$updateViewHolderParams$4 INSTANCE = new AndroidView_androidKt$updateViewHolderParams$4();

    AndroidView_androidKt$updateViewHolderParams$4() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (SavedStateRegistryOwner) obj2);
        return I.f8786a;
    }

    public final void invoke(LayoutNode layoutNode, SavedStateRegistryOwner savedStateRegistryOwner) {
        ViewFactoryHolder requireViewFactoryHolder;
        requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
        requireViewFactoryHolder.setSavedStateRegistryOwner(savedStateRegistryOwner);
    }
}
