package androidx.compose.ui.platform;

import androidx.compose.ui.draganddrop.DragAndDropTransferData;
import androidx.compose.ui.geometry.Size;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C3289v;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public /* synthetic */ class AndroidComposeView$dragAndDropModifierOnDragListener$1 extends C3289v implements InterfaceC2073o {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AndroidComposeView$dragAndDropModifierOnDragListener$1(Object obj) {
        super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m4403invoke12SF9DM((DragAndDropTransferData) obj, ((Size) obj2).m2786unboximpl(), (Function1) obj3);
    }

    /* renamed from: invoke-12SF9DM, reason: not valid java name */
    public final Boolean m4403invoke12SF9DM(DragAndDropTransferData dragAndDropTransferData, long j8, Function1 function1) {
        boolean m4401startDrag12SF9DM;
        m4401startDrag12SF9DM = ((AndroidComposeView) this.receiver).m4401startDrag12SF9DM(dragAndDropTransferData, j8, function1);
        return Boolean.valueOf(m4401startDrag12SF9DM);
    }
}
