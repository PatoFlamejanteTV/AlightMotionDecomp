package androidx.compose.ui.viewinterop;

import Q5.I;
import androidx.compose.ui.node.LayoutNode;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidView_androidKt$AndroidView$2$3 extends AbstractC3293z implements InterfaceC2072n {
    public static final AndroidView_androidKt$AndroidView$2$3 INSTANCE = new AndroidView_androidKt$AndroidView$2$3();

    AndroidView_androidKt$AndroidView$2$3() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (Function1) obj2);
        return I.f8786a;
    }

    public final void invoke(LayoutNode layoutNode, Function1 function1) {
        ViewFactoryHolder requireViewFactoryHolder;
        requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
        requireViewFactoryHolder.setReleaseBlock(function1);
    }
}
