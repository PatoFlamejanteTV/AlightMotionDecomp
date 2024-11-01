package androidx.slidingpanelayout.widget;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import android.app.Activity;
import androidx.slidingpanelayout.widget.FoldingFeatureObserver;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", f = "FoldingFeatureObserver.kt", l = {97}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class FoldingFeatureObserver$registerLayoutStateChangeCallback$1 extends l implements InterfaceC2072n {
    final /* synthetic */ Activity $activity;
    int label;
    final /* synthetic */ FoldingFeatureObserver this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoldingFeatureObserver$registerLayoutStateChangeCallback$1(FoldingFeatureObserver foldingFeatureObserver, Activity activity, d dVar) {
        super(2, dVar);
        this.this$0 = foldingFeatureObserver;
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new FoldingFeatureObserver$registerLayoutStateChangeCallback$1(this.this$0, this.$activity, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WindowInfoTracker windowInfoTracker;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            windowInfoTracker = this.this$0.windowInfoTracker;
            final InterfaceC3821f windowLayoutInfo = windowInfoTracker.windowLayoutInfo(this.$activity);
            final FoldingFeatureObserver foldingFeatureObserver = this.this$0;
            InterfaceC3821f p8 = AbstractC3823h.p(new InterfaceC3821f() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1

                /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass2 implements InterfaceC3822g {
                    final /* synthetic */ InterfaceC3822g $this_unsafeFlow$inlined;
                    final /* synthetic */ FoldingFeatureObserver this$0;

                    @f(c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "FoldingFeatureObserver.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "emit")
                    /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                    /* loaded from: classes3.dex */
                    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(d dVar) {
                            super(dVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.a
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(InterfaceC3822g interfaceC3822g, FoldingFeatureObserver foldingFeatureObserver) {
                        this.$this_unsafeFlow$inlined = interfaceC3822g;
                        this.this$0 = foldingFeatureObserver;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                    @Override // q6.InterfaceC3822g
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public java.lang.Object emit(java.lang.Object r5, U5.d r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = (androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = new androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = V5.b.e()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            Q5.t.b(r6)
                            goto L4a
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            Q5.t.b(r6)
                            q6.g r6 = r4.$this_unsafeFlow$inlined
                            androidx.window.layout.WindowLayoutInfo r5 = (androidx.window.layout.WindowLayoutInfo) r5
                            androidx.slidingpanelayout.widget.FoldingFeatureObserver r2 = r4.this$0
                            androidx.window.layout.FoldingFeature r5 = androidx.slidingpanelayout.widget.FoldingFeatureObserver.access$getFoldingFeature(r2, r5)
                            if (r5 != 0) goto L41
                            goto L4a
                        L41:
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r5, r0)
                            if (r5 != r1) goto L4a
                            return r1
                        L4a:
                            Q5.I r5 = Q5.I.f8786a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1.AnonymousClass2.emit(java.lang.Object, U5.d):java.lang.Object");
                    }
                }

                @Override // q6.InterfaceC3821f
                public Object collect(InterfaceC3822g interfaceC3822g, d dVar) {
                    Object collect = InterfaceC3821f.this.collect(new AnonymousClass2(interfaceC3822g, foldingFeatureObserver), dVar);
                    if (collect == b.e()) {
                        return collect;
                    }
                    return I.f8786a;
                }
            });
            final FoldingFeatureObserver foldingFeatureObserver2 = this.this$0;
            InterfaceC3822g interfaceC3822g = new InterfaceC3822g() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$collect$1
                @Override // q6.InterfaceC3822g
                public Object emit(FoldingFeature foldingFeature, d dVar) {
                    FoldingFeatureObserver.OnFoldingFeatureChangeListener onFoldingFeatureChangeListener;
                    I i9;
                    FoldingFeature foldingFeature2 = foldingFeature;
                    onFoldingFeatureChangeListener = FoldingFeatureObserver.this.onFoldingFeatureChangeListener;
                    if (onFoldingFeatureChangeListener == null) {
                        i9 = null;
                    } else {
                        onFoldingFeatureChangeListener.onFoldingFeatureChange(foldingFeature2);
                        i9 = I.f8786a;
                    }
                    if (i9 == b.e()) {
                        return i9;
                    }
                    return I.f8786a;
                }
            };
            this.label = 1;
            if (p8.collect(interfaceC3822g, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((FoldingFeatureObserver$registerLayoutStateChangeCallback$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
