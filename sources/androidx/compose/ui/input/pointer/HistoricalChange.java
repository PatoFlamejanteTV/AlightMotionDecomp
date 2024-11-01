package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.ExperimentalComposeUiApi;
import androidx.compose.ui.geometry.Offset;
import kotlin.jvm.internal.AbstractC3284p;

@Immutable
@ExperimentalComposeUiApi
/* loaded from: classes.dex */
public final class HistoricalChange {
    public static final int $stable = 0;
    private long originalEventPosition;
    private final long position;
    private final long uptimeMillis;

    public /* synthetic */ HistoricalChange(long j8, long j9, long j10, AbstractC3284p abstractC3284p) {
        this(j8, j9, j10);
    }

    /* renamed from: getOriginalEventPosition-F1C5BW0$ui_release, reason: not valid java name */
    public final long m3919getOriginalEventPositionF1C5BW0$ui_release() {
        return this.originalEventPosition;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m3920getPositionF1C5BW0() {
        return this.position;
    }

    public final long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.uptimeMillis + ", position=" + ((Object) Offset.m2720toStringimpl(this.position)) + ')';
    }

    public /* synthetic */ HistoricalChange(long j8, long j9, AbstractC3284p abstractC3284p) {
        this(j8, j9);
    }

    private HistoricalChange(long j8, long j9) {
        this.uptimeMillis = j8;
        this.position = j9;
        this.originalEventPosition = Offset.Companion.m2728getZeroF1C5BW0();
    }

    private HistoricalChange(long j8, long j9, long j10) {
        this(j8, j9, (AbstractC3284p) null);
        this.originalEventPosition = j10;
    }
}
