package androidx.compose.foundation.text.selection;

import androidx.compose.ui.layout.LayoutCoordinates;
import java.util.Map;

/* loaded from: classes.dex */
public interface SelectionRegistrar {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final long InvalidSelectableId = 0;

    /* loaded from: classes.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final long InvalidSelectableId = 0;

        private Companion() {
        }
    }

    Map<Long, Selection> getSubselections();

    long nextSelectableId();

    void notifyPositionChange(long j8);

    void notifySelectableChange(long j8);

    /* renamed from: notifySelectionUpdate-5iVPX68, reason: not valid java name */
    boolean mo1049notifySelectionUpdate5iVPX68(LayoutCoordinates layoutCoordinates, long j8, long j9, boolean z8, SelectionAdjustment selectionAdjustment);

    void notifySelectionUpdateEnd();

    void notifySelectionUpdateSelectAll(long j8);

    /* renamed from: notifySelectionUpdateStart-d-4ec7I, reason: not valid java name */
    void mo1050notifySelectionUpdateStartd4ec7I(LayoutCoordinates layoutCoordinates, long j8, SelectionAdjustment selectionAdjustment);

    Selectable subscribe(Selectable selectable);

    void unsubscribe(Selectable selectable);
}
