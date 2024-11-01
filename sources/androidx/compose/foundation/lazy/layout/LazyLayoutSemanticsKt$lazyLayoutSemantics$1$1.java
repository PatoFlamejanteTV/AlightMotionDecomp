package androidx.compose.foundation.lazy.layout;

import Q5.I;
import androidx.compose.ui.semantics.CollectionInfo;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ ScrollAxisRange $accessibilityScrollState;
    final /* synthetic */ CollectionInfo $collectionInfo;
    final /* synthetic */ Function1 $indexForKeyMapping;
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ InterfaceC2072n $scrollByAction;
    final /* synthetic */ Function1 $scrollToIndexAction;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyLayoutSemanticsKt$lazyLayoutSemantics$1$1(Function1 function1, boolean z8, ScrollAxisRange scrollAxisRange, InterfaceC2072n interfaceC2072n, Function1 function12, CollectionInfo collectionInfo) {
        super(1);
        this.$indexForKeyMapping = function1;
        this.$isVertical = z8;
        this.$accessibilityScrollState = scrollAxisRange;
        this.$scrollByAction = interfaceC2072n;
        this.$scrollToIndexAction = function12;
        this.$collectionInfo = collectionInfo;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8786a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3292y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.setTraversalGroup(semantics, true);
        SemanticsPropertiesKt.indexForKey(semantics, this.$indexForKeyMapping);
        if (this.$isVertical) {
            SemanticsPropertiesKt.setVerticalScrollAxisRange(semantics, this.$accessibilityScrollState);
        } else {
            SemanticsPropertiesKt.setHorizontalScrollAxisRange(semantics, this.$accessibilityScrollState);
        }
        InterfaceC2072n interfaceC2072n = this.$scrollByAction;
        if (interfaceC2072n != null) {
            SemanticsPropertiesKt.scrollBy$default(semantics, null, interfaceC2072n, 1, null);
        }
        Function1 function1 = this.$scrollToIndexAction;
        if (function1 != null) {
            SemanticsPropertiesKt.scrollToIndex$default(semantics, null, function1, 1, null);
        }
        SemanticsPropertiesKt.setCollectionInfo(semantics, this.$collectionInfo);
    }
}
