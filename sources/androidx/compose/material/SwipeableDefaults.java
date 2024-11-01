package androidx.compose.material;

import R5.AbstractC1435t;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class SwipeableDefaults {
    public static final int $stable = 0;
    public static final float StandardResistanceFactor = 10.0f;
    public static final float StiffResistanceFactor = 20.0f;
    public static final SwipeableDefaults INSTANCE = new SwipeableDefaults();
    private static final SpringSpec<Float> AnimationSpec = new SpringSpec<>(0.0f, 0.0f, null, 7, null);
    private static final float VelocityThreshold = Dp.m5155constructorimpl(125);

    private SwipeableDefaults() {
    }

    public static /* synthetic */ ResistanceConfig resistanceConfig$default(SwipeableDefaults swipeableDefaults, Set set, float f8, float f9, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            f8 = 10.0f;
        }
        if ((i8 & 4) != 0) {
            f9 = 10.0f;
        }
        return swipeableDefaults.resistanceConfig(set, f8, f9);
    }

    public final SpringSpec<Float> getAnimationSpec() {
        return AnimationSpec;
    }

    /* renamed from: getVelocityThreshold-D9Ej5fM */
    public final float m1339getVelocityThresholdD9Ej5fM() {
        return VelocityThreshold;
    }

    public final ResistanceConfig resistanceConfig(Set<Float> anchors, float f8, float f9) {
        AbstractC3292y.i(anchors, "anchors");
        if (anchors.size() <= 1) {
            return null;
        }
        Set<Float> set = anchors;
        Float B02 = AbstractC1435t.B0(set);
        AbstractC3292y.f(B02);
        float floatValue = B02.floatValue();
        Float D02 = AbstractC1435t.D0(set);
        AbstractC3292y.f(D02);
        return new ResistanceConfig(floatValue - D02.floatValue(), f8, f9);
    }
}
