package androidx.compose.ui.window;

import Q5.p;

/* loaded from: classes.dex */
public final class SecureFlagPolicy_androidKt {

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SecureFlagPolicy.values().length];
            try {
                iArr[SecureFlagPolicy.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SecureFlagPolicy.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SecureFlagPolicy.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean shouldApplySecureFlag(SecureFlagPolicy secureFlagPolicy, boolean z8) {
        int i8 = WhenMappings.$EnumSwitchMapping$0[secureFlagPolicy.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    throw new p();
                }
                return z8;
            }
            return true;
        }
        return false;
    }
}
