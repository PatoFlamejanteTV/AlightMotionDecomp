package androidx.compose.material3;

import Q5.I;
import V5.b;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.ui.geometry.Offset;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.AbstractC3284p;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* loaded from: classes.dex */
public final class MappedInteractionSource implements InteractionSource {
    private final long delta;
    private final InterfaceC3821f interactions;
    private final Map<PressInteraction.Press, PressInteraction.Press> mappedPresses;

    public /* synthetic */ MappedInteractionSource(InteractionSource interactionSource, long j8, AbstractC3284p abstractC3284p) {
        this(interactionSource, j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PressInteraction.Press mapPress(PressInteraction.Press press) {
        return new PressInteraction.Press(Offset.m2716minusMKHz9U(press.m458getPressPositionF1C5BW0(), this.delta), null);
    }

    @Override // androidx.compose.foundation.interaction.InteractionSource
    public InterfaceC3821f getInteractions() {
        return this.interactions;
    }

    private MappedInteractionSource(InteractionSource interactionSource, long j8) {
        this.delta = j8;
        this.mappedPresses = new LinkedHashMap();
        final InterfaceC3821f interactions = interactionSource.getInteractions();
        this.interactions = new InterfaceC3821f() { // from class: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1

            /* renamed from: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes.dex */
            public static final class AnonymousClass2<T> implements InterfaceC3822g {
                final /* synthetic */ InterfaceC3822g $this_unsafeFlow;
                final /* synthetic */ MappedInteractionSource this$0;

                @f(c = "androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2", f = "MappedInteractionSource.kt", l = {224}, m = "emit")
                /* renamed from: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes.dex */
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(U5.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(InterfaceC3822g interfaceC3822g, MappedInteractionSource mappedInteractionSource) {
                    this.$this_unsafeFlow = interfaceC3822g;
                    this.this$0 = mappedInteractionSource;
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // q6.InterfaceC3822g
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, U5.d r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = (androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2$1 r0 = new androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = V5.b.e()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L32
                        if (r2 != r3) goto L2a
                        Q5.t.b(r7)
                        goto L97
                    L2a:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L32:
                        Q5.t.b(r7)
                        q6.g r7 = r5.$this_unsafeFlow
                        androidx.compose.foundation.interaction.Interaction r6 = (androidx.compose.foundation.interaction.Interaction) r6
                        boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Press
                        if (r2 == 0) goto L51
                        androidx.compose.material3.MappedInteractionSource r2 = r5.this$0
                        r4 = r6
                        androidx.compose.foundation.interaction.PressInteraction$Press r4 = (androidx.compose.foundation.interaction.PressInteraction.Press) r4
                        androidx.compose.foundation.interaction.PressInteraction$Press r2 = androidx.compose.material3.MappedInteractionSource.access$mapPress(r2, r4)
                        androidx.compose.material3.MappedInteractionSource r4 = r5.this$0
                        java.util.Map r4 = androidx.compose.material3.MappedInteractionSource.access$getMappedPresses$p(r4)
                        r4.put(r6, r2)
                        r6 = r2
                        goto L8e
                    L51:
                        boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Cancel
                        if (r2 == 0) goto L70
                        androidx.compose.material3.MappedInteractionSource r2 = r5.this$0
                        java.util.Map r2 = androidx.compose.material3.MappedInteractionSource.access$getMappedPresses$p(r2)
                        androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = (androidx.compose.foundation.interaction.PressInteraction.Cancel) r6
                        androidx.compose.foundation.interaction.PressInteraction$Press r4 = r6.getPress()
                        java.lang.Object r2 = r2.remove(r4)
                        androidx.compose.foundation.interaction.PressInteraction$Press r2 = (androidx.compose.foundation.interaction.PressInteraction.Press) r2
                        if (r2 != 0) goto L6a
                        goto L8e
                    L6a:
                        androidx.compose.foundation.interaction.PressInteraction$Cancel r6 = new androidx.compose.foundation.interaction.PressInteraction$Cancel
                        r6.<init>(r2)
                        goto L8e
                    L70:
                        boolean r2 = r6 instanceof androidx.compose.foundation.interaction.PressInteraction.Release
                        if (r2 == 0) goto L8e
                        androidx.compose.material3.MappedInteractionSource r2 = r5.this$0
                        java.util.Map r2 = androidx.compose.material3.MappedInteractionSource.access$getMappedPresses$p(r2)
                        androidx.compose.foundation.interaction.PressInteraction$Release r6 = (androidx.compose.foundation.interaction.PressInteraction.Release) r6
                        androidx.compose.foundation.interaction.PressInteraction$Press r4 = r6.getPress()
                        java.lang.Object r2 = r2.remove(r4)
                        androidx.compose.foundation.interaction.PressInteraction$Press r2 = (androidx.compose.foundation.interaction.PressInteraction.Press) r2
                        if (r2 != 0) goto L89
                        goto L8e
                    L89:
                        androidx.compose.foundation.interaction.PressInteraction$Release r6 = new androidx.compose.foundation.interaction.PressInteraction$Release
                        r6.<init>(r2)
                    L8e:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L97
                        return r1
                    L97:
                        Q5.I r6 = Q5.I.f8786a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.MappedInteractionSource$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, U5.d):java.lang.Object");
                }
            }

            @Override // q6.InterfaceC3821f
            public Object collect(InterfaceC3822g interfaceC3822g, U5.d dVar) {
                Object collect = InterfaceC3821f.this.collect(new AnonymousClass2(interfaceC3822g, this), dVar);
                if (collect == b.e()) {
                    return collect;
                }
                return I.f8786a;
            }
        };
    }
}
