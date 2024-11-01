package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.ViewConfiguration;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
final class ClicksCounter {
    private int clicks;
    private PointerInputChange prevClick;
    private final ViewConfiguration viewConfiguration;

    public ClicksCounter(ViewConfiguration viewConfiguration) {
        AbstractC3292y.i(viewConfiguration, "viewConfiguration");
        this.viewConfiguration = viewConfiguration;
    }

    public final int getClicks() {
        return this.clicks;
    }

    public final PointerInputChange getPrevClick() {
        return this.prevClick;
    }

    public final boolean positionIsTolerable(PointerInputChange prevClick, PointerInputChange newClick) {
        AbstractC3292y.i(prevClick, "prevClick");
        AbstractC3292y.i(newClick, "newClick");
        if (Offset.m2710getDistanceimpl(Offset.m2716minusMKHz9U(newClick.m3993getPositionF1C5BW0(), prevClick.m3993getPositionF1C5BW0())) < 100.0d) {
            return true;
        }
        return false;
    }

    public final void setClicks(int i8) {
        this.clicks = i8;
    }

    public final void setPrevClick(PointerInputChange pointerInputChange) {
        this.prevClick = pointerInputChange;
    }

    public final boolean timeIsTolerable(PointerInputChange prevClick, PointerInputChange newClick) {
        AbstractC3292y.i(prevClick, "prevClick");
        AbstractC3292y.i(newClick, "newClick");
        if (newClick.getUptimeMillis() - prevClick.getUptimeMillis() < this.viewConfiguration.getDoubleTapTimeoutMillis()) {
            return true;
        }
        return false;
    }

    public final void update(PointerEvent event) {
        AbstractC3292y.i(event, "event");
        PointerInputChange pointerInputChange = this.prevClick;
        PointerInputChange pointerInputChange2 = event.getChanges().get(0);
        if (pointerInputChange != null && timeIsTolerable(pointerInputChange, pointerInputChange2) && positionIsTolerable(pointerInputChange, pointerInputChange2)) {
            this.clicks++;
        } else {
            this.clicks = 1;
        }
        this.prevClick = pointerInputChange2;
    }
}
