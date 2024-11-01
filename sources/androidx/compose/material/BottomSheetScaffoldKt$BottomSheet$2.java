package androidx.compose.material;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3462k;
import n6.M;

/* loaded from: classes.dex */
final class BottomSheetScaffoldKt$BottomSheet$2 extends AbstractC3293z implements Function1 {
    final /* synthetic */ M $scope;
    final /* synthetic */ BottomSheetState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        final /* synthetic */ M $scope;
        final /* synthetic */ BottomSheetState $state;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$1", f = "BottomSheetScaffold.kt", l = {561}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03221 extends l implements InterfaceC2072n {
            final /* synthetic */ BottomSheetState $state;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03221(BottomSheetState bottomSheetState, d dVar) {
                super(2, dVar);
                this.$state = bottomSheetState;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C03221(this.$state, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    BottomSheetState bottomSheetState = this.$state;
                    this.label = 1;
                    if (bottomSheetState.expand(this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, d dVar) {
                return ((C03221) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BottomSheetState bottomSheetState, M m8) {
            super(0);
            this.$state = bottomSheetState;
            this.$scope = m8;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            if (((Boolean) this.$state.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(BottomSheetValue.Expanded)).booleanValue()) {
                AbstractC3462k.d(this.$scope, null, null, new C03221(this.$state, null), 3, null);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements Function0 {
        final /* synthetic */ M $scope;
        final /* synthetic */ BottomSheetState $state;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$2$1", f = "BottomSheetScaffold.kt", l = {568}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.BottomSheetScaffoldKt$BottomSheet$2$2$1, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass1 extends l implements InterfaceC2072n {
            final /* synthetic */ BottomSheetState $state;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BottomSheetState bottomSheetState, d dVar) {
                super(2, dVar);
                this.$state = bottomSheetState;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new AnonymousClass1(this.$state, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 == 1) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    BottomSheetState bottomSheetState = this.$state;
                    this.label = 1;
                    if (bottomSheetState.collapse(this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, d dVar) {
                return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BottomSheetState bottomSheetState, M m8) {
            super(0);
            this.$state = bottomSheetState;
            this.$scope = m8;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            if (((Boolean) this.$state.getAnchoredDraggableState$material_release().getConfirmValueChange$material_release().invoke(BottomSheetValue.Collapsed)).booleanValue()) {
                AbstractC3462k.d(this.$scope, null, null, new AnonymousClass1(this.$state, null), 3, null);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetScaffoldKt$BottomSheet$2(BottomSheetState bottomSheetState, M m8) {
        super(1);
        this.$state = bottomSheetState;
        this.$scope = m8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8786a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3292y.i(semantics, "$this$semantics");
        if (this.$state.getAnchoredDraggableState$material_release().getAnchors$material_release().size() > 1) {
            if (this.$state.isCollapsed()) {
                SemanticsPropertiesKt.expand$default(semantics, null, new AnonymousClass1(this.$state, this.$scope), 1, null);
            } else {
                SemanticsPropertiesKt.collapse$default(semantics, null, new AnonymousClass2(this.$state, this.$scope), 1, null);
            }
        }
    }
}
