package androidx.datastore.preferences.protobuf;

import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

@Deprecated
/* loaded from: classes3.dex */
public class UnmodifiableLazyStringList extends AbstractList<String> implements LazyStringList, RandomAccess {
    private final LazyStringList list;

    public UnmodifiableLazyStringList(LazyStringList lazyStringList) {
        this.list = lazyStringList;
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteArray(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public boolean addAllByteString(Collection<? extends ByteString> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public List<byte[]> asByteArrayList() {
        return DesugarCollections.unmodifiableList(this.list.asByteArrayList());
    }

    @Override // androidx.datastore.preferences.protobuf.ProtocolStringList
    public List<ByteString> asByteStringList() {
        return DesugarCollections.unmodifiableList(this.list.asByteStringList());
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public byte[] getByteArray(int i8) {
        return this.list.getByteArray(i8);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public ByteString getByteString(int i8) {
        return this.list.getByteString(i8);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public Object getRaw(int i8) {
        return this.list.getRaw(i8);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public List<?> getUnderlyingElements() {
        return this.list.getUnderlyingElements();
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public LazyStringList getUnmodifiableView() {
        return this;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new Iterator<String>() { // from class: androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList.2
            Iterator<String> iter;

            {
                this.iter = UnmodifiableLazyStringList.this.list.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iter.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Iterator
            public String next() {
                return this.iter.next();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i8) {
        return new ListIterator<String>(i8) { // from class: androidx.datastore.preferences.protobuf.UnmodifiableLazyStringList.1
            ListIterator<String> iter;
            final /* synthetic */ int val$index;

            {
                this.val$index = i8;
                this.iter = UnmodifiableLazyStringList.this.list.listIterator(i8);
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                return this.iter.hasNext();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return this.iter.hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return this.iter.nextIndex();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return this.iter.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            public void add(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public String next() {
                return this.iter.next();
            }

            @Override // java.util.ListIterator
            public String previous() {
                return this.iter.previous();
            }

            @Override // java.util.ListIterator
            public void set(String str) {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void mergeFrom(LazyStringList lazyStringList) {
        throw new UnsupportedOperationException();
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int i8, ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.list.size();
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void add(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i8) {
        return this.list.get(i8);
    }

    @Override // androidx.datastore.preferences.protobuf.LazyStringList
    public void set(int i8, byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
