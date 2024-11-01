package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.SelectionManager;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ContextMenu_androidKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ContextMenuArea(TextFieldSelectionManager manager, InterfaceC2072n content, Composer composer, int i8) {
        AbstractC3292y.i(manager, "manager");
        AbstractC3292y.i(content, "content");
        composer.startReplaceableGroup(-1985516685);
        content.invoke(composer, Integer.valueOf((i8 >> 3) & 14));
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ContextMenuArea(SelectionManager manager, InterfaceC2072n content, Composer composer, int i8) {
        AbstractC3292y.i(manager, "manager");
        AbstractC3292y.i(content, "content");
        composer.startReplaceableGroup(605522716);
        content.invoke(composer, Integer.valueOf((i8 >> 3) & 14));
        composer.endReplaceableGroup();
    }
}
