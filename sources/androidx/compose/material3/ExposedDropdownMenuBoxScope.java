package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;

@ExperimentalMaterial3Api
/* loaded from: classes.dex */
public interface ExposedDropdownMenuBoxScope {

    /* renamed from: androidx.compose.material3.ExposedDropdownMenuBoxScope$-CC, reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class CC {
        /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x01a9  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00d8  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00b8  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0087  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x006e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void a(androidx.compose.material3.ExposedDropdownMenuBoxScope r23, boolean r24, kotlin.jvm.functions.Function0 r25, androidx.compose.ui.Modifier r26, c6.InterfaceC2073o r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
            /*
                Method dump skipped, instructions count: 447
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.ExposedDropdownMenuBoxScope.CC.a(androidx.compose.material3.ExposedDropdownMenuBoxScope, boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, c6.o, androidx.compose.runtime.Composer, int, int):void");
        }

        public static /* synthetic */ Modifier b(ExposedDropdownMenuBoxScope exposedDropdownMenuBoxScope, Modifier modifier, boolean z8, int i8, Object obj) {
            if (obj == null) {
                if ((i8 & 1) != 0) {
                    z8 = true;
                }
                return exposedDropdownMenuBoxScope.exposedDropdownSize(modifier, z8);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exposedDropdownSize");
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    void ExposedDropdownMenu(boolean z8, Function0 function0, Modifier modifier, InterfaceC2073o interfaceC2073o, Composer composer, int i8, int i9);

    Modifier exposedDropdownSize(Modifier modifier, boolean z8);

    Modifier menuAnchor(Modifier modifier);
}
