package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/* loaded from: classes3.dex */
public class SortedList<T> {
    private static final int CAPACITY_GROWTH = 10;
    private static final int DELETION = 2;
    private static final int INSERTION = 1;
    public static final int INVALID_POSITION = -1;
    private static final int LOOKUP = 4;
    private static final int MIN_CAPACITY = 10;
    private BatchedCallback mBatchedCallback;
    private Callback mCallback;
    T[] mData;
    private int mNewDataStart;
    private T[] mOldData;
    private int mOldDataSize;
    private int mOldDataStart;
    private int mSize;
    private final Class<T> mTClass;

    /* loaded from: classes3.dex */
    public static class BatchedCallback<T2> extends Callback<T2> {
        private final BatchingListUpdateCallback mBatchingListUpdateCallback;
        final Callback<T2> mWrappedCallback;

        @SuppressLint({"UnknownNullness"})
        public BatchedCallback(Callback<T2> callback) {
            this.mWrappedCallback = callback;
            this.mBatchingListUpdateCallback = new BatchingListUpdateCallback(callback);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areContentsTheSame(T2 t22, T2 t23) {
            return this.mWrappedCallback.areContentsTheSame(t22, t23);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public boolean areItemsTheSame(T2 t22, T2 t23) {
            return this.mWrappedCallback.areItemsTheSame(t22, t23);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, java.util.Comparator
        public int compare(T2 t22, T2 t23) {
            return this.mWrappedCallback.compare(t22, t23);
        }

        public void dispatchLastEvent() {
            this.mBatchingListUpdateCallback.dispatchLastEvent();
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        @Nullable
        public Object getChangePayload(T2 t22, T2 t23) {
            return this.mWrappedCallback.getChangePayload(t22, t23);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback
        public void onChanged(int i8, int i9) {
            this.mBatchingListUpdateCallback.onChanged(i8, i9, null);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onInserted(int i8, int i9) {
            this.mBatchingListUpdateCallback.onInserted(i8, i9);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onMoved(int i8, int i9) {
            this.mBatchingListUpdateCallback.onMoved(i8, i9);
        }

        @Override // androidx.recyclerview.widget.ListUpdateCallback
        public void onRemoved(int i8, int i9) {
            this.mBatchingListUpdateCallback.onRemoved(i8, i9);
        }

        @Override // androidx.recyclerview.widget.SortedList.Callback, androidx.recyclerview.widget.ListUpdateCallback
        @SuppressLint({"UnknownNullness"})
        public void onChanged(int i8, int i9, Object obj) {
            this.mBatchingListUpdateCallback.onChanged(i8, i9, obj);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class Callback<T2> implements Comparator<T2>, ListUpdateCallback {
        public abstract boolean areContentsTheSame(T2 t22, T2 t23);

        public abstract boolean areItemsTheSame(T2 t22, T2 t23);

        @Override // java.util.Comparator
        public abstract int compare(T2 t22, T2 t23);

        @Nullable
        public Object getChangePayload(T2 t22, T2 t23) {
            return null;
        }

        public abstract void onChanged(int i8, int i9);

        @SuppressLint({"UnknownNullness"})
        public void onChanged(int i8, int i9, Object obj) {
            onChanged(i8, i9);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback) {
        this(cls, callback, 10);
    }

    private void addAllInternal(T[] tArr) {
        if (tArr.length < 1) {
            return;
        }
        int sortAndDedup = sortAndDedup(tArr);
        if (this.mSize == 0) {
            this.mData = tArr;
            this.mSize = sortAndDedup;
            this.mCallback.onInserted(0, sortAndDedup);
            return;
        }
        merge(tArr, sortAndDedup);
    }

    private void addToData(int i8, T t8) {
        int i9 = this.mSize;
        if (i8 <= i9) {
            T[] tArr = this.mData;
            if (i9 == tArr.length) {
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, tArr.length + 10));
                System.arraycopy(this.mData, 0, tArr2, 0, i8);
                tArr2[i8] = t8;
                System.arraycopy(this.mData, i8, tArr2, i8 + 1, this.mSize - i8);
                this.mData = tArr2;
            } else {
                System.arraycopy(tArr, i8, tArr, i8 + 1, i9 - i8);
                this.mData[i8] = t8;
            }
            this.mSize++;
            return;
        }
        throw new IndexOutOfBoundsException("cannot add item to " + i8 + " because size is " + this.mSize);
    }

    private T[] copyArray(T[] tArr) {
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, tArr.length));
        System.arraycopy(tArr, 0, tArr2, 0, tArr.length);
        return tArr2;
    }

    private int findIndexOf(T t8, T[] tArr, int i8, int i9, int i10) {
        while (i8 < i9) {
            int i11 = (i8 + i9) / 2;
            T t9 = tArr[i11];
            int compare = this.mCallback.compare(t9, t8);
            if (compare < 0) {
                i8 = i11 + 1;
            } else {
                if (compare == 0) {
                    if (this.mCallback.areItemsTheSame(t9, t8)) {
                        return i11;
                    }
                    int linearEqualitySearch = linearEqualitySearch(t8, i11, i8, i9);
                    if (i10 == 1) {
                        if (linearEqualitySearch != -1) {
                            return linearEqualitySearch;
                        }
                        return i11;
                    }
                    return linearEqualitySearch;
                }
                i9 = i11;
            }
        }
        if (i10 != 1) {
            return -1;
        }
        return i8;
    }

    private int findSameItem(T t8, T[] tArr, int i8, int i9) {
        while (i8 < i9) {
            if (this.mCallback.areItemsTheSame(tArr[i8], t8)) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    private int linearEqualitySearch(T t8, int i8, int i9, int i10) {
        T t9;
        for (int i11 = i8 - 1; i11 >= i9; i11--) {
            T t10 = this.mData[i11];
            if (this.mCallback.compare(t10, t8) != 0) {
                break;
            }
            if (this.mCallback.areItemsTheSame(t10, t8)) {
                return i11;
            }
        }
        do {
            i8++;
            if (i8 < i10) {
                t9 = this.mData[i8];
                if (this.mCallback.compare(t9, t8) != 0) {
                    return -1;
                }
            } else {
                return -1;
            }
        } while (!this.mCallback.areItemsTheSame(t9, t8));
        return i8;
    }

    private void merge(T[] tArr, int i8) {
        boolean z8 = !(this.mCallback instanceof BatchedCallback);
        if (z8) {
            beginBatchedUpdates();
        }
        this.mOldData = this.mData;
        int i9 = 0;
        this.mOldDataStart = 0;
        int i10 = this.mSize;
        this.mOldDataSize = i10;
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, i10 + i8 + 10));
        this.mNewDataStart = 0;
        while (true) {
            int i11 = this.mOldDataStart;
            int i12 = this.mOldDataSize;
            if (i11 >= i12 && i9 >= i8) {
                break;
            }
            if (i11 == i12) {
                int i13 = i8 - i9;
                System.arraycopy(tArr, i9, this.mData, this.mNewDataStart, i13);
                int i14 = this.mNewDataStart + i13;
                this.mNewDataStart = i14;
                this.mSize += i13;
                this.mCallback.onInserted(i14 - i13, i13);
                break;
            }
            if (i9 == i8) {
                int i15 = i12 - i11;
                System.arraycopy(this.mOldData, i11, this.mData, this.mNewDataStart, i15);
                this.mNewDataStart += i15;
                break;
            }
            T t8 = this.mOldData[i11];
            T t9 = tArr[i9];
            int compare = this.mCallback.compare(t8, t9);
            if (compare > 0) {
                T[] tArr2 = this.mData;
                int i16 = this.mNewDataStart;
                this.mNewDataStart = i16 + 1;
                tArr2[i16] = t9;
                this.mSize++;
                i9++;
                this.mCallback.onInserted(i16, 1);
            } else if (compare == 0 && this.mCallback.areItemsTheSame(t8, t9)) {
                T[] tArr3 = this.mData;
                int i17 = this.mNewDataStart;
                this.mNewDataStart = i17 + 1;
                tArr3[i17] = t9;
                i9++;
                this.mOldDataStart++;
                if (!this.mCallback.areContentsTheSame(t8, t9)) {
                    Callback callback = this.mCallback;
                    callback.onChanged(this.mNewDataStart - 1, 1, callback.getChangePayload(t8, t9));
                }
            } else {
                T[] tArr4 = this.mData;
                int i18 = this.mNewDataStart;
                this.mNewDataStart = i18 + 1;
                tArr4[i18] = t8;
                this.mOldDataStart++;
            }
        }
        this.mOldData = null;
        if (z8) {
            endBatchedUpdates();
        }
    }

    private void removeItemAtIndex(int i8, boolean z8) {
        T[] tArr = this.mData;
        System.arraycopy(tArr, i8 + 1, tArr, i8, (this.mSize - i8) - 1);
        int i9 = this.mSize - 1;
        this.mSize = i9;
        this.mData[i9] = null;
        if (z8) {
            this.mCallback.onRemoved(i8, 1);
        }
    }

    private void replaceAllInsert(T t8) {
        T[] tArr = this.mData;
        int i8 = this.mNewDataStart;
        tArr[i8] = t8;
        this.mNewDataStart = i8 + 1;
        this.mSize++;
        this.mCallback.onInserted(i8, 1);
    }

    private void replaceAllInternal(@NonNull T[] tArr) {
        boolean z8 = !(this.mCallback instanceof BatchedCallback);
        if (z8) {
            beginBatchedUpdates();
        }
        this.mOldDataStart = 0;
        this.mOldDataSize = this.mSize;
        this.mOldData = this.mData;
        this.mNewDataStart = 0;
        int sortAndDedup = sortAndDedup(tArr);
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) this.mTClass, sortAndDedup));
        while (true) {
            int i8 = this.mNewDataStart;
            if (i8 >= sortAndDedup && this.mOldDataStart >= this.mOldDataSize) {
                break;
            }
            int i9 = this.mOldDataStart;
            int i10 = this.mOldDataSize;
            if (i9 >= i10) {
                int i11 = sortAndDedup - i8;
                System.arraycopy(tArr, i8, this.mData, i8, i11);
                this.mNewDataStart += i11;
                this.mSize += i11;
                this.mCallback.onInserted(i8, i11);
                break;
            }
            if (i8 >= sortAndDedup) {
                int i12 = i10 - i9;
                this.mSize -= i12;
                this.mCallback.onRemoved(i8, i12);
                break;
            }
            T t8 = this.mOldData[i9];
            T t9 = tArr[i8];
            int compare = this.mCallback.compare(t8, t9);
            if (compare < 0) {
                replaceAllRemove();
            } else if (compare > 0) {
                replaceAllInsert(t9);
            } else if (!this.mCallback.areItemsTheSame(t8, t9)) {
                replaceAllRemove();
                replaceAllInsert(t9);
            } else {
                T[] tArr2 = this.mData;
                int i13 = this.mNewDataStart;
                tArr2[i13] = t9;
                this.mOldDataStart++;
                this.mNewDataStart = i13 + 1;
                if (!this.mCallback.areContentsTheSame(t8, t9)) {
                    Callback callback = this.mCallback;
                    callback.onChanged(this.mNewDataStart - 1, 1, callback.getChangePayload(t8, t9));
                }
            }
        }
        this.mOldData = null;
        if (z8) {
            endBatchedUpdates();
        }
    }

    private void replaceAllRemove() {
        this.mSize--;
        this.mOldDataStart++;
        this.mCallback.onRemoved(this.mNewDataStart, 1);
    }

    private int sortAndDedup(@NonNull T[] tArr) {
        if (tArr.length == 0) {
            return 0;
        }
        Arrays.sort(tArr, this.mCallback);
        int i8 = 1;
        int i9 = 0;
        for (int i10 = 1; i10 < tArr.length; i10++) {
            T t8 = tArr[i10];
            if (this.mCallback.compare(tArr[i9], t8) == 0) {
                int findSameItem = findSameItem(t8, tArr, i9, i8);
                if (findSameItem != -1) {
                    tArr[findSameItem] = t8;
                } else {
                    if (i8 != i10) {
                        tArr[i8] = t8;
                    }
                    i8++;
                }
            } else {
                if (i8 != i10) {
                    tArr[i8] = t8;
                }
                i9 = i8;
                i8++;
            }
        }
        return i8;
    }

    private void throwIfInMutationOperation() {
        if (this.mOldData == null) {
        } else {
            throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
        }
    }

    public int add(T t8) {
        throwIfInMutationOperation();
        return add(t8, true);
    }

    public void addAll(@NonNull T[] tArr, boolean z8) {
        throwIfInMutationOperation();
        if (tArr.length == 0) {
            return;
        }
        if (z8) {
            addAllInternal(tArr);
        } else {
            addAllInternal(copyArray(tArr));
        }
    }

    public void beginBatchedUpdates() {
        throwIfInMutationOperation();
        Callback callback = this.mCallback;
        if (callback instanceof BatchedCallback) {
            return;
        }
        if (this.mBatchedCallback == null) {
            this.mBatchedCallback = new BatchedCallback(callback);
        }
        this.mCallback = this.mBatchedCallback;
    }

    public void clear() {
        throwIfInMutationOperation();
        int i8 = this.mSize;
        if (i8 == 0) {
            return;
        }
        Arrays.fill(this.mData, 0, i8, (Object) null);
        this.mSize = 0;
        this.mCallback.onRemoved(0, i8);
    }

    public void endBatchedUpdates() {
        throwIfInMutationOperation();
        Callback callback = this.mCallback;
        if (callback instanceof BatchedCallback) {
            ((BatchedCallback) callback).dispatchLastEvent();
        }
        Callback callback2 = this.mCallback;
        BatchedCallback batchedCallback = this.mBatchedCallback;
        if (callback2 == batchedCallback) {
            this.mCallback = batchedCallback.mWrappedCallback;
        }
    }

    public T get(int i8) throws IndexOutOfBoundsException {
        int i9;
        if (i8 < this.mSize && i8 >= 0) {
            T[] tArr = this.mOldData;
            if (tArr != null && i8 >= (i9 = this.mNewDataStart)) {
                return tArr[(i8 - i9) + this.mOldDataStart];
            }
            return this.mData[i8];
        }
        throw new IndexOutOfBoundsException("Asked to get item at " + i8 + " but size is " + this.mSize);
    }

    public int indexOf(T t8) {
        if (this.mOldData != null) {
            int findIndexOf = findIndexOf(t8, this.mData, 0, this.mNewDataStart, 4);
            if (findIndexOf != -1) {
                return findIndexOf;
            }
            int findIndexOf2 = findIndexOf(t8, this.mOldData, this.mOldDataStart, this.mOldDataSize, 4);
            if (findIndexOf2 == -1) {
                return -1;
            }
            return (findIndexOf2 - this.mOldDataStart) + this.mNewDataStart;
        }
        return findIndexOf(t8, this.mData, 0, this.mSize, 4);
    }

    public void recalculatePositionOfItemAt(int i8) {
        throwIfInMutationOperation();
        T t8 = get(i8);
        removeItemAtIndex(i8, false);
        int add = add(t8, false);
        if (i8 != add) {
            this.mCallback.onMoved(i8, add);
        }
    }

    public boolean remove(T t8) {
        throwIfInMutationOperation();
        return remove(t8, true);
    }

    public T removeItemAt(int i8) {
        throwIfInMutationOperation();
        T t8 = get(i8);
        removeItemAtIndex(i8, true);
        return t8;
    }

    public void replaceAll(@NonNull T[] tArr, boolean z8) {
        throwIfInMutationOperation();
        if (z8) {
            replaceAllInternal(tArr);
        } else {
            replaceAllInternal(copyArray(tArr));
        }
    }

    public int size() {
        return this.mSize;
    }

    public void updateItemAt(int i8, T t8) {
        boolean z8;
        throwIfInMutationOperation();
        T t9 = get(i8);
        if (t9 != t8 && this.mCallback.areContentsTheSame(t9, t8)) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (t9 != t8 && this.mCallback.compare(t9, t8) == 0) {
            this.mData[i8] = t8;
            if (z8) {
                Callback callback = this.mCallback;
                callback.onChanged(i8, 1, callback.getChangePayload(t9, t8));
                return;
            }
            return;
        }
        if (z8) {
            Callback callback2 = this.mCallback;
            callback2.onChanged(i8, 1, callback2.getChangePayload(t9, t8));
        }
        removeItemAtIndex(i8, false);
        int add = add(t8, false);
        if (i8 != add) {
            this.mCallback.onMoved(i8, add);
        }
    }

    public SortedList(@NonNull Class<T> cls, @NonNull Callback<T> callback, int i8) {
        this.mTClass = cls;
        this.mData = (T[]) ((Object[]) Array.newInstance((Class<?>) cls, i8));
        this.mCallback = callback;
        this.mSize = 0;
    }

    private int add(T t8, boolean z8) {
        int findIndexOf = findIndexOf(t8, this.mData, 0, this.mSize, 1);
        if (findIndexOf == -1) {
            findIndexOf = 0;
        } else if (findIndexOf < this.mSize) {
            T t9 = this.mData[findIndexOf];
            if (this.mCallback.areItemsTheSame(t9, t8)) {
                if (this.mCallback.areContentsTheSame(t9, t8)) {
                    this.mData[findIndexOf] = t8;
                    return findIndexOf;
                }
                this.mData[findIndexOf] = t8;
                Callback callback = this.mCallback;
                callback.onChanged(findIndexOf, 1, callback.getChangePayload(t9, t8));
                return findIndexOf;
            }
        }
        addToData(findIndexOf, t8);
        if (z8) {
            this.mCallback.onInserted(findIndexOf, 1);
        }
        return findIndexOf;
    }

    private boolean remove(T t8, boolean z8) {
        int findIndexOf = findIndexOf(t8, this.mData, 0, this.mSize, 2);
        if (findIndexOf == -1) {
            return false;
        }
        removeItemAtIndex(findIndexOf, z8);
        return true;
    }

    public void replaceAll(@NonNull T... tArr) {
        replaceAll(tArr, false);
    }

    public void addAll(@NonNull T... tArr) {
        addAll(tArr, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void replaceAll(@NonNull Collection<T> collection) {
        replaceAll(collection.toArray((Object[]) Array.newInstance((Class<?>) this.mTClass, collection.size())), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void addAll(@NonNull Collection<T> collection) {
        addAll(collection.toArray((Object[]) Array.newInstance((Class<?>) this.mTClass, collection.size())), true);
    }
}
