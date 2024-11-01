package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Recomposer;
import androidx.lifecycle.LifecycleOwner;
import c6.InterfaceC2072n;

@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1", f = "WindowRecomposer.android.kt", l = {394}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ Recomposer $recomposer;
    final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 $self;
    final /* synthetic */ LifecycleOwner $source;
    final /* synthetic */ kotlin.jvm.internal.T $systemDurationScaleSettingConsumer;
    final /* synthetic */ View $this_createLifecycleAwareWindowRecomposer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(kotlin.jvm.internal.T t8, Recomposer recomposer, LifecycleOwner lifecycleOwner, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, U5.d dVar) {
        super(2, dVar);
        this.$systemDurationScaleSettingConsumer = t8;
        this.$recomposer = recomposer;
        this.$source = lifecycleOwner;
        this.$self = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.$this_createLifecycleAwareWindowRecomposer = view;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1 = new WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1(this.$systemDurationScaleSettingConsumer, this.$recomposer, this.$source, this.$self, this.$this_createLifecycleAwareWindowRecomposer, dVar);
        windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.L$0 = obj;
        return windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = V5.b.e()
            int r1 = r11.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r0 = r11.L$0
            n6.x0 r0 = (n6.InterfaceC3488x0) r0
            Q5.t.b(r12)     // Catch: java.lang.Throwable -> L14
            goto L6a
        L14:
            r12 = move-exception
            goto L81
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            Q5.t.b(r12)
            java.lang.Object r12 = r11.L$0
            r4 = r12
            n6.M r4 = (n6.M) r4
            kotlin.jvm.internal.T r12 = r11.$systemDurationScaleSettingConsumer     // Catch: java.lang.Throwable -> L58
            java.lang.Object r12 = r12.f34573a     // Catch: java.lang.Throwable -> L58
            androidx.compose.ui.platform.MotionDurationScaleImpl r12 = (androidx.compose.ui.platform.MotionDurationScaleImpl) r12     // Catch: java.lang.Throwable -> L58
            if (r12 == 0) goto L5b
            android.view.View r1 = r11.$this_createLifecycleAwareWindowRecomposer     // Catch: java.lang.Throwable -> L58
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L58
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L58
            q6.L r1 = androidx.compose.ui.platform.WindowRecomposer_androidKt.access$getAnimationScaleFlowFor(r1)     // Catch: java.lang.Throwable -> L58
            java.lang.Object r5 = r1.getValue()     // Catch: java.lang.Throwable -> L58
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: java.lang.Throwable -> L58
            float r5 = r5.floatValue()     // Catch: java.lang.Throwable -> L58
            r12.setScaleFactor(r5)     // Catch: java.lang.Throwable -> L58
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1 r7 = new androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1$1$1     // Catch: java.lang.Throwable -> L58
            r7.<init>(r1, r12, r3)     // Catch: java.lang.Throwable -> L58
            r8 = 3
            r9 = 0
            r5 = 0
            r6 = 0
            n6.x0 r12 = n6.AbstractC3458i.d(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L58
            goto L5c
        L58:
            r12 = move-exception
            r0 = r3
            goto L81
        L5b:
            r12 = r3
        L5c:
            androidx.compose.runtime.Recomposer r1 = r11.$recomposer     // Catch: java.lang.Throwable -> L7d
            r11.L$0 = r12     // Catch: java.lang.Throwable -> L7d
            r11.label = r2     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r1 = r1.runRecomposeAndApplyChanges(r11)     // Catch: java.lang.Throwable -> L7d
            if (r1 != r0) goto L69
            return r0
        L69:
            r0 = r12
        L6a:
            if (r0 == 0) goto L6f
            n6.InterfaceC3488x0.a.a(r0, r3, r2, r3)
        L6f:
            androidx.lifecycle.LifecycleOwner r12 = r11.$source
            androidx.lifecycle.Lifecycle r12 = r12.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r0 = r11.$self
            r12.removeObserver(r0)
            Q5.I r12 = Q5.I.f8786a
            return r12
        L7d:
            r0 = move-exception
            r10 = r0
            r0 = r12
            r12 = r10
        L81:
            if (r0 == 0) goto L86
            n6.InterfaceC3488x0.a.a(r0, r3, r2, r3)
        L86:
            androidx.lifecycle.LifecycleOwner r0 = r11.$source
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r1 = r11.$self
            r0.removeObserver(r1)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(n6.M m8, U5.d dVar) {
        return ((WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2$onStateChanged$1) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
    }
}
