package androidx.compose.ui.viewinterop;

import Q5.I;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.LayoutNode;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidView_androidKt$updateViewHolderParams$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final AndroidView_androidKt$updateViewHolderParams$1 INSTANCE = new AndroidView_androidKt$updateViewHolderParams$1();

    AndroidView_androidKt$updateViewHolderParams$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (Modifier) obj2);
        return I.f8786a;
    }

    public final void invoke(LayoutNode layoutNode, Modifier modifier) {
        ViewFactoryHolder requireViewFactoryHolder;
        requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
        requireViewFactoryHolder.setModifier(modifier);
    }
}
