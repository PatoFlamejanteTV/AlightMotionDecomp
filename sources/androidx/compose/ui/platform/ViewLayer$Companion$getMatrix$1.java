package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ViewLayer$Companion$getMatrix$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final ViewLayer$Companion$getMatrix$1 INSTANCE = new ViewLayer$Companion$getMatrix$1();

    ViewLayer$Companion$getMatrix$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((View) obj, (Matrix) obj2);
        return Q5.I.f8786a;
    }

    public final void invoke(View view, Matrix matrix) {
        matrix.set(view.getMatrix());
    }
}
