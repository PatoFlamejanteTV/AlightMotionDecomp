package androidx.compose.foundation.pager;

import Q5.I;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PagerKt$pagerSemantics$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ boolean $isVertical;
    final /* synthetic */ M $scope;
    final /* synthetic */ PagerState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        final /* synthetic */ M $scope;
        final /* synthetic */ PagerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(PagerState pagerState, M m8) {
            super(0);
            this.$state = pagerState;
            this.$scope = m8;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean pagerSemantics$performBackwardPaging;
            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(this.$state, this.$scope);
            return Boolean.valueOf(pagerSemantics$performBackwardPaging);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements Function0 {
        final /* synthetic */ M $scope;
        final /* synthetic */ PagerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(PagerState pagerState, M m8) {
            super(0);
            this.$state = pagerState;
            this.$scope = m8;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean pagerSemantics$performForwardPaging;
            pagerSemantics$performForwardPaging = PagerKt.pagerSemantics$performForwardPaging(this.$state, this.$scope);
            return Boolean.valueOf(pagerSemantics$performForwardPaging);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends AbstractC3293z implements Function0 {
        final /* synthetic */ M $scope;
        final /* synthetic */ PagerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(PagerState pagerState, M m8) {
            super(0);
            this.$state = pagerState;
            this.$scope = m8;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean pagerSemantics$performBackwardPaging;
            pagerSemantics$performBackwardPaging = PagerKt.pagerSemantics$performBackwardPaging(this.$state, this.$scope);
            return Boolean.valueOf(pagerSemantics$performBackwardPaging);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.pager.PagerKt$pagerSemantics$1$4, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass4 extends AbstractC3293z implements Function0 {
        final /* synthetic */ M $scope;
        final /* synthetic */ PagerState $state;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(PagerState pagerState, M m8) {
            super(0);
            this.$state = pagerState;
            this.$scope = m8;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            boolean pagerSemantics$performForwardPaging;
            pagerSemantics$performForwardPaging = PagerKt.pagerSemantics$performForwardPaging(this.$state, this.$scope);
            return Boolean.valueOf(pagerSemantics$performForwardPaging);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerKt$pagerSemantics$1(boolean z8, PagerState pagerState, M m8) {
        super(1);
        this.$isVertical = z8;
        this.$state = pagerState;
        this.$scope = m8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8786a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3292y.i(semantics, "$this$semantics");
        if (this.$isVertical) {
            SemanticsPropertiesKt.pageUp$default(semantics, null, new AnonymousClass1(this.$state, this.$scope), 1, null);
            SemanticsPropertiesKt.pageDown$default(semantics, null, new AnonymousClass2(this.$state, this.$scope), 1, null);
        } else {
            SemanticsPropertiesKt.pageLeft$default(semantics, null, new AnonymousClass3(this.$state, this.$scope), 1, null);
            SemanticsPropertiesKt.pageRight$default(semantics, null, new AnonymousClass4(this.$state, this.$scope), 1, null);
        }
    }
}
