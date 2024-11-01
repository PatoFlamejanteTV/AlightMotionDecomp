package androidx.compose.foundation.lazy;

import R5.AbstractC1428l;
import R5.AbstractC1435t;
import R5.C1427k;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import c6.InterfaceC2073o;
import e6.AbstractC2829a;
import i6.C2979g;
import i6.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyListMeasureKt {
    private static final List<LazyListMeasuredItem> calculateItemsOffsets(List<LazyListMeasuredItem> list, List<LazyListMeasuredItem> list2, List<LazyListMeasuredItem> list3, int i8, int i9, int i10, int i11, int i12, boolean z8, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z9, Density density) {
        int i13;
        boolean z10;
        if (z8) {
            i13 = i9;
        } else {
            i13 = i8;
        }
        if (i10 < Math.min(i13, i11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && i12 != 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z10) {
            if (list2.isEmpty() && list3.isEmpty()) {
                int size = list.size();
                int[] iArr = new int[size];
                for (int i14 = 0; i14 < size; i14++) {
                    iArr[i14] = list.get(calculateItemsOffsets$reverseAware(i14, z9, size)).getSize();
                }
                int[] iArr2 = new int[size];
                for (int i15 = 0; i15 < size; i15++) {
                    iArr2[i15] = 0;
                }
                if (z8) {
                    if (vertical != null) {
                        vertical.arrange(density, i13, iArr, iArr2);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                } else if (horizontal != null) {
                    horizontal.arrange(density, i13, iArr, LayoutDirection.Ltr, iArr2);
                } else {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                C2979g e02 = AbstractC1428l.e0(iArr2);
                if (z9) {
                    e02 = m.q(e02);
                }
                int e8 = e02.e();
                int g8 = e02.g();
                int j8 = e02.j();
                if ((j8 > 0 && e8 <= g8) || (j8 < 0 && g8 <= e8)) {
                    while (true) {
                        int i16 = iArr2[e8];
                        LazyListMeasuredItem lazyListMeasuredItem = list.get(calculateItemsOffsets$reverseAware(e8, z9, size));
                        if (z9) {
                            i16 = (i13 - i16) - lazyListMeasuredItem.getSize();
                        }
                        lazyListMeasuredItem.position(i16, i8, i9);
                        arrayList.add(lazyListMeasuredItem);
                        if (e8 == g8) {
                            break;
                        }
                        e8 += j8;
                    }
                }
            } else {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
        } else {
            int size2 = list2.size();
            int i17 = i12;
            for (int i18 = 0; i18 < size2; i18++) {
                LazyListMeasuredItem lazyListMeasuredItem2 = list2.get(i18);
                i17 -= lazyListMeasuredItem2.getSizeWithSpacings();
                lazyListMeasuredItem2.position(i17, i8, i9);
                arrayList.add(lazyListMeasuredItem2);
            }
            int size3 = list.size();
            int i19 = i12;
            for (int i20 = 0; i20 < size3; i20++) {
                LazyListMeasuredItem lazyListMeasuredItem3 = list.get(i20);
                lazyListMeasuredItem3.position(i19, i8, i9);
                arrayList.add(lazyListMeasuredItem3);
                i19 += lazyListMeasuredItem3.getSizeWithSpacings();
            }
            int size4 = list3.size();
            for (int i21 = 0; i21 < size4; i21++) {
                LazyListMeasuredItem lazyListMeasuredItem4 = list3.get(i21);
                lazyListMeasuredItem4.position(i19, i8, i9);
                arrayList.add(lazyListMeasuredItem4);
                i19 += lazyListMeasuredItem4.getSizeWithSpacings();
            }
        }
        return arrayList;
    }

    private static final int calculateItemsOffsets$reverseAware(int i8, boolean z8, int i9) {
        return !z8 ? i8 : (i9 - i8) - 1;
    }

    private static final List<LazyListMeasuredItem> createItemsAfterList(List<LazyListMeasuredItem> list, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i8, int i9, List<Integer> list2) {
        int min = Math.min(((LazyListMeasuredItem) AbstractC1435t.y0(list)).getIndex() + i9, i8 - 1);
        int index = ((LazyListMeasuredItem) AbstractC1435t.y0(list)).getIndex() + 1;
        ArrayList arrayList = null;
        if (index <= min) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyListMeasuredItemProvider.getAndMeasure(index));
                if (index == min) {
                    break;
                }
                index++;
            }
        }
        int size = list2.size();
        for (int i10 = 0; i10 < size; i10++) {
            int intValue = list2.get(i10).intValue();
            if (intValue > min) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyListMeasuredItemProvider.getAndMeasure(intValue));
            }
        }
        if (arrayList == null) {
            return AbstractC1435t.m();
        }
        return arrayList;
    }

    private static final List<LazyListMeasuredItem> createItemsBeforeList(int i8, LazyListMeasuredItemProvider lazyListMeasuredItemProvider, int i9, List<Integer> list) {
        int max = Math.max(0, i8 - i9);
        int i10 = i8 - 1;
        ArrayList arrayList = null;
        if (max <= i10) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyListMeasuredItemProvider.getAndMeasure(i10));
                if (i10 == max) {
                    break;
                }
                i10--;
            }
        }
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            int intValue = list.get(i11).intValue();
            if (intValue < max) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(lazyListMeasuredItemProvider.getAndMeasure(intValue));
            }
        }
        if (arrayList == null) {
            return AbstractC1435t.m();
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: measureLazyList-CD5nmq0, reason: not valid java name */
    public static final LazyListMeasureResult m682measureLazyListCD5nmq0(int i8, LazyListMeasuredItemProvider measuredItemProvider, int i9, int i10, int i11, int i12, int i13, int i14, float f8, long j8, boolean z8, List<Integer> headerIndexes, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, boolean z9, Density density, LazyListItemPlacementAnimator placementAnimator, int i15, List<Integer> pinnedItems, InterfaceC2073o layout) {
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        LazyListMeasuredItem lazyListMeasuredItem;
        int i23;
        LazyListMeasuredItem lazyListMeasuredItem2;
        List<LazyListMeasuredItem> list;
        int i24;
        int i25;
        AbstractC3292y.i(measuredItemProvider, "measuredItemProvider");
        AbstractC3292y.i(headerIndexes, "headerIndexes");
        AbstractC3292y.i(density, "density");
        AbstractC3292y.i(placementAnimator, "placementAnimator");
        AbstractC3292y.i(pinnedItems, "pinnedItems");
        AbstractC3292y.i(layout, "layout");
        if (i10 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i11 < 0) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (i8 <= 0) {
            return new LazyListMeasureResult(null, 0, false, 0.0f, (MeasureResult) layout.invoke(Integer.valueOf(Constraints.m5125getMinWidthimpl(j8)), Integer.valueOf(Constraints.m5124getMinHeightimpl(j8)), LazyListMeasureKt$measureLazyList$1.INSTANCE), AbstractC1435t.m(), -i10, i9 + i11, 0, z9, z8 ? Orientation.Vertical : Orientation.Horizontal, i11, i12);
        }
        int i26 = i13;
        if (i26 >= i8) {
            i26 = i8 - 1;
            i16 = 0;
        } else {
            i16 = i14;
        }
        int d8 = AbstractC2829a.d(f8);
        int i27 = i16 - d8;
        if (i26 == 0 && i27 < 0) {
            d8 += i27;
            i27 = 0;
        }
        C1427k c1427k = new C1427k();
        int i28 = -i10;
        int i29 = i28 + (i12 < 0 ? i12 : 0);
        int i30 = i27 + i29;
        int i31 = 0;
        while (i30 < 0 && i26 > 0) {
            int i32 = i26 - 1;
            LazyListMeasuredItem andMeasure = measuredItemProvider.getAndMeasure(i32);
            c1427k.add(0, andMeasure);
            i31 = Math.max(i31, andMeasure.getCrossAxisSize());
            i30 += andMeasure.getSizeWithSpacings();
            i26 = i32;
        }
        if (i30 < i29) {
            d8 += i30;
            i30 = i29;
        }
        int i33 = i30 - i29;
        int i34 = i9 + i11;
        int i35 = i31;
        int i36 = i26;
        int d9 = m.d(i34, 0);
        int i37 = -i33;
        int size = c1427k.size();
        int i38 = i36;
        int i39 = i33;
        for (int i40 = 0; i40 < size; i40++) {
            i38++;
            i37 += ((LazyListMeasuredItem) c1427k.get(i40)).getSizeWithSpacings();
        }
        int i41 = i35;
        int i42 = i37;
        int i43 = i38;
        while (i43 < i8 && (i42 < d9 || i42 <= 0 || c1427k.isEmpty())) {
            int i44 = d9;
            LazyListMeasuredItem andMeasure2 = measuredItemProvider.getAndMeasure(i43);
            i42 += andMeasure2.getSizeWithSpacings();
            if (i42 <= i29) {
                i24 = i29;
                if (i43 != i8 - 1) {
                    i25 = i43 + 1;
                    i39 -= andMeasure2.getSizeWithSpacings();
                    i43++;
                    i36 = i25;
                    d9 = i44;
                    i29 = i24;
                }
            } else {
                i24 = i29;
            }
            int max = Math.max(i41, andMeasure2.getCrossAxisSize());
            c1427k.add(andMeasure2);
            i41 = max;
            i25 = i36;
            i43++;
            i36 = i25;
            d9 = i44;
            i29 = i24;
        }
        if (i42 < i9) {
            int i45 = i9 - i42;
            int i46 = i42 + i45;
            int i47 = i36;
            i21 = i39 - i45;
            while (i21 < i10 && i47 > 0) {
                int i48 = i34;
                int i49 = i47 - 1;
                int i50 = i43;
                LazyListMeasuredItem andMeasure3 = measuredItemProvider.getAndMeasure(i49);
                c1427k.add(0, andMeasure3);
                i41 = Math.max(i41, andMeasure3.getCrossAxisSize());
                i21 += andMeasure3.getSizeWithSpacings();
                i47 = i49;
                i34 = i48;
                i43 = i50;
            }
            i17 = i34;
            i18 = i43;
            int i51 = d8 + i45;
            if (i21 < 0) {
                i19 = i46 + i21;
                i20 = i51 + i21;
                i22 = i47;
                i21 = 0;
            } else {
                i19 = i46;
                i20 = i51;
                i22 = i47;
            }
        } else {
            i17 = i34;
            i18 = i43;
            i19 = i42;
            i20 = d8;
            i21 = i39;
            i22 = i36;
        }
        int i52 = i41;
        float f9 = (AbstractC2829a.a(AbstractC2829a.d(f8)) != AbstractC2829a.a(i20) || Math.abs(AbstractC2829a.d(f8)) < Math.abs(i20)) ? f8 : i20;
        if (i21 >= 0) {
            int i53 = -i21;
            LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) c1427k.first();
            if (i10 > 0 || i12 < 0) {
                int size2 = c1427k.size();
                int i54 = i21;
                int i55 = 0;
                while (true) {
                    if (i55 >= size2) {
                        lazyListMeasuredItem = lazyListMeasuredItem3;
                        break;
                    }
                    lazyListMeasuredItem = lazyListMeasuredItem3;
                    int sizeWithSpacings = ((LazyListMeasuredItem) c1427k.get(i55)).getSizeWithSpacings();
                    if (i54 == 0 || sizeWithSpacings > i54) {
                        break;
                    }
                    int i56 = size2;
                    if (i55 == AbstractC1435t.o(c1427k)) {
                        break;
                    }
                    i54 -= sizeWithSpacings;
                    i55++;
                    lazyListMeasuredItem3 = (LazyListMeasuredItem) c1427k.get(i55);
                    size2 = i56;
                }
                i23 = i54;
                lazyListMeasuredItem2 = lazyListMeasuredItem;
            } else {
                lazyListMeasuredItem2 = lazyListMeasuredItem3;
                i23 = i21;
            }
            List<LazyListMeasuredItem> createItemsBeforeList = createItemsBeforeList(i22, measuredItemProvider, i15, pinnedItems);
            int i57 = i52;
            int i58 = 0;
            for (int size3 = createItemsBeforeList.size(); i58 < size3; size3 = size3) {
                i57 = Math.max(i57, createItemsBeforeList.get(i58).getCrossAxisSize());
                i58++;
            }
            List<LazyListMeasuredItem> createItemsAfterList = createItemsAfterList(c1427k, measuredItemProvider, i8, i15, pinnedItems);
            int size4 = createItemsAfterList.size();
            for (int i59 = 0; i59 < size4; i59++) {
                i57 = Math.max(i57, createItemsAfterList.get(i59).getCrossAxisSize());
            }
            boolean z10 = AbstractC3292y.d(lazyListMeasuredItem2, c1427k.first()) && createItemsBeforeList.isEmpty() && createItemsAfterList.isEmpty();
            int m5137constrainWidthK40F9xA = ConstraintsKt.m5137constrainWidthK40F9xA(j8, z8 ? i57 : i19);
            if (z8) {
                i57 = i19;
            }
            int m5136constrainHeightK40F9xA = ConstraintsKt.m5136constrainHeightK40F9xA(j8, i57);
            int i60 = i17;
            int i61 = i18;
            List<LazyListMeasuredItem> calculateItemsOffsets = calculateItemsOffsets(c1427k, createItemsBeforeList, createItemsAfterList, m5137constrainWidthK40F9xA, m5136constrainHeightK40F9xA, i19, i9, i53, z8, vertical, horizontal, z9, density);
            int i62 = i19;
            float f10 = f9;
            LazyListMeasuredItem lazyListMeasuredItem4 = lazyListMeasuredItem2;
            placementAnimator.onMeasured((int) f9, m5137constrainWidthK40F9xA, m5136constrainHeightK40F9xA, calculateItemsOffsets, measuredItemProvider, z8);
            LazyListMeasuredItem findOrComposeLazyListHeader = headerIndexes.isEmpty() ^ true ? LazyListHeadersKt.findOrComposeLazyListHeader(calculateItemsOffsets, measuredItemProvider, headerIndexes, i10, m5137constrainWidthK40F9xA, m5136constrainHeightK40F9xA) : null;
            boolean z11 = i61 < i8 || i62 > i9;
            MeasureResult measureResult = (MeasureResult) layout.invoke(Integer.valueOf(m5137constrainWidthK40F9xA), Integer.valueOf(m5136constrainHeightK40F9xA), new LazyListMeasureKt$measureLazyList$5(calculateItemsOffsets, findOrComposeLazyListHeader));
            if (z10) {
                list = calculateItemsOffsets;
            } else {
                ArrayList arrayList = new ArrayList(calculateItemsOffsets.size());
                int size5 = calculateItemsOffsets.size();
                for (int i63 = 0; i63 < size5; i63++) {
                    LazyListMeasuredItem lazyListMeasuredItem5 = calculateItemsOffsets.get(i63);
                    LazyListMeasuredItem lazyListMeasuredItem6 = lazyListMeasuredItem5;
                    if ((lazyListMeasuredItem6.getIndex() >= ((LazyListMeasuredItem) c1427k.first()).getIndex() && lazyListMeasuredItem6.getIndex() <= ((LazyListMeasuredItem) c1427k.last()).getIndex()) || lazyListMeasuredItem6 == findOrComposeLazyListHeader) {
                        arrayList.add(lazyListMeasuredItem5);
                    }
                }
                list = arrayList;
            }
            return new LazyListMeasureResult(lazyListMeasuredItem4, i23, z11, f10, measureResult, list, i28, i60, i8, z9, z8 ? Orientation.Vertical : Orientation.Horizontal, i11, i12);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }
}
