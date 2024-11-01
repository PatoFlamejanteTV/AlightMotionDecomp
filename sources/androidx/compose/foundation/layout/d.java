package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static /* synthetic */ Modifier a(ColumnScope columnScope, Modifier modifier, float f8, boolean z8, int i8, Object obj) {
        if (obj == null) {
            if ((i8 & 2) != 0) {
                z8 = true;
            }
            return columnScope.weight(modifier, f8, z8);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: weight");
    }
}
