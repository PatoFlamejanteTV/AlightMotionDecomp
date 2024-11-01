package androidx.compose.animation.core;

import Q5.I;
import Q5.t;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.collection.MutableVector;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import kotlin.jvm.internal.P;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.InfiniteTransition$run$1", f = "InfiniteTransition.kt", l = {181, 205}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class InfiniteTransition$run$1 extends l implements InterfaceC2072n {
    final /* synthetic */ MutableState<State<Long>> $toolingOverride;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ InfiniteTransition this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ M $$this$LaunchedEffect;
        final /* synthetic */ P $durationScale;
        final /* synthetic */ MutableState<State<Long>> $toolingOverride;
        final /* synthetic */ InfiniteTransition this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MutableState<State<Long>> mutableState, InfiniteTransition infiniteTransition, P p8, M m8) {
            super(1);
            this.$toolingOverride = mutableState;
            this.this$0 = infiniteTransition;
            this.$durationScale = p8;
            this.$$this$LaunchedEffect = m8;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).longValue());
            return I.f8786a;
        }

        public final void invoke(long j8) {
            long j9;
            MutableVector mutableVector;
            long j10;
            MutableVector mutableVector2;
            State<Long> value = this.$toolingOverride.getValue();
            long longValue = value != null ? value.getValue().longValue() : j8;
            j9 = this.this$0.startTimeNanos;
            int i8 = 0;
            if (j9 == Long.MIN_VALUE || this.$durationScale.f34570a != SuspendAnimationKt.getDurationScale(this.$$this$LaunchedEffect.getCoroutineContext())) {
                this.this$0.startTimeNanos = j8;
                mutableVector = this.this$0._animations;
                int size = mutableVector.getSize();
                if (size > 0) {
                    Object[] content = mutableVector.getContent();
                    int i9 = 0;
                    do {
                        ((InfiniteTransition.TransitionAnimationState) content[i9]).reset$animation_core_release();
                        i9++;
                    } while (i9 < size);
                }
                this.$durationScale.f34570a = SuspendAnimationKt.getDurationScale(this.$$this$LaunchedEffect.getCoroutineContext());
            }
            if (this.$durationScale.f34570a == 0.0f) {
                mutableVector2 = this.this$0._animations;
                int size2 = mutableVector2.getSize();
                if (size2 > 0) {
                    Object[] content2 = mutableVector2.getContent();
                    do {
                        ((InfiniteTransition.TransitionAnimationState) content2[i8]).skipToEnd$animation_core_release();
                        i8++;
                    } while (i8 < size2);
                    return;
                }
                return;
            }
            j10 = this.this$0.startTimeNanos;
            this.this$0.onFrame(((float) (longValue - j10)) / this.$durationScale.f34570a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends AbstractC3293z implements Function0 {
        final /* synthetic */ M $$this$LaunchedEffect;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(M m8) {
            super(0);
            this.$$this$LaunchedEffect = m8;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Float invoke() {
            return Float.valueOf(SuspendAnimationKt.getDurationScale(this.$$this$LaunchedEffect.getCoroutineContext()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.InfiniteTransition$run$1$3", f = "InfiniteTransition.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.compose.animation.core.InfiniteTransition$run$1$3, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass3 extends l implements InterfaceC2072n {
        /* synthetic */ float F$0;
        int label;

        AnonymousClass3(U5.d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(dVar);
            anonymousClass3.F$0 = ((Number) obj).floatValue();
            return anonymousClass3;
        }

        public final Object invoke(float f8, U5.d dVar) {
            return ((AnonymousClass3) create(Float.valueOf(f8), dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            V5.b.e();
            if (this.label == 0) {
                t.b(obj);
                if (this.F$0 > 0.0f) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(z8);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).floatValue(), (U5.d) obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InfiniteTransition$run$1(MutableState<State<Long>> mutableState, InfiniteTransition infiniteTransition, U5.d dVar) {
        super(2, dVar);
        this.$toolingOverride = mutableState;
        this.this$0 = infiniteTransition;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        InfiniteTransition$run$1 infiniteTransition$run$1 = new InfiniteTransition$run$1(this.$toolingOverride, this.this$0, dVar);
        infiniteTransition$run$1.L$0 = obj;
        return infiniteTransition$run$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0055 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x005b -> B:6:0x0040). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0076 -> B:6:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = V5.b.e()
            int r1 = r7.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1b
            java.lang.Object r1 = r7.L$1
            kotlin.jvm.internal.P r1 = (kotlin.jvm.internal.P) r1
            java.lang.Object r4 = r7.L$0
            n6.M r4 = (n6.M) r4
            Q5.t.b(r8)
            r8 = r4
            goto L40
        L1b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L23:
            java.lang.Object r1 = r7.L$1
            kotlin.jvm.internal.P r1 = (kotlin.jvm.internal.P) r1
            java.lang.Object r4 = r7.L$0
            n6.M r4 = (n6.M) r4
            Q5.t.b(r8)
            r8 = r4
            goto L56
        L30:
            Q5.t.b(r8)
            java.lang.Object r8 = r7.L$0
            n6.M r8 = (n6.M) r8
            kotlin.jvm.internal.P r1 = new kotlin.jvm.internal.P
            r1.<init>()
            r4 = 1065353216(0x3f800000, float:1.0)
            r1.f34570a = r4
        L40:
            androidx.compose.animation.core.InfiniteTransition$run$1$1 r4 = new androidx.compose.animation.core.InfiniteTransition$run$1$1
            androidx.compose.runtime.MutableState<androidx.compose.runtime.State<java.lang.Long>> r5 = r7.$toolingOverride
            androidx.compose.animation.core.InfiniteTransition r6 = r7.this$0
            r4.<init>(r5, r6, r1, r8)
            r7.L$0 = r8
            r7.L$1 = r1
            r7.label = r3
            java.lang.Object r4 = androidx.compose.animation.core.InfiniteAnimationPolicyKt.withInfiniteAnimationFrameNanos(r4, r7)
            if (r4 != r0) goto L56
            return r0
        L56:
            float r4 = r1.f34570a
            r5 = 0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L40
            androidx.compose.animation.core.InfiniteTransition$run$1$2 r4 = new androidx.compose.animation.core.InfiniteTransition$run$1$2
            r4.<init>(r8)
            q6.f r4 = androidx.compose.runtime.SnapshotStateKt.snapshotFlow(r4)
            androidx.compose.animation.core.InfiniteTransition$run$1$3 r5 = new androidx.compose.animation.core.InfiniteTransition$run$1$3
            r6 = 0
            r5.<init>(r6)
            r7.L$0 = r8
            r7.L$1 = r1
            r7.label = r2
            java.lang.Object r4 = q6.AbstractC3823h.x(r4, r5, r7)
            if (r4 != r0) goto L40
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.InfiniteTransition$run$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((InfiniteTransition$run$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
