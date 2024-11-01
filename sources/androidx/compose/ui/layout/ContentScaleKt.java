package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Size;

/* loaded from: classes.dex */
public final class ContentScaleKt {
    /* renamed from: access$computeFillHeight-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m4100access$computeFillHeightiLBOSCw(long j8, long j9) {
        return m4104computeFillHeightiLBOSCw(j8, j9);
    }

    /* renamed from: access$computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m4101access$computeFillMaxDimensioniLBOSCw(long j8, long j9) {
        return m4105computeFillMaxDimensioniLBOSCw(j8, j9);
    }

    /* renamed from: access$computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m4102access$computeFillMinDimensioniLBOSCw(long j8, long j9) {
        return m4106computeFillMinDimensioniLBOSCw(j8, j9);
    }

    /* renamed from: access$computeFillWidth-iLBOSCw, reason: not valid java name */
    public static final /* synthetic */ float m4103access$computeFillWidthiLBOSCw(long j8, long j9) {
        return m4107computeFillWidthiLBOSCw(j8, j9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillHeight-iLBOSCw, reason: not valid java name */
    public static final float m4104computeFillHeightiLBOSCw(long j8, long j9) {
        return Size.m2778getHeightimpl(j9) / Size.m2778getHeightimpl(j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMaxDimension-iLBOSCw, reason: not valid java name */
    public static final float m4105computeFillMaxDimensioniLBOSCw(long j8, long j9) {
        return Math.max(m4107computeFillWidthiLBOSCw(j8, j9), m4104computeFillHeightiLBOSCw(j8, j9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillMinDimension-iLBOSCw, reason: not valid java name */
    public static final float m4106computeFillMinDimensioniLBOSCw(long j8, long j9) {
        return Math.min(m4107computeFillWidthiLBOSCw(j8, j9), m4104computeFillHeightiLBOSCw(j8, j9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: computeFillWidth-iLBOSCw, reason: not valid java name */
    public static final float m4107computeFillWidthiLBOSCw(long j8, long j9) {
        return Size.m2781getWidthimpl(j9) / Size.m2781getWidthimpl(j8);
    }
}
