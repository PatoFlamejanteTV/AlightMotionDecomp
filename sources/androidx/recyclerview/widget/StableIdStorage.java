package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.collection.LongSparseArray;

/* loaded from: classes3.dex */
interface StableIdStorage {

    /* loaded from: classes3.dex */
    public static class IsolatedStableIdStorage implements StableIdStorage {
        long mNextStableId = 0;

        /* loaded from: classes3.dex */
        class WrapperStableIdLookup implements StableIdLookup {
            private final LongSparseArray<Long> mLocalToGlobalLookup = new LongSparseArray<>();

            WrapperStableIdLookup() {
            }

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j8) {
                Long l8 = this.mLocalToGlobalLookup.get(j8);
                if (l8 == null) {
                    l8 = Long.valueOf(IsolatedStableIdStorage.this.obtainId());
                    this.mLocalToGlobalLookup.put(j8, l8);
                }
                return l8.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        @NonNull
        public StableIdLookup createStableIdLookup() {
            return new WrapperStableIdLookup();
        }

        long obtainId() {
            long j8 = this.mNextStableId;
            this.mNextStableId = 1 + j8;
            return j8;
        }
    }

    /* loaded from: classes3.dex */
    public static class NoStableIdStorage implements StableIdStorage {
        private final StableIdLookup mNoIdLookup = new StableIdLookup() { // from class: androidx.recyclerview.widget.StableIdStorage.NoStableIdStorage.1
            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j8) {
                return -1L;
            }
        };

        @Override // androidx.recyclerview.widget.StableIdStorage
        @NonNull
        public StableIdLookup createStableIdLookup() {
            return this.mNoIdLookup;
        }
    }

    /* loaded from: classes3.dex */
    public static class SharedPoolStableIdStorage implements StableIdStorage {
        private final StableIdLookup mSameIdLookup = new StableIdLookup() { // from class: androidx.recyclerview.widget.StableIdStorage.SharedPoolStableIdStorage.1
            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j8) {
                return j8;
            }
        };

        @Override // androidx.recyclerview.widget.StableIdStorage
        @NonNull
        public StableIdLookup createStableIdLookup() {
            return this.mSameIdLookup;
        }
    }

    /* loaded from: classes3.dex */
    public interface StableIdLookup {
        long localToGlobal(long j8);
    }

    @NonNull
    StableIdLookup createStableIdLookup();
}
