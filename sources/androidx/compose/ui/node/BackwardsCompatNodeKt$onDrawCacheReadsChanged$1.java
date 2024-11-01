package androidx.compose.ui.node;

import Q5.I;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class BackwardsCompatNodeKt$onDrawCacheReadsChanged$1 extends AbstractC3293z implements Function1 {
    public static final BackwardsCompatNodeKt$onDrawCacheReadsChanged$1 INSTANCE = new BackwardsCompatNodeKt$onDrawCacheReadsChanged$1();

    BackwardsCompatNodeKt$onDrawCacheReadsChanged$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((BackwardsCompatNode) obj);
        return I.f8786a;
    }

    public final void invoke(BackwardsCompatNode backwardsCompatNode) {
        backwardsCompatNode.onDrawCacheReadsChanged$ui_release();
    }
}
