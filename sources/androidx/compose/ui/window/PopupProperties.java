package androidx.compose.ui.window;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
/* loaded from: classes.dex */
public final class PopupProperties {
    public static final int $stable = 0;
    private final boolean clippingEnabled;
    private final boolean dismissOnBackPress;
    private final boolean dismissOnClickOutside;
    private final boolean excludeFromSystemGesture;
    private final boolean focusable;
    private final SecureFlagPolicy securePolicy;
    private final boolean usePlatformDefaultWidth;

    @ExperimentalComposeUiApi
    public PopupProperties() {
        this(false, false, false, null, false, false, false, ModuleDescriptor.MODULE_VERSION, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PopupProperties)) {
            return false;
        }
        PopupProperties popupProperties = (PopupProperties) obj;
        if (this.focusable == popupProperties.focusable && this.dismissOnBackPress == popupProperties.dismissOnBackPress && this.dismissOnClickOutside == popupProperties.dismissOnClickOutside && this.securePolicy == popupProperties.securePolicy && this.excludeFromSystemGesture == popupProperties.excludeFromSystemGesture && this.clippingEnabled == popupProperties.clippingEnabled && this.usePlatformDefaultWidth == popupProperties.usePlatformDefaultWidth) {
            return true;
        }
        return false;
    }

    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final boolean getExcludeFromSystemGesture() {
        return this.excludeFromSystemGesture;
    }

    public final boolean getFocusable() {
        return this.focusable;
    }

    public final SecureFlagPolicy getSecurePolicy() {
        return this.securePolicy;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public int hashCode() {
        return (((((((((((((androidx.compose.foundation.a.a(this.dismissOnBackPress) * 31) + androidx.compose.foundation.a.a(this.focusable)) * 31) + androidx.compose.foundation.a.a(this.dismissOnBackPress)) * 31) + androidx.compose.foundation.a.a(this.dismissOnClickOutside)) * 31) + this.securePolicy.hashCode()) * 31) + androidx.compose.foundation.a.a(this.excludeFromSystemGesture)) * 31) + androidx.compose.foundation.a.a(this.clippingEnabled)) * 31) + androidx.compose.foundation.a.a(this.usePlatformDefaultWidth);
    }

    @ExperimentalComposeUiApi
    public PopupProperties(boolean z8, boolean z9, boolean z10, SecureFlagPolicy secureFlagPolicy, boolean z11, boolean z12, boolean z13) {
        this.focusable = z8;
        this.dismissOnBackPress = z9;
        this.dismissOnClickOutside = z10;
        this.securePolicy = secureFlagPolicy;
        this.excludeFromSystemGesture = z11;
        this.clippingEnabled = z12;
        this.usePlatformDefaultWidth = z13;
    }

    public /* synthetic */ PopupProperties(boolean z8, boolean z9, boolean z10, SecureFlagPolicy secureFlagPolicy, boolean z11, boolean z12, boolean z13, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? true : z9, (i8 & 4) != 0 ? true : z10, (i8 & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i8 & 16) != 0 ? true : z11, (i8 & 32) == 0 ? z12 : true, (i8 & 64) != 0 ? false : z13);
    }

    public /* synthetic */ PopupProperties(boolean z8, boolean z9, boolean z10, SecureFlagPolicy secureFlagPolicy, boolean z11, boolean z12, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? true : z9, (i8 & 4) != 0 ? true : z10, (i8 & 8) != 0 ? SecureFlagPolicy.Inherit : secureFlagPolicy, (i8 & 16) != 0 ? true : z11, (i8 & 32) == 0 ? z12 : true);
    }

    public PopupProperties(boolean z8, boolean z9, boolean z10, SecureFlagPolicy secureFlagPolicy, boolean z11, boolean z12) {
        this(z8, z9, z10, secureFlagPolicy, z11, z12, false);
    }
}
