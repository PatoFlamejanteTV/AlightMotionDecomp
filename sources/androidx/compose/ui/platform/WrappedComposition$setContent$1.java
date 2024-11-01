package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.lifecycle.Lifecycle;
import c6.InterfaceC2072n;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class WrappedComposition$setContent$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ WrappedComposition this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        final /* synthetic */ InterfaceC2072n $content;
        final /* synthetic */ WrappedComposition this$0;

        /* JADX INFO: Access modifiers changed from: package-private */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1", f = "Wrapper.android.kt", l = {136}, m = "invokeSuspend")
        /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$1, reason: invalid class name and collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C03531 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
            int label;
            final /* synthetic */ WrappedComposition this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C03531(WrappedComposition wrappedComposition, U5.d dVar) {
                super(2, dVar);
                this.this$0 = wrappedComposition;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C03531(this.this$0, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object e8 = V5.b.e();
                int i8 = this.label;
                if (i8 != 0) {
                    if (i8 == 1) {
                        Q5.t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    Q5.t.b(obj);
                    AndroidComposeView owner = this.this$0.getOwner();
                    this.label = 1;
                    if (owner.boundsUpdatesEventLoop(this) == e8) {
                        return e8;
                    }
                }
                return Q5.I.f8786a;
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(n6.M m8, U5.d dVar) {
                return ((C03531) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.ui.platform.WrappedComposition$setContent$1$1$2, reason: invalid class name */
        /* loaded from: classes.dex */
        public static final class AnonymousClass2 extends AbstractC3293z implements InterfaceC2072n {
            final /* synthetic */ InterfaceC2072n $content;
            final /* synthetic */ WrappedComposition this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(WrappedComposition wrappedComposition, InterfaceC2072n interfaceC2072n) {
                super(2);
                this.this$0 = wrappedComposition;
                this.$content = interfaceC2072n;
            }

            @Override // c6.InterfaceC2072n
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                invoke((Composer) obj, ((Number) obj2).intValue());
                return Q5.I.f8786a;
            }

            @Composable
            public final void invoke(Composer composer, int i8) {
                if ((i8 & 11) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1193460702, i8, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous>.<anonymous> (Wrapper.android.kt:138)");
                }
                AndroidCompositionLocals_androidKt.ProvideAndroidCompositionLocals(this.this$0.getOwner(), this.$content, composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(WrappedComposition wrappedComposition, InterfaceC2072n interfaceC2072n) {
            super(2);
            this.this$0 = wrappedComposition;
            this.$content = interfaceC2072n;
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((Composer) obj, ((Number) obj2).intValue());
            return Q5.I.f8786a;
        }

        @Composable
        public final void invoke(Composer composer, int i8) {
            if ((i8 & 11) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2000640158, i8, -1, "androidx.compose.ui.platform.WrappedComposition.setContent.<anonymous>.<anonymous> (Wrapper.android.kt:124)");
            }
            AndroidComposeView owner = this.this$0.getOwner();
            int i9 = R.id.inspection_slot_table_set;
            Object tag = owner.getTag(i9);
            Set<CompositionData> set = kotlin.jvm.internal.Z.l(tag) ? (Set) tag : null;
            if (set == null) {
                Object parent = this.this$0.getOwner().getParent();
                View view = parent instanceof View ? (View) parent : null;
                Object tag2 = view != null ? view.getTag(i9) : null;
                set = kotlin.jvm.internal.Z.l(tag2) ? (Set) tag2 : null;
            }
            if (set != null) {
                set.add(composer.getCompositionData());
                composer.collectParameterInformation();
            }
            EffectsKt.LaunchedEffect(this.this$0.getOwner(), new C03531(this.this$0, null), composer, 72);
            CompositionLocalKt.CompositionLocalProvider(InspectionTablesKt.getLocalInspectionTables().provides(set), ComposableLambdaKt.composableLambda(composer, -1193460702, true, new AnonymousClass2(this.this$0, this.$content)), composer, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrappedComposition$setContent$1(WrappedComposition wrappedComposition, InterfaceC2072n interfaceC2072n) {
        super(1);
        this.this$0 = wrappedComposition;
        this.$content = interfaceC2072n;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((AndroidComposeView.ViewTreeOwners) obj);
        return Q5.I.f8786a;
    }

    public final void invoke(AndroidComposeView.ViewTreeOwners viewTreeOwners) {
        boolean z8;
        Lifecycle lifecycle;
        z8 = this.this$0.disposed;
        if (z8) {
            return;
        }
        Lifecycle lifecycle2 = viewTreeOwners.getLifecycleOwner().getLifecycle();
        this.this$0.lastContent = this.$content;
        lifecycle = this.this$0.addedToLifecycle;
        if (lifecycle == null) {
            this.this$0.addedToLifecycle = lifecycle2;
            lifecycle2.addObserver(this.this$0);
        } else if (lifecycle2.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            this.this$0.getOriginal().setContent(ComposableLambdaKt.composableLambdaInstance(-2000640158, true, new AnonymousClass1(this.this$0, this.$content)));
        }
    }
}
