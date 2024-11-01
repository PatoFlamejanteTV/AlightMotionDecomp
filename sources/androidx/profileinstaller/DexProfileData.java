package androidx.profileinstaller;

import androidx.annotation.NonNull;
import java.util.TreeMap;

/* loaded from: classes3.dex */
class DexProfileData {

    @NonNull
    final String apkName;
    int classSetSize;

    @NonNull
    int[] classes;
    final long dexChecksum;

    @NonNull
    final String dexName;
    final int hotMethodRegionSize;
    long mTypeIdCount;

    @NonNull
    final TreeMap<Integer, Integer> methods;
    final int numMethodIds;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DexProfileData(@NonNull String str, @NonNull String str2, long j8, long j9, int i8, int i9, int i10, @NonNull int[] iArr, @NonNull TreeMap<Integer, Integer> treeMap) {
        this.apkName = str;
        this.dexName = str2;
        this.dexChecksum = j8;
        this.mTypeIdCount = j9;
        this.classSetSize = i8;
        this.hotMethodRegionSize = i9;
        this.numMethodIds = i10;
        this.classes = iArr;
        this.methods = treeMap;
    }
}
