package androidx.compose.foundation.gestures;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TransformableKt {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x02aa, code lost:            if (r5 != 0) goto L89;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x02ac, code lost:            r2 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01fc, code lost:            if (((java.lang.Boolean) r14.getValue().invoke()).booleanValue() != false) goto L68;     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0120 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x027f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b1 A[EDGE_INSN: B:97:0x02b1->B:96:0x02b1 BREAK  A[LOOP:0: B:13:0x029c->B:16:0x02ae], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0280 -> B:12:0x028f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope r29, androidx.compose.runtime.State<java.lang.Boolean> r30, p6.d r31, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function0> r32, U5.d r33) {
        /*
            Method dump skipped, instructions count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TransformableKt.detectZoom(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.runtime.State, p6.d, androidx.compose.runtime.State, U5.d):java.lang.Object");
    }

    public static final Modifier transformable(Modifier modifier, TransformableState state, boolean z8, boolean z9) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(state, "state");
        return transformable(modifier, state, TransformableKt$transformable$1.INSTANCE, z8, z9);
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        if ((i8 & 4) != 0) {
            z9 = true;
        }
        return transformable(modifier, transformableState, z8, z9);
    }

    @ExperimentalFoundationApi
    public static final Modifier transformable(Modifier modifier, TransformableState state, Function0 canPan, boolean z8, boolean z9) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(state, "state");
        AbstractC3292y.i(canPan, "canPan");
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new TransformableKt$transformable$$inlined$debugInspectorInfo$1(state, canPan, z9, z8) : InspectableValueKt.getNoInspectorInfo(), new TransformableKt$transformable$3(z8, canPan, z9, state));
    }

    public static /* synthetic */ Modifier transformable$default(Modifier modifier, TransformableState transformableState, Function0 function0, boolean z8, boolean z9, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        if ((i8 & 8) != 0) {
            z9 = true;
        }
        return transformable(modifier, transformableState, function0, z8, z9);
    }
}
