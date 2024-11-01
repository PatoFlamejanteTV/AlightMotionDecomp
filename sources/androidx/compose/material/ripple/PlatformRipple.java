package androidx.compose.material.ripple;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Stable
/* loaded from: classes.dex */
public final class PlatformRipple extends Ripple {
    public /* synthetic */ PlatformRipple(boolean z8, float f8, State state, AbstractC3284p abstractC3284p) {
        this(z8, f8, state);
    }

    @Composable
    private final ViewGroup findNearestViewGroup(Composer composer, int i8) {
        composer.startReplaceableGroup(-1737891121);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1737891121, i8, -1, "androidx.compose.material.ripple.PlatformRipple.findNearestViewGroup (Ripple.android.kt:104)");
        }
        Object consume = composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        while (!(consume instanceof ViewGroup)) {
            ViewParent parent = ((View) consume).getParent();
            if (parent instanceof View) {
                AbstractC3292y.h(parent, "parent");
                consume = parent;
            } else {
                throw new IllegalArgumentException(("Couldn't find a valid parent for " + consume + ". Are you overriding LocalView and providing a View that is not attached to the view hierarchy?").toString());
            }
        }
        ViewGroup viewGroup = (ViewGroup) consume;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return viewGroup;
    }

    @Override // androidx.compose.material.ripple.Ripple
    @Composable
    /* renamed from: rememberUpdatedRippleInstance-942rkJo */
    public RippleIndicationInstance mo1413rememberUpdatedRippleInstance942rkJo(InteractionSource interactionSource, boolean z8, float f8, State<Color> color, State<RippleAlpha> rippleAlpha, Composer composer, int i8) {
        View view;
        AbstractC3292y.i(interactionSource, "interactionSource");
        AbstractC3292y.i(color, "color");
        AbstractC3292y.i(rippleAlpha, "rippleAlpha");
        composer.startReplaceableGroup(331259447);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(331259447, i8, -1, "androidx.compose.material.ripple.PlatformRipple.rememberUpdatedRippleInstance (Ripple.android.kt:57)");
        }
        ViewGroup findNearestViewGroup = findNearestViewGroup(composer, (i8 >> 15) & 14);
        composer.startReplaceableGroup(1643267286);
        if (findNearestViewGroup.isInEditMode()) {
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(interactionSource) | composer.changed(this);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new CommonRippleIndicationInstance(z8, f8, color, rippleAlpha, null);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            CommonRippleIndicationInstance commonRippleIndicationInstance = (CommonRippleIndicationInstance) rememberedValue;
            composer.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return commonRippleIndicationInstance;
        }
        composer.endReplaceableGroup();
        int childCount = findNearestViewGroup.getChildCount();
        int i9 = 0;
        while (true) {
            if (i9 < childCount) {
                view = findNearestViewGroup.getChildAt(i9);
                if (view instanceof RippleContainer) {
                    break;
                }
                i9++;
            } else {
                view = null;
                break;
            }
        }
        if (view == null) {
            Context context = findNearestViewGroup.getContext();
            AbstractC3292y.h(context, "view.context");
            view = new RippleContainer(context);
            findNearestViewGroup.addView(view);
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed2 = composer.changed(interactionSource) | composer.changed(this) | composer.changed(view);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new AndroidRippleIndicationInstance(z8, f8, color, rippleAlpha, (RippleContainer) view, null);
            composer.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceableGroup();
        AndroidRippleIndicationInstance androidRippleIndicationInstance = (AndroidRippleIndicationInstance) rememberedValue2;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidRippleIndicationInstance;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private PlatformRipple(boolean z8, float f8, State<Color> color) {
        super(z8, f8, color, null);
        AbstractC3292y.i(color, "color");
    }
}
