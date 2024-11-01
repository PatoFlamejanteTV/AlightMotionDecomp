package androidx.compose.ui.text.android;

/* loaded from: classes.dex */
final class HorizontalPositionCache {
    private int cachedKey = -1;
    private float cachedValue;
    private final TextLayout layout;

    public HorizontalPositionCache(TextLayout textLayout) {
        this.layout = textLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final float get(int r6, boolean r7, boolean r8, boolean r9) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            if (r7 == 0) goto L1f
            androidx.compose.ui.text.android.TextLayout r2 = r5.layout
            android.text.Layout r2 = r2.getLayout()
            int r2 = androidx.compose.ui.text.android.LayoutCompatKt.getLineForOffset(r2, r6, r7)
            androidx.compose.ui.text.android.TextLayout r3 = r5.layout
            int r3 = r3.getLineStart(r2)
            androidx.compose.ui.text.android.TextLayout r4 = r5.layout
            int r2 = r4.getLineEnd(r2)
            if (r6 == r3) goto L21
            if (r6 != r2) goto L1f
            goto L21
        L1f:
            r2 = 0
            goto L22
        L21:
            r2 = 1
        L22:
            int r3 = r6 * 4
            if (r9 == 0) goto L2a
            if (r2 == 0) goto L2f
            r0 = 0
            goto L2f
        L2a:
            if (r2 == 0) goto L2e
            r0 = 2
            goto L2f
        L2e:
            r0 = 3
        L2f:
            int r3 = r3 + r0
            int r0 = r5.cachedKey
            if (r0 != r3) goto L37
            float r6 = r5.cachedValue
            return r6
        L37:
            if (r9 == 0) goto L40
            androidx.compose.ui.text.android.TextLayout r9 = r5.layout
            float r6 = r9.getPrimaryHorizontal(r6, r7)
            goto L46
        L40:
            androidx.compose.ui.text.android.TextLayout r9 = r5.layout
            float r6 = r9.getSecondaryHorizontal(r6, r7)
        L46:
            if (r8 == 0) goto L4c
            r5.cachedKey = r3
            r5.cachedValue = r6
        L4c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.android.HorizontalPositionCache.get(int, boolean, boolean, boolean):float");
    }

    public final TextLayout getLayout() {
        return this.layout;
    }

    public final float getPrimaryDownstream(int i8) {
        return get(i8, false, false, true);
    }

    public final float getPrimaryUpstream(int i8) {
        return get(i8, true, true, true);
    }

    public final float getSecondaryDownstream(int i8) {
        return get(i8, false, false, false);
    }

    public final float getSecondaryUpstream(int i8) {
        return get(i8, true, true, false);
    }
}
