package androidx.constraintlayout.core.state;

/* loaded from: classes.dex */
public interface RegistryCallback {
    String currentLayoutInformation();

    String currentMotionScene();

    long getLastModified();

    void onDimensions(int i8, int i9);

    void onNewMotionScene(String str);

    void onProgress(float f8);

    void setDrawDebug(int i8);

    void setLayoutInformationMode(int i8);
}
