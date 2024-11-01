package androidx.compose.ui.input.nestedscroll;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public final class NestedScrollModifierKt {
    public static final Modifier nestedScroll(Modifier modifier, NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher) {
        return modifier.then(new NestedScrollElement(nestedScrollConnection, nestedScrollDispatcher));
    }

    public static /* synthetic */ Modifier nestedScroll$default(Modifier modifier, NestedScrollConnection nestedScrollConnection, NestedScrollDispatcher nestedScrollDispatcher, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            nestedScrollDispatcher = null;
        }
        return nestedScroll(modifier, nestedScrollConnection, nestedScrollDispatcher);
    }
}
