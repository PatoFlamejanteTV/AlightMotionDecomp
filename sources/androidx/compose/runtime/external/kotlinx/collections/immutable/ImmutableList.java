package androidx.compose.runtime.external.kotlinx.collections.immutable;

import R5.AbstractC1419c;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.ListImplementation;
import d6.InterfaceC2767a;
import java.util.List;

/* loaded from: classes.dex */
public interface ImmutableList<E> extends List<E>, ImmutableCollection<E>, InterfaceC2767a {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class SubList<E> extends AbstractC1419c implements ImmutableList<E> {
        private int _size;
        private final int fromIndex;
        private final ImmutableList<E> source;
        private final int toIndex;

        /* JADX WARN: Multi-variable type inference failed */
        public SubList(ImmutableList<? extends E> immutableList, int i8, int i9) {
            this.source = immutableList;
            this.fromIndex = i8;
            this.toIndex = i9;
            ListImplementation.checkRangeIndexes$runtime_release(i8, i9, immutableList.size());
            this._size = i9 - i8;
        }

        @Override // R5.AbstractC1419c, java.util.List
        public E get(int i8) {
            ListImplementation.checkElementIndex$runtime_release(i8, this._size);
            return this.source.get(this.fromIndex + i8);
        }

        @Override // R5.AbstractC1419c, R5.AbstractC1417a
        public int getSize() {
            return this._size;
        }

        @Override // R5.AbstractC1419c, java.util.List
        public ImmutableList<E> subList(int i8, int i9) {
            ListImplementation.checkRangeIndexes$runtime_release(i8, i9, this._size);
            ImmutableList<E> immutableList = this.source;
            int i10 = this.fromIndex;
            return new SubList(immutableList, i8 + i10, i10 + i9);
        }
    }

    @Override // java.util.List
    ImmutableList<E> subList(int i8, int i9);

    @Override // java.util.List
    /* bridge */ /* synthetic */ List subList(int i8, int i9);
}
