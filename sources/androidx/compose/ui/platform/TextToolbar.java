package androidx.compose.ui.platform;

import androidx.compose.ui.geometry.Rect;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public interface TextToolbar {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
    }

    TextToolbarStatus getStatus();

    void hide();

    void showMenu(Rect rect, Function0 function0, Function0 function02, Function0 function03, Function0 function04);
}
