package androidx.compose.foundation;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.runtime.SnapshotStateKt;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", l = {352}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class MarqueeModifierNode$runAnimation$2 extends l implements InterfaceC2072n {
    int label;
    final /* synthetic */ MarqueeModifierNode this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function0 {
        final /* synthetic */ MarqueeModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MarqueeModifierNode marqueeModifierNode) {
            super(0);
            this.this$0 = marqueeModifierNode;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            int contentWidth;
            int containerWidth;
            int contentWidth2;
            int spacingPx;
            boolean hasFocus;
            contentWidth = this.this$0.getContentWidth();
            containerWidth = this.this$0.getContainerWidth();
            if (contentWidth <= containerWidth) {
                return null;
            }
            if (MarqueeAnimationMode.m327equalsimpl0(this.this$0.m339getAnimationModeZbEOnfQ(), MarqueeAnimationMode.Companion.m334getWhileFocusedZbEOnfQ())) {
                hasFocus = this.this$0.getHasFocus();
                if (!hasFocus) {
                    return null;
                }
            }
            contentWidth2 = this.this$0.getContentWidth();
            spacingPx = this.this$0.getSpacingPx();
            return Float.valueOf(contentWidth2 + spacingPx);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", l = {365, 367, 369, 369}, m = "invokeSuspend")
    /* renamed from: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends l implements InterfaceC2072n {
        /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ MarqueeModifierNode this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MarqueeModifierNode marqueeModifierNode, d dVar) {
            super(2, dVar);
            this.this$0 = marqueeModifierNode;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(Float f8, d dVar) {
            return ((AnonymousClass2) create(f8, dVar)).invokeSuspend(I.f8786a);
        }

        /* JADX WARN: Removed duplicated region for block: B:19:0x00ba A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                r21 = this;
                r9 = r21
                java.lang.Object r10 = V5.b.e()
                int r0 = r9.label
                r11 = 4
                r12 = 3
                r1 = 2
                r2 = 1
                r13 = 0
                r14 = 0
                if (r0 == 0) goto L43
                if (r0 == r2) goto L36
                if (r0 == r1) goto L2e
                if (r0 == r12) goto L29
                if (r0 == r11) goto L20
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L20:
                java.lang.Object r0 = r9.L$0
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                Q5.t.b(r22)
                goto Ld5
            L29:
                Q5.t.b(r22)
                goto Lbb
            L2e:
                Q5.t.b(r22)     // Catch: java.lang.Throwable -> L33
                goto La8
            L33:
                r0 = move-exception
                goto Lbe
            L36:
                java.lang.Object r0 = r9.L$1
                androidx.compose.animation.core.AnimationSpec r0 = (androidx.compose.animation.core.AnimationSpec) r0
                java.lang.Object r2 = r9.L$0
                java.lang.Float r2 = (java.lang.Float) r2
                Q5.t.b(r22)
                r3 = r0
                goto L8d
            L43:
                Q5.t.b(r22)
                java.lang.Object r0 = r9.L$0
                java.lang.Float r0 = (java.lang.Float) r0
                if (r0 != 0) goto L4f
                Q5.I r0 = Q5.I.f8786a
                return r0
            L4f:
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                int r15 = androidx.compose.foundation.MarqueeModifierNode.access$getIterations$p(r3)
                float r16 = r0.floatValue()
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                int r17 = androidx.compose.foundation.MarqueeModifierNode.access$getInitialDelayMillis$p(r3)
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                int r18 = androidx.compose.foundation.MarqueeModifierNode.access$getDelayMillis$p(r3)
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                float r19 = androidx.compose.foundation.MarqueeModifierNode.access$getVelocity$p(r3)
                androidx.compose.foundation.MarqueeModifierNode r3 = r9.this$0
                androidx.compose.ui.unit.Density r20 = androidx.compose.ui.node.DelegatableNodeKt.requireDensity(r3)
                androidx.compose.animation.core.AnimationSpec r3 = androidx.compose.foundation.BasicMarqueeKt.m263access$createMarqueeAnimationSpecZ4HSEVQ(r15, r16, r17, r18, r19, r20)
                androidx.compose.foundation.MarqueeModifierNode r4 = r9.this$0
                androidx.compose.animation.core.Animatable r4 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r4)
                java.lang.Float r5 = kotlin.coroutines.jvm.internal.b.b(r14)
                r9.L$0 = r0
                r9.L$1 = r3
                r9.label = r2
                java.lang.Object r2 = r4.snapTo(r5, r9)
                if (r2 != r10) goto L8c
                return r10
            L8c:
                r2 = r0
            L8d:
                androidx.compose.foundation.MarqueeModifierNode r0 = r9.this$0     // Catch: java.lang.Throwable -> L33
                androidx.compose.animation.core.Animatable r0 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r0)     // Catch: java.lang.Throwable -> L33
                r9.L$0 = r13     // Catch: java.lang.Throwable -> L33
                r9.L$1 = r13     // Catch: java.lang.Throwable -> L33
                r9.label = r1     // Catch: java.lang.Throwable -> L33
                r4 = 0
                r5 = 0
                r7 = 12
                r8 = 0
                r1 = r0
                r6 = r21
                java.lang.Object r0 = androidx.compose.animation.core.Animatable.animateTo$default(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L33
                if (r0 != r10) goto La8
                return r10
            La8:
                androidx.compose.foundation.MarqueeModifierNode r0 = r9.this$0
                androidx.compose.animation.core.Animatable r0 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r0)
                java.lang.Float r1 = kotlin.coroutines.jvm.internal.b.b(r14)
                r9.label = r12
                java.lang.Object r0 = r0.snapTo(r1, r9)
                if (r0 != r10) goto Lbb
                return r10
            Lbb:
                Q5.I r0 = Q5.I.f8786a
                return r0
            Lbe:
                androidx.compose.foundation.MarqueeModifierNode r1 = r9.this$0
                androidx.compose.animation.core.Animatable r1 = androidx.compose.foundation.MarqueeModifierNode.access$getOffset$p(r1)
                java.lang.Float r2 = kotlin.coroutines.jvm.internal.b.b(r14)
                r9.L$0 = r0
                r9.L$1 = r13
                r9.label = r11
                java.lang.Object r1 = r1.snapTo(r2, r9)
                if (r1 != r10) goto Ld5
                return r10
            Ld5:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.MarqueeModifierNode$runAnimation$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarqueeModifierNode$runAnimation$2(MarqueeModifierNode marqueeModifierNode, d dVar) {
        super(2, dVar);
        this.this$0 = marqueeModifierNode;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new MarqueeModifierNode$runAnimation$2(this.this$0, dVar);
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
            InterfaceC3821f snapshotFlow = SnapshotStateKt.snapshotFlow(new AnonymousClass1(this.this$0));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, null);
            this.label = 1;
            if (AbstractC3823h.j(snapshotFlow, anonymousClass2, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((MarqueeModifierNode$runAnimation$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
