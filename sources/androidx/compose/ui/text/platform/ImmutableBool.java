package androidx.compose.ui.text.platform;

import androidx.compose.runtime.State;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ImmutableBool implements State<Boolean> {
    private final boolean value;

    public ImmutableBool(boolean z8) {
        this.value = z8;
    }

    @Override // androidx.compose.runtime.State
    public Boolean getValue() {
        return Boolean.valueOf(this.value);
    }
}
