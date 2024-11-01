package androidx.compose.ui.node;

import Q5.I;
import androidx.compose.ui.graphics.Canvas;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class NodeCoordinator$drawBlock$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ NodeCoordinator this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.node.NodeCoordinator$drawBlock$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        final /* synthetic */ Canvas $canvas;
        final /* synthetic */ NodeCoordinator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NodeCoordinator nodeCoordinator, Canvas canvas) {
            super(0);
            this.this$0 = nodeCoordinator;
            this.$canvas = canvas;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m4311invoke();
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m4311invoke() {
            this.this$0.drawContainedDrawModifiers(this.$canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NodeCoordinator$drawBlock$1(NodeCoordinator nodeCoordinator) {
        super(1);
        this.this$0 = nodeCoordinator;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((Canvas) obj);
        return I.f8786a;
    }

    public final void invoke(Canvas canvas) {
        OwnerSnapshotObserver snapshotObserver;
        Function1 function1;
        if (this.this$0.getLayoutNode().isPlaced()) {
            snapshotObserver = this.this$0.getSnapshotObserver();
            NodeCoordinator nodeCoordinator = this.this$0;
            function1 = NodeCoordinator.onCommitAffectingLayer;
            snapshotObserver.observeReads$ui_release(nodeCoordinator, function1, new AnonymousClass1(this.this$0, canvas));
            this.this$0.lastLayerDrawingWasSkipped = false;
            return;
        }
        this.this$0.lastLayerDrawingWasSkipped = true;
    }
}
