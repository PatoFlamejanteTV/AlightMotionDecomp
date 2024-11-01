package androidx.navigation.compose;

import android.os.Bundle;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.navigation.NavHostController;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class NavHostControllerKt$NavControllerSaver$1 extends AbstractC3293z implements InterfaceC2072n {
    public static final NavHostControllerKt$NavControllerSaver$1 INSTANCE = new NavHostControllerKt$NavControllerSaver$1();

    NavHostControllerKt$NavControllerSaver$1() {
        super(2);
    }

    @Override // c6.InterfaceC2072n
    public final Bundle invoke(SaverScope saverScope, NavHostController navHostController) {
        return navHostController.saveState();
    }
}
