package androidx.activity.compose;

import Q5.I;
import androidx.activity.FullyDrawnReporter;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.O;

/* loaded from: classes.dex */
final class ReportDrawnComposition implements Function0 {
    private final Function1 checkReporter;
    private final FullyDrawnReporter fullyDrawnReporter;
    private final Function0 predicate;
    private final SnapshotStateObserver snapshotStateObserver;

    public ReportDrawnComposition(FullyDrawnReporter fullyDrawnReporter, Function0 function0) {
        this.fullyDrawnReporter = fullyDrawnReporter;
        this.predicate = function0;
        SnapshotStateObserver snapshotStateObserver = new SnapshotStateObserver(ReportDrawnComposition$snapshotStateObserver$1.INSTANCE);
        snapshotStateObserver.start();
        this.snapshotStateObserver = snapshotStateObserver;
        this.checkReporter = new ReportDrawnComposition$checkReporter$1(this);
        fullyDrawnReporter.addOnReportDrawnListener(this);
        if (!fullyDrawnReporter.isFullyDrawnReported()) {
            fullyDrawnReporter.addReporter();
            observeReporter(function0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void observeReporter(Function0 function0) {
        O o8 = new O();
        this.snapshotStateObserver.observeReads(function0, this.checkReporter, new ReportDrawnComposition$observeReporter$1(o8, function0));
        if (o8.f34569a) {
            removeReporter();
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m78invoke();
        return I.f8786a;
    }

    public final void removeReporter() {
        this.snapshotStateObserver.clear(this.predicate);
        if (!this.fullyDrawnReporter.isFullyDrawnReported()) {
            this.fullyDrawnReporter.removeReporter();
        }
        m78invoke();
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public void m78invoke() {
        this.snapshotStateObserver.clear();
        this.snapshotStateObserver.stop();
    }
}
