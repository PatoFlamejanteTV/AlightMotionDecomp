package androidx.compose.ui.window;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class DialogProperties {
    public static final int $stable = 0;
    private final boolean decorFitsSystemWindows;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final SecureFlagPolicy securePolicy;
    private final boolean usePlatformDefaultWidth;

    public DialogProperties() {
        this(false, false, null, false, false, 31, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogProperties)) {
            return false;
        }
        DialogProperties dialogProperties = (DialogProperties) obj;
        if (this.dismissOnBackPress == dialogProperties.dismissOnBackPress && this.dismissOnClickOutside == dialogProperties.dismissOnClickOutside && this.securePolicy == dialogProperties.securePolicy && this.usePlatformDefaultWidth == dialogProperties.usePlatformDefaultWidth && this.decorFitsSystemWindows == dialogProperties.decorFitsSystemWindows) {
            return true;
        }
        return false;
    }

    public final boolean getDecorFitsSystemWindows() {
        return this.decorFitsSystemWindows;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public int hashCode() {
        return (((((((androidx.compose.foundation.a.a(this.dismissOnBackPress) * 31) + androidx.compose.foundation.a.a(this.dismissOnClickOutside)) * 31) + this.securePolicy.hashCode()) * 31) + androidx.compose.foundation.a.a(this.usePlatformDefaultWidth)) * 31) + androidx.compose.foundation.a.a(this.decorFitsSystemWindows);
    }

    public DialogProperties(boolean z8, boolean z9, SecureFlagPolicy secureFlagPolicy, boolean z10, boolean z11) {
        this.dismissOnBackPress = z8;
        this.dismissOnClickOutside = z9;
        this.securePolicy = secureFlagPolicy;
        this.usePlatformDefaultWidth = z10;
        this.decorFitsSystemWindows = z11;
    }

    public /* synthetic */ DialogProperties(boolean z8, boolean z9, SecureFlagPolicy secureFlagPolicy, boolean z10, boolean z11, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? true : z8, (i8 & 2) != 0 ? true : z9, (i8 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i8 & 8) != 0 ? true : z10, (i8 & 16) != 0 ? true : z11);
    }

    public /* synthetic */ DialogProperties(boolean z8, boolean z9, SecureFlagPolicy secureFlagPolicy, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? true : z8, (i8 & 2) != 0 ? true : z9, (i8 & 4) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy);
    }

    public DialogProperties(boolean z8, boolean z9, SecureFlagPolicy secureFlagPolicy) {
        this(z8, z9, secureFlagPolicy, true, true);
    }
}
