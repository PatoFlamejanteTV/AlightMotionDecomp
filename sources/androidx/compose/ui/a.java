package androidx.compose.ui;

import androidx.compose.ui.Modifier;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    static {
        Modifier.Companion companion = Modifier.Companion;
    }

    public static Modifier a(Modifier modifier, Modifier modifier2) {
        if (modifier2 != Modifier.Companion) {
            return new CombinedModifier(modifier, modifier2);
        }
        return modifier;
    }

    public static /* synthetic */ Modifier b(Modifier modifier, Modifier modifier2) {
        return a(modifier, modifier2);
    }
}
