package androidx.recyclerview.widget;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class DiffUtil {
    private static final Comparator<Diagonal> DIAGONAL_COMPARATOR = new Comparator<Diagonal>() { // from class: androidx.recyclerview.widget.DiffUtil.1
        @Override // java.util.Comparator
        public int compare(Diagonal diagonal, Diagonal diagonal2) {
            return diagonal.f14740x - diagonal2.f14740x;
        }
    };

    /* loaded from: classes3.dex */
    public static abstract class Callback {
        public abstract boolean areContentsTheSame(int i8, int i9);

        public abstract boolean areItemsTheSame(int i8, int i9);

        @Nullable
        public Object getChangePayload(int i8, int i9) {
            return null;
        }

        public abstract int getNewListSize();

        public abstract int getOldListSize();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class CenteredArray {
        private final int[] mData;
        private final int mMid;

        CenteredArray(int i8) {
            int[] iArr = new int[i8];
            this.mData = iArr;
            this.mMid = iArr.length / 2;
        }

        int[] backingData() {
            return this.mData;
        }

        public void fill(int i8) {
            Arrays.fill(this.mData, i8);
        }

        int get(int i8) {
            return this.mData[i8 + this.mMid];
        }

        void set(int i8, int i9) {
            this.mData[i8 + this.mMid] = i9;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class Diagonal {
        public final int size;

        /* renamed from: x, reason: collision with root package name */
        public final int f14740x;

        /* renamed from: y, reason: collision with root package name */
        public final int f14741y;

        Diagonal(int i8, int i9, int i10) {
            this.f14740x = i8;
            this.f14741y = i9;
            this.size = i10;
        }

        int endX() {
            return this.f14740x + this.size;
        }

        int endY() {
            return this.f14741y + this.size;
        }
    }

    /* loaded from: classes3.dex */
    public static class DiffResult {
        private static final int FLAG_CHANGED = 2;
        private static final int FLAG_MASK = 15;
        private static final int FLAG_MOVED = 12;
        private static final int FLAG_MOVED_CHANGED = 4;
        private static final int FLAG_MOVED_NOT_CHANGED = 8;
        private static final int FLAG_NOT_CHANGED = 1;
        private static final int FLAG_OFFSET = 4;
        public static final int NO_POSITION = -1;
        private final Callback mCallback;
        private final boolean mDetectMoves;
        private final List<Diagonal> mDiagonals;
        private final int[] mNewItemStatuses;
        private final int mNewListSize;
        private final int[] mOldItemStatuses;
        private final int mOldListSize;

        DiffResult(Callback callback, List<Diagonal> list, int[] iArr, int[] iArr2, boolean z8) {
            this.mDiagonals = list;
            this.mOldItemStatuses = iArr;
            this.mNewItemStatuses = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.mCallback = callback;
            this.mOldListSize = callback.getOldListSize();
            this.mNewListSize = callback.getNewListSize();
            this.mDetectMoves = z8;
            addEdgeDiagonals();
            findMatchingItems();
        }

        private void addEdgeDiagonals() {
            Diagonal diagonal;
            if (this.mDiagonals.isEmpty()) {
                diagonal = null;
            } else {
                diagonal = this.mDiagonals.get(0);
            }
            if (diagonal == null || diagonal.f14740x != 0 || diagonal.f14741y != 0) {
                this.mDiagonals.add(0, new Diagonal(0, 0, 0));
            }
            this.mDiagonals.add(new Diagonal(this.mOldListSize, this.mNewListSize, 0));
        }

        private void findMatchingAddition(int i8) {
            int i9;
            int size = this.mDiagonals.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                Diagonal diagonal = this.mDiagonals.get(i11);
                while (i10 < diagonal.f14741y) {
                    if (this.mNewItemStatuses[i10] == 0 && this.mCallback.areItemsTheSame(i8, i10)) {
                        if (this.mCallback.areContentsTheSame(i8, i10)) {
                            i9 = 8;
                        } else {
                            i9 = 4;
                        }
                        this.mOldItemStatuses[i8] = (i10 << 4) | i9;
                        this.mNewItemStatuses[i10] = (i8 << 4) | i9;
                        return;
                    }
                    i10++;
                }
                i10 = diagonal.endY();
            }
        }

        private void findMatchingItems() {
            int i8;
            for (Diagonal diagonal : this.mDiagonals) {
                for (int i9 = 0; i9 < diagonal.size; i9++) {
                    int i10 = diagonal.f14740x + i9;
                    int i11 = diagonal.f14741y + i9;
                    if (this.mCallback.areContentsTheSame(i10, i11)) {
                        i8 = 1;
                    } else {
                        i8 = 2;
                    }
                    this.mOldItemStatuses[i10] = (i11 << 4) | i8;
                    this.mNewItemStatuses[i11] = (i10 << 4) | i8;
                }
            }
            if (this.mDetectMoves) {
                findMoveMatches();
            }
        }

        private void findMoveMatches() {
            int i8 = 0;
            for (Diagonal diagonal : this.mDiagonals) {
                while (i8 < diagonal.f14740x) {
                    if (this.mOldItemStatuses[i8] == 0) {
                        findMatchingAddition(i8);
                    }
                    i8++;
                }
                i8 = diagonal.endX();
            }
        }

        @Nullable
        private static PostponedUpdate getPostponedUpdate(Collection<PostponedUpdate> collection, int i8, boolean z8) {
            PostponedUpdate postponedUpdate;
            Iterator<PostponedUpdate> it = collection.iterator();
            while (true) {
                if (it.hasNext()) {
                    postponedUpdate = it.next();
                    if (postponedUpdate.posInOwnerList == i8 && postponedUpdate.removal == z8) {
                        it.remove();
                        break;
                    }
                } else {
                    postponedUpdate = null;
                    break;
                }
            }
            while (it.hasNext()) {
                PostponedUpdate next = it.next();
                if (z8) {
                    next.currentPos--;
                } else {
                    next.currentPos++;
                }
            }
            return postponedUpdate;
        }

        public int convertNewPositionToOld(@IntRange(from = 0) int i8) {
            if (i8 >= 0 && i8 < this.mNewListSize) {
                int i9 = this.mNewItemStatuses[i8];
                if ((i9 & 15) == 0) {
                    return -1;
                }
                return i9 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i8 + ", new list size = " + this.mNewListSize);
        }

        public int convertOldPositionToNew(@IntRange(from = 0) int i8) {
            if (i8 >= 0 && i8 < this.mOldListSize) {
                int i9 = this.mOldItemStatuses[i8];
                if ((i9 & 15) == 0) {
                    return -1;
                }
                return i9 >> 4;
            }
            throw new IndexOutOfBoundsException("Index out of bounds - passed position = " + i8 + ", old list size = " + this.mOldListSize);
        }

        public void dispatchUpdatesTo(@NonNull RecyclerView.Adapter adapter) {
            dispatchUpdatesTo(new AdapterListUpdateCallback(adapter));
        }

        public void dispatchUpdatesTo(@NonNull ListUpdateCallback listUpdateCallback) {
            BatchingListUpdateCallback batchingListUpdateCallback;
            int i8;
            if (listUpdateCallback instanceof BatchingListUpdateCallback) {
                batchingListUpdateCallback = (BatchingListUpdateCallback) listUpdateCallback;
            } else {
                batchingListUpdateCallback = new BatchingListUpdateCallback(listUpdateCallback);
            }
            int i9 = this.mOldListSize;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i10 = this.mOldListSize;
            int i11 = this.mNewListSize;
            for (int size = this.mDiagonals.size() - 1; size >= 0; size--) {
                Diagonal diagonal = this.mDiagonals.get(size);
                int endX = diagonal.endX();
                int endY = diagonal.endY();
                while (true) {
                    if (i10 <= endX) {
                        break;
                    }
                    i10--;
                    int i12 = this.mOldItemStatuses[i10];
                    if ((i12 & 12) != 0) {
                        int i13 = i12 >> 4;
                        PostponedUpdate postponedUpdate = getPostponedUpdate(arrayDeque, i13, false);
                        if (postponedUpdate != null) {
                            int i14 = (i9 - postponedUpdate.currentPos) - 1;
                            batchingListUpdateCallback.onMoved(i10, i14);
                            if ((i12 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i14, 1, this.mCallback.getChangePayload(i10, i13));
                            }
                        } else {
                            arrayDeque.add(new PostponedUpdate(i10, (i9 - i10) - 1, true));
                        }
                    } else {
                        batchingListUpdateCallback.onRemoved(i10, 1);
                        i9--;
                    }
                }
                while (i11 > endY) {
                    i11--;
                    int i15 = this.mNewItemStatuses[i11];
                    if ((i15 & 12) != 0) {
                        int i16 = i15 >> 4;
                        PostponedUpdate postponedUpdate2 = getPostponedUpdate(arrayDeque, i16, true);
                        if (postponedUpdate2 == null) {
                            arrayDeque.add(new PostponedUpdate(i11, i9 - i10, false));
                        } else {
                            batchingListUpdateCallback.onMoved((i9 - postponedUpdate2.currentPos) - 1, i10);
                            if ((i15 & 4) != 0) {
                                batchingListUpdateCallback.onChanged(i10, 1, this.mCallback.getChangePayload(i16, i11));
                            }
                        }
                    } else {
                        batchingListUpdateCallback.onInserted(i10, 1);
                        i9++;
                    }
                }
                int i17 = diagonal.f14740x;
                int i18 = diagonal.f14741y;
                for (i8 = 0; i8 < diagonal.size; i8++) {
                    if ((this.mOldItemStatuses[i17] & 15) == 2) {
                        batchingListUpdateCallback.onChanged(i17, 1, this.mCallback.getChangePayload(i17, i18));
                    }
                    i17++;
                    i18++;
                }
                i10 = diagonal.f14740x;
                i11 = diagonal.f14741y;
            }
            batchingListUpdateCallback.dispatchLastEvent();
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class ItemCallback<T> {
        public abstract boolean areContentsTheSame(@NonNull T t8, @NonNull T t9);

        public abstract boolean areItemsTheSame(@NonNull T t8, @NonNull T t9);

        @Nullable
        public Object getChangePayload(@NonNull T t8, @NonNull T t9) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class PostponedUpdate {
        int currentPos;
        int posInOwnerList;
        boolean removal;

        PostponedUpdate(int i8, int i9, boolean z8) {
            this.posInOwnerList = i8;
            this.currentPos = i9;
            this.removal = z8;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class Range {
        int newListEnd;
        int newListStart;
        int oldListEnd;
        int oldListStart;

        public Range() {
        }

        int newSize() {
            return this.newListEnd - this.newListStart;
        }

        int oldSize() {
            return this.oldListEnd - this.oldListStart;
        }

        public Range(int i8, int i9, int i10, int i11) {
            this.oldListStart = i8;
            this.oldListEnd = i9;
            this.newListStart = i10;
            this.newListEnd = i11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class Snake {
        public int endX;
        public int endY;
        public boolean reverse;
        public int startX;
        public int startY;

        Snake() {
        }

        int diagonalSize() {
            return Math.min(this.endX - this.startX, this.endY - this.startY);
        }

        boolean hasAdditionOrRemoval() {
            if (this.endY - this.startY != this.endX - this.startX) {
                return true;
            }
            return false;
        }

        boolean isAddition() {
            if (this.endY - this.startY > this.endX - this.startX) {
                return true;
            }
            return false;
        }

        @NonNull
        Diagonal toDiagonal() {
            if (hasAdditionOrRemoval()) {
                if (this.reverse) {
                    return new Diagonal(this.startX, this.startY, diagonalSize());
                }
                if (isAddition()) {
                    return new Diagonal(this.startX, this.startY + 1, diagonalSize());
                }
                return new Diagonal(this.startX + 1, this.startY, diagonalSize());
            }
            int i8 = this.startX;
            return new Diagonal(i8, this.startY, this.endX - i8);
        }
    }

    private DiffUtil() {
    }

    @Nullable
    private static Snake backward(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2, int i8) {
        boolean z8;
        int i9;
        int i10;
        int i11;
        int i12;
        if ((range.oldSize() - range.newSize()) % 2 == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        int oldSize = range.oldSize() - range.newSize();
        int i13 = -i8;
        for (int i14 = i13; i14 <= i8; i14 += 2) {
            if (i14 != i13 && (i14 == i8 || centeredArray2.get(i14 + 1) >= centeredArray2.get(i14 - 1))) {
                i9 = centeredArray2.get(i14 - 1);
                i10 = i9 - 1;
            } else {
                i9 = centeredArray2.get(i14 + 1);
                i10 = i9;
            }
            int i15 = range.newListEnd - ((range.oldListEnd - i10) - i14);
            if (i8 != 0 && i10 == i9) {
                i11 = i15 + 1;
            } else {
                i11 = i15;
            }
            while (i10 > range.oldListStart && i15 > range.newListStart && callback.areItemsTheSame(i10 - 1, i15 - 1)) {
                i10--;
                i15--;
            }
            centeredArray2.set(i14, i10);
            if (z8 && (i12 = oldSize - i14) >= i13 && i12 <= i8 && centeredArray.get(i12) >= i10) {
                Snake snake = new Snake();
                snake.startX = i10;
                snake.startY = i15;
                snake.endX = i9;
                snake.endY = i11;
                snake.reverse = true;
                return snake;
            }
        }
        return null;
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback) {
        return calculateDiff(callback, true);
    }

    @Nullable
    private static Snake forward(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2, int i8) {
        int i9;
        int i10;
        int i11;
        boolean z8 = true;
        if (Math.abs(range.oldSize() - range.newSize()) % 2 != 1) {
            z8 = false;
        }
        int oldSize = range.oldSize() - range.newSize();
        int i12 = -i8;
        for (int i13 = i12; i13 <= i8; i13 += 2) {
            if (i13 != i12 && (i13 == i8 || centeredArray.get(i13 + 1) <= centeredArray.get(i13 - 1))) {
                i9 = centeredArray.get(i13 - 1);
                i10 = i9 + 1;
            } else {
                i9 = centeredArray.get(i13 + 1);
                i10 = i9;
            }
            int i14 = (range.newListStart + (i10 - range.oldListStart)) - i13;
            int i15 = (i8 != 0 && i10 == i9) ? i14 - 1 : i14;
            while (i10 < range.oldListEnd && i14 < range.newListEnd && callback.areItemsTheSame(i10, i14)) {
                i10++;
                i14++;
            }
            centeredArray.set(i13, i10);
            if (z8 && (i11 = oldSize - i13) >= i12 + 1 && i11 <= i8 - 1 && centeredArray2.get(i11) <= i10) {
                Snake snake = new Snake();
                snake.startX = i9;
                snake.startY = i15;
                snake.endX = i10;
                snake.endY = i14;
                snake.reverse = false;
                return snake;
            }
        }
        return null;
    }

    @Nullable
    private static Snake midPoint(Range range, Callback callback, CenteredArray centeredArray, CenteredArray centeredArray2) {
        if (range.oldSize() >= 1 && range.newSize() >= 1) {
            int oldSize = ((range.oldSize() + range.newSize()) + 1) / 2;
            centeredArray.set(1, range.oldListStart);
            centeredArray2.set(1, range.oldListEnd);
            for (int i8 = 0; i8 < oldSize; i8++) {
                Snake forward = forward(range, callback, centeredArray, centeredArray2, i8);
                if (forward != null) {
                    return forward;
                }
                Snake backward = backward(range, callback, centeredArray, centeredArray2, i8);
                if (backward != null) {
                    return backward;
                }
            }
        }
        return null;
    }

    @NonNull
    public static DiffResult calculateDiff(@NonNull Callback callback, boolean z8) {
        int oldListSize = callback.getOldListSize();
        int newListSize = callback.getNewListSize();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Range(0, oldListSize, 0, newListSize));
        int i8 = ((((oldListSize + newListSize) + 1) / 2) * 2) + 1;
        CenteredArray centeredArray = new CenteredArray(i8);
        CenteredArray centeredArray2 = new CenteredArray(i8);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            Range range = (Range) arrayList2.remove(arrayList2.size() - 1);
            Snake midPoint = midPoint(range, callback, centeredArray, centeredArray2);
            if (midPoint != null) {
                if (midPoint.diagonalSize() > 0) {
                    arrayList.add(midPoint.toDiagonal());
                }
                Range range2 = arrayList3.isEmpty() ? new Range() : (Range) arrayList3.remove(arrayList3.size() - 1);
                range2.oldListStart = range.oldListStart;
                range2.newListStart = range.newListStart;
                range2.oldListEnd = midPoint.startX;
                range2.newListEnd = midPoint.startY;
                arrayList2.add(range2);
                range.oldListEnd = range.oldListEnd;
                range.newListEnd = range.newListEnd;
                range.oldListStart = midPoint.endX;
                range.newListStart = midPoint.endY;
                arrayList2.add(range);
            } else {
                arrayList3.add(range);
            }
        }
        Collections.sort(arrayList, DIAGONAL_COMPARATOR);
        return new DiffResult(callback, arrayList, centeredArray.backingData(), centeredArray2.backingData(), z8);
    }
}
