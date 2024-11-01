package androidx.compose.ui.layout;

/* loaded from: classes.dex */
public interface GraphicLayerInfo {

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static long getOwnerViewId(GraphicLayerInfo graphicLayerInfo) {
            long a9;
            a9 = a.a(graphicLayerInfo);
            return a9;
        }
    }

    long getLayerId();

    long getOwnerViewId();
}
