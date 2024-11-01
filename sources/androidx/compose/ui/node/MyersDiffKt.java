package androidx.compose.ui.node;

/* loaded from: classes.dex */
public final class MyersDiffKt {
    public static final /* synthetic */ void access$swap(int[] iArr, int i8, int i9) {
        swap(iArr, i8, i9);
    }

    private static final void applyDiff(IntStack intStack, DiffCallback diffCallback) {
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i8 < intStack.getSize()) {
            int i11 = i8 + 2;
            int i12 = intStack.get(i8) - intStack.get(i11);
            int i13 = intStack.get(i8 + 1) - intStack.get(i11);
            int i14 = intStack.get(i11);
            i8 += 3;
            while (i9 < i12) {
                diffCallback.remove(i10, i9);
                i9++;
            }
            while (i10 < i13) {
                diffCallback.insert(i10);
                i10++;
            }
            while (true) {
                int i15 = i14 - 1;
                if (i14 > 0) {
                    diffCallback.same(i9, i10);
                    i9++;
                    i10++;
                    i14 = i15;
                }
            }
        }
    }

    /* renamed from: backward-4l5_RBY, reason: not valid java name */
    private static final boolean m4273backward4l5_RBY(int i8, int i9, int i10, int i11, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i12, int[] iArr3) {
        boolean z8;
        int m4193getimpl;
        int i13;
        int i14;
        int i15;
        int i16 = (i9 - i8) - (i11 - i10);
        if (i16 % 2 == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i17 = -i12;
        for (int i18 = i17; i18 <= i12; i18 += 2) {
            if (i18 != i17 && (i18 == i12 || CenteredArray.m4193getimpl(iArr2, i18 + 1) >= CenteredArray.m4193getimpl(iArr2, i18 - 1))) {
                m4193getimpl = CenteredArray.m4193getimpl(iArr2, i18 - 1);
                i13 = m4193getimpl - 1;
            } else {
                m4193getimpl = CenteredArray.m4193getimpl(iArr2, i18 + 1);
                i13 = m4193getimpl;
            }
            int i19 = i11 - ((i9 - i13) - i18);
            if (i12 != 0 && i13 == m4193getimpl) {
                i14 = i19 + 1;
            } else {
                i14 = i19;
            }
            while (i13 > i8 && i19 > i10) {
                if (!diffCallback.areItemsTheSame(i13 - 1, i19 - 1)) {
                    break;
                }
                i13--;
                i19--;
            }
            CenteredArray.m4196setimpl(iArr2, i18, i13);
            if (z8 && (i15 = i16 - i18) >= i17 && i15 <= i12) {
                if (CenteredArray.m4193getimpl(iArr, i15) >= i13) {
                    fillSnake(i13, i19, m4193getimpl, i14, true, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    private static final IntStack calculateDiff(int i8, int i9, DiffCallback diffCallback) {
        int i10 = ((i8 + i9) + 1) / 2;
        IntStack intStack = new IntStack(i10 * 3);
        IntStack intStack2 = new IntStack(i10 * 4);
        intStack2.pushRange(0, i8, 0, i9);
        int i11 = (i10 * 2) + 1;
        int[] m4190constructorimpl = CenteredArray.m4190constructorimpl(new int[i11]);
        int[] m4190constructorimpl2 = CenteredArray.m4190constructorimpl(new int[i11]);
        int[] m4380constructorimpl = Snake.m4380constructorimpl(new int[5]);
        while (intStack2.isNotEmpty()) {
            int pop = intStack2.pop();
            int pop2 = intStack2.pop();
            int pop3 = intStack2.pop();
            int pop4 = intStack2.pop();
            int[] iArr = m4190constructorimpl;
            int[] iArr2 = m4190constructorimpl2;
            if (m4275midPointq5eDKzI(pop4, pop3, pop2, pop, diffCallback, m4190constructorimpl, m4190constructorimpl2, m4380constructorimpl)) {
                if (Snake.m4383getDiagonalSizeimpl(m4380constructorimpl) > 0) {
                    Snake.m4378addDiagonalToStackimpl(m4380constructorimpl, intStack);
                }
                intStack2.pushRange(pop4, Snake.m4388getStartXimpl(m4380constructorimpl), pop2, Snake.m4389getStartYimpl(m4380constructorimpl));
                intStack2.pushRange(Snake.m4384getEndXimpl(m4380constructorimpl), pop3, Snake.m4385getEndYimpl(m4380constructorimpl), pop);
            }
            m4190constructorimpl = iArr;
            m4190constructorimpl2 = iArr2;
        }
        intStack.sortDiagonals();
        intStack.pushDiagonal(i8, i9, 0);
        return intStack;
    }

    public static final void executeDiff(int i8, int i9, DiffCallback diffCallback) {
        applyDiff(calculateDiff(i8, i9, diffCallback), diffCallback);
    }

    public static final void fillSnake(int i8, int i9, int i10, int i11, boolean z8, int[] iArr) {
        iArr[0] = i8;
        iArr[1] = i9;
        iArr[2] = i10;
        iArr[3] = i11;
        iArr[4] = z8 ? 1 : 0;
    }

    /* renamed from: forward-4l5_RBY, reason: not valid java name */
    private static final boolean m4274forward4l5_RBY(int i8, int i9, int i10, int i11, DiffCallback diffCallback, int[] iArr, int[] iArr2, int i12, int[] iArr3) {
        boolean z8;
        int m4193getimpl;
        int i13;
        int i14;
        int i15 = (i9 - i8) - (i11 - i10);
        if (Math.abs(i15) % 2 == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i16 = -i12;
        for (int i17 = i16; i17 <= i12; i17 += 2) {
            if (i17 != i16 && (i17 == i12 || CenteredArray.m4193getimpl(iArr, i17 + 1) <= CenteredArray.m4193getimpl(iArr, i17 - 1))) {
                m4193getimpl = CenteredArray.m4193getimpl(iArr, i17 - 1);
                i13 = m4193getimpl + 1;
            } else {
                m4193getimpl = CenteredArray.m4193getimpl(iArr, i17 + 1);
                i13 = m4193getimpl;
            }
            int i18 = (i10 + (i13 - i8)) - i17;
            int i19 = (i12 != 0 && i13 == m4193getimpl) ? i18 - 1 : i18;
            while (i13 < i9 && i18 < i11) {
                if (!diffCallback.areItemsTheSame(i13, i18)) {
                    break;
                }
                i13++;
                i18++;
            }
            CenteredArray.m4196setimpl(iArr, i17, i13);
            if (z8 && (i14 = i15 - i17) >= i16 + 1 && i14 <= i12 - 1) {
                if (CenteredArray.m4193getimpl(iArr2, i14) <= i13) {
                    fillSnake(m4193getimpl, i19, i13, i18, false, iArr3);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: midPoint-q5eDKzI, reason: not valid java name */
    private static final boolean m4275midPointq5eDKzI(int i8, int i9, int i10, int i11, DiffCallback diffCallback, int[] iArr, int[] iArr2, int[] iArr3) {
        int i12 = i9 - i8;
        int i13 = i11 - i10;
        if (i12 >= 1 && i13 >= 1) {
            int i14 = ((i12 + i13) + 1) / 2;
            CenteredArray.m4196setimpl(iArr, 1, i8);
            CenteredArray.m4196setimpl(iArr2, 1, i9);
            int i15 = 0;
            while (i15 < i14) {
                int i16 = i15;
                if (m4274forward4l5_RBY(i8, i9, i10, i11, diffCallback, iArr, iArr2, i15, iArr3) || m4273backward4l5_RBY(i8, i9, i10, i11, diffCallback, iArr, iArr2, i16, iArr3)) {
                    return true;
                }
                i15 = i16 + 1;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void swap(int[] iArr, int i8, int i9) {
        int i10 = iArr[i8];
        iArr[i8] = iArr[i9];
        iArr[i9] = i10;
    }
}
