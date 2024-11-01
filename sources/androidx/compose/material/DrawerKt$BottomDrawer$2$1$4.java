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
final class DrawerKt$BottomDrawer$2$1$4 extends AbstractC3293z implements Function1 {
    final /* synthetic */ BottomDrawerState $drawerState;
    final /* synthetic */ String $navigationMenu;
    final /* synthetic */ M $scope;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.material.DrawerKt$BottomDrawer$2$1$4$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        final /* synthetic */ BottomDrawerState $drawerState;
        final /* synthetic */ M $scope;

        /* JADX INFO: Access modifiers changed from: package-private */
        @f(c = "androidx.compose.material.DrawerKt$BottomDrawer$2$1$4$1$1", f = "Drawer.kt", l = {738}, m = "invokeSuspend")
        /* renamed from: androidx.compose.material.DrawerKt$BottomDrawer$2$1$4$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03261 extends l implements InterfaceC2072n {
            final /* synthetic */ BottomDrawerState $drawerState;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03261(BottomDrawerState bottomDrawerState, d dVar) {
                super(2, dVar);
                this.$drawerState = bottomDrawerState;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C03261(this.$drawerState, dVar);
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
                    BottomDrawerState bottomDrawerState = this.$drawerState;
                    this.label = 1;
                    if (bottomDrawerState.close(this) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, d dVar) {
                return ((C03261) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BottomDrawerState bottomDrawerState, M m8) {
            super(0);
            this.$drawerState = bottomDrawerState;
            this.$scope = m8;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            if (this.$drawerState.confirmStateChange$material_release(BottomDrawerValue.Closed)) {
                AbstractC3462k.d(this.$scope, null, null, new C03261(this.$drawerState, null), 3, null);
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DrawerKt$BottomDrawer$2$1$4(String str, BottomDrawerState bottomDrawerState, M m8) {
        super(1);
        this.$navigationMenu = str;
        this.$drawerState = bottomDrawerState;
        this.$scope = m8;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SemanticsPropertyReceiver) obj);
        return I.f8786a;
    }

    public final void invoke(SemanticsPropertyReceiver semantics) {
        AbstractC3292y.i(semantics, "$this$semantics");
        SemanticsPropertiesKt.setPaneTitle(semantics, this.$navigationMenu);
        if (this.$drawerState.isOpen()) {
            SemanticsPropertiesKt.dismiss$default(semantics, null, new AnonymousClass1(this.$drawerState, this.$scope), 1, null);
        }
    }
}
