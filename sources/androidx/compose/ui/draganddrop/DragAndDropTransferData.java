package androidx.compose.ui.draganddrop;

import android.content.ClipData;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class DragAndDropTransferData {
    public static final int $stable = 8;
    private final ClipData clipData;
    private final int flags;
    private final Object localState;

    public DragAndDropTransferData(ClipData clipData, Object obj, int i8) {
        this.clipData = clipData;
        this.localState = obj;
        this.flags = i8;
    }

    public final ClipData getClipData() {
        return this.clipData;
    }

    public final int getFlags() {
        return this.flags;
    }

    public final Object getLocalState() {
        return this.localState;
    }

    public /* synthetic */ DragAndDropTransferData(ClipData clipData, Object obj, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(clipData, (i9 & 2) != 0 ? null : obj, (i9 & 4) != 0 ? 0 : i8);
    }
}
