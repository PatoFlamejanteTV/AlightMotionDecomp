package androidx.compose.ui.viewinterop;

import Q5.I;
import Q5.p;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidView_androidKt$updateViewHolderParams$5 extends AbstractC3293z implements InterfaceC2072n {
    public static final AndroidView_androidKt$updateViewHolderParams$5 INSTANCE = new AndroidView_androidKt$updateViewHolderParams$5();

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    AndroidView_androidKt$updateViewHolderParams$5() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (LayoutDirection) obj2);
        return I.f8786a;
    }

    public final void invoke(LayoutNode layoutNode, LayoutDirection layoutDirection) {
        ViewFactoryHolder requireViewFactoryHolder;
        requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
        int i8 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i9 = 1;
        if (i8 == 1) {
            i9 = 0;
        } else if (i8 != 2) {
            throw new p();
        }
        requireViewFactoryHolder.setLayoutDirection(i9);
    }
}
