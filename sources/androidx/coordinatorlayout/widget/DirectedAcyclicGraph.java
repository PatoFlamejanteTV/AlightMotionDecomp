package androidx.coordinatorlayout.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes.dex */
public final class DirectedAcyclicGraph<T> {
    private final Pools.Pool<ArrayList<T>> mListPool = new Pools.SimplePool(10);
    private final SimpleArrayMap<T, ArrayList<T>> mGraph = new SimpleArrayMap<>();
    private final ArrayList<T> mSortResult = new ArrayList<>();
    private final HashSet<T> mSortTmpMarked = new HashSet<>();

    private void dfs(T t8, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (arrayList.contains(t8)) {
            return;
        }
        if (!hashSet.contains(t8)) {
            hashSet.add(t8);
            ArrayList<T> arrayList2 = this.mGraph.get(t8);
            if (arrayList2 != null) {
                int size = arrayList2.size();
                for (int i8 = 0; i8 < size; i8++) {
                    dfs(arrayList2.get(i8), arrayList, hashSet);
                }
            }
            hashSet.remove(t8);
            arrayList.add(t8);
            return;
        }
        throw new RuntimeException("This graph contains cyclic dependencies");
    }

    @NonNull
    private ArrayList<T> getEmptyList() {
        ArrayList<T> acquire = this.mListPool.acquire();
        if (acquire == null) {
            return new ArrayList<>();
        }
        return acquire;
    }

    private void poolList(@NonNull ArrayList<T> arrayList) {
        arrayList.clear();
        this.mListPool.release(arrayList);
    }

    public void addEdge(@NonNull T t8, @NonNull T t9) {
        if (this.mGraph.containsKey(t8) && this.mGraph.containsKey(t9)) {
            ArrayList<T> arrayList = this.mGraph.get(t8);
            if (arrayList == null) {
                arrayList = getEmptyList();
                this.mGraph.put(t8, arrayList);
            }
            arrayList.add(t9);
            return;
        }
        throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
    }

    public void addNode(@NonNull T t8) {
        if (!this.mGraph.containsKey(t8)) {
            this.mGraph.put(t8, null);
        }
    }

    public void clear() {
        int size = this.mGraph.size();
        for (int i8 = 0; i8 < size; i8++) {
            ArrayList<T> valueAt = this.mGraph.valueAt(i8);
            if (valueAt != null) {
                poolList(valueAt);
            }
        }
        this.mGraph.clear();
    }

    public boolean contains(@NonNull T t8) {
        return this.mGraph.containsKey(t8);
    }

    @Nullable
    public List getIncomingEdges(@NonNull T t8) {
        return this.mGraph.get(t8);
    }

    @Nullable
    public List<T> getOutgoingEdges(@NonNull T t8) {
        int size = this.mGraph.size();
        ArrayList arrayList = null;
        for (int i8 = 0; i8 < size; i8++) {
            ArrayList<T> valueAt = this.mGraph.valueAt(i8);
            if (valueAt != null && valueAt.contains(t8)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.mGraph.keyAt(i8));
            }
        }
        return arrayList;
    }

    @NonNull
    public ArrayList<T> getSortedList() {
        this.mSortResult.clear();
        this.mSortTmpMarked.clear();
        int size = this.mGraph.size();
        for (int i8 = 0; i8 < size; i8++) {
            dfs(this.mGraph.keyAt(i8), this.mSortResult, this.mSortTmpMarked);
        }
        return this.mSortResult;
    }

    public boolean hasOutgoingEdges(@NonNull T t8) {
        int size = this.mGraph.size();
        for (int i8 = 0; i8 < size; i8++) {
            ArrayList<T> valueAt = this.mGraph.valueAt(i8);
            if (valueAt != null && valueAt.contains(t8)) {
                return true;
            }
        }
        return false;
    }

    int size() {
        return this.mGraph.size();
    }
}
