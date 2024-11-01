package androidx.compose.ui.unit;

/* loaded from: classes.dex */
public abstract /* synthetic */ class c {
    public static float a(FontScalingLinear fontScalingLinear, long j8) {
        if (TextUnitType.m5370equalsimpl0(TextUnit.m5341getTypeUIouoOA(j8), TextUnitType.Companion.m5375getSpUIouoOA())) {
            return Dp.m5155constructorimpl(TextUnit.m5342getValueimpl(j8) * fontScalingLinear.getFontScale());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    public static long b(FontScalingLinear fontScalingLinear, float f8) {
        return TextUnitKt.getSp(f8 / fontScalingLinear.getFontScale());
    }
}
