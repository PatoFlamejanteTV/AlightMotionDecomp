package androidx.compose.animation.core;

import Q5.I;
import Q5.t;
import androidx.compose.runtime.State;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3", f = "AnimateAsState.kt", l = {419}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class AnimateAsStateKt$animateValueAsState$3 extends l implements InterfaceC2072n {
    final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
    final /* synthetic */ Animatable<T, V> $animatable;
    final /* synthetic */ p6.d $channel;
    final /* synthetic */ State<Function1> $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", l = {428}, m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC2072n {
        final /* synthetic */ State<AnimationSpec<T>> $animSpec$delegate;
        final /* synthetic */ Animatable<T, V> $animatable;
        final /* synthetic */ State<Function1> $listener$delegate;
        final /* synthetic */ T $newTarget;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(T t8, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends Function1> state2, U5.d dVar) {
            super(2, dVar);
            this.$newTarget = t8;
            this.$animatable = animatable;
            this.$animSpec$delegate = state;
            this.$listener$delegate = state2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new AnonymousClass1(this.$newTarget, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            AnimationSpec animateValueAsState$lambda$6;
            Function1 animateValueAsState$lambda$4;
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
                if (!AbstractC3292y.d(this.$newTarget, this.$animatable.getTargetValue())) {
                    Animatable<T, V> animatable = this.$animatable;
                    T t8 = this.$newTarget;
                    animateValueAsState$lambda$6 = AnimateAsStateKt.animateValueAsState$lambda$6(this.$animSpec$delegate);
                    this.label = 1;
                    if (Animatable.animateTo$default(animatable, t8, animateValueAsState$lambda$6, null, null, this, 12, null) == e8) {
                        return e8;
                    }
                }
                return I.f8786a;
            }
            animateValueAsState$lambda$4 = AnimateAsStateKt.animateValueAsState$lambda$4(this.$listener$delegate);
            if (animateValueAsState$lambda$4 != null) {
                animateValueAsState$lambda$4.invoke(this.$animatable.getValue());
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AnimateAsStateKt$animateValueAsState$3(p6.d dVar, Animatable<T, V> animatable, State<? extends AnimationSpec<T>> state, State<? extends Function1> state2, U5.d dVar2) {
        super(2, dVar2);
        this.$channel = dVar;
        this.$animatable = animatable;
        this.$animSpec$delegate = state;
        this.$listener$delegate = state2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        AnimateAsStateKt$animateValueAsState$3 animateAsStateKt$animateValueAsState$3 = new AnimateAsStateKt$animateValueAsState$3(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, dVar);
        animateAsStateKt$animateValueAsState$3.L$0 = obj;
        return animateAsStateKt$animateValueAsState$3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0045  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003a -> B:5:0x003d). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = V5.b.e()
            int r1 = r13.label
            r2 = 1
            if (r1 == 0) goto L20
            if (r1 != r2) goto L18
            java.lang.Object r1 = r13.L$1
            p6.f r1 = (p6.f) r1
            java.lang.Object r3 = r13.L$0
            n6.M r3 = (n6.M) r3
            Q5.t.b(r14)
            r4 = r14
            goto L3d
        L18:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L20:
            Q5.t.b(r14)
            java.lang.Object r1 = r13.L$0
            n6.M r1 = (n6.M) r1
            p6.d r3 = r13.$channel
            p6.f r3 = r3.iterator()
            r12 = r3
            r3 = r1
            r1 = r12
        L30:
            r13.L$0 = r3
            r13.L$1 = r1
            r13.label = r2
            java.lang.Object r4 = r1.b(r13)
            if (r4 != r0) goto L3d
            return r0
        L3d:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L6f
            java.lang.Object r4 = r1.next()
            p6.d r5 = r13.$channel
            java.lang.Object r5 = r5.c()
            java.lang.Object r5 = p6.h.f(r5)
            if (r5 != 0) goto L57
            r7 = r4
            goto L58
        L57:
            r7 = r5
        L58:
            androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1 r4 = new androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1
            androidx.compose.animation.core.Animatable<T, V> r8 = r13.$animatable
            androidx.compose.runtime.State<androidx.compose.animation.core.AnimationSpec<T>> r9 = r13.$animSpec$delegate
            androidx.compose.runtime.State<kotlin.jvm.functions.Function1> r10 = r13.$listener$delegate
            r11 = 0
            r6 = r4
            r6.<init>(r7, r8, r9, r10, r11)
            r9 = 3
            r10 = 0
            r6 = 0
            r7 = 0
            r5 = r3
            r8 = r4
            n6.AbstractC3458i.d(r5, r6, r7, r8, r9, r10)
            goto L30
        L6f:
            Q5.I r0 = Q5.I.f8786a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((AnimateAsStateKt$animateValueAsState$3) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
