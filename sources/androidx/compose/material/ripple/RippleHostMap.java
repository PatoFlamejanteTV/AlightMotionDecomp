package androidx.compose.material.ripple;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class RippleHostMap {
    private final Map<AndroidRippleIndicationInstance, RippleHostView> indicationToHostMap = new LinkedHashMap();
    private final Map<RippleHostView, AndroidRippleIndicationInstance> hostToIndicationMap = new LinkedHashMap();

    public final RippleHostView get(AndroidRippleIndicationInstance indicationInstance) {
        AbstractC3292y.i(indicationInstance, "indicationInstance");
        return this.indicationToHostMap.get(indicationInstance);
    }

    public final void remove(AndroidRippleIndicationInstance indicationInstance) {
        AbstractC3292y.i(indicationInstance, "indicationInstance");
        RippleHostView rippleHostView = this.indicationToHostMap.get(indicationInstance);
        if (rippleHostView != null) {
            this.hostToIndicationMap.remove(rippleHostView);
        }
        this.indicationToHostMap.remove(indicationInstance);
    }

    public final void set(AndroidRippleIndicationInstance indicationInstance, RippleHostView rippleHostView) {
        AbstractC3292y.i(indicationInstance, "indicationInstance");
        AbstractC3292y.i(rippleHostView, "rippleHostView");
        this.indicationToHostMap.put(indicationInstance, rippleHostView);
        this.hostToIndicationMap.put(rippleHostView, indicationInstance);
    }

    public final AndroidRippleIndicationInstance get(RippleHostView rippleHostView) {
        AbstractC3292y.i(rippleHostView, "rippleHostView");
        return this.hostToIndicationMap.get(rippleHostView);
    }
}
