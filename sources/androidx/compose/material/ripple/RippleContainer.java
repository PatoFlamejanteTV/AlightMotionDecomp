package androidx.compose.material.ripple;

import R5.AbstractC1435t;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class RippleContainer extends ViewGroup {
    private final int MaxRippleHosts;
    private int nextHostIndex;
    private final RippleHostMap rippleHostMap;
    private final List<RippleHostView> rippleHosts;
    private final List<RippleHostView> unusedRippleHosts;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RippleContainer(Context context) {
        super(context);
        AbstractC3292y.i(context, "context");
        this.MaxRippleHosts = 5;
        ArrayList arrayList = new ArrayList();
        this.rippleHosts = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.unusedRippleHosts = arrayList2;
        this.rippleHostMap = new RippleHostMap();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.nextHostIndex = 1;
        setTag(androidx.compose.ui.R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void disposeRippleIfNeeded(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        AbstractC3292y.i(androidRippleIndicationInstance, "<this>");
        androidRippleIndicationInstance.resetHostView();
        RippleHostView rippleHostView = this.rippleHostMap.get(androidRippleIndicationInstance);
        if (rippleHostView != null) {
            rippleHostView.disposeRipple();
            this.rippleHostMap.remove(androidRippleIndicationInstance);
            this.unusedRippleHosts.add(rippleHostView);
        }
    }

    public final RippleHostView getRippleHostView(AndroidRippleIndicationInstance androidRippleIndicationInstance) {
        AbstractC3292y.i(androidRippleIndicationInstance, "<this>");
        RippleHostView rippleHostView = this.rippleHostMap.get(androidRippleIndicationInstance);
        if (rippleHostView != null) {
            return rippleHostView;
        }
        RippleHostView rippleHostView2 = (RippleHostView) AbstractC1435t.O(this.unusedRippleHosts);
        if (rippleHostView2 == null) {
            if (this.nextHostIndex > AbstractC1435t.o(this.rippleHosts)) {
                Context context = getContext();
                AbstractC3292y.h(context, "context");
                rippleHostView2 = new RippleHostView(context);
                addView(rippleHostView2);
                this.rippleHosts.add(rippleHostView2);
            } else {
                rippleHostView2 = this.rippleHosts.get(this.nextHostIndex);
                AndroidRippleIndicationInstance androidRippleIndicationInstance2 = this.rippleHostMap.get(rippleHostView2);
                if (androidRippleIndicationInstance2 != null) {
                    androidRippleIndicationInstance2.resetHostView();
                    this.rippleHostMap.remove(androidRippleIndicationInstance2);
                    rippleHostView2.disposeRipple();
                }
            }
            int i8 = this.nextHostIndex;
            if (i8 < this.MaxRippleHosts - 1) {
                this.nextHostIndex = i8 + 1;
            } else {
                this.nextHostIndex = 0;
            }
        }
        this.rippleHostMap.set(androidRippleIndicationInstance, rippleHostView2);
        return rippleHostView2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        setMeasuredDimension(0, 0);
    }
}
