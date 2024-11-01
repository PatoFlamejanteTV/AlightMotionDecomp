package androidx.compose.foundation.layout;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class IntrinsicKt {

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IntrinsicSize.values().length];
            try {
                iArr[IntrinsicSize.Min.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IntrinsicSize.Max.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Stable
    public static final Modifier height(Modifier modifier, IntrinsicSize intrinsicSize) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(intrinsicSize, "intrinsicSize");
        int i8 = WhenMappings.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return modifier.then(MaxIntrinsicHeightModifier.INSTANCE);
            }
            throw new Q5.p();
        }
        return modifier.then(MinIntrinsicHeightModifier.INSTANCE);
    }

    @Stable
    public static final Modifier requiredHeight(Modifier modifier, IntrinsicSize intrinsicSize) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(intrinsicSize, "intrinsicSize");
        int i8 = WhenMappings.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return modifier.then(RequiredMaxIntrinsicHeightModifier.INSTANCE);
            }
            throw new Q5.p();
        }
        return modifier.then(RequiredMinIntrinsicHeightModifier.INSTANCE);
    }

    @Stable
    public static final Modifier requiredWidth(Modifier modifier, IntrinsicSize intrinsicSize) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(intrinsicSize, "intrinsicSize");
        int i8 = WhenMappings.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return modifier.then(RequiredMaxIntrinsicWidthModifier.INSTANCE);
            }
            throw new Q5.p();
        }
        return modifier.then(RequiredMinIntrinsicWidthModifier.INSTANCE);
    }

    @Stable
    public static final Modifier width(Modifier modifier, IntrinsicSize intrinsicSize) {
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(intrinsicSize, "intrinsicSize");
        int i8 = WhenMappings.$EnumSwitchMapping$0[intrinsicSize.ordinal()];
        if (i8 != 1) {
            if (i8 == 2) {
                return modifier.then(MaxIntrinsicWidthModifier.INSTANCE);
            }
            throw new Q5.p();
        }
        return modifier.then(MinIntrinsicWidthModifier.INSTANCE);
    }
}
