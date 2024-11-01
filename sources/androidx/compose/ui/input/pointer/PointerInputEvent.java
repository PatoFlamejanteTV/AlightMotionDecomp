package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class PointerInputEvent {
    public static final int $stable = 8;
    private final MotionEvent motionEvent;
    private final List<PointerInputEventData> pointers;
    private final long uptime;

    public PointerInputEvent(long j8, List<PointerInputEventData> list, MotionEvent motionEvent) {
        this.uptime = j8;
        this.pointers = list;
        this.motionEvent = motionEvent;
    }

    public final MotionEvent getMotionEvent() {
        return this.motionEvent;
    }

    public final List<PointerInputEventData> getPointers() {
        return this.pointers;
    }

    public final long getUptime() {
        return this.uptime;
    }
}
