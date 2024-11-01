package androidx.compose.ui.viewinterop;

import Q5.I;
import androidx.compose.ui.node.LayoutNode;
import androidx.lifecycle.LifecycleOwner;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidView_androidKt$updateViewHolderParams$3 extends AbstractC3293z implements InterfaceC2072n {
    public static final AndroidView_androidKt$updateViewHolderParams$3 INSTANCE = new AndroidView_androidKt$updateViewHolderParams$3();

    AndroidView_androidKt$updateViewHolderParams$3() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (LifecycleOwner) obj2);
        return I.f8786a;
    }

    public final void invoke(LayoutNode layoutNode, LifecycleOwner lifecycleOwner) {
        ViewFactoryHolder requireViewFactoryHolder;
        requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
        requireViewFactoryHolder.setLifecycleOwner(lifecycleOwner);
    }
}
