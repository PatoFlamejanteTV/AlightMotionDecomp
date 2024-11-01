package androidx.constraintlayout.motion.widget;

/* loaded from: classes.dex */
interface ProxyInterface {
    int designAccess(int i8, String str, Object obj, float[] fArr, int i9, float[] fArr2, int i10);

    float getKeyFramePosition(Object obj, int i8, float f8, float f9);

    Object getKeyframeAtLocation(Object obj, float f8, float f9);

    Boolean getPositionKeyframe(Object obj, Object obj2, float f8, float f9, String[] strArr, float[] fArr);

    long getTransitionTimeMs();

    void setAttributes(int i8, String str, Object obj, Object obj2);

    void setKeyFrame(Object obj, int i8, String str, Object obj2);

    boolean setKeyFramePosition(Object obj, int i8, int i9, float f8, float f9);

    void setToolPosition(float f8);
}
