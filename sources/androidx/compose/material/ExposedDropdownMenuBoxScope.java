package androidx.compose.material;

import androidx.compose.foundation.ScrollState;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

@ExperimentalMaterialApi
/* loaded from: classes.dex */
public interface ExposedDropdownMenuBoxScope {

    /* renamed from: androidx.compose.material.ExposedDropdownMenuBoxScope$-CC, reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class CC {
        /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x01f0  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:73:0x00f7  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0103  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x00a5  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0089  */
        /* JADX WARN: Removed duplicated region for block: B:92:0x0080  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void a(androidx.compose.material.ExposedDropdownMenuBoxScope r24, boolean r25, kotlin.jvm.functions.Function0 r26, androidx.compose.ui.Modifier r27, androidx.compose.foundation.ScrollState r28, c6.InterfaceC2073o r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
            /*
                Method dump skipped, instructions count: 532
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ExposedDropdownMenuBoxScope.CC.a(androidx.compose.material.ExposedDropdownMenuBoxScope, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.foundation.ScrollState, c6.o, androidx.compose.runtime.Composer, int, int):void");
        }

        public static /* synthetic */ Modifier c(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z8, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 1) != 0) {
                    z8 = true;
                }
                return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z8);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
    }

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Composable
        @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        @Deprecated
        public static void ExposedDropdownMenu(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, boolean z8, Function0 onDismissRequest, Modifier modifier, ScrollState scrollState, InterfaceC2073o content, Composer composer, int i8, int i9) {
            AbstractC3292y.i(onDismissRequest, "onDismissRequest");
            AbstractC3292y.i(content, "content");
            CC.a(exposedDropdownMenuBoxScope, z8, onDismissRequest, modifier, scrollState, content, composer, i8, i9);
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    void ExposedDropdownMenu(boolean z8, Function0 function0, Modifier modifier, ScrollState scrollState, InterfaceC2073o interfaceC2073o, Composer composer, int i8, int i9);

    Modifier exposedDropdownSize(Modifier modifier, boolean z8);
}
