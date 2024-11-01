package androidx.compose.material;

import Q5.I;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import c6.InterfaceC2072n;
import java.util.Iterator;
import k6.AbstractC3258j;
import k6.InterfaceC3255g;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

@Immutable
/* loaded from: classes.dex */
public final class DropdownMenuPositionProvider implements PopupPositionProvider {
    private final long contentOffset;
    private final Density density;
    private final InterfaceC2072n onPositionCalculated;

    /* renamed from: androidx.compose.material.DropdownMenuPositionProvider$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends AbstractC3293z implements InterfaceC2072n {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(2);
        }

        public final void invoke(IntRect intRect, IntRect intRect2) {
            AbstractC3292y.i(intRect, "<anonymous parameter 0>");
            AbstractC3292y.i(intRect2, "<anonymous parameter 1>");
        }

        @Override // c6.InterfaceC2072n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((IntRect) obj, (IntRect) obj2);
            return I.f8786a;
        }
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j8, Density density, InterfaceC2072n interfaceC2072n, AbstractC3284p abstractC3284p) {
        this(j8, density, interfaceC2072n);
    }

    /* renamed from: copy-rOJDEFc$default, reason: not valid java name */
    public static /* synthetic */ DropdownMenuPositionProvider m1211copyrOJDEFc$default(DropdownMenuPositionProvider dropdownMenuPositionProvider, long j8, Density density, InterfaceC2072n interfaceC2072n, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = dropdownMenuPositionProvider.contentOffset;
        }
        if ((i8 & 2) != 0) {
            density = dropdownMenuPositionProvider.density;
        }
        if ((i8 & 4) != 0) {
            interfaceC2072n = dropdownMenuPositionProvider.onPositionCalculated;
        }
        return dropdownMenuPositionProvider.m1213copyrOJDEFc(j8, density, interfaceC2072n);
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo987calculatePositionllwVHH4(IntRect anchorBounds, long j8, LayoutDirection layoutDirection, long j9) {
        InterfaceC3255g k8;
        Object obj;
        Object obj2;
        AbstractC3292y.i(anchorBounds, "anchorBounds");
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        int mo419roundToPx0680j_4 = this.density.mo419roundToPx0680j_4(MenuKt.getMenuVerticalMargin());
        int mo419roundToPx0680j_42 = this.density.mo419roundToPx0680j_4(DpOffset.m5216getXD9Ej5fM(this.contentOffset));
        int mo419roundToPx0680j_43 = this.density.mo419roundToPx0680j_4(DpOffset.m5218getYD9Ej5fM(this.contentOffset));
        int left = anchorBounds.getLeft() + mo419roundToPx0680j_42;
        int right = (anchorBounds.getRight() - mo419roundToPx0680j_42) - IntSize.m5321getWidthimpl(j9);
        int m5321getWidthimpl = IntSize.m5321getWidthimpl(j8) - IntSize.m5321getWidthimpl(j9);
        if (layoutDirection == LayoutDirection.Ltr) {
            Integer valueOf = Integer.valueOf(left);
            Integer valueOf2 = Integer.valueOf(right);
            if (anchorBounds.getLeft() < 0) {
                m5321getWidthimpl = 0;
            }
            k8 = AbstractC3258j.k(valueOf, valueOf2, Integer.valueOf(m5321getWidthimpl));
        } else {
            Integer valueOf3 = Integer.valueOf(right);
            Integer valueOf4 = Integer.valueOf(left);
            if (anchorBounds.getRight() <= IntSize.m5321getWidthimpl(j8)) {
                m5321getWidthimpl = 0;
            }
            k8 = AbstractC3258j.k(valueOf3, valueOf4, Integer.valueOf(m5321getWidthimpl));
        }
        Iterator it = k8.iterator();
        while (true) {
            obj = null;
            if (it.hasNext()) {
                obj2 = it.next();
                int intValue = ((Number) obj2).intValue();
                if (intValue >= 0 && intValue + IntSize.m5321getWidthimpl(j9) <= IntSize.m5321getWidthimpl(j8)) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        Integer num = (Integer) obj2;
        if (num != null) {
            right = num.intValue();
        }
        int max = Math.max(anchorBounds.getBottom() + mo419roundToPx0680j_43, mo419roundToPx0680j_4);
        int top = (anchorBounds.getTop() - mo419roundToPx0680j_43) - IntSize.m5320getHeightimpl(j9);
        Iterator it2 = AbstractC3258j.k(Integer.valueOf(max), Integer.valueOf(top), Integer.valueOf(anchorBounds.getTop() - (IntSize.m5320getHeightimpl(j9) / 2)), Integer.valueOf((IntSize.m5320getHeightimpl(j8) - IntSize.m5320getHeightimpl(j9)) - mo419roundToPx0680j_4)).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            int intValue2 = ((Number) next).intValue();
            if (intValue2 >= mo419roundToPx0680j_4 && intValue2 + IntSize.m5320getHeightimpl(j9) <= IntSize.m5320getHeightimpl(j8) - mo419roundToPx0680j_4) {
                obj = next;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            top = num2.intValue();
        }
        this.onPositionCalculated.invoke(anchorBounds, new IntRect(right, top, IntSize.m5321getWidthimpl(j9) + right, IntSize.m5320getHeightimpl(j9) + top));
        return IntOffsetKt.IntOffset(right, top);
    }

    /* renamed from: component1-RKDOV3M, reason: not valid java name */
    public final long m1212component1RKDOV3M() {
        return this.contentOffset;
    }

    public final Density component2() {
        return this.density;
    }

    public final InterfaceC2072n component3() {
        return this.onPositionCalculated;
    }

    /* renamed from: copy-rOJDEFc, reason: not valid java name */
    public final DropdownMenuPositionProvider m1213copyrOJDEFc(long j8, Density density, InterfaceC2072n onPositionCalculated) {
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(onPositionCalculated, "onPositionCalculated");
        return new DropdownMenuPositionProvider(j8, density, onPositionCalculated, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DropdownMenuPositionProvider)) {
            return false;
        }
        DropdownMenuPositionProvider dropdownMenuPositionProvider = (DropdownMenuPositionProvider) obj;
        return DpOffset.m5215equalsimpl0(this.contentOffset, dropdownMenuPositionProvider.contentOffset) && AbstractC3292y.d(this.density, dropdownMenuPositionProvider.density) && AbstractC3292y.d(this.onPositionCalculated, dropdownMenuPositionProvider.onPositionCalculated);
    }

    /* renamed from: getContentOffset-RKDOV3M, reason: not valid java name */
    public final long m1214getContentOffsetRKDOV3M() {
        return this.contentOffset;
    }

    public final Density getDensity() {
        return this.density;
    }

    public final InterfaceC2072n getOnPositionCalculated() {
        return this.onPositionCalculated;
    }

    public int hashCode() {
        return (((DpOffset.m5220hashCodeimpl(this.contentOffset) * 31) + this.density.hashCode()) * 31) + this.onPositionCalculated.hashCode();
    }

    public String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) DpOffset.m5223toStringimpl(this.contentOffset)) + ", density=" + this.density + ", onPositionCalculated=" + this.onPositionCalculated + ')';
    }

    private DropdownMenuPositionProvider(long j8, Density density, InterfaceC2072n onPositionCalculated) {
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(onPositionCalculated, "onPositionCalculated");
        this.contentOffset = j8;
        this.density = density;
        this.onPositionCalculated = onPositionCalculated;
    }

    public /* synthetic */ DropdownMenuPositionProvider(long j8, Density density, InterfaceC2072n interfaceC2072n, int i8, AbstractC3284p abstractC3284p) {
        this(j8, density, (i8 & 4) != 0 ? AnonymousClass1.INSTANCE : interfaceC2072n, null);
    }
}
